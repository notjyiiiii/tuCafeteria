package java_assignment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CUSTOMER_ConfirmOrder extends javax.swing.JFrame {

    private String selFood;
    private String selFoodDesc;
    private String selFoodPrice;
    private String vendorName;
    private String vendorID;
    private String cusID = Java_assignment.LoggedInUser.userid;
    private int row = -1;
    private DefaultTableModel modelFood = new DefaultTableModel();
    private String[] columnName = {"Food","Price"};
    private String[][] itemsArray;
    
    public CUSTOMER_ConfirmOrder() {
        initComponents();
        
        if (Java_assignment.LoggedInUser.userid != null) {
            try {
                CustomerHandler customerHandler = new CustomerHandler("Customer", Customer.class);
                double x = customerHandler.getCredit(Java_assignment.LoggedInUser.userid);
                lbAvailableCredit.setText("RM: "+String.valueOf(x));
            } catch (IOException ex) {
                Logger.getLogger(CUSTOMER_ConfirmOrder.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CUSTOMER_ConfirmOrder.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
        // Handle the case where userid is null (perhaps display an error message)
        System.err.println("Userid is null");
        }        
                
    }
    
    public CUSTOMER_ConfirmOrder(String vendorId, String vendorName ) {
        initComponents();
        
        try {
            initComponents();
            this.selFood = selFood;
            this.selFoodDesc = selFoodDesc;
            this.selFoodPrice = selFoodPrice;
            this.vendorID = vendorID;
            this.vendorName = vendorName;
            
            lb_Vname.setText(vendorName);
            
//        modelFood.setColumnIdentifiers(columnName);
//        Object[] rowData = {selFood, selFoodPrice};
//        modelFood.addRow(rowData);
//        ViewOrder.setModel(modelFood);


        modelFood.setColumnIdentifiers(columnName);

        ViewOrder.setModel(modelFood);

        modelFood.setColumnIdentifiers(columnName);

        ViewOrder.setModel(modelFood);

//        ViewOrder.getColumnModel().getColumn(0).setPreferredWidth(50);
//        ViewOrder.getColumnModel().getColumn(1).setPreferredWidth(50);
//        ViewOrder.getColumnModel().getColumn(2).setPreferredWidth(50);

        OrderSummaryHandler ordersummaryHandler = new OrderSummaryHandler("OrderSummary",OrderSummary.class);
        ArrayList<OrderSummary> ordersummary = ordersummaryHandler.GetCusOrderSummary(cusID);

        double totalFoodPrice = 0.0;
        
        for (OrderSummary ordersummaryItem : ordersummary) {
            modelFood.addRow(new Object[]{ordersummaryItem.getFoodName(), ordersummaryItem.getFoodPrice()});
            totalFoodPrice += Double.parseDouble(ordersummaryItem.getFoodPrice());
            
           
            
        }
        txtSubtotal.setText("");
        txtSubtotal.setText("RM "+String.valueOf(totalFoodPrice));
        
        System.out.println(totalFoodPrice+"Hi");
        
                } catch (IOException ex) {
                    Logger.getLogger(CUSTOMER_ConfirmOrder.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(CUSTOMER_ConfirmOrder.class.getName()).log(Level.SEVERE, null, ex);
                }

    }

    public CUSTOMER_ConfirmOrder(String[][] itemsArray) {
        initComponents();

        // Initialize the viewOrderModel
        modelFood = new DefaultTableModel();
        ViewOrder.setModel(modelFood);

        // Add columns to the viewOrderModel if needed
        // viewOrderModel.addColumn("Column1");
        // viewOrderModel.addColumn("Column2");

        // Populate the viewOrderModel with items from itemsArray
        for (String[] item : itemsArray) {
            modelFood.addRow(item);
        }
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
        txtLocation = new javax.swing.JTextField();
        lb_checkout3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lb_checkout4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ViewOrder = new javax.swing.JTable();
        lb_checkout2 = new javax.swing.JLabel();
        lb_checkout6 = new javax.swing.JLabel();
        lb_checkout8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lb_checkout7 = new javax.swing.JLabel();
        lbAvailableCredit = new javax.swing.JLabel();
        btnCancelOrder = new javax.swing.JButton();
        btnPlaceOrder = new javax.swing.JButton();
        comboOrderType = new javax.swing.JComboBox<>();
        DeliveryFeeCus = new javax.swing.JTextField();
        TotalCus = new javax.swing.JTextField();
        txtSubtotal = new javax.swing.JTextField();

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

        lb_checkout3.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_checkout3.setText("Delivery Option");

        lb_checkout4.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_checkout4.setText("Order Summary");

        ViewOrder.setModel(modelFood);
        jScrollPane1.setViewportView(ViewOrder);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_checkout4))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_checkout4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lb_checkout2.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_checkout2.setText("Subtotal");

        lb_checkout6.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_checkout6.setText("Delivery Fee");

        lb_checkout8.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_checkout8.setText("Total");

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lb_checkout7.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_checkout7.setText("Available Credits");

        lbAvailableCredit.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lbAvailableCredit.setText("RM");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lb_checkout7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbAvailableCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(lb_checkout7)
                .addGap(15, 15, 15))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lbAvailableCredit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        comboOrderType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dine-In", "Takeaway", "Delivery" }));
        comboOrderType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboOrderTypeMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                comboOrderTypeMouseReleased(evt);
            }
        });

        DeliveryFeeCus.setEditable(false);
        DeliveryFeeCus.setText("RM");

        TotalCus.setEditable(false);
        TotalCus.setText("RM");

        txtSubtotal.setEditable(false);
        txtSubtotal.setText("RM");

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
                                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(134, 134, 134)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_checkout3)
                                    .addComponent(comboOrderType, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lb_checkout8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TotalCus, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lb_checkout2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lb_checkout6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(432, 432, 432)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DeliveryFeeCus, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                    .addComponent(txtSubtotal))
                                .addGap(6, 6, 6)))))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboOrderType, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_checkout2)
                            .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addComponent(lb_checkout6)
                        .addGap(16, 16, 16)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_checkout8)
                            .addComponent(TotalCus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(15, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(DeliveryFeeCus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addContainerGap(13, Short.MAX_VALUE))
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
        String food = String.valueOf(modelFood.getValueAt(row, 0));
        String foodPrice = String.valueOf(modelFood.getValueAt(row, 1));
        String OrderType = String.valueOf(comboOrderType.getSelectedItem());
        String Location = txtLocation.getText();
                
        String[] orders = {food,foodPrice};
        modelFood.addRow(orders);
        
        
        
    }//GEN-LAST:event_btnPlaceOrderMouseClicked

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void comboOrderTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboOrderTypeMouseClicked
        // TODO add your handling code here:
        //String deliveryType = String.valueOf(comboOrderType.getSelectedItem());
        Object selectedItem = comboOrderType.getSelectedItem();
        if (selectedItem != null && selectedItem.toString().equals("Dine_In")) {
            System.out.println("RM 3.00");
            DeliveryFeeCus.setText("3.00");
            System.out.println("Rm 3.00");
        } else {
            DeliveryFeeCus.setText("0");
    }
    }//GEN-LAST:event_comboOrderTypeMouseClicked

    private void comboOrderTypeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboOrderTypeMouseReleased
        // TODO add your handling code here:
