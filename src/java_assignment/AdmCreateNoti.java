/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package java_assignment;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class AdmCreateNoti extends javax.swing.JFrame {

    public AdmCreateNoti() throws IOException, ClassNotFoundException {
        initComponents();
        UserHandler admhandler = new UserHandler("User",User.class);
        String[] userIds = new String[admhandler.collection.size()];
        for (int i = 0; i < admhandler.collection.size(); i++) {
            userIds[i] = admhandler.collection.get(i).getUserid();
        }
        
        for (String element : userIds) {
            cmbRecID.addItem(element);
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

        AMP_Bottom1 = new javax.swing.JPanel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(32767, 5));
        lblAdminName1 = new javax.swing.JLabel();
        lblAdminNum1 = new javax.swing.JLabel();
        btnSettings1 = new javax.swing.JButton();
        btnTopUp1 = new javax.swing.JButton();
        btnRegistration1 = new javax.swing.JButton();
        btnDashboard1 = new javax.swing.JButton();
        btnNoti1 = new javax.swing.JButton();
        AMP_Right1 = new javax.swing.JPanel();
        btnSend = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblCusName = new javax.swing.JLabel();
        lblCusID = new javax.swing.JLabel();
        txtNotiID = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        cmbRecID = new javax.swing.JComboBox<>();
        AMP_Left1 = new javax.swing.JPanel();
        lb_tuName2 = new javax.swing.JLabel();
        lb_tuName3 = new javax.swing.JLabel();
        lb_cafeName1 = new javax.swing.JLabel();
        AMP_Top1 = new javax.swing.JPanel();
        lb_quit2 = new javax.swing.JLabel();
        lb_logoName2 = new javax.swing.JLabel();
        lb_logoPic2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AMP_Bottom1.setBackground(new java.awt.Color(58, 54, 54));
        AMP_Bottom1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        filler2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblAdminName1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lblAdminName1.setForeground(new java.awt.Color(255, 204, 102));
        lblAdminName1.setText("Admin Name");

        lblAdminNum1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblAdminNum1.setForeground(new java.awt.Color(255, 204, 102));
        lblAdminNum1.setText("Admin Num");

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
                    .addComponent(lblAdminNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdminName1))
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
                        .addComponent(lblAdminName1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAdminNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AMP_Right1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        btnSend.setBackground(new java.awt.Color(0, 0, 0));
        btnSend.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnSend.setForeground(new java.awt.Color(255, 204, 0));
        btnSend.setText("Send");
        btnSend.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
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

        lblCusName.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lblCusName.setForeground(new java.awt.Color(255, 204, 102));
        lblCusName.setText("Recipient ID:");

        lblCusID.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lblCusID.setForeground(new java.awt.Color(255, 204, 102));
        lblCusID.setText("Notification ID:");

        lblPassword.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 204, 102));
        lblPassword.setText("Message:");

        javax.swing.GroupLayout AMP_Right1Layout = new javax.swing.GroupLayout(AMP_Right1);
        AMP_Right1.setLayout(AMP_Right1Layout);
        AMP_Right1Layout.setHorizontalGroup(
            AMP_Right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AMP_Right1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AMP_Right1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AMP_Right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(AMP_Right1Layout.createSequentialGroup()
                        .addGroup(AMP_Right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCusID)
                            .addComponent(lblCusName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(AMP_Right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNotiID, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbRecID, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AMP_Right1Layout.createSequentialGroup()
                        .addComponent(lblPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        AMP_Right1Layout.setVerticalGroup(
            AMP_Right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AMP_Right1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(AMP_Right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCusID)
                    .addComponent(txtNotiID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AMP_Right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCusName)
                    .addComponent(cmbRecID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AMP_Right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addGap(18, 25, Short.MAX_VALUE)
                .addGroup(AMP_Right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
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
                .addContainerGap(192, Short.MAX_VALUE))
        );

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

    private void btnTopUp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopUp1ActionPerformed
        this.dispose();
        AdmTopUp topup;
        try {
            topup = new AdmTopUp();
            topup.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(AdmRegCus.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdmRegCus.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnTopUp1ActionPerformed

    private void btnRegistration1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistration1ActionPerformed
        this.dispose();
        AdmRegMain reg;
        try {
            reg = new AdmRegMain();
            reg.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(AdmRegCus.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdmRegCus.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnRegistration1ActionPerformed

    private void btnDashboard1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboard1ActionPerformed
        this.dispose();
        AdmMainPage main;
        try {
            main = new AdmMainPage();
            main.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(AdmRegCus.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdmRegCus.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnDashboard1ActionPerformed

    private void btnNoti1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoti1ActionPerformed
        this.dispose();
        AdmNoti noti;
        try {
            noti = new AdmNoti();
            noti.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(AdmRegCus.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdmRegCus.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnNoti1ActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed

        try {
            NotificationHandler notihan = new NotificationHandler("Notification",Notification.class);
            Notification newnoti = new Notification();
            
            newnoti.setNotiID(txtNotiID.getText());
            newnoti.setSenderID(Java_assignment.LoggedInUser.getUserid());
            newnoti.setRecipientID(cmbRecID.getSelectedItem().toString());
            newnoti.setNotiMessage(txtMessage.getText());
            newnoti.setNotiDateTime(LocalDateTime.now());
            newnoti.setNotiStatus("Unread");
            notihan.AddNewItem(newnoti);
            
        } catch (IOException ex) {
            Logger.getLogger(AdmCreateNoti.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdmCreateNoti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
        AdmNoti noti;
        try {
            noti = new AdmNoti();
            noti.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(AdmRegCus.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdmRegCus.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnCancelActionPerformed

    private void lb_quit2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_quit2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_lb_quit2MouseClicked

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
            java.util.logging.Logger.getLogger(AdmCreateNoti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdmCreateNoti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdmCreateNoti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdmCreateNoti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AdmCreateNoti().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(AdmCreateNoti.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AdmCreateNoti.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnSettings1;
    private javax.swing.JButton btnTopUp1;
    private javax.swing.JComboBox<String> cmbRecID;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel lb_cafeName1;
    private javax.swing.JLabel lb_logoName2;
    private javax.swing.JLabel lb_logoPic2;
    private javax.swing.JLabel lb_quit2;
    private javax.swing.JLabel lb_tuName2;
    private javax.swing.JLabel lb_tuName3;
    private javax.swing.JLabel lblAdminName1;
    private javax.swing.JLabel lblAdminNum1;
    private javax.swing.JLabel lblCusID;
    private javax.swing.JLabel lblCusName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtNotiID;
    // End of variables declaration//GEN-END:variables
}
