package java_assignment;

import java.awt.Color;
import java.awt.Component;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Notification_Page extends javax.swing.JFrame {
    
    private Vendor vendor;
    private Customer customer;
//    private Runner runner;
//    private Admin admin;
    private DefaultTableModel model = new DefaultTableModel();
    private String[] columnName = {"ID","Sender","Recipient","Message","Date Time"};
    private int row=-1;

    public Notification_Page(Vendor vendor) throws IOException, ClassNotFoundException {
        initComponents();
        this.vendor = vendor;
        jTable1.setDefaultRenderer(Object.class, new CustomRenderer()); 
        
        model.setColumnIdentifiers(columnName);
        jTable1.setModel(model);
        

        OrderHandler oh = new OrderHandler();      
        Float income = oh.CalculateTotalIncome(Java_assignment.LoggedInUser.userid);
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        String formattedIncome = "RM" + decimalFormat.format(income);
        lb_dailyEarningstxt.setText(String.valueOf(formattedIncome));
        
        
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(400);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(300);
        
        NotificationHandler nh = new NotificationHandler("Notification", Notification.class);
        ArrayList<Notification> noti = nh.getNotificationsByVendorID(Java_assignment.LoggedInUser.userid);
        for (Notification notification : noti) {
            model.addRow(new Object[]{notification.getNotiID(), notification.getSenderID(), notification.getRecipientID(), notification.getNotiMessage(), notification.getNotiDateTime()});
        }
    }
    
    
    public Notification_Page(Customer customer) {
        initComponents();
        this.customer = customer;
    }
    
//    public Notification_Page(Runner runner) {
//        initComponents();
//        this.runner = runner;
//    }
//
//    public Notification_Page(Admin admin) {
//        initComponents();
//        this.admin = admin;
//    }
    
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
        lb_dailyEarningstxt = new javax.swing.JLabel();
        lb_dailyEarnings1 = new javax.swing.JLabel();
        btn_Credits = new java.awt.Button();
        rightPanel = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
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
                .addContainerGap(53, Short.MAX_VALUE))
        );

        rightPanel.setBackground(new java.awt.Color(246, 246, 246));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Unread", "Read" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("View");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTable1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filter by...", "January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                .addContainerGap(198, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(196, 196, 196))
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
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
                .addContainerGap(23, Short.MAX_VALUE))
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
                    .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public class CustomRenderer extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(
                JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

            try {
                String notiID = table.getValueAt(row, 0).toString(); // Assuming notiID is in the first column
                String status = getStatusFromTextFile(notiID);

                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                // Customize rendering based on the status
                if ("unread".equalsIgnoreCase(status)) {
                    c.setBackground(new Color(173, 216, 230)); // Light Blue
                } else {
                    // Set the background color back to default for read items
                    c.setBackground(table.getBackground());
                }

                return c;
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(Notification_Page.class.getName()).log(Level.SEVERE, null, ex);
                return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            }
        }

        private String getStatusFromTextFile(String notiID) throws IOException, ClassNotFoundException {
            NotificationHandler nh = new NotificationHandler("Notification", Notification.class);
            ArrayList<Notification> notiList = nh.getNotificationsByVendorID(Java_assignment.LoggedInUser.userid);

            for (Notification noti : notiList) {
                if (noti.getNotiID().equals(notiID)) {
                    return noti.getNotiStatus();
                }
            }

            return "unread"; 
        }
    }   
    
    
    
    private void lb_quit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_quit1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_lb_quit1MouseClicked

    private void btn_insightsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_insightsMouseClicked
        try {
            this.dispose();
            VendorInsightsPage vip = new VendorInsightsPage(vendor);
            vip.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Notification_Page.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Notification_Page.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_insightsMouseClicked

    private void btn_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_menuMouseClicked
        try {
            this.dispose();
            VendorMenuPage vmenup = new VendorMenuPage(vendor);
            vmenup.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Notification_Page.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Notification_Page.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_menuMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            refreshData();
        } catch (IOException ex) {
            Logger.getLogger(VendorOrdersPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorOrdersPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        try {
            filterMonth();
        } catch (IOException ex) {
            Logger.getLogger(Notification_Page.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Notification_Page.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        try {
            filterMonth();
        } catch (IOException ex) {
            Logger.getLogger(Notification_Page.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Notification_Page.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        try {
            filterData();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Notification_Page.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            markNotificationAsRead();
            refreshData();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Notification_Page.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
        VendorSettingsPage vsp = new VendorSettingsPage(vendor);
        vsp.setVisible(true);
    }//GEN-LAST:event_btn_SettingsActionPerformed

    private void btn_notiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_notiActionPerformed
        try {
            this.dispose();
            Notification_Page noti = new Notification_Page(vendor);
            noti.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(VendorOrdersPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorOrdersPage.class.getName()).log(Level.SEVERE, null, ex);
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

    private void markNotificationAsRead() throws IOException, ClassNotFoundException {
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) {
            String notiID = jTable1.getValueAt(selectedRow, 0).toString();

            NotificationHandler nh = new NotificationHandler("Notification", Notification.class);
            nh.markNotificationAsRead(notiID, Java_assignment.LoggedInUser.userid);
        }
    }
    
    
    private void filterData() throws IOException, ClassNotFoundException {
        model.setRowCount(0);
        NotificationHandler nh = new NotificationHandler("Notification", Notification.class);

        String selectedStatus = jComboBox2.getSelectedItem().toString();

        ArrayList<Notification> noti;
        if (!selectedStatus.equals("All")) {
            noti = nh.getNotificationsByVendorIDAndStatus(Java_assignment.LoggedInUser.userid, selectedStatus);
        } else {
            noti = nh.getNotificationsByVendorID(Java_assignment.LoggedInUser.userid);
        }

        for (Notification notification : noti) {
            model.addRow(new Object[]{
                notification.getNotiID(),
                notification.getSenderID(),
                notification.getRecipientID(),
                notification.getNotiMessage(),
                notification.getNotiDateTime(),
                notification.getNotiStatus()
            });
        }
    }
    
    private void refreshData() throws IOException, ClassNotFoundException {
        model.setRowCount(0);
        NotificationHandler nh = new NotificationHandler("Notification", Notification.class);
        ArrayList<Notification> noti = nh.getNotificationsByVendorID(Java_assignment.LoggedInUser.userid);
        
        for (Notification notification : noti) {
            model.addRow(new Object[]{notification.getNotiID(), notification.getSenderID(), notification.getRecipientID(), notification.getNotiMessage(), notification.getNotiDateTime()});
        }
    }
    
    private void filterMonth() throws IOException, ClassNotFoundException{
        model.setRowCount(0);
        NotificationHandler nh = new NotificationHandler("Notification", Notification.class);

        // Get the selected month from the combo box
        String selectedMonth = jComboBox1.getSelectedItem().toString();

        ArrayList<Notification> noti;
        if (!selectedMonth.equals("Filter by...")) {
            noti = nh.getNotificationsByVendorIDAndMonth(Java_assignment.LoggedInUser.userid, selectedMonth);
        } else {
            noti = nh.getNotificationsByVendorID(Java_assignment.LoggedInUser.userid);
        }

        for (Notification notification : noti) {
            model.addRow(new Object[]{notification.getNotiID(), notification.getSenderID(), notification.getRecipientID(), notification.getNotiMessage(), notification.getNotiDateTime()});
        }
    }
    
    
    
    
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
            java.util.logging.Logger.getLogger(Notification_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notification_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notification_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notification_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lb_cafeName;
    private javax.swing.JLabel lb_dailyEarnings1;
    private javax.swing.JLabel lb_dailyEarningstxt;
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
