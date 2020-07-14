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

public class Pembayaran {
    private int id_pembayaran;
    private String id_jenis;
    private String nama_jenis;
    private String tgl_masuk;
    private String tgl_keluar;
    private int total_harga;
    private String id_pasien;
    private String nama_pasien;
    private String id_alat;

    public Pembayaran() {
    }

    public Pembayaran(int id_pembayaran, String id_jenis, String nama_jenis, String tgl_masuk, String tgl_keluar, int total_harga, String id_pasien, String nama_pasien, String id_alat) {
        this.id_pembayaran = id_pembayaran;
        this.id_jenis = id_jenis;
        this.nama_jenis = nama_jenis;
        this.tgl_masuk = tgl_masuk;
        this.tgl_keluar = tgl_keluar;
        this.total_harga = total_harga;
        this.id_pasien = id_pasien;
        this.nama_pasien = nama_pasien;
        this.id_alat = id_alat;
    }



    public Pembayaran(String id_jenis, String tgl_masuk, String id_pasien) {
        this.id_jenis = id_jenis;
        this.tgl_masuk = tgl_masuk;
        this.id_pasien = id_pasien;
    }

    public Pembayaran(int id_pembayaran, String tgl_keluar, int total_harga, String id_alat) {
        this.id_pembayaran = id_pembayaran;
        this.tgl_keluar = tgl_keluar;
        this.total_harga = total_harga;
        this.id_alat = id_alat;
    }

    public String getId_alat() {
        return id_alat;
    }

    public void setId_alat(String id_alat) {
        this.id_alat = id_alat;
    }

    public Pembayaran(int id_pembayaran, String id_jenis, String nama_jenis, int total_harga, String id_pasien, String nama_pasien) {
        this.id_pembayaran = id_pembayaran;
        this.id_jenis = id_jenis;
        this.nama_jenis = nama_jenis;
        this.total_harga = total_harga;
        this.id_pasien = id_pasien;
        this.nama_pasien = nama_pasien;
    }
    
    //public Pembayaran(int id_pembayaran, String id_jenis, int total_harga, String id_pasien) {
     //   this.id_pembayaran = id_pembayaran;
    //    this.id_jenis = id_jenis;
    //    this.total_harga = total_harga;
   //     this.id_pasien = id_pasien;
   // }
    public int getId_pembayaran() {
        return id_pembayaran;
    }
    public String getId_jenis() {
        return id_jenis;
    }
    public int getTotal_harga() {
        return total_harga;
    }
    public String getId_pasien() {
        return id_pasien;
    }
    public void setId_pembayaran(int id_pembayaran) {
        this.id_pembayaran = id_pembayaran;
    }
    public void setId_jenis(String id_jenis) {
        this.id_jenis = id_jenis;
    }
    public void setTotal_harga(int total_harga) {
        this.total_harga = total_harga;
    }
    public void setId_pasien(String id_pasien) {
        this.id_pasien = id_pasien;
    }
    public String getNama_jenis() {
        return nama_jenis;
    }
    public void setNama_jenis(String nama_jenis) {
        this.nama_jenis = nama_jenis;
    }
    public String getNama_pasien() {
        return nama_pasien;
    }
    public void setNama_pasien(String nama_pasien) {
        this.nama_pasien = nama_pasien;
    }
    public String getTgl_masuk() {
        return tgl_masuk;
    }

    public void setTgl_masuk(String tgl_masuk) {
        this.tgl_masuk = tgl_masuk;
    }

    public String getTgl_keluar() {
        return tgl_keluar;
    }

    public void setTgl_keluar(String tgl_keluar) {
        this.tgl_keluar = tgl_keluar;
    }
    
}
