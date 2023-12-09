 package java_assignment;

import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;

public class CUSTOMER_Main extends javax.swing.JFrame {

    //private String userid, password;
    private Customer customer;
    private String vendorName;
    private String vendorID;
    
    public CUSTOMER_Main() throws IOException, ClassNotFoundException {
        initComponents();
        setVisible(true); 
        //Vendor vendor = new Vendor();
        lb_Cname.setText(Java_assignment.LoggedInUser.username);
        
        if (Java_assignment.LoggedInUser.userid != null) {
        CustomerHandler customerHandler = new CustomerHandler("Customer", Customer.class);
        double x = customerHandler.getCredit(Java_assignment.LoggedInUser.userid);
        lb_Credit.setText("RM: "+String.valueOf(String.format("%.2f",x)));
        }
        else {
        // Handle the case where userid is null (perhaps display an error message)
        System.err.println("Userid is null");
        }
        
//        CustomerHandler testing = new CustomerHandler("Customer", Customer.class);
//        testing.AddNewItem(customer);
        
//        CustomerHandler customerHandler = new CustomerHandler("Customer", Customer.class);
//        String x = customerHandler.getCredit(userid);
//        lb_cCredit.setText(x);
        
        //CustomerHandler customerHandler = new CustomerHandler("Customer", Customer.class);
        //Customer cs = new Customer();
//        String x = Double.toString(customer.getCredit());
//        System.out.println(x);
//        lb_cCredit.setText(x);
        
//        CustomerHandler customerHandler = new CustomerHandler("Customer", Customer.class);
//        ArrayList<Customer> credit = customerHandler.getCredit(userid);
//        
//        Customer getCredit = credit.get(1);
//        System.out.println(getCredit);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_insights = new javax.swing.JButton();
        btn_menu = new javax.swing.JButton();
        topPanel1 = new javax.swing.JPanel();
        lb_logoPic1 = new javax.swing.JLabel();
        lb_logoName1 = new javax.swing.JLabel();
        lb_quit1 = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        lb_welcome = new javax.swing.JLabel();
        lb_Cname = new javax.swing.JLabel();
        westernFood = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lb_totalmenu1 = new javax.swing.JLabel();
        chineseFood = new javax.swing.JButton();
        malayFood = new javax.swing.JButton();
        indianFood = new javax.swing.JButton();
        koreanFood = new javax.swing.JButton();
        japaneseFood = new javax.swing.JButton();
        bottomPanel = new javax.swing.JPanel();
        btn_notiCus = new javax.swing.JButton();
        btn_orderHis = new javax.swing.JButton();
        btn_dashCus = new javax.swing.JButton();
        btn_dashb1 = new javax.swing.JButton();
        btn_orderStat = new javax.swing.JButton();
        leftPanel2 = new javax.swing.JPanel();
        lb_cafeName2 = new javax.swing.JLabel();
        lb_tuName4 = new javax.swing.JLabel();
        lb_tuName5 = new javax.swing.JLabel();
        btn_Profile1 = new java.awt.Button();
        btn_Settings1 = new java.awt.Button();
        lb_dailyEarnings3 = new javax.swing.JLabel();
        lb_Credit = new javax.swing.JLabel();

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
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });

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
                .addGap(191, 191, 191)
                .addComponent(lb_quit1)
                .addGap(41, 41, 41))
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

        rightPanel.setBackground(new java.awt.Color(246, 246, 246));

        lb_welcome.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_welcome.setText("Welcome");

        lb_Cname.setFont(new java.awt.Font("Malayalam MN", 1, 25)); // NOI18N

        westernFood.setText("Western");
        westernFood.setMaximumSize(new java.awt.Dimension(78, 16));
        westernFood.setMinimumSize(new java.awt.Dimension(78, 16));
        westernFood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                westernFoodMouseClicked(evt);
            }
        });
        westernFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                westernFoodActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 189, 49));
        jPanel1.setForeground(new java.awt.Color(255, 189, 49));

        lb_totalmenu1.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_totalmenu1.setText("Browse Restaurant");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(lb_totalmenu1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lb_totalmenu1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        chineseFood.setText("Chinese");
        chineseFood.setMaximumSize(new java.awt.Dimension(78, 16));
        chineseFood.setMinimumSize(new java.awt.Dimension(78, 16));
        chineseFood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chineseFoodMouseClicked(evt);
            }
        });
        chineseFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chineseFoodActionPerformed(evt);
            }
        });

        malayFood.setText("Malay");
        malayFood.setMaximumSize(new java.awt.Dimension(78, 16));
        malayFood.setMinimumSize(new java.awt.Dimension(78, 16));
        malayFood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                malayFoodMouseClicked(evt);
            }
        });
        malayFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                malayFoodActionPerformed(evt);
            }
        });

        indianFood.setText("Indian");
        indianFood.setMaximumSize(new java.awt.Dimension(78, 16));
        indianFood.setMinimumSize(new java.awt.Dimension(78, 16));
        indianFood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                indianFoodMouseClicked(evt);
            }
        });
        indianFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indianFoodActionPerformed(evt);
            }
        });

        koreanFood.setText("Korean");
        koreanFood.setMaximumSize(new java.awt.Dimension(78, 16));
        koreanFood.setMinimumSize(new java.awt.Dimension(78, 16));
        koreanFood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                koreanFoodMouseClicked(evt);
            }
        });
        koreanFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                koreanFoodActionPerformed(evt);
            }
        });

        japaneseFood.setText("Japanese");
        japaneseFood.setMaximumSize(new java.awt.Dimension(78, 16));
        japaneseFood.setMinimumSize(new java.awt.Dimension(78, 16));
        japaneseFood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                japaneseFoodMouseClicked(evt);
            }
        });
        japaneseFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                japaneseFoodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_welcome)
                    .addComponent(lb_Cname, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(indianFood, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(westernFood, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(koreanFood, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chineseFood, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(japaneseFood, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(malayFood, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)))
                .addContainerGap())
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lb_welcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_Cname, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(westernFood, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chineseFood, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(malayFood, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indianFood, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(koreanFood, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(japaneseFood, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
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
                .addGap(23, 23, 23)
                .addComponent(btn_notiCus)
                .addGap(32, 32, 32)
                .addComponent(btn_orderHis)
                .addGap(33, 33, 33)
                .addComponent(btn_dashCus, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btn_orderStat)
                .addGap(38, 38, 38)
                .addComponent(btn_dashb1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_notiCus, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_dashCus, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_orderHis, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_dashb1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_orderStat, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        leftPanel2.setBackground(new java.awt.Color(246, 246, 246));

        lb_cafeName2.setFont(new java.awt.Font("Josefin Sans", 1, 28)); // NOI18N
        lb_cafeName2.setForeground(new java.awt.Color(255, 189, 49));
        lb_cafeName2.setText("Cafeteria");

        lb_tuName4.setFont(new java.awt.Font("Josefin Sans", 1, 28)); // NOI18N
        lb_tuName4.setText("University");

        lb_tuName5.setFont(new java.awt.Font("Josefin Sans", 1, 28)); // NOI18N
        lb_tuName5.setText("Tech");

        btn_Profile1.setLabel("Profile");

        btn_Settings1.setLabel("Settings");
        btn_Settings1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Settings1MouseClicked(evt);
            }
        });

        lb_dailyEarnings3.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_dailyEarnings3.setText("TU - E Credits:");

        lb_Credit.setFont(new java.awt.Font("Malayalam MN", 1, 25)); // NOI18N

        javax.swing.GroupLayout leftPanel2Layout = new javax.swing.GroupLayout(leftPanel2);
        leftPanel2.setLayout(leftPanel2Layout);
        leftPanel2Layout.setHorizontalGroup(
            leftPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(leftPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_Credit, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_dailyEarnings3)
                    .addComponent(btn_Settings1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_tuName4)
                    .addComponent(lb_tuName5)
                    .addComponent(lb_cafeName2)
                    .addComponent(btn_Profile1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        leftPanel2Layout.setVerticalGroup(
            leftPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lb_tuName5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_tuName4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_cafeName2)
                .addGap(24, 24, 24)
                .addComponent(lb_dailyEarnings3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_Credit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Profile1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(btn_Settings1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(leftPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(bottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(leftPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb_quit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_quit1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_lb_quit1MouseClicked

    private void btn_insightsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_insightsMouseClicked
        
    }//GEN-LAST:event_btn_insightsMouseClicked

    private void btn_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_menuMouseClicked
            
    }//GEN-LAST:event_btn_menuMouseClicked

    private void btn_orderHisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_orderHisMouseClicked
        this.dispose();
        CUSTOMER_OrderHistory orderHis = new CUSTOMER_OrderHistory(Java_assignment.LoggedInUser.userid);
        orderHis.setVisible(true);
    }//GEN-LAST:event_btn_orderHisMouseClicked

    private void btn_notiCusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_notiCusMouseClicked
        this.dispose();
        CUSTOMER_Notification noti = new CUSTOMER_Notification();
        noti.setVisible(true); 
    }//GEN-LAST:event_btn_notiCusMouseClicked

    private void btn_orderHisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_orderHisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_orderHisActionPerformed

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_menuActionPerformed

    private void btn_dashCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dashCusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_dashCusActionPerformed

    private void btn_dashb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dashb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_dashb1ActionPerformed

    private void westernFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_westernFoodActionPerformed
        
    }//GEN-LAST:event_westernFoodActionPerformed

    private void chineseFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chineseFoodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chineseFoodActionPerformed

    private void malayFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_malayFoodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_malayFoodActionPerformed

    private void indianFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indianFoodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_indianFoodActionPerformed

    private void koreanFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_koreanFoodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_koreanFoodActionPerformed

    private void japaneseFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_japaneseFoodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_japaneseFoodActionPerformed

    private void btn_notiCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_notiCusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_notiCusActionPerformed

    private void btn_Settings1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Settings1MouseClicked
        // TODO add your handling code here:
//        this.dispose();
//        CUSTOMER_Setting orderHis = new CUSTOMER_Setting();
//        orderHis.setVisible(true);
          CUSTOMER_ConfirmOrder test = new CUSTOMER_ConfirmOrder();
          test.setVisible(true);
    }//GEN-LAST:event_btn_Settings1MouseClicked

    private void westernFoodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_westernFoodMouseClicked
        
        try {
            // TODO add your handling code here:
            this.dispose();
            //VendorHandler vdHandler = new VendorHandler();
            this.vendorID="VD001";
            this.vendorName="Western";
            CUSTOMER_ViewVendorProfile vdProfile = new CUSTOMER_ViewVendorProfile(vendorID,vendorName);
            vdProfile.setVisible(true);
            
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(CUSTOMER_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CUSTOMER_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_westernFoodMouseClicked

    private void chineseFoodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chineseFoodMouseClicked
        // TODO add your handling code here:
        try {
            
            this.dispose();
            this.vendorID="VD002";
            this.vendorName="Chinese";
            CUSTOMER_ViewVendorProfile vdProfile = new CUSTOMER_ViewVendorProfile(vendorID,vendorName);
            vdProfile.setVisible(true);
            
            
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(CUSTOMER_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CUSTOMER_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_chineseFoodMouseClicked

    private void malayFoodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_malayFoodMouseClicked
        // TODO add your handling code here:
        try {
            
            this.dispose();
            this.vendorID="VD003";
            this.vendorName="Malay";
            CUSTOMER_ViewVendorProfile vdProfile = new CUSTOMER_ViewVendorProfile(vendorID,vendorName);
            vdProfile.setVisible(true);
            
            
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(CUSTOMER_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CUSTOMER_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_malayFoodMouseClicked

    private void indianFoodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_indianFoodMouseClicked
        // TODO add your handling code here:
        try {
            
            this.dispose();
            this.vendorID="VD004";
            this.vendorName="Indian";
            CUSTOMER_ViewVendorProfile vdProfile = new CUSTOMER_ViewVendorProfile(vendorID,vendorName);
            vdProfile.setVisible(true);
            
            
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(CUSTOMER_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CUSTOMER_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_indianFoodMouseClicked

    private void koreanFoodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_koreanFoodMouseClicked
        // TODO add your handling code here:
        try {
            
            this.dispose();
            this.vendorID="VD005";
            this.vendorName="Korean";
            CUSTOMER_ViewVendorProfile vdProfile = new CUSTOMER_ViewVendorProfile(vendorID,vendorName);
            vdProfile.setVisible(true);
            
            
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(CUSTOMER_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CUSTOMER_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_koreanFoodMouseClicked

    private void japaneseFoodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_japaneseFoodMouseClicked
        // TODO add your handling code here:
        try {
            
            this.dispose();
            this.vendorID="VD006";
            this.vendorName="Japanese";
            CUSTOMER_ViewVendorProfile vdProfile = new CUSTOMER_ViewVendorProfile(vendorID,vendorName);
            vdProfile.setVisible(true);
            
            
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(CUSTOMER_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CUSTOMER_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_japaneseFoodMouseClicked

    private void btn_orderStatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_orderStatMouseClicked
//        try {
//            // TODO add your handling code here:
//            OrderHandler orderHandler = new OrderHandler("Order", Order.class);
//            ArrayList<String> orderIDs = orderHandler.GetOrderIDsByUserID(Java_assignment.LoggedInUser.userid);
//            
//            this.dispose();
//            CUSTOMER_OrderStatus orderStatus = new CUSTOMER_OrderStatus(orderIDs);
//            orderStatus.setVisible(true);
//
//            
//        } catch (IOException ex) {
//            java.util.logging.Logger.getLogger(CUSTOMER_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CUSTOMER_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }

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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new VendorMainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private java.awt.Button btn_Profile1;
    private java.awt.Button btn_Settings1;
    private javax.swing.JButton btn_dashCus;
    private javax.swing.JButton btn_dashb1;
    private javax.swing.JButton btn_insights;
    private javax.swing.JButton btn_menu;
    private javax.swing.JButton btn_notiCus;
    private javax.swing.JButton btn_orderHis;
    private javax.swing.JButton btn_orderStat;
    private javax.swing.JButton chineseFood;
    private javax.swing.JButton indianFood;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton japaneseFood;
    private javax.swing.JButton koreanFood;
    private javax.swing.JLabel lb_Cname;
    private javax.swing.JLabel lb_Credit;
    private javax.swing.JLabel lb_cafeName2;
    private javax.swing.JLabel lb_dailyEarnings3;
    private javax.swing.JLabel lb_logoName1;
    private javax.swing.JLabel lb_logoPic1;
    private javax.swing.JLabel lb_quit1;
    private javax.swing.JLabel lb_totalmenu1;
    private javax.swing.JLabel lb_tuName4;
    private javax.swing.JLabel lb_tuName5;
    private javax.swing.JLabel lb_welcome;
    private javax.swing.JPanel leftPanel2;
    private javax.swing.JButton malayFood;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JPanel topPanel1;
    private javax.swing.JButton westernFood;
    // End of variables declaration//GEN-END:variables
}
