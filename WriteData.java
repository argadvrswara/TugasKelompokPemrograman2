/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eztixapp;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;


public class WriteData {
    
    public void WriteData (String dataName, String username, String password) {
        File data = new File(dataName + ".txt");
        
        new Thread(() -> {
            try {
                FileWriter fileWriter = new FileWriter(data, true);
                PrintWriter printWriter = new PrintWriter(fileWriter, false);
                
                printWriter.println(username + ":" + password); 
                
                printWriter.close();
            } catch (Exception ignored) {
                ignored.printStackTrace();
            }
        }).start();
    }
    
    public void WriteData (String dataName, int balance) {
        File data = new File("balance.txt");
        String bal = String.valueOf(balance);
        
        new Thread(() -> {
            try {
                FileWriter fileWriter = new FileWriter(data, true);
                PrintWriter printWriter = new PrintWriter(fileWriter, false);
                
                printWriter.println(dataName + ":" + bal); 
                
                printWriter.close();
            } catch (Exception ignored) {
                ignored.printStackTrace();
            }
        }).start();
    }
    
    public void WriteData (String username, ArrayList<String> order){
        
        new Thread(() -> {
            try {
                File user = new File (username + ".txt");
                FileWriter fileWriter = new FileWriter(user, true);
                PrintWriter printWriter = new PrintWriter(fileWriter, false);
                
                for (int i=0; i < order.size() ; i++) {
                    printWriter.print(order.get(i) + "/");
                }
                printWriter.println();
                printWriter.close();
            } catch (Exception ignored) {
                
            }
        }).start();
    }
}

