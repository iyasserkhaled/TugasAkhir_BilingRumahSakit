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
public class Pasien {
  private String id_pasien;
  private String nama_pasien;
  private String alamat;
  private String diagnosis_penyakit;
    public Pasien() {
    }
    public Pasien(String id_pasien, String nama_pasien, String alamat, String diagnosis_penyakit) {
        this.id_pasien = id_pasien;
        this.nama_pasien = nama_pasien;
        this.alamat = alamat;
        this.diagnosis_penyakit = diagnosis_penyakit;
    }
    public String getId_pasien() {
        return id_pasien;
    }
    public String getNama_pasien() {
        return nama_pasien;
    }
    public String getAlamat() {
        return alamat;
    }
    public String getDiagnosis_penyakit() {
        return diagnosis_penyakit;
    }
    public void setId_pasien(String id_pasien) {
        this.id_pasien = id_pasien;
    }
    public void setNama_pasien(String nama_pasien) {
        this.nama_pasien = nama_pasien;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void setDiagnosis_penyakit(String diagnosis_penyakit) {
        this.diagnosis_penyakit = diagnosis_penyakit;
    }
  
  
}
