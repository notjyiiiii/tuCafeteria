/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package java_assignment;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class AdmUpdDelRun extends javax.swing.JFrame {

    User AdmUser = new User();
    
    public AdmUpdDelRun() throws IOException, ClassNotFoundException {
        initComponents();
        
        String userid = Java_assignment.LoggedInUser.getUserid();
        
        UserHandler admhandler = new UserHandler("User",User.class);
        
        this.AdmUser = admhandler.GetUserByUserID(userid);
        
        lblAdminName.setText(AdmUser.username);
        lblAdminNum.setText(AdmUser.userid);
        
        String[] userIds = new String[admhandler.collection.size()];
        for (int i = 0; i < admhandler.collection.size(); i++) {
            String uid = admhandler.collection.get(i).getUserid();
            
            if(uid.matches("DR.*")){
                userIds[i] = uid;
            }
            
        }
        
        userIds = Arrays.stream(userIds)
        .filter(uid -> uid != null && !uid.isEmpty())
        .toArray(String[]::new);

// Add non-blank elements to cmbUserID
for (String element : userIds) {
    cmbRunID.addItem(element);
}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AMP_Top1 = new javax.swing.JPanel();
        lb_quit2 = new javax.swing.JLabel();
        lb_logoName2 = new javax.swing.JLabel();
        lb_logoPic2 = new javax.swing.JLabel();
        AMP_Left1 = new javax.swing.JPanel();
        lb_tuName2 = new javax.swing.JLabel();
        lb_tuName3 = new javax.swing.JLabel();
        lb_cafeName1 = new javax.swing.JLabel();
        AMP_Right1 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblRunName = new javax.swing.JLabel();
        lblRunID = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblConNum = new javax.swing.JLabel();
        txtRunName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtConNum = new javax.swing.JTextField();
        txtrunPassword = new javax.swing.JTextField();
        lblRunPassword = new javax.swing.JLabel();
        cmbRunID = new javax.swing.JComboBox<>();
        AMP_Bottom1 = new javax.swing.JPanel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(32767, 5));
        lblAdminName = new javax.swing.JLabel();
        lblAdminNum = new javax.swing.JLabel();
        btnSettings1 = new javax.swing.JButton();
        btnTopUp1 = new javax.swing.JButton();
        btnRegistration1 = new javax.swing.JButton();
        btnDashboard1 = new javax.swing.JButton();
        btnNoti1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AMP_Top1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lb_quit2.setFont(new java.awt.Font("Myanmar Sangam MN", 1, 20)); // NOI18N
        lb_quit2.setText("X");
        lb_quit2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_quit2MouseClicked(evt);
            }
        });

        lb_logoName2.setFont(new java.awt.Font("Josefin Sans", 1, 18)); // NOI18N
        lb_logoName2.setText("Tech University");

        lb_logoPic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tuCafeteria_logo.png"))); // NOI18N

        javax.swing.GroupLayout AMP_Top1Layout = new javax.swing.GroupLayout(AMP_Top1);
        AMP_Top1.setLayout(AMP_Top1Layout);
        AMP_Top1Layout.setHorizontalGroup(
            AMP_Top1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AMP_Top1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_logoPic2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_logoName2)
                .addGap(145, 145, 145)
                .addComponent(lb_quit2)
                .addGap(37, 37, 37))
        );
        AMP_Top1Layout.setVerticalGroup(
            AMP_Top1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AMP_Top1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(AMP_Top1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_logoPic2)
                    .addGroup(AMP_Top1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb_logoName2)
                        .addComponent(lb_quit2)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        AMP_Left1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        AMP_Left1.setForeground(new java.awt.Color(204, 204, 204));

        lb_tuName2.setFont(new java.awt.Font("Josefin Sans", 1, 26)); // NOI18N
        lb_tuName2.setText("Tech");

        lb_tuName3.setFont(new java.awt.Font("Josefin Sans", 1, 26)); // NOI18N
        lb_tuName3.setText("University");

        lb_cafeName1.setFont(new java.awt.Font("Josefin Sans", 1, 26)); // NOI18N
        lb_cafeName1.setForeground(new java.awt.Color(255, 189, 49));
        lb_cafeName1.setText("Cafeteria");

        javax.swing.GroupLayout AMP_Left1Layout = new javax.swing.GroupLayout(AMP_Left1);
        AMP_Left1.setLayout(AMP_Left1Layout);
        AMP_Left1Layout.setHorizontalGroup(
            AMP_Left1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AMP_Left1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AMP_Left1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_tuName3)
                    .addComponent(lb_tuName2)
                    .addComponent(lb_cafeName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );
        AMP_Left1Layout.setVerticalGroup(
            AMP_Left1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AMP_Left1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_tuName2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_tuName3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_cafeName1)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        AMP_Right1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        btnUpdate.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdate.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 204, 0));
        btnUpdate.setText("Update");
        btnUpdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(0, 0, 0));
        btnCancel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 204, 0));
        btnCancel.setText("Cancel");
        btnCancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblRunName.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lblRunName.setForeground(new java.awt.Color(255, 204, 102));
        lblRunName.setText("Runner Name:");

        lblRunID.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lblRunID.setForeground(new java.awt.Color(255, 204, 102));
        lblRunID.setText("Runner ID:");

        lblEmail.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 204, 102));
        lblEmail.setText("Email Address:");

        lblConNum.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lblConNum.setForeground(new java.awt.Color(255, 204, 102));
        lblConNum.setText("Contact Number:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtrunPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrunPasswordActionPerformed(evt);
            }
        });

        lblRunPassword.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lblRunPassword.setForeground(new java.awt.Color(255, 204, 102));
        lblRunPassword.setText("Password:");

        cmbRunID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRunIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AMP_Right1Layout = new javax.swing.GroupLayout(AMP_Right1);
        AMP_Right1.setLayout(AMP_Right1Layout);
        AMP_Right1Layout.setHorizontalGroup(
            AMP_Right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AMP_Right1Layout.createSequentialGroup()
                .addGroup(AMP_Right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AMP_Right1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(AMP_Right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AMP_Right1Layout.createSequentialGroup()
                                .addGroup(AMP_Right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRunID)
                                    .addComponent(lblRunName))
                                .addGap(42, 42, 42)
                                .addGroup(AMP_Right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtRunName, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                    .addComponent(cmbRunID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(lblEmail)
                            .addGroup(AMP_Right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(AMP_Right1Layout.createSequentialGroup()
                                    .addComponent(lblConNum)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtConNum, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(AMP_Right1Layout.createSequentialGroup()
                                    .addComponent(lblRunPassword)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtrunPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(AMP_Right1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AMP_Right1Layout.setVerticalGroup(
            AMP_Right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AMP_Right1Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(AMP_Right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRunID)
                    .addComponent(cmbRunID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AMP_Right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRunName)
                    .addComponent(txtRunName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AMP_Right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRunPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtrunPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AMP_Right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AMP_Right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConNum)
                    .addComponent(txtConNum, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(AMP_Right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        AMP_Bottom1.setBackground(new java.awt.Color(58, 54, 54));
        AMP_Bottom1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        filler2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblAdminName.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lblAdminName.setForeground(new java.awt.Color(255, 204, 102));
        lblAdminName.setText("Admin Name");

        lblAdminNum.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblAdminNum.setForeground(new java.awt.Color(255, 204, 102));
        lblAdminNum.setText("Admin Num");

        btnSettings1.setBackground(new java.awt.Color(0, 0, 0));
        btnSettings1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/settings.png"))); // NOI18N
        btnSettings1.setText("jButton3");
        btnSettings1.setIconTextGap(-6);
        btnSettings1.setMaximumSize(new java.awt.Dimension(55, 55));
        btnSettings1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettings1ActionPerformed(evt);
            }
        });

        btnTopUp1.setBackground(new java.awt.Color(0, 0, 0));
        btnTopUp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/top up.png"))); // NOI18N
        btnTopUp1.setText("jButton3");
        btnTopUp1.setIconTextGap(-6);
        btnTopUp1.setMaximumSize(new java.awt.Dimension(55, 55));
        btnTopUp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopUp1ActionPerformed(evt);
            }
        });

        btnRegistration1.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistration1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/registration.png"))); // NOI18N
        btnRegistration1.setText("jButton3");
        btnRegistration1.setIconTextGap(-6);
        btnRegistration1.setMaximumSize(new java.awt.Dimension(55, 55));
        btnRegistration1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistration1ActionPerformed(evt);
            }
        });

        btnDashboard1.setBackground(new java.awt.Color(0, 0, 0));
        btnDashboard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dashboard.png"))); // NOI18N
        btnDashboard1.setText("jButton3");
        btnDashboard1.setIconTextGap(-6);
        btnDashboard1.setMaximumSize(new java.awt.Dimension(55, 55));
        btnDashboard1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboard1ActionPerformed(evt);
            }
        });

        btnNoti1.setBackground(new java.awt.Color(51, 51, 51));
        btnNoti1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/notifiactions.png"))); // NOI18N
        btnNoti1.setText("jButton3");
        btnNoti1.setIconTextGap(-6);
        btnNoti1.setMaximumSize(new java.awt.Dimension(55, 55));
        btnNoti1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoti1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AMP_Bottom1Layout = new javax.swing.GroupLayout(AMP_Bottom1);
        AMP_Bottom1.setLayout(AMP_Bottom1Layout);
        AMP_Bottom1Layout.setHorizontalGroup(
            AMP_Bottom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AMP_Bottom1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AMP_Bottom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAdminNum, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdminName))
                .addGap(55, 55, 55)
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNoti1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDashboard1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistration1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTopUp1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSettings1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );
        AMP_Bottom1Layout.setVerticalGroup(
            AMP_Bottom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(filler2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(AMP_Bottom1Layout.createSequentialGroup()
                .addGroup(AMP_Bottom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AMP_Bottom1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(AMP_Bottom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSettings1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTopUp1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistration1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDashboard1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNoti1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(AMP_Bottom1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblAdminName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAdminNum, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AMP_Top1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(AMP_Left1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AMP_Right1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(AMP_Bottom1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(AMP_Top1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AMP_Left1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AMP_Right1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AMP_Bottom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb_quit2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_quit2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_lb_quit2MouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
        AdmUpdMain update;
        try {
            update = new AdmUpdMain();
            update.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(AdmUpdDelRun.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdmUpdDelRun.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtrunPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrunPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrunPasswordActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        User selus = new User();

            User newselus = new User();
            UserHandler ushan;
        try {
            ushan = new UserHandler("User",User.class);
            
            selus = ushan.GetUserByUserID(cmbRunID.getSelectedItem().toString());
            
            newselus.setUserid(cmbRunID.getSelectedItem().toString());
            newselus.setUsername(txtRunName.getText());
            newselus.setPassword(txtrunPassword.getText());
            newselus.setEmail(txtEmail.getText());
            newselus.setHpnum(txtConNum.getText());
            newselus.setRole("Runner");
            
            ushan.UpdateItem(selus, newselus);
            JOptionPane.showMessageDialog(null,"Successfully Updated.");
        } catch (IOException ex) {
            Logger.getLogger(AdmUpdDelRun.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdmUpdDelRun.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnNoti1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoti1ActionPerformed
        this.dispose();
        AdmNoti noti;
        try {
            noti = new AdmNoti();
            noti.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(AdmUpdDelRun.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdmUpdDelRun.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnNoti1ActionPerformed

    private void btnDashboard1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboard1ActionPerformed
        this.dispose();
        AdmMainPage main;
        try {
            main = new AdmMainPage();
            main.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(AdmUpdDelRun.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdmUpdDelRun.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnDashboard1ActionPerformed

    private void btnRegistration1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistration1ActionPerformed
        this.dispose();
        AdmRegMain reg;
        try {
            reg = new AdmRegMain();
            reg.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(AdmUpdDelRun.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdmUpdDelRun.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnRegistration1ActionPerformed

    private void btnTopUp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopUp1ActionPerformed
        this.dispose();
        AdmTopUp topup;
        try {
            topup = new AdmTopUp();
            topup.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(AdmUpdDelRun.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdmUpdDelRun.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnTopUp1ActionPerformed

    private void btnSettings1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettings1ActionPerformed
        this.dispose();
        AdmSettings sett;
        try {
            sett = new AdmSettings();
            sett.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(AdmRegCus.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdmRegCus.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnSettings1ActionPerformed

    private void cmbRunIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRunIDActionPerformed
        User selected = new User();
        UserHandler selhandler;
        try {
            selhandler = new UserHandler("User",User.class);
            
            selected = selhandler.GetUserByUserID(cmbRunID.getSelectedItem().toString());
            
            txtRunName.setText(selected.getUsername());
            txtrunPassword.setText(selected.getPassword());
            txtEmail.setText(selected.getEmail());
            txtConNum.setText(selected.getHpnum());
        } catch (IOException ex) {
            Logger.getLogger(AdmUpdDelRun.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdmUpdDelRun.class.getName()).log(Level.SEVERE, null, ex);
        }            
    }//GEN-LAST:event_cmbRunIDActionPerformed

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
            java.util.logging.Logger.getLogger(AdmUpdDelRun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdmUpdDelRun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdmUpdDelRun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdmUpdDelRun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AdmUpdDelRun().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(AdmUpdDelRun.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AdmUpdDelRun.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AMP_Bottom1;
    private javax.swing.JPanel AMP_Left1;
    private javax.swing.JPanel AMP_Right1;
    private javax.swing.JPanel AMP_Top1;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDashboard1;
    private javax.swing.JButton btnNoti1;
    private javax.swing.JButton btnRegistration1;
    private javax.swing.JButton btnSettings1;
    private javax.swing.JButton btnTopUp1;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbRunID;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel lb_cafeName1;
    private javax.swing.JLabel lb_logoName2;
    private javax.swing.JLabel lb_logoPic2;
    private javax.swing.JLabel lb_quit2;
    private javax.swing.JLabel lb_tuName2;
    private javax.swing.JLabel lb_tuName3;
    private javax.swing.JLabel lblAdminName;
    private javax.swing.JLabel lblAdminNum;
    private javax.swing.JLabel lblConNum;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblRunID;
    private javax.swing.JLabel lblRunName;
    private javax.swing.JLabel lblRunPassword;
    private javax.swing.JTextField txtConNum;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtRunName;
    private javax.swing.JTextField txtrunPassword;
    // End of variables declaration//GEN-END:variables
}
