/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package java_assignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class MenuAdd extends javax.swing.JFrame implements ActionListener {
    
    private Vendor vendor;

    public MenuAdd(Vendor vendor) {
        initComponents();
        this.vendor = vendor;
        Menu menu = new Menu(vendor);
        //lb_totalmenutxt1.setText(menu.getItemid());
        
        //combobox de selection
        jComboBox1.addActionListener(this);
        updateLabelBasedOnSelection();
        
        lb_totalmenutxt1.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topPanel1 = new javax.swing.JPanel();
        lb_logoPic1 = new javax.swing.JLabel();
        lb_logoName1 = new javax.swing.JLabel();
        lb_quit1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lb_userID = new javax.swing.JLabel();
        tf_userID = new javax.swing.JTextField();
        lb_totalmenutxt = new javax.swing.JLabel();
        lb_userID1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        lb_totalmenutxt1 = new javax.swing.JLabel();
        lb_userID2 = new javax.swing.JLabel();
        lb_userID3 = new javax.swing.JLabel();
        tf_userID1 = new javax.swing.JTextField();
        lb_userID4 = new javax.swing.JLabel();
        tf_userID2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
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
                .addContainerGap(187, Short.MAX_VALUE)
                .addComponent(lb_logoPic1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_logoName1)
                .addGap(156, 156, 156)
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

        lb_userID.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_userID.setText("ItemID:");

        lb_totalmenutxt.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N

        lb_userID1.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_userID1.setText("Item Name:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Main Dish", "Side Dish", "Dessert", "Beverage" }));
        jComboBox1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jComboBox1PropertyChange(evt);
            }
        });

        lb_totalmenutxt1.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N

        lb_userID2.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_userID2.setText("Item Type:");

        lb_userID3.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_userID3.setText("Item Price:");

        lb_userID4.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_userID4.setText("Item Desc:");

        jButton1.setText("Cancel");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Add");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb_userID4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf_userID2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lb_userID2)
                                    .addComponent(lb_userID1)
                                    .addComponent(tf_userID)
                                    .addComponent(jComboBox1, 0, 230, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_userID)
                                    .addComponent(lb_userID3)
                                    .addComponent(tf_userID1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lb_totalmenutxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lb_totalmenutxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(33, 33, 33))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_userID)
                    .addComponent(lb_userID2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lb_totalmenutxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_totalmenutxt1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jComboBox1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_userID1)
                            .addComponent(lb_userID3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_userID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tf_userID1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lb_userID4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_userID2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb_quit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_quit1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_lb_quit1MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.dispose();
        VendorMenuPage vmenup = new VendorMenuPage(vendor);
        vmenup.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        int a = JOptionPane.showConfirmDialog(this, "Are you sure?","Confirm", JOptionPane.YES_NO_OPTION);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jComboBox1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBox1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1PropertyChange

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle actions here
        if (e.getSource() == jComboBox1) {
            // When an item is selected in the JComboBox, update the label
            updateLabelBasedOnSelection();
        }
    }
    
    private void updateLabelBasedOnSelection() {
        String selectedItem = jComboBox1.getSelectedItem().toString();

        if ("Main Dish".equals(selectedItem)) {
            lb_totalmenutxt.setText("MD");
        } else if ("Side Dish".equals(selectedItem)) {
            lb_totalmenutxt.setText("SD");
        } else if ("Dessert".equals(selectedItem)) {
            lb_totalmenutxt.setText("D");
        } else {
            lb_totalmenutxt.setText("B");
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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_logoName1;
    private javax.swing.JLabel lb_logoPic1;
    private javax.swing.JLabel lb_quit1;
    private javax.swing.JLabel lb_totalmenutxt;
    private javax.swing.JLabel lb_totalmenutxt1;
    private javax.swing.JLabel lb_userID;
    private javax.swing.JLabel lb_userID1;
    private javax.swing.JLabel lb_userID2;
    private javax.swing.JLabel lb_userID3;
    private javax.swing.JLabel lb_userID4;
    private javax.swing.JTextField tf_userID;
    private javax.swing.JTextField tf_userID1;
    private javax.swing.JTextField tf_userID2;
    private javax.swing.JPanel topPanel1;
    // End of variables declaration//GEN-END:variables
}
