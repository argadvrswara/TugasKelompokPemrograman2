/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eztixapp;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;


abstract class Cut {
    public abstract void PaymentCut(String code);
    
    Queue<Integer> discVTotal = new PriorityQueue<>();
    int totalCut = 0;
    
    public int getPayment() {
        Iterator iterator = discVTotal.iterator();
        while(iterator.hasNext()) {
            totalCut += (int)iterator.next();
        }
        return totalCut;
    }
}

public class Payment extends Cut {
    
    @Override
    public void PaymentCut(String code) {
            String value = code;
            String lastTwo = null;
            if (value != null && value.length() >= 2) {  
                lastTwo = value.substring(value.length() - 2);
                
                if ("30".equals(lastTwo)) {
                discVTotal.add(30000);
                } else if ("10".equals(lastTwo)) {
                    discVTotal.add(10000);
                } else {
                    discVTotal.add(5000);
                }
            }
    }

}
