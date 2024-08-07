package java_assignment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class CUSTOMER_ViewVendorProfile extends javax.swing.JFrame {

    //private Vendor vendor;
    private String vendorName;
    private String vendorID;
    private VendorReviewPage reviewPage;
    private DefaultTableModel modelReview;
    
//    public CUSTOMER_ViewVendorProfile(Vendor vendor){
//        initComponents();
//        this.vendor = vendor;
//    }
    
    public CUSTOMER_ViewVendorProfile(){initComponents();}
    
    public CUSTOMER_ViewVendorProfile(DefaultTableModel modelReview, String vendorName) throws IOException, ClassNotFoundException {
        initComponents();
        this.modelReview = modelReview;
        this.vendorName = vendorName;
        lblvdName.setText(this.vendorName);
        
        if (Java_assignment.LoggedInUser.userid != null) {
            CustomerHandler customerHandler = new CustomerHandler("Customer", Customer.class);
            double x = customerHandler.getCredit(Java_assignment.LoggedInUser.userid);
            lb_Credit.setText("RM: "+String.valueOf(String.format("%.2f",x)));
        } 
        else {
            System.err.println("Userid is null");
        }
    }
    
    public CUSTOMER_ViewVendorProfile(String vendorID, String vendorName) throws IOException, ClassNotFoundException {
        initComponents();
        this.vendorName = vendorName;
        this.vendorID = vendorID;
        lblvdName.setText(this.vendorName);
        
        if (Java_assignment.LoggedInUser.userid != null) {
        CustomerHandler customerHandler = new CustomerHandler("Customer", Customer.class);
        double x = customerHandler.getCredit(Java_assignment.LoggedInUser.userid);
        lb_Credit.setText("RM: "+String.valueOf(String.format("%.2f",x)));
        }
        else {
        // Handle the case where userid is null (perhaps display an error message)
        System.err.println("Userid is null");
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_orderStat = new javax.swing.JButton();
        topPanel1 = new javax.swing.JPanel();
        lb_logoPic1 = new javax.swing.JLabel();
        lb_logoName1 = new javax.swing.JLabel();
        lb_quit1 = new javax.swing.JLabel();
        bottomPanel = new javax.swing.JPanel();
        btn_notiCus = new javax.swing.JButton();
        btn_orderHis = new javax.swing.JButton();
        btn_dashCus = new javax.swing.JButton();
        btn_dashb1 = new javax.swing.JButton();
        btn_orderStatus = new javax.swing.JButton();
        rightPanel = new javax.swing.JPanel();
        btnVendorMenuCus = new javax.swing.JButton();
        lblvdName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblRating1 = new javax.swing.JLabel();
        AllRating = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblRating2 = new javax.swing.JLabel();
        leftPanel = new javax.swing.JPanel();
        lb_tuName5 = new javax.swing.JLabel();
        lb_tuName4 = new javax.swing.JLabel();
        lb_cafeName2 = new javax.swing.JLabel();
        lb_dailyEarnings3 = new javax.swing.JLabel();
        lb_Credit = new javax.swing.JLabel();
        btn_Profile1 = new java.awt.Button();
        btn_Settings1 = new java.awt.Button();

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

        btn_notiCus.setText("Notification");
        btn_notiCus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_notiCusMouseClicked(evt);
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

        btn_orderStatus.setText("Order Status");
        btn_orderStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_orderStatusMouseClicked(evt);
            }
        });
        btn_orderStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_orderStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btn_notiCus)
                .addGap(32, 32, 32)
                .addComponent(btn_orderHis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_dashCus, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btn_orderStatus)
                .addGap(29, 29, 29)
                .addComponent(btn_dashb1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_notiCus, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_dashCus, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_orderHis, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_dashb1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_orderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        rightPanel.setBackground(new java.awt.Color(246, 246, 246));

        btnVendorMenuCus.setText("View Menu");
        btnVendorMenuCus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVendorMenuCusMouseClicked(evt);
            }
        });

        lblvdName.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        lblvdName.setText("Vendor Name");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 1835.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Malayalam MN", 0, 18)); // NOI18N
        jLabel6.setText("Ratings");

        jLabel7.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        jLabel7.setText("Ratings");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblRating1.setFont(new java.awt.Font("Malayalam MN", 0, 12)); // NOI18N
        lblRating1.setText("sgt sedap! best restaurant");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRating1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblRating1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        AllRating.setText("See All");
        AllRating.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AllRatingMouseClicked(evt);
            }
        });
        AllRating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllRatingActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 189, 49));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        jLabel4.setText("Operating Hours");

        jLabel9.setFont(new java.awt.Font("Malayalam MN", 0, 12)); // NOI18N
        jLabel9.setText("Monday");

        jLabel10.setFont(new java.awt.Font("Malayalam MN", 0, 12)); // NOI18N
        jLabel10.setText("0800 - 2000");

        jLabel11.setFont(new java.awt.Font("Malayalam MN", 0, 12)); // NOI18N
        jLabel11.setText("Tuesday");

        jLabel12.setFont(new java.awt.Font("Malayalam MN", 0, 12)); // NOI18N
        jLabel12.setText("0800 - 2000");

        jLabel13.setFont(new java.awt.Font("Malayalam MN", 0, 12)); // NOI18N
        jLabel13.setText("0800 - 2000");

        jLabel14.setFont(new java.awt.Font("Malayalam MN", 0, 12)); // NOI18N
        jLabel14.setText("Wednesday");

        jLabel15.setFont(new java.awt.Font("Malayalam MN", 0, 12)); // NOI18N
        jLabel15.setText("0800 - 2000");

        jLabel16.setFont(new java.awt.Font("Malayalam MN", 0, 12)); // NOI18N
        jLabel16.setText("Thursday");

        jLabel17.setFont(new java.awt.Font("Malayalam MN", 0, 12)); // NOI18N
        jLabel17.setText("Friday");

        jLabel18.setFont(new java.awt.Font("Malayalam MN", 0, 12)); // NOI18N
        jLabel18.setText("Close");

        jLabel19.setFont(new java.awt.Font("Malayalam MN", 0, 12)); // NOI18N
        jLabel19.setText("Saturday");

        jLabel20.setFont(new java.awt.Font("Malayalam MN", 0, 12)); // NOI18N
        jLabel20.setText("0800 - 2000");

        jLabel21.setFont(new java.awt.Font("Malayalam MN", 0, 12)); // NOI18N
        jLabel21.setText("Sunday");

        jLabel22.setFont(new java.awt.Font("Malayalam MN", 0, 12)); // NOI18N
        jLabel22.setText("0800 - 2000");

        jLabel5.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        jLabel5.setText("Contact");

        jLabel29.setFont(new java.awt.Font("Malayalam MN", 0, 12)); // NOI18N
        jLabel29.setText("contact number here");

        jLabel30.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        jLabel30.setText("Email");

        jLabel31.setFont(new java.awt.Font("Malayalam MN", 0, 12)); // NOI18N
        jLabel31.setText("Email here");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel11)
                        .addComponent(jLabel9))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel12)
                        .addComponent(jLabel10)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel13))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addGap(25, 25, 25)
                            .addComponent(jLabel15)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel29))))
                .addGap(76, 76, 76)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(28, 28, 28)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel20)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel22)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31)))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15))
                .addGap(15, 15, 15))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        lblRating2.setFont(new java.awt.Font("Malayalam MN", 0, 12)); // NOI18N
        lblRating2.setText("sgt sedap! best restaurant");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRating2)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblRating2)
                .addContainerGap(29, Short.MAX_VALUE))
        );

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
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addComponent(lblvdName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVendorMenuCus)
                        .addGap(24, 24, 24))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AllRating)
                            .addGroup(rightPanelLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVendorMenuCus)
                            .addComponent(lblvdName))
                        .addGap(44, 44, 44)
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addComponent(AllRating)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        lb_Credit.setFont(new java.awt.Font("Malayalam MN", 1, 25)); // NOI18N

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
                        .addComponent(lb_Credit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(lb_Credit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Profile1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(btn_Settings1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb_quit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_quit1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_lb_quit1MouseClicked

    private void btn_notiCusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_notiCusMouseClicked
        this.dispose();
        CUSTOMER_Notification noti = new CUSTOMER_Notification();
        noti.setVisible(true);
    }//GEN-LAST:event_btn_notiCusMouseClicked

    private void btn_orderHisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_orderHisMouseClicked
        this.dispose();
        CUSTOMER_OrderHistory vop = new CUSTOMER_OrderHistory();
        vop.setVisible(true);
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

    private void AllRatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllRatingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AllRatingActionPerformed

    private void btnVendorMenuCusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVendorMenuCusMouseClicked
        try {
//            VendorHandler vd = new VendorHandler();
//            vendor = vd.GetVendorByVendorID("VD001");
//            String vdName = vendor.getVendorName();
//            System.out.println(vdName);
            

            if("Western".equals(this.vendorName)){
                this.dispose();
                CUSTOMER_ViewMenu viewMenu = new CUSTOMER_ViewMenu("VD001",vendorName);
                viewMenu.setVisible(true);
            }
            else if("Chinese".equals(this.vendorName)){
                this.dispose();
                CUSTOMER_ViewMenu viewMenu = new CUSTOMER_ViewMenu("VD002",vendorName);
                viewMenu.setVisible(true);
            }
            else if("Malay".equals(this.vendorName)){
                this.dispose();
                CUSTOMER_ViewMenu viewMenu = new CUSTOMER_ViewMenu("VD003",vendorName);
                viewMenu.setVisible(true);
            }
            else if("Indian".equals(this.vendorName)){
                this.dispose();
                CUSTOMER_ViewMenu viewMenu = new CUSTOMER_ViewMenu("VD004",vendorName);
                viewMenu.setVisible(true);
            }
            else if("Korean".equals(this.vendorName)){
                this.dispose();
                CUSTOMER_ViewMenu viewMenu = new CUSTOMER_ViewMenu("VD005",vendorName);
                viewMenu.setVisible(true);
            }
            else if("Japanese".equals(this.vendorName)){
                this.dispose();
                CUSTOMER_ViewMenu viewMenu = new CUSTOMER_ViewMenu("VD006",vendorName);
                viewMenu.setVisible(true);
            }
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(CUSTOMER_ViewVendorProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnVendorMenuCusMouseClicked

    private void btn_dashCusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dashCusMouseClicked
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

    private void AllRatingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllRatingMouseClicked
        // TODO add your handling code here:
        
//        try {
////            VendorHandler vd = new VendorHandler();
////            vendor = vd.GetVendorByVendorID("VD001");
////            String vdName = vendor.getVendorName();
////            System.out.println(vdName);
//            
//
//            if("Western".equals(this.vendorName)){
//                this.dispose();
//                CUSTOMER_Review review = new CUSTOMER_Review("VD001",vendorName);
//                review.setVisible(true);
//            }
//            else if("Chinese".equals(this.vendorName)){
//                this.dispose();
//                CUSTOMER_Review review = new CUSTOMER_Review("VD002",vendorName);
//                review.setVisible(true);
//            }
//            else if("Malay".equals(this.vendorName)){
//                this.dispose();
//                CUSTOMER_Review review = new CUSTOMER_Review("VD003",vendorName);
//                review.setVisible(true);
//            }
//            else if("Indian".equals(this.vendorName)){
//                this.dispose();
//                CUSTOMER_Review review = new CUSTOMER_Review("VD004",vendorName);
//                review.setVisible(true);
//            }
//            else if("Korean".equals(this.vendorName)){
//                this.dispose();
//                CUSTOMER_Review review = new CUSTOMER_Review("VD005",vendorName);
//                review.setVisible(true);
//            }
//            else if("Japanese".equals(this.vendorName)){
//                this.dispose();
//                CUSTOMER_Review review = new CUSTOMER_Review("VD006",vendorName);
//                review.setVisible(true);
//            }
//        } catch (IOException | ClassNotFoundException ex) {
//            Logger.getLogger(CUSTOMER_ViewVendorProfile.class.getName()).log(Level.SEVERE, null, ex);
//        }
            try {
                
            if (reviewPage == null || !reviewPage.isVisible()) {
                this.dispose();
                CUSTOMER_Review reviewPage = new CUSTOMER_Review(vendorID, vendorName);
                reviewPage.setVisible(true);
            } else {
                reviewPage.toFront();
            }
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(CUSTOMER_ViewVendorProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AllRatingMouseClicked

    private void btn_orderStatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_orderStatMouseClicked

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

    private void btn_orderStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_orderStatusMouseClicked
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
    }//GEN-LAST:event_btn_orderStatusMouseClicked

    private void btn_orderStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_orderStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_orderStatusActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AllRating;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton btnVendorMenuCus;
    private java.awt.Button btn_Profile1;
    private java.awt.Button btn_Settings1;
    private javax.swing.JButton btn_dashCus;
    private javax.swing.JButton btn_dashb1;
    private javax.swing.JButton btn_notiCus;
    private javax.swing.JButton btn_orderHis;
    private javax.swing.JButton btn_orderStat;
    private javax.swing.JButton btn_orderStatus;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lb_Credit;
    private javax.swing.JLabel lb_cafeName2;
    private javax.swing.JLabel lb_dailyEarnings3;
    private javax.swing.JLabel lb_logoName1;
    private javax.swing.JLabel lb_logoPic1;
    private javax.swing.JLabel lb_quit1;
    private javax.swing.JLabel lb_tuName4;
    private javax.swing.JLabel lb_tuName5;
    private javax.swing.JLabel lblRating1;
    private javax.swing.JLabel lblRating2;
    private javax.swing.JLabel lblvdName;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JPanel topPanel1;
    // End of variables declaration//GEN-END:variables
}
