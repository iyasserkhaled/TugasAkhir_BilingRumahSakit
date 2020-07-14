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
public class Jenis {
    private String id_jenis;
    private String nama_jenis;
    private int tarif;
    public Jenis() {
    }
    public Jenis(String id_jenis, String nama_jenis, int tarif) {
        this.id_jenis = id_jenis;
        this.nama_jenis = nama_jenis;
        this.tarif = tarif;
    }
    public String getId_jenis() {
        return id_jenis;
    }
    public String getNama_jenis() {
        return nama_jenis;
    }
    public int getTarif() {
        return tarif;
    }
    public void setId_jenis(String id_jenis) {
        this.id_jenis = id_jenis;
    }
    public void setNama_jenis(String nama_jenis) {
        this.nama_jenis = nama_jenis;
    }
    public void setTarif(int tarif) {
        this.tarif = tarif;
    }
}
