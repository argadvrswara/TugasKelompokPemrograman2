/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eztixapp;

import java.util.Random;

public class SilverMember extends Membership {
    public String status3;
    StringBuilder salt = new StringBuilder();
    public String coupon;
    
    @Override
    public String getCoupon() {
        DiscVoucher();
        this.coupon = salt.toString(); 
        return coupon;
    }
    
    @Override
    public String getStatus() {
        setMember();
        return status3;
    }
    
    @Override
    public void setMember () {
        status3 = "SILVER";
    }
    
    @Override
    public void DiscVoucher() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        Random rnd = new Random();
        
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        salt.append("10");
    }
}
