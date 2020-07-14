/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import exec.ExecuteAlat;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author MuhammadRauf
 */
public class ConvertAlatToObject {
    
public String[][] getAlat(){
List<Alat> myAt = new ArrayList<Alat>();
    ExecuteAlat eAt = new ExecuteAlat();
    myAt = eAt.getAllAlat();
String[][] dataAlat = new String[myAt.size()][4];
int i=0;
for(Alat at : myAt){
    dataAlat[i][0] = at.getId_alat();
    dataAlat[i][1] = at.getNama_alat();
    dataAlat[i][2] = ""+at.getStok();
    dataAlat[i][3] =""+at.getTarif();
    
i++;
}
return dataAlat;
}
}
