package java_assignment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CUSTOMER_ViewMenu extends javax.swing.JFrame {

    private DefaultTableModel model = new DefaultTableModel();
    private DefaultTableModel AddedOrdermodel = new DefaultTableModel();
    private String[] columnName = {"Food", "Food Description", "Price"};
    private String[] columnName2 = {"Food", "Price"};
    private int row=-1,row2=-1;
    private String vendorID;
    private String vendorName;
    private String cusID = Java_assignment.LoggedInUser.userid;
    private String orderIDforSummary;
    
    public CUSTOMER_ViewMenu(){
        initComponents();
    }
    
    
    public CUSTOMER_ViewMenu(String vendorID,String vendorName) throws IOException, ClassNotFoundException {
        initComponents();
        this.vendorID = vendorID;
        this.vendorName = vendorName;
        //VendorHandler vendorHandler = new VendorHandler();
//        this.vendorIDObj = vendorHandler.GetVendorByVendorID(Java_assignment.LoggedInUser.userid);
//        System.out.println(this.vendorIDObj);
             
//        String vendorID = String.valueOf(vendorIDObj);
//        System.out.println(vendorID);
        OrderHandler orderHandlerGenerate = new OrderHandler();
        
        String orderIDforSummary = orderHandlerGenerate.generateOrderID();
        this.orderIDforSummary = orderIDforSummary;
        
        
        model.setColumnIdentifiers(columnName);
        
        ViewMenu.setModel(model);
        
        AddedOrdermodel.setColumnIdentifiers(columnName2);
        
        AddedFood.setModel(AddedOrdermodel);
        
        ViewMenu.getColumnModel().getColumn(0).setPreferredWidth(50);
        ViewMenu.getColumnModel().getColumn(1).setPreferredWidth(600);
        ViewMenu.getColumnModel().getColumn(2).setPreferredWidth(50);
        
        MenuHandler menuHandler = new MenuHandler("Menu",Menu.class);
        ArrayList<Menu> menu = menuHandler.GetVendorMenu(vendorID);
        
        for (Menu menuItem : menu) {
            model.addRow(new Object[]{menuItem.getItemName(), menuItem.getItemDesc(), menuItem.getItemPrice()});
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
        jButton3 = new javax.swing.JButton();
        btnOrderBck = new javax.swing.JButton();
        btnOrder = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ViewMenu = new javax.swing.JTable();
        btnAddOrder = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        AddedFood = new javax.swing.JTable();

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
                .addGap(315, 315, 315)
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

        jButton3.setText("Search");

        btnOrderBck.setText("Back");
        btnOrderBck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOrderBckMouseClicked(evt);
            }
        });

        btnOrder.setText("Order");
        btnOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOrderMouseClicked(evt);
            }
        });
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        ViewMenu.setModel(model);
        ViewMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ViewMenuMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(ViewMenu);

        btnAddOrder.setText("Add");
        btnAddOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddOrderMouseClicked(evt);
            }
        });
        btnAddOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrderActionPerformed(evt);
            }
        });

        AddedFood.setModel(AddedOrdermodel);
        jScrollPane3.setViewportView(AddedFood);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(315, 315, 315)
                            .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(44, 44, 44)
                            .addComponent(btnOrderBck, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)
                                .addGap(459, 459, 459)
                                .addComponent(btnAddOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAddOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOrderBck, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void btnOrderBckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrderBckMouseClicked
        this.dispose();
        CUSTOMER_ViewVendorProfile vdProfile = new CUSTOMER_ViewVendorProfile();
        vdProfile.setVisible(true);
    }//GEN-LAST:event_btnOrderBckMouseClicked

    private String[][] getOrderDataFromAddedFood() {
    int rowCount = AddedOrdermodel.getRowCount();
    int colCount = AddedOrdermodel.getColumnCount();
    String[][] orderData = new String[rowCount][colCount];
    
    for (int row = 0; row < rowCount; row++) {
        for (int col = 0; col < colCount; col++) {
            orderData[row][col] = String.valueOf(AddedOrdermodel.getValueAt(row, col));
        }
    }
    
        return orderData;
    }
    
    private void btnOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrderMouseClicked
//        
//        AddedOrdermodel.setRowCount(0);
//        AddedFood.setModel(AddedOrdermodel);
      
        String[][] orderData = getOrderDataFromAddedFood();
        this.dispose();
        CUSTOMER_ConfirmOrder confirmorder = new CUSTOMER_ConfirmOrder(orderIDforSummary, vendorID, vendorName, orderData);
        confirmorder.setVisible(true);
        
