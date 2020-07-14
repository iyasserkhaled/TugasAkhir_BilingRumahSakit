/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author MuhammadRauf
 */
public class Alat {
    private String id_alat;
    private String nama_alat;
    private int stok;
    private int tarif;
    
    public Alat() {
    }
    public Alat(String id_alat, String nama_alat, int stok, int tarif) {
        this.id_alat = id_alat;
        this.nama_alat = nama_alat;
        this.stok = stok;
        this.tarif = tarif;
    }
    public String getId_alat() {
        return id_alat;
    }
    public String getNama_alat() {
        return nama_alat;
    }
    public int getStok() {
        return stok;
    }
    public int getTarif() {
        return tarif;
    }
    public void setId_alat(String id_alat) {
        this.id_alat = id_alat;
    }
    public void setNama_alat(String nama_alat) {
        this.nama_alat = nama_alat;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
    public void setTarif(int tarif) {
        this.tarif = tarif;
    }      
}
