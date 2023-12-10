package java_assignment;

import javax.swing.JOptionPane;

public class VendorMainPage extends javax.swing.JFrame {
    
    private Vendor currentVendor;
    private User user;
    
    public VendorMainPage(User user){
        this.user = user;
    }
    
    public VendorMainPage() {
        initComponents();
        setVisible(true); 
        
        try {
            VendorHandler vendorHandler = new VendorHandler();
            this.currentVendor = vendorHandler.GetVendorByVendorID(Java_assignment.LoggedInUser.userid);

        }
        catch(Exception e)
        {
            JOptionPane.showConfirmDialog(null, e,"Error", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // Set labels
        lb_Vname.setText(currentVendor.getVendorName());
              

        CalculateStats();
//        lb_ecreditstxt.setText(currentVendor.cre)
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topPanel1 = new javax.swing.JPanel();
        lb_logoPic1 = new javax.swing.JLabel();
        lb_logoName1 = new javax.swing.JLabel();
        lb_quit1 = new javax.swing.JLabel();
        leftPanel = new javax.swing.JPanel();
        lb_cafeName = new javax.swing.JLabel();
        lb_tuName = new javax.swing.JLabel();
        lb_tuName1 = new javax.swing.JLabel();
        btn_Profile = new java.awt.Button();
        btn_Settings = new java.awt.Button();
        lb_ecredittxt = new javax.swing.JLabel();
        lb_dailyEarnings1 = new javax.swing.JLabel();
        btn_Credits = new java.awt.Button();
        rightPanel = new javax.swing.JPanel();
        lb_welcome = new javax.swing.JLabel();
        lb_Vname = new javax.swing.JLabel();
        lb_dailyEarnings = new javax.swing.JLabel();
        lb_totalmenu = new javax.swing.JLabel();
        lb_totalmenutxt = new javax.swing.JLabel();
        lb_totalmenu1 = new javax.swing.JLabel();
        lb_totalordersdailytxt = new javax.swing.JLabel();
        lb_dailyEarningTxt = new javax.swing.JLabel();
        bottomPanel = new javax.swing.JPanel();
        btn_noti = new javax.swing.JButton();
        btn_orders = new javax.swing.JButton();
        btn_dashb = new javax.swing.JButton();
        btn_insights = new javax.swing.JButton();
        btn_menu = new javax.swing.JButton();

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

        leftPanel.setBackground(new java.awt.Color(246, 246, 246));

        lb_cafeName.setFont(new java.awt.Font("Josefin Sans", 1, 28)); // NOI18N
        lb_cafeName.setForeground(new java.awt.Color(255, 189, 49));
        lb_cafeName.setText("Cafeteria");

        lb_tuName.setFont(new java.awt.Font("Josefin Sans", 1, 28)); // NOI18N
        lb_tuName.setText("University");

        lb_tuName1.setFont(new java.awt.Font("Josefin Sans", 1, 28)); // NOI18N
        lb_tuName1.setText("Tech");

        btn_Profile.setLabel("Profile");
        btn_Profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ProfileMouseClicked(evt);
            }
        });

