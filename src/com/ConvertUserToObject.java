/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import exec.ExecuteUser;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author MuhammadRauf
 */
public class ConvertUserToObject {
    
public String[][] getUser(){
List<User> myUs = new ArrayList<User>();
    ExecuteUser eUs = new ExecuteUser();
    myUs = eUs.getAllUser();
String[][] dataUser = new String[myUs.size()][5];
int i=0;
for(User us : myUs){
    dataUser[i][0] = us.getId_user();
    dataUser[i][1] = us.getNama_user();
    dataUser[i][2] = us.getUsername();
    dataUser[i][3] = us.getPassword();
    dataUser[i][4] = us.getLevel();
i++;
}
return dataUser;
}
}
