/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;

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
public class ExecuteUser {
public List<User> getAllUser(){
String query = "select * from user";
ConnectionManager conMan = new ConnectionManager();
List<User> lsUser = new ArrayList<User>();
Connection conn = conMan.logOn();
try {
Statement stm = conn.createStatement();
ResultSet rs = stm.executeQuery(query);
while(rs.next()){
User us = new User();
us.setId_user(rs.getString("id_user"));
us.setNama_user(rs.getString("nama_user"));
us.setUsername(rs.getString("username"));
us.setPassword(rs.getString("password"));
us.setLevel(rs.getString("level"));
lsUser.add(us);
}
} catch (SQLException ex) {
Logger.getLogger(ExecuteUser.class.getName()).log(Level.SEVERE, null, ex);
}
conMan.logOff();
return lsUser;
}

public int insertData(User us){
int hasil = 0;
String query ="insert into user(id_user, nama_user, username, password, level)values"
+ "('"+us.getId_user()+"','"+us.getNama_user()+"','"+us.getUsername()+"','"+us.getPassword()+"','"+us.getLevel()+"')";
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

public int hapusData(String id_user){
String query = "Delete from user where id_user='"+id_user+"'";
int hasil = 0;
ConnectionManager conMan = new ConnectionManager();
Connection conn = conMan.logOn();
try {
Statement stm = conn.createStatement();
hasil = stm.executeUpdate(query);

} catch (SQLException ex) {
Logger.getLogger(ExecuteUser.class.getName()).log(Level.SEVERE, null, ex);
}
conMan.logOff();
return hasil;
}

public int ubahData(User us){
int hasil = 0;
ConnectionManager conMan = new ConnectionManager();
Connection conn = conMan.logOn();
String query = "Update user set nama_user ='"+us.getNama_user()+"', username='"+us.getUsername()+"',"
+ "password='"+us.getPassword()+"',level='"+us.getLevel()+"'"
+ "where id_user='"+us.getId_user()+"'";
try {
Statement stm = conn.createStatement();
hasil = stm.executeUpdate(query);
} catch (SQLException ex) {
Logger.getLogger(ExecuteUser.class.getName()).log(Level.SEVERE, null, ex);
}
return hasil;
}

}
