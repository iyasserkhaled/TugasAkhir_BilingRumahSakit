/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import exec.ExecutePembayaran;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MuhammadRauf
 */
public class ConvertPembayaranToObject {
 public String[][] getPembayaran(){
List<Pembayaran> myPy = new ArrayList<Pembayaran>();
    ExecutePembayaran eUs = new ExecutePembayaran();
    myPy = eUs.getAllPembayaran();
String[][] dataPembayaran = new String[myPy.size()][7];
int i=0;
for(Pembayaran py : myPy){
    dataPembayaran[i][0] = ""+py.getId_pembayaran();
    dataPembayaran[i][1] = py.getId_jenis();
    dataPembayaran[i][2] = py.getNama_jenis();
    dataPembayaran[i][3] = ""+py.getTotal_harga();
    dataPembayaran[i][4] = py.getId_pasien();
    dataPembayaran[i][5] = py.getNama_pasien();
i++;
}
return dataPembayaran;
}

 public String[][] getPembayaranInap(){
List<Pembayaran> myPy = new ArrayList<Pembayaran>();
    ExecutePembayaran eUs = new ExecutePembayaran();
    myPy = eUs.getAllPembayaran();
String[][] dataPembayaran = new String[myPy.size()][7];
int i=0;
for(Pembayaran py : myPy){
    dataPembayaran[i][0] = ""+py.getId_pembayaran();
    dataPembayaran[i][1] = py.getId_jenis();
    dataPembayaran[i][2] = py.getNama_jenis();
    dataPembayaran[i][3] = ""+py.getTotal_harga();
    dataPembayaran[i][4] = py.getId_pasien();
    dataPembayaran[i][5] = py.getNama_pasien();
i++;
}
return dataPembayaran;
}

 public String[][] getPembayaranDarurat(){
List<Pembayaran> myPy = new ArrayList<Pembayaran>();
    ExecutePembayaran eUs = new ExecutePembayaran();
    myPy = eUs.getAllPembayaran();
String[][] dataPembayaran = new String[myPy.size()][7];
int i=0;
for(Pembayaran py : myPy){
    dataPembayaran[i][0] = ""+py.getId_pembayaran();
    dataPembayaran[i][1] = py.getId_jenis();
    dataPembayaran[i][2] = py.getNama_jenis();
    dataPembayaran[i][3] = ""+py.getTotal_harga();
    dataPembayaran[i][4] = py.getId_pasien();
    dataPembayaran[i][5] = py.getNama_pasien();
i++;
}
return dataPembayaran;
}
 public String[][] getPembayaranJalan(){
List<Pembayaran> myPy = new ArrayList<Pembayaran>();
    ExecutePembayaran eUs = new ExecutePembayaran();
    myPy = eUs.getAllPembayaran();
String[][] dataPembayaran = new String[myPy.size()][7];
int i=0;
for(Pembayaran py : myPy){
    dataPembayaran[i][0] = ""+py.getId_pembayaran();
    dataPembayaran[i][1] = py.getId_jenis();
    dataPembayaran[i][2] = py.getNama_jenis();
    dataPembayaran[i][3] = ""+py.getTotal_harga();
    dataPembayaran[i][4] = py.getId_pasien();
    dataPembayaran[i][5] = py.getNama_pasien();
i++;
}
return dataPembayaran;
}
 
 
}
