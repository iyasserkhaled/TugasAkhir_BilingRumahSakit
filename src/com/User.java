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
public class User {
    private String id_user;
    private String nama_user;
    private String username;
    private String password;
    private String level;
    public User() {
    }
    public User(String id_user, String nama_user, String username, String password, String level) {
        this.id_user = id_user;
        this.nama_user = nama_user;
        this.username = username;
        this.password = password;
        this.level = level;
    }
    public String getId_user() {
        return id_user;
    }
    public String getNama_user() {
        return nama_user;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getLevel() {
        return level;
    }
    public void setId_user(String id_user) {
        this.id_user = id_user;
    }
    public void setNama_user(String nama_user) {
        this.nama_user = nama_user;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    
    }
