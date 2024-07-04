package java_assignment;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_assignment.Enums.OperatingDay;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

public class VendorEditProfile extends javax.swing.JFrame {
    
    private Vendor vendor;
    private String userid;

    public VendorEditProfile(Vendor vendor) throws IOException, ClassNotFoundException {
        initComponents();
        this.vendor = vendor;
        this.userid = Java_assignment.LoggedInUser.userid;
        
        btnGroup.add(jRadioButton1);
        btnGroup.add(jRadioButton2);
        btnGroup.add(jRadioButton3);
        
        jLabel1.setText(vendor.getVendorName());
        jLabel2.setText(vendor.getVendorid());
        lb_email1.setText(Java_assignment.LoggedInUser.getEmail());
        jTextField1.setText(Java_assignment.LoggedInUser.getHpnum());
        
        
        VendorHandler vendorHandler = new VendorHandler();
        ArrayList<OperatingDay> operatingDays = vendorHandler.GetVendorByVendorID(userid).getOperatingDays();
        updateCheckbox(jCheckBox1, OperatingDay.MONDAY, operatingDays);
        updateCheckbox(jCheckBox2, OperatingDay.TUESDAY, operatingDays);
        updateCheckbox(jCheckBox3, OperatingDay.WEDNESDAY, operatingDays);
        updateCheckbox(jCheckBox6, OperatingDay.THURSDAY, operatingDays);
        updateCheckbox(jCheckBox5, OperatingDay.FRIDAY, operatingDays);
        updateCheckbox(jCheckBox4, OperatingDay.SATURDAY, operatingDays);
        updateCheckbox(jCheckBox7, OperatingDay.SUNDAY, operatingDays);
        
        updateRadioButtons(vendor.getOperatingHours());
    }
    
    private void updateCheckbox(javax.swing.JCheckBox checkBox, OperatingDay day, ArrayList<OperatingDay> operatingDays) {
        System.out.println("Operating Days: " + operatingDays);
        checkBox.setSelected(operatingDays.contains(day));
        System.out.println("Day to Check: " + day);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        topPanel1 = new javax.swing.JPanel();
        lb_logoPic1 = new javax.swing.JLabel();
        lb_logoName1 = new javax.swing.JLabel();
        lb_quit1 = new javax.swing.JLabel();
        bottomPanel = new javax.swing.JPanel();
        btn_noti = new javax.swing.JButton();
        btn_orders = new javax.swing.JButton();
        btn_dashb = new javax.swing.JButton();
        btn_insights = new javax.swing.JButton();
        btn_menu = new javax.swing.JButton();
        rightPanel = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lb_email = new javax.swing.JLabel();
        lb_hp = new javax.swing.JLabel();
        lb_email1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lb_hp1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        leftPanel = new javax.swing.JPanel();
        lb_cafeName = new javax.swing.JLabel();
        lb_tuName = new javax.swing.JLabel();
        lb_tuName1 = new javax.swing.JLabel();
        btn_Profile = new java.awt.Button();
        btn_Settings = new java.awt.Button();
        lb_dailyEarningstxt = new javax.swing.JLabel();
        lb_dailyEarnings1 = new javax.swing.JLabel();
        btn_Credits = new java.awt.Button();

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
                .addGap(35, 35, 35)
                .addComponent(btn_orders, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        rightPanel.setBackground(new java.awt.Color(246, 246, 246));

        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 0, 18)); // NOI18N
        jLabel1.setText("Vendor Name");

        jLabel2.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        jLabel2.setText("VendorID");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 1835.png"))); // NOI18N

        lb_email.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_email.setText("Email:");

        lb_hp.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_hp.setText("Mobile Number:");

        lb_email1.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_email1.setText("vendorA@tuCafeteria.edu.co");

        jTextField1.setText("0123457689");

        lb_hp1.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_hp1.setText("Operating Hour:");

        jCheckBox1.setText("Monday");

        jCheckBox2.setText("Tuesday");

        jCheckBox3.setText("Wednesday");

        jCheckBox4.setText("Saturday");

        jCheckBox5.setText("Friday");

        jCheckBox6.setText("Thursday");

