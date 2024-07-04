package java_assignment;

import com.jcalendar.event.CalendarEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.DecimalFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class OrderHistory extends javax.swing.JFrame {

    private Vendor vendor;
    private DefaultTableModel model = new DefaultTableModel();
    private String[] columnName = {"ID","Status","Service","Date Time","Amount"};
    private ArrayList<Order> order;
    
    public OrderHistory(Vendor vendor) throws IOException, ClassNotFoundException {
        initComponents();
        this.vendor = vendor;
        
       model.setColumnIdentifiers(columnName);
        jTable1.setModel(model);
        String searchQuery = jTextField1.getText();

        OrderHandler oh = new OrderHandler();      

        jTable1.getColumnModel().getColumn(0).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(300);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(80);

        ArrayList<Order> order = oh.GetOrdersByVendorID(Java_assignment.LoggedInUser.userid);
        
        ArrayList<Order> filteredOrders = new ArrayList<>();
        for (Order orderItem : order) {
            System.out.println("Order Status: " + orderItem.getOrderStatus());
            if ("DELIVERED".equalsIgnoreCase(orderItem.getOrderStatus().toString().trim())) {
                model.addRow(new Object[]{orderItem.getOrderid(), orderItem.getOrderStatus(), orderItem.getOrderType(), orderItem.getOrderDateTime(), orderItem.getOrderAmount()});
                filteredOrders.add(orderItem);
            }
        }
        this.order = filteredOrders;
        populateComboBox1(filteredOrders);
    }
    
    
    private void populateComboBox1(ArrayList<Order> order) {
        Set<String> uniqueOrderTypes = new HashSet<>();

        for (Order orderItem : order) {
            uniqueOrderTypes.add(orderItem.getOrderType().toString().trim());
        }

        String[] orderTypesArray = uniqueOrderTypes.toArray(new String[0]);

        String[] comboBoxItems = new String[orderTypesArray.length + 1];
        comboBoxItems[0] = "Filter by...";
        System.arraycopy(orderTypesArray, 0, comboBoxItems, 1, orderTypesArray.length);

        DefaultComboBoxModel<String> typeComboBoxModel = new DefaultComboBoxModel<>(comboBoxItems);
        jComboBox1.setModel(typeComboBoxModel);

        // Set the selected item to the last selected value
        String selectedType = jComboBox1.getSelectedItem().toString();
        if (!selectedType.equals("Filter by...")) {
            jComboBox1.setSelectedItem(selectedType);
            
        }

    }


    private void updateTable(ArrayList<Order> orders) throws IOException, ClassNotFoundException {
        String selectedOrderType = jComboBox1.getSelectedItem().toString();

        // Filter the table based on selected values
        model.setRowCount(0);

        OrderHandler oh = new OrderHandler();

        for (Order orderItem : orders) {
        if (("Filter by...".equals(selectedOrderType) || orderItem.getOrderType().toString().equals(selectedOrderType))) {
            model.addRow(new Object[]{orderItem.getOrderid(), orderItem.getOrderStatus(), orderItem.getOrderType(), orderItem.getOrderDateTime(), orderItem.getOrderAmount()});
        }
    }
        
    }
    
    private void filterByDateRange(ArrayList<Order> order) throws IOException, ClassNotFoundException {
        String selectedViewBy = jComboBox3.getSelectedItem().toString();
        model.setRowCount(0);
        OrderHandler oh = new OrderHandler();

        switch (selectedViewBy) {
            case "Daily":
                filterByDaily(order);
                break;
            case "Weekly":
                filterByWeekly(order);
                break;
            case "Monthly":
                filterByMonthly(order);
                break;
            case "Yearly":
                filterByYearly(order);
                break;
            default:
                filterAllOrders(order, "Filter by...", "Filter by..."); // Add your default filter
                break;
        }
    }

    private void populateTable(ArrayList<Order> order) {
        for (Order orderItem : order) {
            model.addRow(new Object[]{orderItem.getOrderid(), orderItem.getOrderStatus(), orderItem.getOrderType(), orderItem.getOrderDateTime(), orderItem.getOrderAmount()});
        }
    }
    
    private void filterByDaily(ArrayList<Order> order) {
        LocalDate today = LocalDate.now();

        for (Order orderItem : order) {
            LocalDate orderDate = orderItem.getOrderDateTime().toLocalDate();
            if (orderDate.isEqual(today) && "DELIVERED".equalsIgnoreCase(orderItem.getOrderStatus().toString().trim())) {
                model.addRow(new Object[]{orderItem.getOrderid(), orderItem.getOrderStatus(), orderItem.getOrderType(), orderItem.getOrderDateTime(), orderItem.getOrderAmount()});
            }
        }
    }

    // Helper method to filter orders by week
    private void filterByWeekly(ArrayList<Order> order) {
        LocalDate startDate = LocalDate.now().with(DayOfWeek.MONDAY);
        LocalDate endDate = LocalDate.now().with(DayOfWeek.SUNDAY);
        for (Order orderItem : order) {
            LocalDate orderDate = orderItem.getOrderDateTime().toLocalDate();
            if (!orderDate.isBefore(startDate) && !orderDate.isAfter(endDate)) {
                model.addRow(new Object[]{orderItem.getOrderid(), orderItem.getOrderStatus(), orderItem.getOrderType(), orderItem.getOrderDateTime(), orderItem.getOrderAmount()});
            }
        }
    }

    // Helper method to filter orders by month
    private void filterByMonthly(ArrayList<Order> order) {
        LocalDate startDate = LocalDate.now().withDayOfMonth(1);
        LocalDate endDate = LocalDate.now().withDayOfMonth(LocalDate.now().lengthOfMonth());
        for (Order orderItem : order) {
            LocalDate orderDate = orderItem.getOrderDateTime().toLocalDate();
            if (!orderDate.isBefore(startDate) && !orderDate.isAfter(endDate)) {
                model.addRow(new Object[]{orderItem.getOrderid(), orderItem.getOrderStatus(), orderItem.getOrderType(), orderItem.getOrderDateTime(), orderItem.getOrderAmount()});
            }
        }
    }

    // Helper method to filter orders by year
    private void filterByYearly(ArrayList<Order> order) {
        LocalDate startDate = LocalDate.now().withDayOfYear(1);
        LocalDate endDate = LocalDate.now().withDayOfYear(LocalDate.now().lengthOfYear());
        for (Order orderItem : order) {
            LocalDate orderDate = orderItem.getOrderDateTime().toLocalDate();
            if (!orderDate.isBefore(startDate) && !orderDate.isAfter(endDate)) {
                model.addRow(new Object[]{orderItem.getOrderid(), orderItem.getOrderStatus(), orderItem.getOrderType(), orderItem.getOrderDateTime(), orderItem.getOrderAmount()});
            }
        }
    }

    // Helper method to filter all orders based on type and status
    private void filterAllOrders(ArrayList<Order> order, String selectedOrderType, String selectedOrderStatus) {
        for (Order orderItem : order) {
            if (("Filter by...".equals(selectedOrderType) || orderItem.getOrderType().toString().equals(selectedOrderType)) &&
                    ("Filter by...".equals(selectedOrderStatus) || orderItem.getOrderStatus().toString().equals(selectedOrderStatus))) {
                model.addRow(new Object[]{orderItem.getOrderid(), orderItem.getOrderStatus(), orderItem.getOrderType(), orderItem.getOrderDateTime(), orderItem.getOrderAmount()});
            }
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
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        lb_userID = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        lb_userID2 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

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

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTable1);

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        lb_userID.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_userID.setText("Service");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lb_userID2.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_userID2.setText("View by:");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filter by...", "Daily", "Weekly", "Monthly", "Yearly" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jButton2.setText("View");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(328, 328, 328)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lb_userID)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(191, 191, 191)
                            .addComponent(lb_userID2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_userID)
                    .addComponent(lb_userID2)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
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

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
     
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
        String searchQuery = jTextField1.getText();
        performSearch(searchQuery);

        } catch (IOException ex) {
            Logger.getLogger(VendorMenuPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorMenuPage.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            this.dispose();
            VendorOrdersPage vop = new VendorOrdersPage(vendor);
            vop.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorOrdersPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VendorOrdersPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        try {
            this.filterByDateRange(this.order);
        } catch (IOException ex) {
            Logger.getLogger(OrderHistory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OrderHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();

        if (selectedRowIndex != -1) {
            try {
                // Get the order ID from the selected row
                String orderId = jTable1.getValueAt(selectedRowIndex, 0).toString();
                // Pass the order ID to the OrdersView page
                openViewPage(orderId);
            } catch (IOException ex) {
                Logger.getLogger(VendorOrdersPage.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(VendorOrdersPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            // If no row is selected, show a message or take appropriate action
            JOptionPane.showMessageDialog(this, "Please select a row to view.", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        try {
            //populateComboBox1(this.order);
            updateTable(this.order);
        } catch (IOException ex) {
            Logger.getLogger(OrderHistory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OrderHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void openViewPage(String orderId) throws IOException, ClassNotFoundException {
        this.dispose();
        OrdersView_History ohh = new OrdersView_History(orderId, vendor);
        ohh.setVisible(true);
    }
    
    private void performSearch(String query) throws IOException, ClassNotFoundException {
        model.setRowCount(0);
        for (Order orderItem : order) {
        if (orderItem.getOrderid().toLowerCase().contains(query.toLowerCase())) {
            model.addRow(new Object[]{orderItem.getOrderid(), orderItem.getOrderStatus(), orderItem.getOrderType(), orderItem.getOrderDateTime(), orderItem.getOrderAmount()});
            }
        }
    }
    
    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lb_logoName1;
    private javax.swing.JLabel lb_logoPic1;
    private javax.swing.JLabel lb_quit1;
    private javax.swing.JLabel lb_userID;
    private javax.swing.JLabel lb_userID2;
    private javax.swing.JPanel topPanel1;
    // End of variables declaration//GEN-END:variables
}
