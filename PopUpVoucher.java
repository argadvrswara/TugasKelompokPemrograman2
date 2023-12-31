/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.eztixapp;

public class PopUpVoucher extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    static String name;
    static String statusrn;
    
    private Payment pushCoupon;
    
    public PopUpVoucher(String username, String statusrn, Payment pushCoupon) {
        initComponents();
        name = username;
        
        if ("GOLD".equals(statusrn)){
            GoldMember a = new GoldMember();
            couponCode.setText(a.getCoupon());
        } else if ("SILVER".equals(statusrn)){
            SilverMember a = new SilverMember();
            couponCode.setText(a.getCoupon());
        } else {
            Membership a = new Membership();
            couponCode.setText(a.getCoupon());
        }
        
        this.pushCoupon = pushCoupon;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        couponCode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        addCoupon = new javax.swing.JButton();
        ignoreCoupon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        couponCode.setEditable(false);
        couponCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        couponCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                couponCodeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Coupon");

        addCoupon.setBackground(new java.awt.Color(204, 255, 204));
        addCoupon.setText("claim");
        addCoupon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCouponActionPerformed(evt);
            }
        });

        ignoreCoupon.setBackground(new java.awt.Color(255, 102, 102));
        ignoreCoupon.setText("ignore");
        ignoreCoupon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ignoreCouponActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(104, 104, 104))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(couponCode, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ignoreCoupon)
                        .addGap(18, 18, 18)
                        .addComponent(addCoupon)
                        .addGap(45, 45, 45))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(couponCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCoupon)
                    .addComponent(ignoreCoupon))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void couponCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_couponCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_couponCodeActionPerformed

    private void addCouponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCouponActionPerformed
        // TODO add your handling code here:
        pushCoupon.PaymentCut((String)couponCode.getText());

        this.setVisible(false);
        new WelcomeFrame(name, pushCoupon).setVisible(true);
    }//GEN-LAST:event_addCouponActionPerformed

    private void ignoreCouponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ignoreCouponActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new WelcomeFrame(name, pushCoupon).setVisible(true);
    }//GEN-LAST:event_ignoreCouponActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCoupon;
    private javax.swing.JTextField couponCode;
    private javax.swing.JButton ignoreCoupon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