//        String deliveryType = String.valueOf(comboOrderType.getSelectedItem());
//        if(deliveryType.equals("Delivery")){
//            System.out.println("RM 3.00");
//            DeliveryFeeCus.setText("3.00");
//        }
//        else{
//            DeliveryFeeCus.setText("0");
//        }
    }//GEN-LAST:event_comboOrderTypeMouseReleased

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CUSTOMER_ConfirmOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DeliveryFeeCus;
    private javax.swing.JButton OrderBack;
    private javax.swing.JTextField TotalCus;
    private javax.swing.JTable ViewOrder;
    private javax.swing.JButton btnCancelOrder;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JComboBox<String> comboOrderType;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAvailableCredit;
    private javax.swing.JLabel lb_Vname;
    private javax.swing.JLabel lb_checkout;
    private javax.swing.JLabel lb_checkout1;
    private javax.swing.JLabel lb_checkout2;
    private javax.swing.JLabel lb_checkout3;
    private javax.swing.JLabel lb_checkout4;
    private javax.swing.JLabel lb_checkout6;
    private javax.swing.JLabel lb_checkout7;
    private javax.swing.JLabel lb_checkout8;
    private javax.swing.JLabel lb_logoName1;
    private javax.swing.JLabel lb_logoPic1;
    private javax.swing.JLabel lb_quit1;
    private javax.swing.JPanel topPanel1;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtSubtotal;
    // End of variables declaration//GEN-END:variables
}
