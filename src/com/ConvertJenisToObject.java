/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import exec.ExecuteJenis;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MuhammadRauf
 */
public class ConvertJenisToObject {
    public String[][] getJenis(){
List<Jenis> myJs = new ArrayList<Jenis>();
    ExecuteJenis eJs = new ExecuteJenis();
    myJs = eJs.getAllJenis();
String[][] dataJenis = new String[myJs.size()][4];
int i=0;
for(Jenis js : myJs){
    dataJenis[i][0] = js.getId_jenis();
    dataJenis[i][1] = js.getNama_jenis();
    dataJenis[i][2] = ""+js.getTarif();
i++;
}
return dataJenis;
}
}
