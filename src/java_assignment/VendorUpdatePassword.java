package java_assignment;

import java.awt.event.ItemEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VendorUpdatePassword extends javax.swing.JFrame {
    
    private Vendor vendor;

    public VendorUpdatePassword(Vendor vendor) {
        initComponents();
        this.vendor= vendor;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rightPanel = new javax.swing.JPanel();
        lb_pw = new javax.swing.JLabel();
        lb_userID = new javax.swing.JLabel();
        tf_userID = new javax.swing.JTextField();
        pwf_pw = new javax.swing.JPasswordField();
        cb_showPw = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        bottomPanel = new javax.swing.JPanel();
        btn_noti = new javax.swing.JButton();
        btn_orders = new javax.swing.JButton();
        btn_dashb = new javax.swing.JButton();
        btn_insights = new javax.swing.JButton();
        btn_menu = new javax.swing.JButton();
        leftPanel = new javax.swing.JPanel();
        lb_cafeName = new javax.swing.JLabel();
        lb_tuName = new javax.swing.JLabel();
        lb_tuName1 = new javax.swing.JLabel();
        btn_Profile = new java.awt.Button();
        btn_Settings = new java.awt.Button();
        lb_dailyEarningstxt = new javax.swing.JLabel();
        lb_dailyEarnings1 = new javax.swing.JLabel();
        btn_Credits = new java.awt.Button();
        topPanel1 = new javax.swing.JPanel();
        lb_logoPic1 = new javax.swing.JLabel();
        lb_logoName1 = new javax.swing.JLabel();
        lb_quit1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rightPanel.setBackground(new java.awt.Color(246, 246, 246));

        lb_pw.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_pw.setText("New Password:");

        lb_userID.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_userID.setText("Old Password");

        cb_showPw.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        cb_showPw.setText("Show Password");
        cb_showPw.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_showPwItemStateChanged(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lb_pw)
                        .addComponent(tf_userID)
                        .addComponent(lb_userID)
                        .addComponent(cb_showPw)
                        .addComponent(pwf_pw, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lb_userID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_userID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_pw)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwf_pw, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_showPw)
                .addGap(18, 18, 18)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bottomPanel.setBackground(new java.awt.Color(66, 33, 11));

        btn_noti.setText("Notification");
        btn_noti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_notiActionPerformed(evt);
            }
        });

        btn_orders.setText("Orders");
        btn_orders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ordersActionPerformed(evt);
            }
        });

        btn_dashb.setText("Dashboard");
        btn_dashb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dashbActionPerformed(evt);
            }
        });

        btn_insights.setText("Insights");
        btn_insights.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_insightsMouseClicked(evt);
            }
        });

        btn_menu.setText("Menu");
        btn_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_menuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btn_noti)
                .addGap(28, 28, 28)
                .addComponent(btn_orders, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btn_dashb)
                .addGap(32, 32, 32)
                .addComponent(btn_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_insights, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_noti, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_insights, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_dashb, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_orders, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        leftPanel.setBackground(new java.awt.Color(246, 246, 246));

        lb_cafeName.setFont(new java.awt.Font("Josefin Sans", 1, 28)); // NOI18N
        lb_cafeName.setForeground(new java.awt.Color(255, 189, 49));
        lb_cafeName.setText("Cafeteria");

        lb_tuName.setFont(new java.awt.Font("Josefin Sans", 1, 28)); // NOI18N
        lb_tuName.setText("University");

        lb_tuName1.setFont(new java.awt.Font("Josefin Sans", 1, 28)); // NOI18N
        lb_tuName1.setText("Tech");

        btn_Profile.setLabel("Profile");
        btn_Profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProfileActionPerformed(evt);
            }
        });

        btn_Settings.setLabel("Settings");
        btn_Settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SettingsActionPerformed(evt);
            }
        });

        lb_dailyEarningstxt.setFont(new java.awt.Font("Malayalam MN", 1, 25)); // NOI18N

        lb_dailyEarnings1.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_dailyEarnings1.setText("TU - E Credits:");

        btn_Credits.setActionCommand("Credits");
        btn_Credits.setLabel("Credits");
        btn_Credits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CreditsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Credits, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_dailyEarnings1)
                    .addComponent(btn_Settings, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_tuName)
                    .addComponent(lb_tuName1)
                    .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lb_dailyEarningstxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_cafeName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lb_tuName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_tuName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_cafeName)
                .addGap(24, 24, 24)
                .addComponent(lb_dailyEarnings1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_dailyEarningstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(btn_Credits, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(btn_Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(btn_Settings, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

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
                .addGap(197, 197, 197)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(bottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_insightsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_insightsMouseClicked
        try {
            this.dispose();
            VendorInsightsPage vip = new VendorInsightsPage(vendor);
            vip.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(VendorUpdatePassword.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorUpdatePassword.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_insightsMouseClicked

    private void btn_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_menuMouseClicked
        try {
            this.dispose();
            VendorMenuPage vmenup = new VendorMenuPage(vendor);
            vmenup.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(VendorUpdatePassword.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorUpdatePassword.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_menuMouseClicked

    private void lb_quit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_quit1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_lb_quit1MouseClicked

    private void btn_CreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CreditsActionPerformed
        try {
            this.dispose();
            VendorCreditPage vcreditp = new VendorCreditPage(vendor);
            vcreditp.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(VendorOrdersPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorOrdersPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_CreditsActionPerformed

    private void btn_ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProfileActionPerformed
       try {
            this.dispose();
            VendorProfilePage vpp = new VendorProfilePage(vendor);
            vpp.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(VendorMainPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorMainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_ProfileActionPerformed

    private void btn_SettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SettingsActionPerformed
        this.dispose();
        VendorUpdatePassword vsp = new VendorUpdatePassword(vendor);
        vsp.setVisible(true);
    }//GEN-LAST:event_btn_SettingsActionPerformed

    private void btn_notiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_notiActionPerformed
        try {
            this.dispose();
            Notification_Page noti = new Notification_Page(vendor);
            noti.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(VendorUpdatePassword.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorUpdatePassword.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_notiActionPerformed

    private void btn_ordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ordersActionPerformed
        try {
            this.dispose();
            VendorOrdersPage vop = new VendorOrdersPage(vendor);
            vop.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorOrdersPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VendorOrdersPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_ordersActionPerformed

    private void btn_dashbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dashbActionPerformed
        this.dispose();
        VendorMainPage vmp = null;
        try {
            vmp = new VendorMainPage(vendor);
        } catch (IOException ex) {
            Logger.getLogger(VendorProfilePage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorProfilePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        vmp.setVisible(true);
    }//GEN-LAST:event_btn_dashbActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        VendorSettingsPage vsp = new VendorSettingsPage(vendor);
        vsp.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String enteredpw = tf_userID.getText();
        char[] newPasswordChars = pwf_pw.getPassword();
        String newEnteredPassword = new String(newPasswordChars);

        if (enteredpw.equals(Java_assignment.LoggedInUser.getPassword())) {
            try {
                UserHandler uh = new UserHandler("User", User.class);
                User user = uh.GetUserByUserID(Java_assignment.LoggedInUser.userid);
                user.setPassword(newEnteredPassword);
                uh.UpdateItem(user, user);
                
                JOptionPane.showMessageDialog(this, "Update successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                Logger.getLogger(VendorUpdatePassword.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(VendorUpdatePassword.class.getName()).log(Level.SEVERE, null, ex);
            }
            

        } else {
            JOptionPane.showMessageDialog(this, "Wrong Password", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cb_showPwItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_showPwItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
                    // If selected, set the echo char to 0 (show password)
                    pwf_pw.setEchoChar((char) 0);
                } else {
                    // If not selected, set the echo char to '*'
                    pwf_pw.setEchoChar('*');
                }
    }//GEN-LAST:event_cb_showPwItemStateChanged

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private java.awt.Button btn_Credits;
    private java.awt.Button btn_Profile;
    private java.awt.Button btn_Settings;
    private javax.swing.JButton btn_dashb;
    private javax.swing.JButton btn_insights;
    private javax.swing.JButton btn_menu;
    private javax.swing.JButton btn_noti;
    private javax.swing.JButton btn_orders;
    private javax.swing.JCheckBox cb_showPw;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lb_cafeName;
    private javax.swing.JLabel lb_dailyEarnings1;
    private javax.swing.JLabel lb_dailyEarningstxt;
    private javax.swing.JLabel lb_logoName1;
    private javax.swing.JLabel lb_logoPic1;
    private javax.swing.JLabel lb_pw;
    private javax.swing.JLabel lb_quit1;
    private javax.swing.JLabel lb_tuName;
    private javax.swing.JLabel lb_tuName1;
    private javax.swing.JLabel lb_userID;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPasswordField pwf_pw;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JTextField tf_userID;
    private javax.swing.JPanel topPanel1;
    // End of variables declaration//GEN-END:variables
}
