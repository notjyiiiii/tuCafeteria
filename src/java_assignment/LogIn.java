package java_assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LogIn extends javax.swing.JFrame {

    
    private static void checkInput() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public LogIn() {
        initComponents();
        setVisible(true);
        
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topPanel = new javax.swing.JPanel();
        lb_logoPic = new javax.swing.JLabel();
        lb_logoName = new javax.swing.JLabel();
        lb_quit = new javax.swing.JLabel();
        bottomPanel = new javax.swing.JPanel();
        lb_tuName = new javax.swing.JLabel();
        lb_cafeName = new javax.swing.JLabel();
        lb_motto = new javax.swing.JLabel();
        lb_userID = new javax.swing.JLabel();
        tf_userID = new javax.swing.JTextField();
        lb_pw = new javax.swing.JLabel();
        bt_logIn = new javax.swing.JButton();
        lb_forgotpw = new javax.swing.JLabel();
        cb_showPw = new javax.swing.JCheckBox();
        pwf_pw = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        topPanel.setBackground(new java.awt.Color(246, 246, 246));

        lb_logoPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tuCafeteria_logo.png"))); // NOI18N

        lb_logoName.setFont(new java.awt.Font("Josefin Sans", 1, 18)); // NOI18N
        lb_logoName.setText("Tech University");

        lb_quit.setFont(new java.awt.Font("Myanmar Sangam MN", 1, 20)); // NOI18N
        lb_quit.setText("X");
        lb_quit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_quitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(lb_logoPic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_logoName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(lb_quit)
                .addGap(37, 37, 37))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_logoPic)
                    .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb_logoName)
                        .addComponent(lb_quit)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        bottomPanel.setBackground(new java.awt.Color(246, 246, 246));

        lb_tuName.setFont(new java.awt.Font("Josefin Sans", 1, 28)); // NOI18N
        lb_tuName.setText("Tech University");

        lb_cafeName.setFont(new java.awt.Font("Josefin Sans", 1, 28)); // NOI18N
        lb_cafeName.setForeground(new java.awt.Color(255, 189, 49));
        lb_cafeName.setText("Cafeteria");

        lb_motto.setFont(new java.awt.Font("Kaiti SC", 1, 16)); // NOI18N
        lb_motto.setText("Serving you the best quality.");

        lb_userID.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_userID.setText("User ID:");

        lb_pw.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_pw.setText("Password:");

        bt_logIn.setBackground(new java.awt.Color(255, 189, 49));
        bt_logIn.setFont(new java.awt.Font("Josefin Sans", 0, 20)); // NOI18N
        bt_logIn.setText("Log In");
        bt_logIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_logInMouseClicked(evt);
            }
        });
        bt_logIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_logInActionPerformed(evt);
            }
        });

        lb_forgotpw.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_forgotpw.setForeground(new java.awt.Color(0, 153, 255));
        lb_forgotpw.setText("Forgot Password?");

        cb_showPw.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        cb_showPw.setText("Show Password");

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb_pw)
                            .addComponent(tf_userID, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                            .addComponent(lb_motto)
                            .addComponent(lb_tuName)
                            .addComponent(lb_cafeName)
                            .addComponent(lb_userID)
                            .addComponent(cb_showPw)
                            .addComponent(pwf_pw)))
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_logIn, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(lb_forgotpw)
                                .addGap(35, 35, 35)))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lb_tuName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_cafeName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_motto)
                .addGap(55, 55, 55)
                .addComponent(lb_userID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_userID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_pw)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwf_pw, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_showPw)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(bt_logIn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_forgotpw)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb_quitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_quitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lb_quitMouseClicked

    private void bt_logInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_logInMouseClicked
        
        String password = pwf_pw.getText();
        String userid = tf_userID.getText();
            
        Login(userid, password);
            
    }//GEN-LAST:event_bt_logInMouseClicked

    private void bt_logInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_logInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_logInActionPerformed

    private void Login(String userid, String password)
    {
        try {
            UserHandler handler = new UserHandler("User", User.class);
            User user = handler.ValidateUserCredential(userid, password);
       
            if(user==null){
                int a = JOptionPane.showConfirmDialog(null, "Please enter valid UserID and Password.","Error", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            Java_assignment.LoggedInUser = user;
            
            String userRole = user.getRole();
            switch(userRole){
                case "Vendor":
                    this.dispose(); 
                    //VendorMainPage vmp = new VendorMainPage();
                    //vmp.setVisible(true);
                    break;
                    
                case "Customer":
                    this.dispose();
                    CUSTOMER_Main vr = new CUSTOMER_Main();
                    vr.setVisible(true);
                    break;
                // TODO: More switch case for each role
                    
                case "Admin":
//                    this.dispose(); 
//                    AdmMainPage amp = new AdmMainPage();
//                    amp.setVisible(true);
                    break;    
                    
        }
        } catch (IOException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton bt_logIn;
    private javax.swing.JCheckBox cb_showPw;
    private javax.swing.JLabel lb_cafeName;
    private javax.swing.JLabel lb_forgotpw;
    private javax.swing.JLabel lb_logoName;
    private javax.swing.JLabel lb_logoPic;
    private javax.swing.JLabel lb_motto;
    private javax.swing.JLabel lb_pw;
    private javax.swing.JLabel lb_quit;
    private javax.swing.JLabel lb_tuName;
    private javax.swing.JLabel lb_userID;
    private javax.swing.JPasswordField pwf_pw;
    private javax.swing.JTextField tf_userID;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables

}
