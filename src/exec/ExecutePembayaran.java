/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;
import com.Pasien;
import com.Pembayaran;
import com.User;
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
public class ExecutePembayaran {
public List<Pembayaran> getAllPembayaran(){
String query = "SELECT pembayaran.id_pembayaran, pembayaran.id_jenis, "
        + "jenis_rawat.nama_jenis, pembayaran.total_harga, pembayaran.id_pasien,"
        + " pasien.nama_pasien from pembayaran,pasien,jenis_rawat "
        + "where pembayaran.id_jenis = jenis_rawat.id_jenis and pembayaran.id_pasien = pasien.id_pasien";
ConnectionManager conMan = new ConnectionManager();
List<Pembayaran> lsPembayaran = new ArrayList<Pembayaran>();
Connection conn = conMan.logOn();
try {
Statement stm = conn.createStatement();
ResultSet rs = stm.executeQuery(query);
while(rs.next()){
Pembayaran py = new Pembayaran();
py.setId_pembayaran(rs.getInt("id_pembayaran"));
py.setId_jenis(rs.getString("id_jenis"));
py.setNama_jenis(rs.getString("nama_jenis"));
py.setTotal_harga(rs.getInt("total_harga"));
py.setId_pasien(rs.getString("id_pasien"));
py.setNama_pasien(rs.getString("nama_pasien"));
lsPembayaran.add(py);
}
} catch (SQLException ex) {
Logger.getLogger(ExecutePembayaran.class.getName()).log(Level.SEVERE, null, ex);
}
conMan.logOff();
return lsPembayaran;
}

public List<Pembayaran> getAllPembayaranInap(Pembayaran py){
String query = "select id_pembayaran,id_jenis,id_pasien,tgl_masuk from Pembayaran where id_jenis = 'RWT01'";
ConnectionManager conMan = new ConnectionManager();
List<Pembayaran> lsPembayaran = new ArrayList<Pembayaran>();
Connection conn = conMan.logOn();
try {
Statement stm = conn.createStatement();
ResultSet rs = stm.executeQuery(query);
while(rs.next()){
Pembayaran us = new Pembayaran();
us.setId_pembayaran(rs.getInt("id_pembayaran"));
us.setId_jenis(rs.getString("id_jenis"));
us.setId_pasien(rs.getString("id_pasien"));
lsPembayaran.add(us);
}
} catch (SQLException ex) {
Logger.getLogger(ExecutePembayaran.class.getName()).log(Level.SEVERE, null, ex);
}
conMan.logOff();
return lsPembayaran;
}

public List<Pembayaran> getAllPembayaranDarurat(Pembayaran py){
String query = "select id_pembayaran,id_jenis,id_pasien,tgl_masuk from Pembayaran where id_jenis = 'RWT02'";
ConnectionManager conMan = new ConnectionManager();
List<Pembayaran> lsPembayaran = new ArrayList<Pembayaran>();
Connection conn = conMan.logOn();
try {
Statement stm = conn.createStatement();
ResultSet rs = stm.executeQuery(query);
while(rs.next()){
Pembayaran us = new Pembayaran();
us.setId_pembayaran(rs.getInt("id_pembayaran"));
us.setId_jenis(rs.getString("id_jenis"));
us.setId_pasien(rs.getString("id_pasien"));
lsPembayaran.add(us);
}
} catch (SQLException ex) {
Logger.getLogger(ExecutePembayaran.class.getName()).log(Level.SEVERE, null, ex);
}
conMan.logOff();
return lsPembayaran;
}


public List<Pembayaran> getAllPembayaranJalan(Pembayaran py){
String query = "select id_pembayaran,id_jenis,id_pasien,tgl_masuk from Pembayaran where id_jenis = 'RWT03'";
ConnectionManager conMan = new ConnectionManager();
List<Pembayaran> lsPembayaran = new ArrayList<Pembayaran>();
Connection conn = conMan.logOn();
try {
Statement stm = conn.createStatement();
ResultSet rs = stm.executeQuery(query);
while(rs.next()){
Pembayaran us = new Pembayaran();
us.setId_pembayaran(rs.getInt("id_pembayaran"));
us.setId_jenis(rs.getString("id_jenis"));
us.setId_pasien(rs.getString("id_pasien"));
lsPembayaran.add(us);
}
} catch (SQLException ex) {
Logger.getLogger(ExecutePembayaran.class.getName()).log(Level.SEVERE, null, ex);
}
conMan.logOff();
return lsPembayaran;
}

public int insertData(Pembayaran py){
int hasil = 0;
String query ="insert into pembayaran(id_pembayaran, id_jenis, tgl_masuk,tgl_keluar, total_harga,id_pasien,id_alat)values"
+ "(NULL,'"+py.getId_jenis()+"','"+py.getTgl_masuk()+"',NULL,"
        + "NULL,'"+py.getId_pasien()+"',NULL)";
ConnectionManager conMan = new ConnectionManager();
Connection conn = conMan.logOn();
try {
Statement stm = conn.createStatement();
hasil = stm.executeUpdate(query);
} catch (SQLException ex) {
Logger.getLogger(ExecutePembayaran.class.getName()).log(Level.SEVERE, null, ex);
}
conMan.logOff();
return hasil;
}

public int ubahData(Pembayaran ps){
int hasil = 0;
ConnectionManager conMan = new ConnectionManager();
Connection conn = conMan.logOn();
String query = "UPDATE pembayaran SET tgl_keluar = '"+ps.getTgl_keluar()+"', total_harga = "+ps.getTotal_harga()+", "
        + "id_alat = '"+ps.getId_alat()+"' WHERE id_pembayaran ="+ps.getId_pembayaran()+"";
try {
Statement stm = conn.createStatement();
hasil = stm.executeUpdate(query);
} catch (SQLException ex) {
Logger.getLogger(ExecutePembayaran.class.getName()).log(Level.SEVERE, null, ex);
}
return hasil;
}

}
