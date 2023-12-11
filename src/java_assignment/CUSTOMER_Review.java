package java_assignment;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CUSTOMER_Review extends javax.swing.JFrame {

    private DefaultTableModel modelReview = new DefaultTableModel();
    private String[] columnName = {"Name", "Rating", "Review","Date & Time"};
    private int row=-1;
    private String vendorID;
    private String vendorName;
    private String cusName = Java_assignment.LoggedInUser.username;
    private LocalDateTime now;
    
    public CUSTOMER_Review(){
        try {
            initComponents();
            
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSS");
            String formattedDateTime = now.format(formatter);
            this.now = now;
            
            modelReview.setColumnIdentifiers(columnName);
            
            ViewMenu.setModel(modelReview);
            
            ViewMenu.getColumnModel().getColumn(0).setPreferredWidth(50);
            ViewMenu.getColumnModel().getColumn(1).setPreferredWidth(30);
            ViewMenu.getColumnModel().getColumn(2).setPreferredWidth(400);
            ViewMenu.getColumnModel().getColumn(3).setPreferredWidth(50);
            
            ReviewHandler reviewHandler = new ReviewHandler("Review",Review.class);
//        ArrayList<Review> reviews = reviewHandler.getReviewsForVendor(vendorID);
//        
//        for (Review review : reviews) {
//            modelReview.addRow(new Object[]{review.getCustomerName(), review.getReview(), review.getRating()});
//        }

    ArrayList<Review> review = reviewHandler.GetReview(vendorID);

    for (Review reviewList : review) {
        modelReview.addRow(new Object[]{reviewList.getCustomerName(), reviewList.getReview(), reviewList.getRating(),reviewList.getReviewDateTime()});
    }
            } catch (IOException ex) {
                Logger.getLogger(CUSTOMER_Review.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CUSTOMER_Review.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    
    public CUSTOMER_Review(String vendorID,String vendorName) throws IOException, ClassNotFoundException {
        initComponents();
        this.vendorID = vendorID;
        this.vendorName = vendorName;
        //VendorHandler vendorHandler = new VendorHandler();
//        this.vendorIDObj = vendorHandler.GetVendorByVendorID(Java_assignment.LoggedInUser.userid);
//        System.out.println(this.vendorIDObj);
             
//        String vendorID = String.valueOf(vendorIDObj);
//        System.out.println(vendorID);
        
        
        modelReview.setColumnIdentifiers(columnName);
        
        ViewMenu.setModel(modelReview);
        
        ViewMenu.getColumnModel().getColumn(0).setPreferredWidth(50);
        ViewMenu.getColumnModel().getColumn(1).setPreferredWidth(600);
        ViewMenu.getColumnModel().getColumn(2).setPreferredWidth(50);
        ViewMenu.getColumnModel().getColumn(3).setPreferredWidth(50);
        
        ReviewHandler reviewHandler = new ReviewHandler("Review",Review.class);
//        ArrayList<Review> reviews = reviewHandler.getReviewsForVendor(vendorID);
//        
//        for (Review review : reviews) {
//            modelReview.addRow(new Object[]{review.getCustomerName(), review.getReview(), review.getRating()});
//        }
        
        ArrayList<Review> review = reviewHandler.GetReview(vendorID);
        
        for (Review reviewList : review) {
            modelReview.addRow(new Object[]{reviewList.getCustomerName(), reviewList.getRating(), reviewList.getReview(),reviewList.getReviewDateTime()});
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
        ViewMenu = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        btnReviewBck = new javax.swing.JButton();
        btnWriteReview = new javax.swing.JButton();
        txtWriteReview = new javax.swing.JTextField();
        comboRating = new javax.swing.JComboBox<>();

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
                .addGap(330, 330, 330)
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

        ViewMenu.setModel(modelReview);
        ViewMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ViewMenuMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(ViewMenu);

        jButton3.setText("Search");

        btnReviewBck.setText("Back");
        btnReviewBck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReviewBckMouseClicked(evt);
            }
        });

        btnWriteReview.setText("Write Review");
        btnWriteReview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnWriteReviewMouseClicked(evt);
            }
        });
        btnWriteReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWriteReviewActionPerformed(evt);
            }
        });

        txtWriteReview.setText("Write a review here...");
        txtWriteReview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtWriteReviewMouseClicked(evt);
            }
        });

        comboRating.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
        comboRating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRatingActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtWriteReview, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboRating, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(45, 45, 45)
                                    .addComponent(btnWriteReview, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addComponent(btnReviewBck, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWriteReview, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboRating, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnWriteReview, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnReviewBck, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
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

    private void btnReviewBckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReviewBckMouseClicked
        
        try {
            this.dispose();
            CUSTOMER_ViewVendorProfile vdProfile = new CUSTOMER_ViewVendorProfile(vendorID,vendorName);
            vdProfile.setVisible(true);
            
            
            
            } catch (IOException ex) {
                Logger.getLogger(CUSTOMER_Review.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CUSTOMER_Review.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnReviewBckMouseClicked
    
    public void updateViewOrderTable(String food, String foodDesc, String foodPrice) {
            
        }
    
    
    private void ViewMenuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewMenuMouseReleased
         //TODO add your handling code here:
//        row = ViewMenu.getSelectedRow();
//        String Food = String.valueOf(modelReview.getValueAt(row, 0));
//        String FoodDesc = String.valueOf(modelReview.getValueAt(row, 1));
//        String FoodPrice = String.valueOf(modelReview.getValueAt(row, 2));
    }//GEN-LAST:event_ViewMenuMouseReleased

    private void btnWriteReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWriteReviewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnWriteReviewActionPerformed

    private void btnWriteReviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWriteReviewMouseClicked
        // TODO add your handling code here:
        
        
        String review = txtWriteReview.getText();
        String rating = String.valueOf(comboRating.getSelectedItem());
        String[] reviews = {cusName,rating,review,String.valueOf(now)};
        modelReview.addRow(reviews);
        
        //write to file
        ReviewHandler reviewHandler;
        try {
            reviewHandler = new ReviewHandler("Review", Review.class);
            reviewHandler.WriteReview(vendorID, reviews);
            
        } catch (IOException | ClassNotFoundException ex) {
            // Handle exceptions as needed
            Logger.getLogger(CUSTOMER_Review.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error writing review to file.");
        }
        
    }//GEN-LAST:event_btnWriteReviewMouseClicked

    private void txtWriteReviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtWriteReviewMouseClicked
        // TODO add your handling code here:
        txtWriteReview.setText("");
    }//GEN-LAST:event_txtWriteReviewMouseClicked

    private void comboRatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRatingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboRatingActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CUSTOMER_Review().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ViewMenu;
    private javax.swing.JButton btnReviewBck;
    private javax.swing.JButton btnWriteReview;
    private javax.swing.JComboBox<String> comboRating;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lb_logoName1;
    private javax.swing.JLabel lb_logoPic1;
    private javax.swing.JLabel lb_quit1;
    private javax.swing.JPanel topPanel1;
    private javax.swing.JTextField txtWriteReview;
    // End of variables declaration//GEN-END:variables
}
