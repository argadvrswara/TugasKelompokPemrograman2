/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.eztixapp;

import java.awt.*;
import java.io.File;
import java.util.Scanner;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        notMatch.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginPanel = new javax.swing.JPanel();
        LoginHeadline = new javax.swing.JLabel();
        UsernameTitle = new javax.swing.JLabel();
        PasswordTitle = new javax.swing.JLabel();
        usernameInputLogin = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        notMatch = new javax.swing.JLabel();
        redirectRegister = new javax.swing.JButton();
        passwordInputLogin = new javax.swing.JPasswordField();
        FooterLogin = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 470));
        setPreferredSize(new java.awt.Dimension(400, 470));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        LoginPanel.setBackground(new java.awt.Color(0, 144, 158));

        LoginHeadline.setFont(new java.awt.Font("Plus Jakarta Sans", Font.BOLD, 40)); // NOI18N
        LoginHeadline.setText("EZ-Tix");

        UsernameTitle.setFont(new java.awt.Font("Plus Jakarta Sans", Font.PLAIN, 14)); // NOI18N
        UsernameTitle.setText("Username");

        PasswordTitle.setFont(new java.awt.Font("Plus Jakarta Sans", Font.PLAIN, 14)); // NOI18N
        PasswordTitle.setText("Password");

        loginButton.setFont(new java.awt.Font("Plus Jakarta Sans", Font.PLAIN, 12)); // NOI18N
        loginButton.setText("Login");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        notMatch.setForeground(new java.awt.Color(225, 77, 42));
        notMatch.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        notMatch.setText("*username and password doesn't match");

        redirectRegister.setBackground(new java.awt.Color(255, 158, 11));
        redirectRegister.setText("Register");
        redirectRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redirectRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(redirectRegister)
                            .addComponent(notMatch)
                            .addComponent(loginButton)
                            .addComponent(UsernameTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(PasswordTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usernameInputLogin, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordInputLogin, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(LoginHeadline)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(LoginHeadline, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(UsernameTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameInputLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PasswordTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordInputLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(notMatch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(redirectRegister)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        FooterLogin.setBackground(new java.awt.Color(0, 104, 132));

        javax.swing.GroupLayout FooterLoginLayout = new javax.swing.GroupLayout(FooterLogin);
        FooterLogin.setLayout(FooterLoginLayout);
        FooterLoginLayout.setHorizontalGroup(
            FooterLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        FooterLoginLayout.setVerticalGroup(
            FooterLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(FooterLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FooterLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        String username = (String) usernameInputLogin.getText();
        String password = (String) passwordInputLogin.getText();
        
        if (!checkUsername(username, password)){
            notMatch.setVisible(false);
            this.setVisible(false);
            
            new WelcomeFrame(username, new Payment()).setVisible(true);
        } else  {
            notMatch.setVisible(true);
        }
    }//GEN-LAST:event_loginButtonActionPerformed
    
    private boolean checkUsername(String username, String password) {
        try {
            Scanner dataScanner = new Scanner(data);
            while (dataScanner.hasNextLine()) {
                String[] keyValue = dataScanner.nextLine().split(":");
                if (keyValue[0].equals(username) && keyValue[1].equals(password)) {
                    return false;
                }
            }
            dataScanner.close();
        } catch (Exception e) {
            return true;
        }
        return true;
    }
    
    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButtonMouseClicked

    private void redirectRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redirectRegisterActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Register().setVisible(true);
    }//GEN-LAST:event_redirectRegisterActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
        
    private final File data = new File("data.txt");
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FooterLogin;
    private javax.swing.JLabel LoginHeadline;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JLabel PasswordTitle;
    private javax.swing.JLabel UsernameTitle;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel notMatch;
    private javax.swing.JPasswordField passwordInputLogin;
    private javax.swing.JButton redirectRegister;
    private javax.swing.JTextField usernameInputLogin;
    // End of variables declaration//GEN-END:variables
}
