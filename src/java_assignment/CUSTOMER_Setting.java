package java_assignment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CUSTOMER_Setting extends javax.swing.JFrame {
    
    private Vendor vendor;
    private Customer customer;

    public CUSTOMER_Setting() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rightPanel = new javax.swing.JPanel();
        updatePass = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        bottomPanel = new javax.swing.JPanel();
        btn_notiCus = new javax.swing.JButton();
        btn_orderHis = new javax.swing.JButton();
        btn_dashCus = new javax.swing.JButton();
        btn_dashb1 = new javax.swing.JButton();
        btn_orderStat = new javax.swing.JButton();
        leftPanel = new javax.swing.JPanel();
        lb_tuName5 = new javax.swing.JLabel();
        lb_tuName4 = new javax.swing.JLabel();
        lb_cafeName2 = new javax.swing.JLabel();
        lb_dailyEarnings3 = new javax.swing.JLabel();
        lb_dailyEarningstxt3 = new javax.swing.JLabel();
        btn_Profile1 = new java.awt.Button();
        btn_Settings1 = new java.awt.Button();
        topPanel1 = new javax.swing.JPanel();
        lb_logoPic1 = new javax.swing.JLabel();
        lb_logoName1 = new javax.swing.JLabel();
        lb_quit1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rightPanel.setBackground(new java.awt.Color(246, 246, 246));

        updatePass.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        updatePass.setText("Update Password");
        updatePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatePassMouseClicked(evt);
            }
        });

        logout.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        logout.setText("Log Out");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatePass, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(updatePass, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bottomPanel.setBackground(new java.awt.Color(66, 33, 11));

        btn_notiCus.setText("Notification");
        btn_notiCus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_notiCusMouseClicked(evt);
            }
        });
        btn_notiCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_notiCusActionPerformed(evt);
            }
        });

        btn_orderHis.setText("Order History");
        btn_orderHis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_orderHisMouseClicked(evt);
            }
        });
        btn_orderHis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_orderHisActionPerformed(evt);
            }
        });

        btn_dashCus.setText("Dashboard");
        btn_dashCus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dashCusMouseClicked(evt);
            }
        });
        btn_dashCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dashCusActionPerformed(evt);
            }
        });

        btn_dashb1.setText("TUCredit");
        btn_dashb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dashb1ActionPerformed(evt);
            }
        });

        btn_orderStat.setText("Order Status");
        btn_orderStat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_orderStatMouseClicked(evt);
            }
        });
        btn_orderStat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_orderStatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btn_notiCus)
                .addGap(28, 28, 28)
                .addComponent(btn_orderHis)
                .addGap(30, 30, 30)
                .addComponent(btn_dashCus, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_orderStat)
                .addGap(26, 26, 26)
                .addComponent(btn_dashb1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_notiCus, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_dashCus, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_orderHis, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_dashb1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_orderStat, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        leftPanel.setBackground(new java.awt.Color(246, 246, 246));

        lb_tuName5.setFont(new java.awt.Font("Josefin Sans", 1, 28)); // NOI18N
        lb_tuName5.setText("Tech");

        lb_tuName4.setFont(new java.awt.Font("Josefin Sans", 1, 28)); // NOI18N
        lb_tuName4.setText("University");

        lb_cafeName2.setFont(new java.awt.Font("Josefin Sans", 1, 28)); // NOI18N
        lb_cafeName2.setForeground(new java.awt.Color(255, 189, 49));
        lb_cafeName2.setText("Cafeteria");

        lb_dailyEarnings3.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_dailyEarnings3.setText("TU - E Credits:");

        lb_dailyEarningstxt3.setFont(new java.awt.Font("Malayalam MN", 1, 25)); // NOI18N

        btn_Profile1.setLabel("Profile");

        btn_Settings1.setLabel("Settings");

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_dailyEarnings3)
                    .addComponent(btn_Settings1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Profile1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_tuName4)
                    .addComponent(lb_tuName5)
                    .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lb_dailyEarningstxt3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_cafeName2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lb_tuName5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_tuName4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_cafeName2)
                .addGap(24, 24, 24)
                .addComponent(lb_dailyEarnings3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_dailyEarningstxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Profile1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(btn_Settings1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
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

    private void lb_quit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_quit1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_lb_quit1MouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        this.dispose();
        LogIn login = new LogIn();
        login.setVisible(true);
    }//GEN-LAST:event_logoutMouseClicked

    private void btn_notiCusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_notiCusMouseClicked
        try {
            this.dispose();
            CUSTOMER_Notification noti = new CUSTOMER_Notification(customer);
            noti.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(CUSTOMER_Setting.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CUSTOMER_Setting.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_notiCusMouseClicked

    private void btn_notiCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_notiCusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_notiCusActionPerformed

    private void btn_orderHisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_orderHisMouseClicked
        this.dispose();
        CUSTOMER_OrderHistory orderHis = new CUSTOMER_OrderHistory();
        orderHis.setVisible(true);
    }//GEN-LAST:event_btn_orderHisMouseClicked

    private void btn_orderHisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_orderHisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_orderHisActionPerformed

    private void btn_dashCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dashCusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_dashCusActionPerformed

    private void btn_dashb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dashb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_dashb1ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void updatePassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatePassMouseClicked
        // TODO add your handling code here:
        this.dispose();
        CUSTOMER_UpdatePassword updatePass = new CUSTOMER_UpdatePassword();
        updatePass.setVisible(true);
    }//GEN-LAST:event_updatePassMouseClicked

    private void btn_orderStatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_orderStatMouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            OrderHandler orderHandler = new OrderHandler("Order", Order.class);
            ArrayList<String> orderIDs = orderHandler.GetOrderIDsByUserID(Java_assignment.LoggedInUser.userid);

            this.dispose();
            CUSTOMER_OrderStatus orderStatus = new CUSTOMER_OrderStatus(orderIDs);
            orderStatus.setVisible(true);

        } catch (IOException | ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CUSTOMER_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_orderStatMouseClicked

    private void btn_orderStatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_orderStatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_orderStatActionPerformed

    private void btn_dashCusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dashCusMouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            this.dispose();
            CUSTOMER_Main main = new CUSTOMER_Main();
            main.setVisible(true);
            
        } catch (IOException ex) {
            Logger.getLogger(CUSTOMER_ViewVendorProfile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CUSTOMER_ViewVendorProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_dashCusMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CUSTOMER_Setting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private java.awt.Button btn_Profile1;
    private java.awt.Button btn_Settings1;
    private javax.swing.JButton btn_dashCus;
    private javax.swing.JButton btn_dashb1;
    private javax.swing.JButton btn_notiCus;
    private javax.swing.JButton btn_orderHis;
    private javax.swing.JButton btn_orderStat;
    private javax.swing.JLabel lb_cafeName2;
    private javax.swing.JLabel lb_dailyEarnings3;
    private javax.swing.JLabel lb_dailyEarningstxt3;
    private javax.swing.JLabel lb_logoName1;
    private javax.swing.JLabel lb_logoPic1;
    private javax.swing.JLabel lb_quit1;
    private javax.swing.JLabel lb_tuName4;
    private javax.swing.JLabel lb_tuName5;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton logout;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JPanel topPanel1;
    private javax.swing.JButton updatePass;
    // End of variables declaration//GEN-END:variables
}
