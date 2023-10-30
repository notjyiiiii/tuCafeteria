package java_assignment;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;




public class VendorRegister extends javax.swing.JFrame {
    
    private int userID;
    private String name;
    private String pw;
    private String hpnum;
    private String email;

    public VendorRegister() {
        initComponents();
        jLabel1.setText("VD");
        lb_roleauto.setText("Vendor");
    }
    
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topPanel1 = new javax.swing.JPanel();
        lb_logoPic1 = new javax.swing.JLabel();
        lb_logoName1 = new javax.swing.JLabel();
        lb_quit1 = new javax.swing.JLabel();
        bottomPanel = new javax.swing.JPanel();
        lb_Name = new javax.swing.JLabel();
        tf_Name = new javax.swing.JTextField();
        lb_pw = new javax.swing.JLabel();
        tf_pw = new javax.swing.JTextField();
        bt_register = new javax.swing.JButton();
        lb_userID = new javax.swing.JLabel();
        lb_email = new javax.swing.JLabel();
        tf_email = new javax.swing.JTextField();
        lb_hp = new javax.swing.JLabel();
        tf_hp = new javax.swing.JTextField();
        lb_userIDauto = new javax.swing.JLabel();
        lb_roleauto = new javax.swing.JLabel();
        lb_role = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        topPanel1.setBackground(new java.awt.Color(246, 246, 246));

        lb_logoPic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tuCafeteria_logo.png"))); // NOI18N

        lb_logoName1.setFont(new java.awt.Font("Josefin Sans", 1, 18)); // NOI18N
        lb_logoName1.setText("Tech University");

        lb_quit1.setFont(new java.awt.Font("Myanmar Sangam MN", 1, 20)); // NOI18N
        lb_quit1.setText("X");
        lb_quit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_quit1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout topPanel1Layout = new javax.swing.GroupLayout(topPanel1);
        topPanel1.setLayout(topPanel1Layout);
        topPanel1Layout.setHorizontalGroup(
            topPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_logoPic1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_logoName1)
                .addGap(131, 131, 131)
                .addComponent(lb_quit1)
                .addGap(37, 37, 37))
        );
        topPanel1Layout.setVerticalGroup(
            topPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(topPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_logoPic1)
                    .addGroup(topPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb_logoName1)
                        .addComponent(lb_quit1)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        bottomPanel.setBackground(new java.awt.Color(246, 246, 246));

        lb_Name.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_Name.setText("Name:");

        lb_pw.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_pw.setText("Password:");

        bt_register.setBackground(new java.awt.Color(255, 189, 49));
        bt_register.setFont(new java.awt.Font("Josefin Sans", 0, 20)); // NOI18N
        bt_register.setText("Register");
        bt_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_registerMouseClicked(evt);
            }
        });

        lb_userID.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_userID.setText("User ID:");

        lb_email.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_email.setText("Email:");

        lb_hp.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_hp.setText("Mobile Number:");

        lb_role.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_role.setText("Role:");

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb_pw)
                            .addComponent(lb_Name)
                            .addComponent(tf_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(tf_pw))
                        .addComponent(lb_userID))
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lb_userIDauto, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_email)
                    .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_hp)
                    .addComponent(tf_hp, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_roleauto, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_role))
                .addGap(36, 36, 36))
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(bt_register, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addComponent(lb_userID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb_userIDauto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)))
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addComponent(lb_role)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_roleauto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                        .addComponent(lb_Name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                        .addComponent(lb_email)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addComponent(lb_pw)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_pw, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addComponent(lb_hp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_hp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addComponent(bt_register, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb_quit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_quit1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_lb_quit1MouseClicked

    private void bt_registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_registerMouseClicked
        name = tf_Name.getText();
        email = tf_email.getText();
        hpnum = tf_hp.getText();
        pw = tf_pw.getText();
        
        fileManager fm = new fileManager();
        String key = "User";
        String configVar = fm.getConfigVar(key, true);
        try {
            
            FileWriter fileWriter = new FileWriter(configVar,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            
            bufferedWriter.write("Name: " + name);
            bufferedWriter.newLine();
            bufferedWriter.write("Email: " + email);
            bufferedWriter.newLine();
            bufferedWriter.write("Phone Number: " + hpnum);
            bufferedWriter.newLine();
            bufferedWriter.write("Password: " + pw);
            bufferedWriter.newLine();
            bufferedWriter.newLine();

            // Close the BufferedWriter and FileWriter
            bufferedWriter.close();
            fileWriter.close();

            System.out.println("Data has been successfully written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_bt_registerMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendorRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton bt_register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_Name;
    private javax.swing.JLabel lb_email;
    private javax.swing.JLabel lb_hp;
    private javax.swing.JLabel lb_logoName1;
    private javax.swing.JLabel lb_logoPic1;
    private javax.swing.JLabel lb_pw;
    private javax.swing.JLabel lb_quit1;
    private javax.swing.JLabel lb_role;
    private javax.swing.JLabel lb_roleauto;
    private javax.swing.JLabel lb_userID;
    private javax.swing.JLabel lb_userIDauto;
    private javax.swing.JTextField tf_Name;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_hp;
    private javax.swing.JTextField tf_pw;
    private javax.swing.JPanel topPanel1;
    // End of variables declaration//GEN-END:variables
}
