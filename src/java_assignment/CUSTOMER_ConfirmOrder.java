package java_assignment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CUSTOMER_ConfirmOrder extends javax.swing.JFrame {

    private String selFood;
    private String selFoodDesc;
    private String selFoodPrice;
    private String vendorName;
    private String vendorID;
    private String orderID;
    private String cusID = Java_assignment.LoggedInUser.userid;
    private int row = -1;
    private DefaultTableModel modelFood = new DefaultTableModel();
    private String[] columnName = {"Food","Price"};
    private String[][] itemsArray;
    private ButtonGroup OrderType = new ButtonGroup();
    
    
    public CUSTOMER_ConfirmOrder() {
        initComponents();          
    }
    
    public CUSTOMER_ConfirmOrder(String orderID,String vendorID, String vendorName ) {
        initComponents();
        
        OrderType.add(RBdinein); 
        OrderType.add(RBtakeaway); 
        OrderType.add(RBdelivery); 
        
        try {
            initComponents();
            this.selFood = selFood;
            this.selFoodDesc = selFoodDesc;
            this.selFoodPrice = selFoodPrice;
            this.vendorID = vendorID;
            this.vendorName = vendorName;
            this.orderID = orderID;
            
            System.out.println("\nBeing pass from menu in confirm order, writing to order_1 file: "+ this.orderID);
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
        //txtSubtotal.setText("");
        System.out.println("Total price: "+totalFoodPrice);
        txtSubtotal.setText(String.valueOf(totalFoodPrice));
        
                } catch (IOException ex) {
                    Logger.getLogger(CUSTOMER_ConfirmOrder.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(CUSTOMER_ConfirmOrder.class.getName()).log(Level.SEVERE, null, ex);
                }

        
        if (Java_assignment.LoggedInUser.userid != null) {
            try {
                CustomerHandler customerHandler = new CustomerHandler("Customer", Customer.class);
                double x = customerHandler.getCredit(Java_assignment.LoggedInUser.userid);
                
                //txtAvailableCredit.setText("");
                txtAvailableCredit.setText("RM: "+String.valueOf(x));
                
                System.out.println("\nAvailable credit: "+x);
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
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        topPanel1 = new javax.swing.JPanel();
        lb_logoPic1 = new javax.swing.JLabel();
        lb_logoName1 = new javax.swing.JLabel();
        lb_quit1 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        lb_checkout = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lb_Vname = new javax.swing.JLabel();
        lb_checkout1 = new javax.swing.JLabel();
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
        txtAvailableCredit = new javax.swing.JTextField();
        btnCancelOrder = new javax.swing.JButton();
        btnPlaceOrder = new javax.swing.JButton();
        DeliveryFeeCus = new javax.swing.JTextField();
        TotalCus = new javax.swing.JTextField();
        txtSubtotal = new javax.swing.JTextField();
        RBdinein = new javax.swing.JRadioButton();
        RBtakeaway = new javax.swing.JRadioButton();
        RBdelivery = new javax.swing.JRadioButton();
        comboLocation = new javax.swing.JComboBox<>();

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

        txtAvailableCredit.setEditable(false);
        txtAvailableCredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAvailableCreditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_checkout7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtAvailableCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAvailableCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_checkout7))
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

        DeliveryFeeCus.setEditable(false);

        TotalCus.setEditable(false);

        txtSubtotal.setEditable(false);

        RBdinein.setText("Dine-In");
        RBdinein.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBdineinActionPerformed(evt);
            }
        });

        RBtakeaway.setText("Takeaway");
        RBtakeaway.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBtakeawayActionPerformed(evt);
            }
        });

        RBdelivery.setText("Delivery");
        RBdelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBdeliveryActionPerformed(evt);
            }
        });

        comboLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Block A", "Block B", "Block D", "Block E" }));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_checkout1)
                                    .addComponent(comboLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(90, 90, 90)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_checkout3)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(RBdinein)
                                        .addGap(18, 18, 18)
                                        .addComponent(RBtakeaway)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(RBdelivery)))
                                .addGap(146, 159, Short.MAX_VALUE))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lb_checkout)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(lb_checkout8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TotalCus, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lb_checkout2)
                                            .addComponent(lb_checkout6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(DeliveryFeeCus, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(3, 3, 3))))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnCancelOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)))
                .addGap(31, 31, 31))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_checkout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_checkout1)
                    .addComponent(lb_checkout3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBdinein)
                    .addComponent(RBtakeaway)
                    .addComponent(RBdelivery)
                    .addComponent(comboLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_checkout2)
                    .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_checkout6)
                    .addComponent(DeliveryFeeCus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_checkout8)
                    .addComponent(TotalCus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
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
        String orderStatus = "Pending";
//        String food = String.valueOf(modelFood.getValueAt(row, 0));
//        String foodPrice = String.valueOf(modelFood.getValueAt(row, 1));
        
        String orderType = "";
        if(RBdinein.isSelected()){
            orderType = "Dine-In";
        }
        else if(RBtakeaway.isSelected()){
            orderType = "Takeaway";
        }
        else{
            orderType = "Delivery";
        }
        Object Location = comboLocation.getSelectedItem();
        
        //System.out.println(Location+"   Hi");
        
        
        String orderAmount = txtSubtotal.getText();
        String deliveryFees = DeliveryFeeCus.getText();
        String totalAmount = TotalCus.getText();
        
        //check enough credit or not
        try {
                CustomerHandler customerHandler = new CustomerHandler("Customer", Customer.class);
                double credit = customerHandler.getCredit(Java_assignment.LoggedInUser.userid);
                
                //txtAvailableCredit.setText("");
                //txtAvailableCredit.setText("RM: "+String.valueOf(x));
                if(credit < Double.parseDouble(totalAmount)){
                    JOptionPane.showMessageDialog(this,"Order failed, please reload credit!");
                }
                else{
                    JOptionPane.showMessageDialog(this,"Order successfully!");
                    double newcredit = credit - Double.parseDouble(totalAmount);
                    //CustomerHandler customerHandler = new CustomerHandler();
                    // Call the updateCredit method to update the credit
                    customerHandler.updateCredit(cusID, String.valueOf(newcredit));
                    // Print or use the updated credit as needed
                    
                    
                    
//                    OrderHandler orderHandlerGenerate = new OrderHandler();
//                    String orderID = orderHandlerGenerate.generateOrderID();

                    String[] orders = {orderStatus,orderType,String.valueOf(Location),orderAmount,deliveryFees,totalAmount};

                    OrderHandler orderHandler;
                    try{
                        orderHandler = new OrderHandler("Order_1",Order.class);
                        System.out.println(orderID +"before writing to order_1");
                        orderHandler.WritePlaceOrder(orderID, cusID, vendorID, orders);
                        System.out.println("After writing order to file: "+ orderID);

                    }catch (IOException | ClassNotFoundException ex){
                        Logger.getLogger(CUSTOMER_ConfirmOrder.class.getName()).log(Level.SEVERE,null,ex);
                        JOptionPane.showMessageDialog(this,"Error writing review to file");
                    }
                    
                    
                    this.dispose();
                    CUSTOMER_OrderStatus orderstatus = new CUSTOMER_OrderStatus(orderID);
                    orderstatus.setVisible(true);
                }
                
            } catch (IOException ex) {
                Logger.getLogger(CUSTOMER_ConfirmOrder.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CUSTOMER_ConfirmOrder.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        
    }//GEN-LAST:event_btnPlaceOrderMouseClicked

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        // TODO add your handling code here:
//        System.out.println("before getting location");
//        jTextField1.getText();
//        System.out.println("after getting location");
//        System.out.println(jTextField1.getText());
//        System.out.println("after trying to print location");
        
        //System.out.println(comboLocation.getSelectedItem());
        
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    
    private void updateTotal() {
        try {
            double deliveryFee = Double.parseDouble(DeliveryFeeCus.getText().replace("RM ", ""));
            double subtotal = Double.parseDouble(txtSubtotal.getText().replace("RM ", ""));
            double total = subtotal + deliveryFee;
            TotalCus.setText(String.format("%.2f", total));
        } catch (NumberFormatException e) {
            // Handle the exception if the text cannot be converted to a number
            TotalCus.setText("Invalid total");
        }
    }
    
    private void RBdeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBdeliveryActionPerformed
        // TODO add your handling code here:
        DeliveryFeeCus.setText("RM 3.00");
        updateTotal();
        
//        double total = 0.0;
//        double subtotal = Double.parseDouble(txtSubtotal.getText());
//        total = subtotal + 3;
//        TotalCus.setText("RM "+String.valueOf(total));
    }//GEN-LAST:event_RBdeliveryActionPerformed

    private void RBdineinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBdineinActionPerformed
        // TODO add your handling code here:
        DeliveryFeeCus.setText("RM 0.00");
        updateTotal();
        
//        double total = 0.0;
//        double subtotal = Double.parseDouble(txtSubtotal.getText());
//        total = subtotal;
//        TotalCus.setText("RM "+String.valueOf(total));
    }//GEN-LAST:event_RBdineinActionPerformed

    private void RBtakeawayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBtakeawayActionPerformed
        // TODO add your handling code here:
        DeliveryFeeCus.setText("RM 0.00");
        updateTotal();
//        double total = 0.0;
//        double subtotal = Double.parseDouble(txtSubtotal.getText());
//        total = subtotal;
    }//GEN-LAST:event_RBtakeawayActionPerformed

    private void txtAvailableCreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAvailableCreditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvailableCreditActionPerformed

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
    private javax.swing.JRadioButton RBdelivery;
    private javax.swing.JRadioButton RBdinein;
    private javax.swing.JRadioButton RBtakeaway;
    private javax.swing.JTextField TotalCus;
    private javax.swing.JTable ViewOrder;
    private javax.swing.JButton btnCancelOrder;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JComboBox<String> comboLocation;
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
    private javax.swing.JLabel lb_logoName1;
    private javax.swing.JLabel lb_logoPic1;
    private javax.swing.JLabel lb_quit1;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel topPanel1;
    private javax.swing.JTextField txtAvailableCredit;
    private javax.swing.JTextField txtSubtotal;
    // End of variables declaration//GEN-END:variables
}
