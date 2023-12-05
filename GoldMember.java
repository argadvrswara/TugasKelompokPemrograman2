/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eztixapp;

import java.util.Random;


public class GoldMember extends Membership {
    public String status2;
    
    @Override
    public String getCoupon() {
        DiscVoucher();
        this.coupon = salt.toString(); 
        return coupon;
    }
    
    @Override
    public String getStatus() {
        setMember();
        return status2;
    }
    
    @Override
    public void setMember () {
        status2 = "GOLD";
    }
    
    @Override
    public void DiscVoucher() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        Random rnd = new Random();
        
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        salt.append("30");
    }
    
    public static void main(String args[]) {
        GoldMember a = new GoldMember();
        a.DiscVoucher();
    }
}
