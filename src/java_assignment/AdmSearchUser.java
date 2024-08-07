package java_assignment;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class AdmSearchUser extends javax.swing.JFrame {

    User AdmUser = new User();
    Admin adm = new Admin();
    public AdmSearchUser() throws IOException, ClassNotFoundException {
        initComponents();
        
        String userid = Java_assignment.LoggedInUser.getUserid();
        
        UserHandler admhandler = new UserHandler("User",User.class);
        
        this.AdmUser = admhandler.GetUserByUserID(userid);
        
        lblAdminName.setText(AdmUser.username);
        lblAdminNum.setText(AdmUser.userid);
        
        DefaultTableModel userListTable = new DefaultTableModel();
        adm.populateUserTable(userListTable,admhandler.collection);
        tblView.setModel(userListTable);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        AMP_Left = new javax.swing.JPanel();
        lb_tuName1 = new javax.swing.JLabel();
        lb_tuName = new javax.swing.JLabel();
        lb_cafeName = new javax.swing.JLabel();
        AMP_Top = new javax.swing.JPanel();
        lb_quit1 = new javax.swing.JLabel();
        lb_logoName1 = new javax.swing.JLabel();
        lb_logoPic1 = new javax.swing.JLabel();
        AMP_Bottom = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(32767, 5));
        lblAdminName = new javax.swing.JLabel();
        lblAdminNum = new javax.swing.JLabel();
        btnSettings = new javax.swing.JButton();
        btnTopUp = new javax.swing.JButton();
        btnRegistration = new javax.swing.JButton();
        btnDashboard = new javax.swing.JButton();
        btnNoti = new javax.swing.JButton();
        AMP_Right = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblView = new javax.swing.JTable();
        lblUserID = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        txtUserID = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AMP_Left.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        AMP_Left.setForeground(new java.awt.Color(204, 204, 204));

        lb_tuName1.setFont(new java.awt.Font("Josefin Sans", 1, 26)); // NOI18N
        lb_tuName1.setText("Tech");

        lb_tuName.setFont(new java.awt.Font("Josefin Sans", 1, 26)); // NOI18N
        lb_tuName.setText("University");

        lb_cafeName.setFont(new java.awt.Font("Josefin Sans", 1, 26)); // NOI18N
        lb_cafeName.setForeground(new java.awt.Color(255, 189, 49));
        lb_cafeName.setText("Cafeteria");

        javax.swing.GroupLayout AMP_LeftLayout = new javax.swing.GroupLayout(AMP_Left);
        AMP_Left.setLayout(AMP_LeftLayout);
        AMP_LeftLayout.setHorizontalGroup(
            AMP_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AMP_LeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AMP_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_tuName)
                    .addComponent(lb_tuName1)
                    .addComponent(lb_cafeName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );
        AMP_LeftLayout.setVerticalGroup(
            AMP_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AMP_LeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_tuName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_tuName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_cafeName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AMP_Top.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lb_quit1.setFont(new java.awt.Font("Myanmar Sangam MN", 1, 20)); // NOI18N
        lb_quit1.setText("X");
        lb_quit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_quit1MouseClicked(evt);
            }
        });

        lb_logoName1.setFont(new java.awt.Font("Josefin Sans", 1, 18)); // NOI18N
        lb_logoName1.setText("Tech University");

        lb_logoPic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tuCafeteria_logo.png"))); // NOI18N

        javax.swing.GroupLayout AMP_TopLayout = new javax.swing.GroupLayout(AMP_Top);
        AMP_Top.setLayout(AMP_TopLayout);
        AMP_TopLayout.setHorizontalGroup(
            AMP_TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AMP_TopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_logoPic1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_logoName1)
                .addGap(145, 145, 145)
                .addComponent(lb_quit1)
                .addGap(37, 37, 37))
        );
        AMP_TopLayout.setVerticalGroup(
            AMP_TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AMP_TopLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(AMP_TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_logoPic1)
                    .addGroup(AMP_TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb_logoName1)
                        .addComponent(lb_quit1)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        AMP_Bottom.setBackground(new java.awt.Color(58, 54, 54));
        AMP_Bottom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        filler1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblAdminName.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lblAdminName.setForeground(new java.awt.Color(255, 204, 102));
        lblAdminName.setText("Admin Name");

        lblAdminNum.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblAdminNum.setForeground(new java.awt.Color(255, 204, 102));
        lblAdminNum.setText("Admin Num");

        btnSettings.setBackground(new java.awt.Color(0, 0, 0));
        btnSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/settings.png"))); // NOI18N
        btnSettings.setText("jButton3");
        btnSettings.setIconTextGap(-6);
        btnSettings.setMaximumSize(new java.awt.Dimension(55, 55));
        btnSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingsActionPerformed(evt);
            }
        });

        btnTopUp.setBackground(new java.awt.Color(0, 0, 0));
        btnTopUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/top up.png"))); // NOI18N
        btnTopUp.setText("jButton3");
        btnTopUp.setIconTextGap(-6);
        btnTopUp.setMaximumSize(new java.awt.Dimension(55, 55));
        btnTopUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopUpActionPerformed(evt);
            }
        });

        btnRegistration.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/registration.png"))); // NOI18N
        btnRegistration.setText("jButton3");
        btnRegistration.setIconTextGap(-6);
        btnRegistration.setMaximumSize(new java.awt.Dimension(55, 55));
        btnRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrationActionPerformed(evt);
            }
        });

        btnDashboard.setBackground(new java.awt.Color(0, 0, 0));
        btnDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dashboard.png"))); // NOI18N
        btnDashboard.setText("jButton3");
        btnDashboard.setIconTextGap(-6);
        btnDashboard.setMaximumSize(new java.awt.Dimension(55, 55));
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        btnNoti.setBackground(new java.awt.Color(51, 51, 51));
        btnNoti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/notifiactions.png"))); // NOI18N
        btnNoti.setText("jButton3");
        btnNoti.setIconTextGap(-6);
        btnNoti.setMaximumSize(new java.awt.Dimension(55, 55));
        btnNoti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AMP_BottomLayout = new javax.swing.GroupLayout(AMP_Bottom);
        AMP_Bottom.setLayout(AMP_BottomLayout);
        AMP_BottomLayout.setHorizontalGroup(
            AMP_BottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AMP_BottomLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AMP_BottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAdminNum, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdminName))
                .addGap(55, 55, 55)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNoti, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnTopUp, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );
        AMP_BottomLayout.setVerticalGroup(
            AMP_BottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(filler1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(AMP_BottomLayout.createSequentialGroup()
                .addGroup(AMP_BottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AMP_BottomLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(AMP_BottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTopUp, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNoti, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(AMP_BottomLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblAdminName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAdminNum, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AMP_Right.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        btnSearch.setBackground(new java.awt.Color(0, 0, 0));
        btnSearch.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 204, 51));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblView);

        lblUserID.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lblUserID.setForeground(new java.awt.Color(255, 204, 102));
        lblUserID.setText("User ID:");

        lblUserName.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 204, 102));
        lblUserName.setText("User Name:");

        btnCancel.setBackground(new java.awt.Color(0, 0, 0));
        btnCancel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 204, 51));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AMP_RightLayout = new javax.swing.GroupLayout(AMP_Right);
        AMP_Right.setLayout(AMP_RightLayout);
        AMP_RightLayout.setHorizontalGroup(
            AMP_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AMP_RightLayout.createSequentialGroup()
                .addGroup(AMP_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AMP_RightLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AMP_RightLayout.createSequentialGroup()
                        .addGroup(AMP_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(AMP_RightLayout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AMP_RightLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(AMP_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AMP_RightLayout.createSequentialGroup()
                                        .addComponent(lblUserID)
                                        .addGap(55, 55, 55)
                                        .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AMP_RightLayout.createSequentialGroup()
                                        .addComponent(lblUserName)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(100, 100, 100)))
                .addContainerGap())
        );
        AMP_RightLayout.setVerticalGroup(
            AMP_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AMP_RightLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(AMP_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserID)
                    .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AMP_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(AMP_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AMP_Top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(AMP_Left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AMP_Right, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(AMP_Bottom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(AMP_Top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AMP_Right, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AMP_Left, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AMP_Bottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb_quit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_quit1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_lb_quit1MouseClicked

    private void btnNotiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotiActionPerformed
        this.dispose();
        AdmNoti noti;
        try {
            noti = new AdmNoti();
            noti.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(AdmSearchUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdmSearchUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnNotiActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        this.dispose();
        AdmMainPage main;
        try {
            main = new AdmMainPage();
            main.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(AdmSearchUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdmSearchUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrationActionPerformed
        this.dispose();
        AdmRegMain reg;
        try {
            reg = new AdmRegMain();
            reg.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(AdmSearchUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdmSearchUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnRegistrationActionPerformed

    private void btnTopUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopUpActionPerformed
        this.dispose();
        AdmTopUp topup;
        try {
            topup = new AdmTopUp();
            topup.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(AdmSearchUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdmSearchUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnTopUpActionPerformed

    private void btnSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingsActionPerformed
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
        
    }//GEN-LAST:event_btnSettingsActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        UserHandler admhandler;
        try {
            try {
                if (!txtUserID.getText().isEmpty()) {
                    admhandler = new UserHandler("User", User.class);
                    DefaultTableModel userListTable = new DefaultTableModel();
                    adm.filteruidpopulateUserTable(userListTable, admhandler.collection, txtUserID.getText());
                    tblView.setModel(userListTable);
                }
                if (!txtUsername.getText().isEmpty()) {
                    admhandler = new UserHandler("User", User.class);
                    DefaultTableModel userListTable = new DefaultTableModel();
                    adm.filternamepopulateUserTable(userListTable, admhandler.collection, txtUsername.getText());
                    tblView.setModel(userListTable);
                }
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No user found.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } 
        catch (Exception e) {
            
        } 
        
              
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        UserHandler admhandler;
        try {
            admhandler = new UserHandler("User",User.class);
            DefaultTableModel userListTable = new DefaultTableModel();
        adm.populateUserTable(userListTable,admhandler.collection);
        tblView.setModel(userListTable);
        
        txtUserID.setText("");
        txtUsername.setText("");
        } catch (IOException ex) {
            Logger.getLogger(AdmSearchUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdmSearchUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(AdmSearchUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdmSearchUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdmSearchUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdmSearchUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AdmSearchUser().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(AdmSearchUser.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AdmSearchUser.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AMP_Bottom;
    private javax.swing.JPanel AMP_Left;
    private javax.swing.JPanel AMP_Right;
    private javax.swing.JPanel AMP_Top;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnNoti;
    private javax.swing.JButton btnRegistration;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSettings;
    private javax.swing.JButton btnTopUp;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_cafeName;
    private javax.swing.JLabel lb_logoName1;
    private javax.swing.JLabel lb_logoPic1;
    private javax.swing.JLabel lb_quit1;
    private javax.swing.JLabel lb_tuName;
    private javax.swing.JLabel lb_tuName1;
    private javax.swing.JLabel lblAdminName;
    private javax.swing.JLabel lblAdminNum;
    private javax.swing.JLabel lblUserID;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTable tblView;
    private javax.swing.JTextField txtUserID;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
