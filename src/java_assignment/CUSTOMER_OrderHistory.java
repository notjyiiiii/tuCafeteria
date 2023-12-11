package java_assignment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CUSTOMER_OrderHistory extends javax.swing.JFrame {

    private DefaultTableModel modelReorder = new DefaultTableModel();
    private String[] columnName = {"Food","Price"};
    private int row = -1;
    private String cusID;
    private String vendorID;
    private String vendorName;
    private String orderID;
    private String food;
    private String foodPrice;
    
    public CUSTOMER_OrderHistory(){}
    
    public CUSTOMER_OrderHistory(String cusID) {
        
        initComponents();
        this.cusID = cusID;
        try {
            //get completed items based on cusID
            modelReorder.setColumnIdentifiers(columnName);
            OrderHandler orderHandler = new OrderHandler("Order",Order.class);
            ArrayList<Order> completedOrders = orderHandler.GetCompletedOrderByUserID(cusID);
            
            //from the completed items, get the orderID
            for(Order completedOrder : completedOrders){
                String OrderID = completedOrder.getOrderid();
                this.orderID = OrderID;
                String vendorID = completedOrder.getVendorid();
                this.vendorID = vendorID;
                String vendorName="";
                if(vendorID=="VD001"){
                    vendorName = "Western";
                    this.vendorName = vendorName;
                }else if(vendorID=="VD002"){
                    vendorName = "Chinese";
                    this.vendorName = vendorName;
                }else if(vendorID=="VD003"){
                    vendorName = "Malay";
                    this.vendorName = vendorName;
                }else if(vendorID=="VD004"){
                    vendorName = "Indian";
                    this.vendorName = vendorName;
                }else if(vendorID=="VD005"){
                    vendorName = "Korean";
                    this.vendorName = vendorName;
                }else if(vendorID=="VD006"){
                    vendorName = "Japanese";
                    this.vendorName = vendorName;
                }
                
                //use the orderID from order to get food
                OrderSummaryHandler orderSummaryHandler = new OrderSummaryHandler("OrderSummary",OrderSummary.class);
                ArrayList<OrderSummary> ordersummary = orderSummaryHandler.GetOrderByOrderID(OrderID);
            
                for (OrderSummary orderSummary : ordersummary) {
                    this.food = orderSummary.getFoodName();
                    this.foodPrice = orderSummary.getFoodPrice();
                    modelReorder.addRow(new Object[]{orderSummary.getFoodName(), orderSummary.getFoodPrice()});
                }
            }
            OrderHistory.setModel(modelReorder);
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(CUSTOMER_OrderStatus.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CUSTOMER_OrderStatus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topPanel1 = new javax.swing.JPanel();
        lb_logoPic1 = new javax.swing.JLabel();
        lb_logoName1 = new javax.swing.JLabel();
        lb_quit1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        OrderHistory = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        btnOrderHistoryBck = new javax.swing.JButton();
        btnReorder = new javax.swing.JButton();

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

        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setText("Search");

        OrderHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"#2768", "Dine In", "Food1 , Food 2", "Pending", null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jScrollPane1.setViewportView(OrderHistory);

        jButton3.setText("Search");

        btnOrderHistoryBck.setText("Back");
        btnOrderHistoryBck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOrderHistoryBckMouseClicked(evt);
            }
        });
        btnOrderHistoryBck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderHistoryBckActionPerformed(evt);
            }
        });

        btnReorder.setText("Order Again");
        btnReorder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReorderMouseClicked(evt);
            }
        });
        btnReorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReorderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(btnReorder, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnOrderHistoryBck, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOrderHistoryBck, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReorder, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb_quit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_quit1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_lb_quit1MouseClicked

    private void btnOrderHistoryBckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrderHistoryBckMouseClicked
        try {
            this.dispose();
            CUSTOMER_Main main = new CUSTOMER_Main();
            main.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(CUSTOMER_OrderHistory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CUSTOMER_OrderHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnOrderHistoryBckMouseClicked

    private void btnOrderHistoryBckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderHistoryBckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOrderHistoryBckActionPerformed

    private String[][] getSelectedDataFromOrderHistory() {
        int[] selectedRows = OrderHistory.getSelectedRows();
        int colCount = modelReorder.getColumnCount();
        String[][] orderData = new String[selectedRows.length][colCount];

        for (int i = 0; i < selectedRows.length; i++) {
            int selectedRow = selectedRows[i];
            for (int col = 0; col < colCount; col++) {
                orderData[i][col] = String.valueOf(modelReorder.getValueAt(selectedRow, col));
            }
        }

        return orderData;
    }
    
    private void btnReorderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReorderMouseClicked
        // TODO add your handling code here:
        try {
        this.dispose();
        OrderHandler orderHandlerGenerate = new OrderHandler();
        String reorderID = orderHandlerGenerate.generateOrderID();

        // Assuming orderData is available in your CUSTOMER_OrderHistory class
        String[][] orderData = getSelectedDataFromOrderHistory();

        // Loop through each row in orderData and write to OrderSummary
        for (int i = 0; i < orderData.length; i++) {
            String reorderedFood = orderData[i][0]; // Extract food name
            double reorderedFoodPrice = Double.parseDouble(orderData[i][1]); // Extract food price

            // Create an instance of OrderSummaryHandler
            OrderSummaryHandler orderSummaryHandler = new OrderSummaryHandler("OrderSummary", OrderSummary.class);

            // Call WriteOrderSummary to write the reordered item to OrderSummary
            orderSummaryHandler.WriteOrderSummary(reorderID, cusID, reorderedFood, String.valueOf(reorderedFoodPrice));
            System.out.println("Reordered item written to OrderSummary successfully.");
        }

        CUSTOMER_ConfirmOrder reorder = new CUSTOMER_ConfirmOrder(reorderID, vendorID, vendorName, orderData);
        System.out.println("\nView Menu's orderID, OrderSummary: " + reorderID);
        reorder.setVisible(true);

    } catch (IOException ex) {
        Logger.getLogger(CUSTOMER_OrderHistory.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(CUSTOMER_OrderHistory.class.getName()).log(Level.SEVERE, null, ex);
    }

        
//        //generate new orderID
//        OrderHandler orderHandlerGenerate = new OrderHandler();
//        String reorderID = orderHandlerGenerate.generateOrderID();
//
//
//        String[][] orderData = getSelectedDataFromOrderHistory();
//        
//        this.dispose();
//        CUSTOMER_ConfirmOrder reorder = new CUSTOMER_ConfirmOrder(reorderID, vendorID, vendorName,orderData);
//        System.out.println("\nView Menu's orderID,OrderSummary: "+reorderID);
//        reorder.setVisible(true);
      
         
    }//GEN-LAST:event_btnReorderMouseClicked

    private void btnReorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReorderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReorderActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CUSTOMER_OrderHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable OrderHistory;
    private javax.swing.JButton btnOrderHistoryBck;
    private javax.swing.JButton btnReorder;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lb_logoName1;
    private javax.swing.JLabel lb_logoPic1;
    private javax.swing.JLabel lb_quit1;
    private javax.swing.JPanel topPanel1;
    // End of variables declaration//GEN-END:variables
}
