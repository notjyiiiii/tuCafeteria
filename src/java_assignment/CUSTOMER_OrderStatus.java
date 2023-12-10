package java_assignment;

import java.awt.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CUSTOMER_OrderStatus extends javax.swing.JFrame {

    private DefaultTableModel modelOrderStatus = new DefaultTableModel(); 
    private String[] columnName = {"Order ID", "Food","Status"};
    private int row = -1;
    
    public CUSTOMER_OrderStatus() {
        initComponents();
    }

public CUSTOMER_OrderStatus(ArrayList<String> orderIDs) {
        initComponents();
        
        
        modelOrderStatus.setColumnIdentifiers(columnName);

        OrderStatus.setModel(modelOrderStatus);

        try {
        OrderSummaryHandler orderSummaryHandler = new OrderSummaryHandler("OrderSummary", OrderSummary.class);

        for (String orderID : orderIDs) {
            ArrayList<OrderSummary> ordersummary = orderSummaryHandler.GetOrderID(orderID);

            OrderHandler orderHandler = new OrderHandler("Order", Order.class);
            ArrayList<Order> orderStatusList = orderHandler.GetOrderStatusByOrderID(orderID);

            for (OrderSummary orderSummaryItem : ordersummary) {
                // Find matching order status in orderStatusList
                Optional<Order> matchingOrderStatus = orderStatusList.stream()
                        .filter(order -> order.getOrderid().equals(orderID))
                        .findFirst();

                // Add data to the modelOrderStatus
                if (matchingOrderStatus.isPresent()) {
                    String orderStatus = matchingOrderStatus.get().getOrderStatus();
                    modelOrderStatus.addRow(new Object[]{
                            orderSummaryItem.getOrderIDforSummary(),
                            orderSummaryItem.getFoodName(),
                            matchingOrderStatus.get().getOrderStatus()
                    });
                    if ("DELIVERED".equals(orderStatus)) {
                        // Prompt the user to write a review
                        int confirmResult = JOptionPane.showConfirmDialog(
                                this,
                                "Your order has been delivered. Would you like to write a review?",
                                "Write Review",
                                JOptionPane.YES_NO_OPTION
                        );

                        if (confirmResult == JOptionPane.YES_OPTION) {
                            // Open the review writing dialog or perform any other action
                            // You can replace the following line with the code to open your review dialog
                            CUSTOMER_Review review = new CUSTOMER_Review();
                            review.setVisible(true);
                        }
                        
                        if (confirmResult == JOptionPane.YES_OPTION) {
                            // Open the review writing dialog (replace the following line with your code)
                            // For demonstration, a simple message dialog is used
                            JOptionPane.showMessageDialog(this, "Opening review writing dialog for order ID " + orderID);

                            orderHandler.updateOrderStatusToCompleted(orderID);
                            // After writing the review, update the order status to "COMPLETED"
                            //matchingOrderStatus.get().setOrderStatus("COMPLETED");
                            //orderHandler.UpdateItem(matchingOrderStatus.get(), matchingOrderStatus.get());
                        }
                    }
                    
                    
                } else {
                    // Handle the case where order status is not found (you can set a default value or leave it empty)
                    modelOrderStatus.addRow(new Object[]{
                            orderSummaryItem.getOrderIDforSummary(),
                            orderSummaryItem.getFoodName(),
                            "Status Not Found"
                    });
                }
            }
        }
    } catch (IOException | ClassNotFoundException ex) {
        Logger.getLogger(CUSTOMER_OrderStatus.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }

public CUSTOMER_OrderStatus(String orderID) {
        initComponents();
        modelOrderStatus.setColumnIdentifiers(columnName);

        OrderStatus.setModel(modelOrderStatus);
        try {
            OrderSummaryHandler orderSummaryHandler = new OrderSummaryHandler("OrderMiddleMan", OrderSummary.class);
            ArrayList<OrderSummary> ordersummary = orderSummaryHandler.GetOrderID(orderID);

            OrderHandler orderHandler = new OrderHandler("Order", Order.class);
            ArrayList<Order> orderStatusList = orderHandler.GetOrderStatusByOrderID(orderID);

            for (OrderSummary orderSummaryItem : ordersummary) {
                // Find matching order status in orderStatusList
                Optional<Order> matchingOrderStatus = orderStatusList.stream()
                        .filter(order -> order.getOrderid().equals(orderID))
                        .findFirst();

                // Add data to the modelOrderStatus
                if (matchingOrderStatus.isPresent()) {
                    modelOrderStatus.addRow(new Object[]{
                            orderSummaryItem.getOrderIDforSummary(),
                            orderSummaryItem.getFoodName(),
                            matchingOrderStatus.get().getOrderStatus()
                    });
                } else {
                    // Handle the case where order status is not found (you can set a default value or leave it empty)
                    modelOrderStatus.addRow(new Object[]{
                            orderSummaryItem.getOrderIDforSummary(),
                            orderSummaryItem.getFoodName(),
                            "Status Not Found"
                    });
                }
            }
        } catch (IOException | ClassNotFoundException ex) {
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
        OrderStatus = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        btnOrderStatusBck = new javax.swing.JButton();
        btnCancelOrder = new javax.swing.JButton();

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

        OrderStatus.setModel(modelOrderStatus);
        jScrollPane1.setViewportView(OrderStatus);

        jButton3.setText("Search");

        btnOrderStatusBck.setText("Back");
        btnOrderStatusBck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOrderStatusBckMouseClicked(evt);
            }
        });
        btnOrderStatusBck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderStatusBckActionPerformed(evt);
            }
        });

        btnCancelOrder.setText("Cancel Order");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)
                                .addGap(271, 271, 271))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(btnCancelOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnOrderStatusBck, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOrderStatusBck, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb_quit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_quit1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_lb_quit1MouseClicked

    private void btnOrderStatusBckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrderStatusBckMouseClicked
        try {
            this.dispose();
            CUSTOMER_Main main = new CUSTOMER_Main();
            main.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(CUSTOMER_OrderStatus.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CUSTOMER_OrderStatus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnOrderStatusBckMouseClicked

    private void btnOrderStatusBckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderStatusBckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOrderStatusBckActionPerformed

    private void btnCancelOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelOrderMouseClicked
        // TODO add your handling code here:
        try {
    // Step 1: Get the selected row from the JTable
        int selectedRow = OrderStatus.getSelectedRow();

        if (selectedRow == -1) {
            // No row selected, handle accordingly
            System.out.println("Please select a row to cancel.");
            return;
        }

        // Step 2: Get the order ID and status from the selected row
        String orderID = (String) OrderStatus.getValueAt(selectedRow, 0);

        // Step 3: Update the JTable modelOrderStatus
        modelOrderStatus.setValueAt("CANCELLED", selectedRow, 2);

        // Step 4: Use OrderHandler to update the collection
        OrderHandler orderHandler = new OrderHandler("Order", Order.class);
        ArrayList<Order> completedOrders = orderHandler.GetCompletedOrderByUserID(Java_assignment.LoggedInUser.userid);

    // Find the order to update
    Order foundOrder = null;
    for (Order completedOrder : completedOrders) {
        if (completedOrder.getOrderid().equals(orderID)) {
            // Update the order status
            completedOrder.setOrderStatus("CANCELLED");
            foundOrder = completedOrder;
            break; // Exit the loop after updating the matching order ID
        }
    }

    // Step 5: Update the file content
    fileManager fm = new fileManager();
    ArrayList<String[]> fileContent = fm.readFile("Order");

    // Step 6: Identify and update the line with the selected order ID to "Cancelled"
    for (int i = 0; i < fileContent.size(); i++) {
        String[] parts = fileContent.get(i);

        // Assuming the order ID is at index 0 (adjust if it's at a different index)
        if (parts.length > 0 && parts[0].equals(orderID)) {
            // Update the status to "Cancelled"
            parts[3] = "CANCELLED";

            // If you need to update other fields, do it here

            // Update the ArrayList directly
            fileContent.set(i, parts);
            break; // Exit the loop after updating the matching order ID
        }
    }

    // Step 7: Write the updated data back to the "Order" file
    fm.updateFile("Order", fileContent);

    System.out.println("Order cancelled successfully.");

} catch (IOException e) {
    e.printStackTrace();
} catch (ClassNotFoundException ex) {
    Logger.getLogger(CUSTOMER_OrderStatus.class.getName()).log(Level.SEVERE, null, ex);
} 

//        try{
//            int selectedRow = OrderStatus.getSelectedRow();
//            if(selectedRow == -1){
//                System.out.println("Select item to cancel");
//                return;
//            }
//            String orderID = (String) OrderStatus.getValueAt(selectedRow, 0);
//            
//            String filePath = "Order_1.txt";
//            fileManager fm = new fileManager();
//            ArrayList<String[]> fileContent = fm.readFile(filePath);
//            
//            for(int i =0; i<fileContent.size();i++){
//                String[] parts = fileContent.get(i);
//                
//                if(parts.length > 0 && parts[0].equals(orderID)){
//                    parts[3] = "Cancelled";
//                    fileContent.set(i, parts);
//                    break;
//                }
//            }
//            String[] updatedData = fileContent.stream().map(parts -> String.join(";", parts)).toArray(String[]::new);
//            fm.updateFile(filePath, updatedData);
//            modelOrderStatus.setValueAt("Cancelled", selectedRow, 2);
//            System.out.println("Order cancelled successfully.");
//        }catch (IOException e){
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_btnCancelOrderMouseClicked

    private void btnCancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelOrderActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnCancelOrderActionPerformed

    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CUSTOMER_OrderStatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable OrderStatus;
    private javax.swing.JButton btnCancelOrder;
    private javax.swing.JButton btnOrderStatusBck;
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
