package java_assignment;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CUSTOMER_ConfirmOrder extends javax.swing.JFrame {

    private String selFood;
    private String selFoodDesc;
    private String selFoodPrice;
    private String vendorName;
    private int row = -1;
    private DefaultTableModel model = new DefaultTableModel();
    private String[] columnName = {"Food","Price"};
    
    public CUSTOMER_ConfirmOrder() {
        initComponents();
    }
    
    public CUSTOMER_ConfirmOrder(String selFood, String selFoodDesc, String selFoodPrice, String vendorName ) {
        initComponents();
        this.selFood = selFood;
        this.selFoodDesc = selFoodDesc;
        this.selFoodPrice = selFoodPrice;
        this.vendorName = vendorName;
        
        lb_Vname.setText(vendorName);
        
        model.setColumnIdentifiers(columnName);
        Object[] rowData = {selFood, selFoodPrice};
        model.addRow(rowData);
        ViewOrder.setModel(model);
        
    }

    
    public void updateViewOrderTable(String food, String foodPrice) {
        Object[] rowData = {food, foodPrice};
        model.addRow(rowData);
        ViewOrder.setModel(model);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OrderBack = new javax.swing.JButton();
        topPanel1 = new javax.swing.JPanel();
        lb_logoPic1 = new javax.swing.JLabel();
        lb_logoName1 = new javax.swing.JLabel();
        lb_quit1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lb_checkout = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lb_Vname = new javax.swing.JLabel();
        lb_checkout1 = new javax.swing.JLabel();
        txtLocation1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        lb_checkout3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnAddItem = new javax.swing.JButton();
        lb_checkout4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ViewOrder = new javax.swing.JTable();
        lb_checkout2 = new javax.swing.JLabel();
        lblSubtotalCus = new javax.swing.JLabel();
        lb_checkout6 = new javax.swing.JLabel();
        lblTotalCus = new javax.swing.JLabel();
        lb_checkout8 = new javax.swing.JLabel();
        lblDeliveryFeeCus1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lb_checkout7 = new javax.swing.JLabel();
        lb_checkout9 = new javax.swing.JLabel();
        btnCancelOrder = new javax.swing.JButton();
        btnPlaceOrder = new javax.swing.JButton();

        OrderBack.setText("Back");
        OrderBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderBackMouseClicked(evt);
            }
        });
        OrderBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderBackActionPerformed(evt);
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
                .addGap(176, 176, 176)
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

        lb_checkout.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_checkout.setText("Check Out");

        jPanel2.setBackground(new java.awt.Color(255, 189, 49));
        jPanel2.setForeground(new java.awt.Color(255, 189, 49));

        lb_Vname.setFont(new java.awt.Font("Malayalam MN", 1, 25)); // NOI18N
        lb_Vname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_VnameMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_Vname, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_Vname, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lb_checkout1.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_checkout1.setText("Location");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delivery", "Dine In", "Pick Up" }));

        lb_checkout3.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_checkout3.setText("Delivery Option");

        btnAddItem.setText("Add Items");
        btnAddItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddItemMouseClicked(evt);
            }
        });
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        lb_checkout4.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_checkout4.setText("Order Summary");

        ViewOrder.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(ViewOrder);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lb_checkout4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddItem)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_checkout4)
                    .addComponent(btnAddItem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lb_checkout2.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_checkout2.setText("Subtotal");

        lblSubtotalCus.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lblSubtotalCus.setText("RM");
        lblSubtotalCus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lb_checkout6.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_checkout6.setText("Delivery Fee");

        lblTotalCus.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lblTotalCus.setText("RM");
        lblTotalCus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lb_checkout8.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_checkout8.setText("Total");

        lblDeliveryFeeCus1.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lblDeliveryFeeCus1.setText("RM");
        lblDeliveryFeeCus1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lb_checkout7.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_checkout7.setText("Available Credits");

        lb_checkout9.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_checkout9.setText("RM");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lb_checkout7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_checkout9, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(lb_checkout7)
                .addGap(15, 15, 15))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lb_checkout9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnCancelOrder.setText("Cancel");
        btnCancelOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelOrderMouseClicked(evt);
            }
        });
        btnCancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelOrderActionPerformed(evt);
            }
        });

        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPlaceOrderMouseClicked(evt);
            }
        });
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_checkout1)
                                    .addComponent(txtLocation1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(134, 134, 134)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_checkout3))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lb_checkout)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCancelOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_checkout2)
                                    .addComponent(lb_checkout6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSubtotalCus, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDeliveryFeeCus1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lb_checkout8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTotalCus, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_checkout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_checkout1)
                    .addComponent(lb_checkout3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLocation1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_checkout2)
                    .addComponent(lblSubtotalCus))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_checkout6)
                    .addComponent(lblDeliveryFeeCus1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_checkout8)
                    .addComponent(lblTotalCus))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb_quit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_quit1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_lb_quit1MouseClicked

    private void OrderBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderBackMouseClicked
        this.dispose();
        VendorOrdersPage vop = new VendorOrdersPage();
        vop.setVisible(true);
    }//GEN-LAST:event_OrderBackMouseClicked

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void OrderBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderBackActionPerformed

    private void lb_VnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_VnameMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lb_VnameMouseClicked

    private void btnCancelOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelOrderMouseClicked
        // TODO add your handling code here:
//        int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to cancel the order?", "Cancel Order", JOptionPane.YES_NO_OPTION);
//    
//        if (result == JOptionPane.YES_OPTION) {
//            // User clicked "Yes," cancel the order
//            this.dispose();
//            CUSTOMER_ViewMenu cancel = new CUSTOMER_ViewMenu();
//            cancel.setVisible(true);
//
//        }
        this.dispose();
        CUSTOMER_ViewMenu cancel = new CUSTOMER_ViewMenu();
        cancel.setVisible(true);
    }//GEN-LAST:event_btnCancelOrderMouseClicked

    private void btnCancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelOrderActionPerformed

    private void btnPlaceOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlaceOrderMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPlaceOrderMouseClicked

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void btnAddItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddItemMouseClicked
        // TODO add your handling code here:
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
//        this.dispose();
//        CUSTOMER_ViewMenu addFood = new CUSTOMER_ViewMenu();
//        addFood.setVisible(true);
        String food = String.valueOf(model.getValueAt(row, 0));
        String foodPrice = String.valueOf(model.getValueAt(row, 1));
        updateViewOrderTable(food, foodPrice);
    }//GEN-LAST:event_btnAddItemMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CUSTOMER_ConfirmOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OrderBack;
    private javax.swing.JTable ViewOrder;
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnCancelOrder;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_Vname;
    private javax.swing.JLabel lb_checkout;
    private javax.swing.JLabel lb_checkout1;
    private javax.swing.JLabel lb_checkout2;
    private javax.swing.JLabel lb_checkout3;
    private javax.swing.JLabel lb_checkout4;
    private javax.swing.JLabel lb_checkout6;
    private javax.swing.JLabel lb_checkout7;
    private javax.swing.JLabel lb_checkout8;
    private javax.swing.JLabel lb_checkout9;
    private javax.swing.JLabel lb_logoName1;
    private javax.swing.JLabel lb_logoPic1;
    private javax.swing.JLabel lb_quit1;
    private javax.swing.JLabel lblDeliveryFeeCus1;
    private javax.swing.JLabel lblSubtotalCus;
    private javax.swing.JLabel lblTotalCus;
    private javax.swing.JPanel topPanel1;
    private javax.swing.JTextField txtLocation1;
    // End of variables declaration//GEN-END:variables
}
