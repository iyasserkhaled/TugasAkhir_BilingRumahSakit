/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;

import com.Alat;
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
public class ExecuteAlat {
public List<Alat> getAllAlat(){
String query = "select * from alat";
ConnectionManager conMan = new ConnectionManager();
List<Alat> lsAlat = new ArrayList<Alat>();
Connection conn = conMan.logOn();
try {
Statement stm = conn.createStatement();
ResultSet rs = stm.executeQuery(query);
while(rs.next()){
Alat at = new Alat();
at.setId_alat(rs.getString("id_alat"));
at.setNama_alat(rs.getString("nama_alat"));
at.setStok(rs.getInt("stok"));
at.setTarif(rs.getInt("tarif"));
lsAlat.add(at);
}
} catch (SQLException ex) {
Logger.getLogger(ExecuteAlat.class.getName()).log(Level.SEVERE, null, ex);
}
conMan.logOff();
return lsAlat;
}

public int hapusData(String id_alat){
String query = "Delete from alat where id_alat='"+id_alat+"'";
int hasil = 0;
ConnectionManager conMan = new ConnectionManager();
Connection conn = conMan.logOn();
try {
Statement stm = conn.createStatement();
hasil = stm.executeUpdate(query);

} catch (SQLException ex) {
Logger.getLogger(ExecuteAlat.class.getName()).log(Level.SEVERE, null, ex);
}
conMan.logOff();
return hasil;
}

public int insertData(Alat at){
int hasil = 0;
String query ="insert into alat(id_alat, nama_alat, stok, tarif)values"
+ "('"+at.getId_alat()+"','"+at.getNama_alat()+"',"+at.getStok()+","+at.getTarif()+")";
ConnectionManager conMan = new ConnectionManager();
Connection conn = conMan.logOn();
try {
Statement stm = conn.createStatement();
hasil = stm.executeUpdate(query);
} catch (SQLException ex) {
Logger.getLogger(ExecuteAlat.class.getName()).log(Level.SEVERE, null, ex);
}
conMan.logOff();
return hasil;
}

public int ubahData(Alat at){
int hasil = 0;
ConnectionManager conMan = new ConnectionManager();
Connection conn = conMan.logOn();
String query = "Update alat set nama_alat ='"+at.getNama_alat()+"', stok='"+at.getStok()+"',"
+ "tarif='"+at.getTarif()+"'"
+ "where id_alat='"+at.getId_alat()+"'";
try {
Statement stm = conn.createStatement();
hasil = stm.executeUpdate(query);
} catch (SQLException ex) {
Logger.getLogger(ExecuteAlat.class.getName()).log(Level.SEVERE, null, ex);
}
return hasil;
}
}