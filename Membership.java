/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eztixapp;

import java.util.Random;


interface Voucher {
    public void DiscVoucher();
}

public class Membership implements Voucher {
    
    public String status1;
    StringBuilder salt = new StringBuilder();
    public String coupon;
    
    public String getStatus() {
        setMember();
        return status1;
    }
    
    public void setMember() {
        status1 = "REGULER";
    }
    
    public String getCoupon() {
        DiscVoucher();
        this.coupon = salt.toString(); 
        return coupon;
    }
    
    public void printCoupon(){
        System.out.println(this.coupon);
    }
    
    @Override
    public void DiscVoucher() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        Random rnd = new Random();
        
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        salt.append("05");
    }
}
