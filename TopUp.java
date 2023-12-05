/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eztixapp;

import java.io.File;
import java.util.Scanner;


public class TopUp{
    public int balance;
    public int paymentCode;

    
    public void TopUp(int topUpBalance) {
        balance += topUpBalance;
    }
    
    public int getBalance(String username) {
        try {
            File user = new File ("balance.txt");
            Scanner dataScanner = new Scanner(user);
            while (dataScanner.hasNextLine()) {
                String[] keyValue = dataScanner.nextLine().split(":");
                if (keyValue[0].equals(username)) {
                    int number = Integer.parseInt(keyValue[1]);
                    balance += number;
                }
            }
            dataScanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        int bal = balance;
        balance = 0;
        return bal;
    }
    
    public void payment(int total) {
        balance -= total;
    }
}
