/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;

import com.Jenis;
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
public class ExecuteJenis {

public List<Jenis> getAllJenis(){
String query = "select * from jenis_rawat";
ConnectionManager conMan = new ConnectionManager();
List<Jenis> lsJenis = new ArrayList<Jenis>();
Connection conn = conMan.logOn();
try {
Statement stm = conn.createStatement();
ResultSet rs = stm.executeQuery(query);
while(rs.next()){
Jenis at = new Jenis();
at.setId_jenis(rs.getString("id_jenis"));
at.setNama_jenis(rs.getString("nama_jenis"));
at.setTarif(rs.getInt("tarif"));
lsJenis.add(at);
}
} catch (SQLException ex) {
Logger.getLogger(ExecuteJenis.class.getName()).log(Level.SEVERE, null, ex);
}
conMan.logOff();
return lsJenis;
}

public int hapusData(String id_jenis){
String query = "Delete from jenis_rawat where id_jenis='"+id_jenis+"'";
int hasil = 0;
ConnectionManager conMan = new ConnectionManager();
Connection conn = conMan.logOn();
try {
Statement stm = conn.createStatement();
hasil = stm.executeUpdate(query);
} catch (SQLException ex) {
Logger.getLogger(ExecuteJenis.class.getName()).log(Level.SEVERE, null, ex);
}
conMan.logOff();
return hasil;
}

public int insertData(Jenis js){
int hasil = 0;
String query ="insert into jenis_rawat(id_jenis, nama_jenis, tarif)values"
+ "('"+js.getId_jenis()+"','"+js.getNama_jenis()+"',"+js.getTarif()+")";
ConnectionManager conMan = new ConnectionManager();
Connection conn = conMan.logOn();
try {
Statement stm = conn.createStatement();
hasil = stm.executeUpdate(query);
} catch (SQLException ex) {
Logger.getLogger(ExecuteJenis.class.getName()).log(Level.SEVERE, null, ex);
}
conMan.logOff();
return hasil;
}

public int ubahData(Jenis js){
int hasil = 0;
ConnectionManager conMan = new ConnectionManager();
Connection conn = conMan.logOn();
String query = "Update jenis set nama_jenis ='"+js.getNama_jenis()+"', tarif='"+js.getTarif()+"',"
+ "where id_jenis='"+js.getId_jenis()+"'";
try {
Statement stm = conn.createStatement();
hasil = stm.executeUpdate(query);
} catch (SQLException ex) {
Logger.getLogger(ExecuteJenis.class.getName()).log(Level.SEVERE, null, ex);
}
return hasil;
}
    
}