        btn_Settings.setLabel("Settings");
        btn_Settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SettingsMouseClicked(evt);
            }
        });

        lb_ecredittxt.setFont(new java.awt.Font("Malayalam MN", 1, 25)); // NOI18N

        lb_dailyEarnings1.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_dailyEarnings1.setText("TU - E Credits:");

        btn_Credits.setActionCommand("Credits");
        btn_Credits.setLabel("Credits");
        btn_Credits.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CreditsMouseClicked(evt);
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
                        .addComponent(lb_ecredittxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(lb_ecredittxt, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(btn_Credits, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btn_Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(btn_Settings, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        rightPanel.setBackground(new java.awt.Color(246, 246, 246));

        lb_welcome.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_welcome.setText("Welcome");

        lb_Vname.setFont(new java.awt.Font("Malayalam MN", 1, 25)); // NOI18N

        lb_dailyEarnings.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_dailyEarnings.setText("Daily Earnings");

        lb_totalmenu.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_totalmenu.setText("Total Menu");

        lb_totalmenutxt.setFont(new java.awt.Font("Malayalam MN", 1, 25)); // NOI18N

        lb_totalmenu1.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_totalmenu1.setText("Total Orders (Daily)");

        lb_totalordersdailytxt.setFont(new java.awt.Font("Malayalam MN", 1, 25)); // NOI18N

        lb_dailyEarningTxt.setFont(new java.awt.Font("Malayalam MN", 1, 25)); // NOI18N

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_totalmenu)
                            .addComponent(lb_totalmenutxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_totalmenu1)
                            .addComponent(lb_totalordersdailytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_dailyEarnings)
                            .addComponent(lb_dailyEarningTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_welcome)
                            .addComponent(lb_Vname, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lb_welcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_Vname, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(lb_dailyEarnings)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_dailyEarningTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addComponent(lb_totalmenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_totalmenutxt, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                        .addComponent(lb_totalmenu1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_totalordersdailytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bottomPanel.setBackground(new java.awt.Color(66, 33, 11));

        btn_noti.setText("Notification");
        btn_noti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_notiMouseClicked(evt);
            }
        });

        btn_orders.setText("Orders");
        btn_orders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ordersMouseClicked(evt);
            }
        });

        btn_dashb.setText("Dashboard");

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
                .addContainerGap(25, Short.MAX_VALUE))
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
                .addComponent(bottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb_quit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_quit1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_lb_quit1MouseClicked

    private void btn_insightsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_insightsMouseClicked
        this.dispose();
        VendorInsightsPage vip = new VendorInsightsPage(currentVendor);
        vip.setVisible(true);
    }//GEN-LAST:event_btn_insightsMouseClicked

    private void btn_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_menuMouseClicked
            this.dispose();
            VendorMenuPage vmenup = new VendorMenuPage(currentVendor);
            vmenup.setVisible(true);
    }//GEN-LAST:event_btn_menuMouseClicked

    private void btn_ordersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ordersMouseClicked
        this.dispose();
        //VendorOrdersPage vop = new VendorOrdersPage();
        //vop.setVisible(true);
    }//GEN-LAST:event_btn_ordersMouseClicked

    private void btn_CreditsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CreditsMouseClicked
        this.dispose();
        VendorCreditPage vcreditp = new VendorCreditPage();
        vcreditp.setVisible(true);
    }//GEN-LAST:event_btn_CreditsMouseClicked

    private void btn_ProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ProfileMouseClicked
        this.dispose();
        VendorProfilePage vpp = new VendorProfilePage(currentVendor);
        vpp.setVisible(true);
    }//GEN-LAST:event_btn_ProfileMouseClicked

    private void btn_SettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SettingsMouseClicked
        this.dispose();
        VendorSettingsPage vsp = new VendorSettingsPage();
        vsp.setVisible(true);
    }//GEN-LAST:event_btn_SettingsMouseClicked

    private void btn_notiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_notiMouseClicked
        this.dispose();
//        Notification_Page noti = new Notification_Page();
//        noti.setVisible(true);
    }//GEN-LAST:event_btn_notiMouseClicked

    // Custom code
    
    private void CalculateStats() {
        // Calculate from Order Handler
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
    private javax.swing.JLabel lb_Vname;
    private javax.swing.JLabel lb_cafeName;
    private javax.swing.JLabel lb_dailyEarningTxt;
    private javax.swing.JLabel lb_dailyEarnings;
    private javax.swing.JLabel lb_dailyEarnings1;
    private javax.swing.JLabel lb_ecredittxt;
    private javax.swing.JLabel lb_logoName1;
    private javax.swing.JLabel lb_logoPic1;
    private javax.swing.JLabel lb_quit1;
    private javax.swing.JLabel lb_totalmenu;
    private javax.swing.JLabel lb_totalmenu1;
    private javax.swing.JLabel lb_totalmenutxt;
    private javax.swing.JLabel lb_totalordersdailytxt;
    private javax.swing.JLabel lb_tuName;
    private javax.swing.JLabel lb_tuName1;
    private javax.swing.JLabel lb_welcome;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JPanel topPanel1;
    // End of variables declaration//GEN-END:variables

    
}