        jCheckBox7.setText("Sunday");

        jRadioButton1.setText("0800 - 1400");

        jRadioButton2.setText("0800 - 2000");

        jRadioButton3.setText("1400 - 2000");

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_email1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 241, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(24, 24, 24))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_email)
                            .addComponent(jLabel2))
                        .addContainerGap())
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_hp1)
                            .addComponent(lb_hp)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox3)
                                    .addComponent(jCheckBox2)
                                    .addComponent(jCheckBox1)
                                    .addComponent(jRadioButton1))
                                .addGap(35, 35, 35)
                                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox4)
                                    .addComponent(jCheckBox5)
                                    .addGroup(rightPanelLayout.createSequentialGroup()
                                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox6)
                                            .addComponent(jRadioButton2))
                                        .addGap(35, 35, 35)
                                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton3)
                                            .addComponent(jCheckBox7))))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addComponent(lb_email)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_email1)
                        .addGap(18, 18, 18)
                        .addComponent(lb_hp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lb_hp1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox3))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox6)
                            .addComponent(jCheckBox7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox4)))
                .addGap(38, 38, 38)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addContainerGap(36, Short.MAX_VALUE))
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
                .addContainerGap(57, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb_quit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_quit1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_lb_quit1MouseClicked

    private void btn_insightsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_insightsMouseClicked
        try {
            this.dispose();
            VendorInsightsPage vip = new VendorInsightsPage(vendor);
            vip.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(VendorEditProfile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorEditProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_insightsMouseClicked

    private void btn_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_menuMouseClicked
        try {
            this.dispose();
            VendorMenuPage vmenup = new VendorMenuPage(vendor);
            vmenup.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(VendorEditProfile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorEditProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_menuMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int confirmResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to save changes?", "Confirm", JOptionPane.YES_NO_OPTION);

        if (confirmResult == JOptionPane.YES_OPTION) {
        
            try {
                VendorHandler vendorHandler = new VendorHandler();
                String selectedVendorId = Java_assignment.LoggedInUser.userid;
                
                Vendor selectedVendor = vendorHandler.GetVendorByVendorID(selectedVendorId);
                
                if (selectedVendor != null) {
                    ArrayList<OperatingDay> newOperatingDays = new ArrayList<>();
                    if (jCheckBox1.isSelected()) {
                        newOperatingDays.add(OperatingDay.MONDAY);
                    }
                    if (jCheckBox2.isSelected()) {
                        newOperatingDays.add(OperatingDay.TUESDAY);
                    }
                    if (jCheckBox3.isSelected()) {
                        newOperatingDays.add(OperatingDay.WEDNESDAY);
                    }
                    if (jCheckBox6.isSelected()) {
                        newOperatingDays.add(OperatingDay.THURSDAY);
                    }
                    if (jCheckBox5.isSelected()) {
                        newOperatingDays.add(OperatingDay.FRIDAY);
                    }
                    if (jCheckBox4.isSelected()) {
                        newOperatingDays.add(OperatingDay.SATURDAY);
                    }
                    if (jCheckBox7.isSelected()) {
                        newOperatingDays.add(OperatingDay.SUNDAY);
                    }
                    
                    selectedVendor.setOperatingDays(newOperatingDays);
                    
                    String newOperatingHours = "";
                    ButtonModel selectedRadioButton = btnGroup.getSelection();
                    
                    if (selectedRadioButton != null) {
                        if (selectedRadioButton.equals(jRadioButton1.getModel())) {
                            newOperatingHours = "0800 - 1400";
                        } else if (selectedRadioButton.equals(jRadioButton2.getModel())) {
                            newOperatingHours = "0800 - 2000";
                        } else if (selectedRadioButton.equals(jRadioButton3.getModel())) {
                            newOperatingHours = "1400 - 2000";
                        }
                        
                        selectedVendor.setOperatingHours(newOperatingHours);
                        
                        // Use a separate method to update the file without modifying UpdateItem
                        updateFileWithoutModifyingUpdateItem(vendorHandler, selectedVendor, selectedVendorId);
                        
                        UserHandler uh = new UserHandler("User", User.class);
                        ArrayList<User> userv = uh.LoadCollection("User", User.class);
                        User selectedUser = uh.GetUserByUserID(Java_assignment.LoggedInUser.userid);

                        if (selectedUser != null) {
                            selectedUser.setHpnum(jTextField1.getText());

                            uh.UpdateItem(selectedUser, selectedUser);

                            JOptionPane.showMessageDialog(this, "Update successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    
                }
            } catch (IOException ex) {
                Logger.getLogger(VendorEditProfile.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(VendorEditProfile.class.getName()).log(Level.SEVERE, null, ex);
            }
}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_CreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CreditsActionPerformed
        try {
            this.dispose();
            VendorCreditPage vcreditp = new VendorCreditPage(vendor);
            vcreditp.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(VendorProfilePage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorProfilePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_CreditsActionPerformed

    private void btn_ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProfileActionPerformed
        try {
            this.dispose();
            VendorProfilePage vpp = new VendorProfilePage(vendor);
            vpp.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(VendorProfilePage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorProfilePage.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }//GEN-LAST:event_btn_ProfileActionPerformed

    private void btn_SettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SettingsActionPerformed
        this.dispose();
        VendorSettingsPage vsp = new VendorSettingsPage(vendor);
        vsp.setVisible(true);
    }//GEN-LAST:event_btn_SettingsActionPerformed

    private void btn_notiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_notiActionPerformed
        try {
            this.dispose();
            Notification_Page noti = new Notification_Page(vendor);
            noti.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(VendorEditProfile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorEditProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_notiActionPerformed

    private void btn_ordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ordersActionPerformed
        try {
            this.dispose();
            VendorOrdersPage vop = new VendorOrdersPage(vendor);
            vop.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorProfilePage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VendorProfilePage.class.getName()).log(Level.SEVERE, null, ex);
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
   
        
        private void updateFileWithoutModifyingUpdateItem(VendorHandler vendorHandler, Vendor selectedVendor, String selectedVendorId) throws IOException {
            ArrayList<Vendor> vendors = vendorHandler.collection;
            for (Vendor vendor : vendors) {
                if (vendor.getVendorid().equals(selectedVendorId)) {
                    vendorHandler.updateOperatingDays(selectedVendorId, selectedVendor.getOperatingDays());
                    break;
                }
            }
        }
        
        private void updateRadioButtons(String operatingHours) {
            String operatingHoursFromVendor = vendor.getOperatingHours();

            // Assuming you have radio buttons named jRadioButtonOpen1 to jRadioButtonOpen4
            // Adjust the condition based on your actual radio buttons
            if (operatingHoursFromVendor.equals("0800 - 1400")) {
                jRadioButton1.setSelected(true);
            } else if (operatingHoursFromVendor.equals("0800 - 2000")) {
                jRadioButton2.setSelected(true);
            } else if (operatingHoursFromVendor.equals("1400 - 2000")) {
                jRadioButton3.setSelected(true);
            } else {
                System.out.println("bruhhh");
            }
        }

   
    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.ButtonGroup btnGroup;
    private java.awt.Button btn_Credits;
    private java.awt.Button btn_Profile;
    private java.awt.Button btn_Settings;
    private javax.swing.JButton btn_dashb;
    private javax.swing.JButton btn_insights;
    private javax.swing.JButton btn_menu;
    private javax.swing.JButton btn_noti;
    private javax.swing.JButton btn_orders;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lb_cafeName;
    private javax.swing.JLabel lb_dailyEarnings1;
    private javax.swing.JLabel lb_dailyEarningstxt;
    private javax.swing.JLabel lb_email;
    private javax.swing.JLabel lb_email1;
    private javax.swing.JLabel lb_hp;
    private javax.swing.JLabel lb_hp1;
    private javax.swing.JLabel lb_logoName1;
    private javax.swing.JLabel lb_logoPic1;
    private javax.swing.JLabel lb_quit1;
    private javax.swing.JLabel lb_tuName;
    private javax.swing.JLabel lb_tuName1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JPanel topPanel1;
    // End of variables declaration//GEN-END:variables
}
