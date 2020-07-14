/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;

import com.Pasien;
import db.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MuhammadRauf
 */
public class ExecutePasien {
public List<Pasien> getAllPasien(){
String query = "select * from pasien";
ConnectionManager conMan = new ConnectionManager();
List<Pasien> lsPasien = new ArrayList<Pasien>();
Connection conn = conMan.logOn();
try {
Statement stm = conn.createStatement();
ResultSet rs = stm.executeQuery(query);
while(rs.next()){
Pasien us = new Pasien();
us.setId_pasien(rs.getString("id_pasien"));
us.setNama_pasien(rs.getString("nama_pasien"));
us.setAlamat(rs.getString("alamat"));
us.setDiagnosis_penyakit(rs.getString("diagnosis_penyakit"));
lsPasien.add(us);
}
} catch (SQLException ex) {
Logger.getLogger(ExecutePasien.class.getName()).log(Level.SEVERE, null, ex);
}
conMan.logOff();
return lsPasien;
}

public int insertData(Pasien ps){
int hasil = 0;
String query ="insert into pasien(id_pasien, nama_pasien, alamat, diagnosis_penyakit)values"
+ "('"+ps.getId_pasien()+"','"+ps.getNama_pasien()+"','"+ps.getAlamat()+"','"+ps.getDiagnosis_penyakit()+"')";
ConnectionManager conMan = new ConnectionManager();
Connection conn = conMan.logOn();
try {
Statement stm = conn.createStatement();
hasil = stm.executeUpdate(query);
} catch (SQLException ex) {
Logger.getLogger(ExecutePasien.class.getName()).log(Level.SEVERE, null, ex);
}
conMan.logOff();
return hasil;
}

public int hapusData(String id_pasien){
String query = "Delete from pasien where id_pasien='"+id_pasien+"'";
int hasil = 0;
ConnectionManager conMan = new ConnectionManager();
Connection conn = conMan.logOn();
try {
Statement stm = conn.createStatement();
hasil = stm.executeUpdate(query);

} catch (SQLException ex) {
Logger.getLogger(ExecutePasien.class.getName()).log(Level.SEVERE, null, ex);
}
conMan.logOff();
return hasil;
}

public int ubahData(Pasien ps){
int hasil = 0;
ConnectionManager conMan = new ConnectionManager();
Connection conn = conMan.logOn();
String query = "Update pasien set nama_pasien ='"+ps.getNama_pasien()+"', alamat='"+ps.getAlamat()+"',"
+ "diagnosis_penyakit='"+ps.getDiagnosis_penyakit()+"'"
+ "where id_pasien='"+ps.getId_pasien()+"'";
try {
Statement stm = conn.createStatement();
hasil = stm.executeUpdate(query);
} catch (SQLException ex) {
Logger.getLogger(ExecutePasien.class.getName()).log(Level.SEVERE, null, ex);
}
return hasil;
}
}
