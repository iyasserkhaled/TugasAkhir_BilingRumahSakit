/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import exec.ExecutePasien;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MuhammadRauf
 */
public class ConvertPasienToObject {
public String[][] getPasien(){
List<Pasien> myPs = new ArrayList<Pasien>();
ExecutePasien ePs = new ExecutePasien();
myPs = ePs.getAllPasien();
String[][] dataPasien = new String[myPs.size()][5];
int i=0;
for(Pasien ps : myPs){
    dataPasien[i][0] = ps.getId_pasien();
    dataPasien[i][1] = ps.getNama_pasien();
    dataPasien[i][2] = ps.getAlamat();
    dataPasien[i][3] = ps.getDiagnosis_penyakit();
i++;
}
return dataPasien;
}
}