//        this.dispose();
//        CUSTOMER_ConfirmOrder confirmorder = new CUSTOMER_ConfirmOrder(orderIDforSummary,vendorID,vendorName);
//        System.out.println("OrderID in View Menu, before passing to confirm order: "+orderIDforSummary);
//        confirmorder.setVisible(true);

        
    }//GEN-LAST:event_btnOrderMouseClicked
    
    
    
    
    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOrderActionPerformed

    private void ViewMenuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewMenuMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewMenuMouseReleased

    private void btnAddOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddOrderMouseClicked
        // TODO add your handling code here:
        row2 = ViewMenu.getSelectedRow();
        if (row2 != -1) {
            String food = String.valueOf(model.getValueAt(row2, 0));
            //String foodDesc = String.valueOf(model.getValueAt(row2, 1));
            String foodPrice = String.valueOf(model.getValueAt(row2, 2));
            
            
            String[] orders = {food,foodPrice};
            AddedOrdermodel.addRow(orders);
            
            AddedFood.setModel(AddedOrdermodel);
            
//            MenuHandler menuHandler;
//            try{
//                menuHandler = new MenuHandler("OrderSummary",Menu.class);
//                menuHandler.WriteOrderSummary(food,foodPrice);
//                System.out.println(food+foodPrice);
//                
//            } catch(IOException | ClassNotFoundException ex){
//                Logger.getLogger(CUSTOMER_ViewMenu.class.getName()).log(Level.SEVERE,null,ex);
//                JOptionPane.showMessageDialog(this,"Error writing review to file");
//            }
            
            OrderSummaryHandler ordersummaryHandler;
            OrderMiddleManHandler ordermiddlemanHandler;
            try{

                ordersummaryHandler = new OrderSummaryHandler("OrderSummary",OrderSummary.class);
                //System.out.println(food+foodPrice);
                ordersummaryHandler.WriteOrderSummary(orderIDforSummary,cusID,food,foodPrice);
                
                System.out.println("\nView Menu's orderID,OrderSummary: "+orderIDforSummary);
                
            } catch(IOException | ClassNotFoundException ex){
                Logger.getLogger(CUSTOMER_ViewMenu.class.getName()).log(Level.SEVERE,null,ex);
                JOptionPane.showMessageDialog(this,"Error writing review to file");
            }
        } 
        else {
        // Display a message or handle the case where no item is selected
            JOptionPane.showMessageDialog(this, "Please select an item.");
        }
        
        //OrderMiddleMan
        row2 = ViewMenu.getSelectedRow();
        if (row2 != -1) {
            String food = String.valueOf(model.getValueAt(row2, 0));
            //String foodDesc = String.valueOf(model.getValueAt(row2, 1));
            String foodPrice = String.valueOf(model.getValueAt(row2, 2));
            
            
            //String[] orders = {food,foodPrice};
            //AddedOrdermodel.addRow(orders);
            
            //AddedFood.setModel(AddedOrdermodel);
            
            OrderMiddleManHandler ordermiddlemanHandler;
            try{

                ordermiddlemanHandler = new OrderMiddleManHandler("OrderMiddleMan",OrderMiddleMan.class);
                
                ordermiddlemanHandler.clearOrderMiddleManFile();
                ordermiddlemanHandler.WriteOrderSummary(orderIDforSummary,cusID,food,foodPrice);
                
                System.out.println("\nView Menu's orderID,OrderSummary: "+orderIDforSummary);
                
            } catch(IOException | ClassNotFoundException ex){
                Logger.getLogger(CUSTOMER_ViewMenu.class.getName()).log(Level.SEVERE,null,ex);
                JOptionPane.showMessageDialog(this,"Error writing review to file");
            }
        } 
        else {
        // Display a message or handle the case where no item is selected
            JOptionPane.showMessageDialog(this, "Please select an item.");
        }       
        
    }//GEN-LAST:event_btnAddOrderMouseClicked

    private void btnAddOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddOrderActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CUSTOMER_ViewMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AddedFood;
    private javax.swing.JTable ViewMenu;
    private javax.swing.JButton btnAddOrder;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnOrderBck;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lb_logoName1;
    private javax.swing.JLabel lb_logoPic1;
    private javax.swing.JLabel lb_quit1;
    private javax.swing.JPanel topPanel1;
    // End of variables declaration//GEN-END:variables
}
