package java_assignment;

import java.awt.HeadlessException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class Runner_Dashboard extends javax.swing.JFrame {

    public static Runner rnUser;
    private DefaultListModel<String> listModel = new DefaultListModel<>();
    private ArrayList<Review> csReview;

    public Runner_Dashboard() {
        try {
            initComponents();
            setVisible(true);
            
            try {
                RunnerHandler hdlr = new RunnerHandler();
                Runner_Dashboard.rnUser = hdlr.getRunnerDetails(Java_assignment.LoggedInUser.getUserid());
            }
            catch(IOException | ClassNotFoundException ex)
            {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error retieving Runner Details: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }        
             
            setRnStatus();
            populatelstLocation();

            lbl_RnName.setText (Runner_Dashboard.rnUser.getUsername());
            lbl_RnId.setText(Runner_Dashboard.rnUser.getUserid());
        } catch (HeadlessException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error initializing Runner Dashboard Menu: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void setRnStatus() {
        switch (Runner_Dashboard.rnUser.getStatus()) {
        case "Busy"-> cmb_Status.setSelectedIndex(2);
        case "Away" -> cmb_Status.setSelectedIndex(1);
        case "Standby" -> cmb_Status.setSelectedIndex(0);
        default -> cmb_Status.setSelectedIndex(-1);

        }
    }
    
    private void populatelstLocation(){
        
        listModel.clear(); 
        lst_Location.setModel(listModel);
        
        ArrayList<Task> rnTask;


        try {
            
            LocationHandler hdlr = new LocationHandler();
            ArrayList<Location> location = hdlr.getLocationDetails();

            if (location.isEmpty()){
                listModel.addElement("No Locations.");
            }else{            
                for (Location l : location) {
                    listModel.addElement(l.getLocationid() + " - " + l.getLocationname()+ " - " +l.getDetails());
                }
            }
        }
        catch(IOException | ClassNotFoundException ex)
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error retieving Review Details: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Left = new javax.swing.JPanel();
        lbl_Cafe = new javax.swing.JLabel();
        lbl_Tech = new javax.swing.JLabel();
        lbl_Uni = new javax.swing.JLabel();
        cmb_Status = new javax.swing.JComboBox<>();
        lbl_RnStatus = new javax.swing.JLabel();
        pnl_Top = new javax.swing.JPanel();
        lbl_LogoPic = new javax.swing.JLabel();
        lbl_LogoName = new javax.swing.JLabel();
        lbl_Quit = new javax.swing.JLabel();
        pnl_Bottom = new javax.swing.JPanel();
        lbl_RnName = new javax.swing.JLabel();
        lbl_RnId = new javax.swing.JLabel();
        btn_Review = new javax.swing.JButton();
        btn_Income = new javax.swing.JButton();
        btn_Dashboard = new javax.swing.JButton();
        btn_Task = new javax.swing.JButton();
        pnl_Right = new javax.swing.JPanel();
        lbl_MenuName = new javax.swing.JLabel();
        scrl_List = new javax.swing.JScrollPane();
        lst_Location = new javax.swing.JList<>();
        lbl_RnStatus1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(607, 578));
        setMinimumSize(new java.awt.Dimension(607, 578));
        setPreferredSize(new java.awt.Dimension(607, 578));

        pnl_Left.setBackground(new java.awt.Color(246, 246, 246));
        pnl_Left.setPreferredSize(new java.awt.Dimension(164, 435));

        lbl_Cafe.setFont(new java.awt.Font("Josefin Sans", 1, 28)); // NOI18N
        lbl_Cafe.setForeground(new java.awt.Color(255, 189, 49));
        lbl_Cafe.setText("Cafeteria");

        lbl_Tech.setFont(new java.awt.Font("Josefin Sans", 1, 28)); // NOI18N
        lbl_Tech.setForeground(new java.awt.Color(102, 102, 102));
        lbl_Tech.setText("University");

        lbl_Uni.setFont(new java.awt.Font("Josefin Sans", 1, 28)); // NOI18N
        lbl_Uni.setForeground(new java.awt.Color(102, 102, 102));
        lbl_Uni.setText("Tech");

        cmb_Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Standby", "Away", "Busy" }));
        cmb_Status.setSelectedIndex(-1);
        cmb_Status.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_StatusItemStateChanged(evt);
            }
        });
        cmb_Status.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_StatusMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmb_StatusMouseReleased(evt);
            }
        });
        cmb_Status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_StatusActionPerformed(evt);
            }
        });

        lbl_RnStatus.setFont(new java.awt.Font("Josefin Sans", 3, 14)); // NOI18N
        lbl_RnStatus.setForeground(new java.awt.Color(153, 153, 153));
        lbl_RnStatus.setText("Status:");

        javax.swing.GroupLayout pnl_LeftLayout = new javax.swing.GroupLayout(pnl_Left);
        pnl_Left.setLayout(pnl_LeftLayout);
        pnl_LeftLayout.setHorizontalGroup(
            pnl_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_LeftLayout.createSequentialGroup()
                .addGroup(pnl_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_LeftLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(pnl_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Tech)
                            .addComponent(lbl_Uni)
                            .addGroup(pnl_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmb_Status, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_Cafe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(pnl_LeftLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lbl_RnStatus)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_LeftLayout.setVerticalGroup(
            pnl_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_LeftLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbl_Uni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Tech)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Cafe)
                .addGap(33, 33, 33)
                .addComponent(lbl_RnStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmb_Status, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(203, Short.MAX_VALUE))
        );

        getContentPane().add(pnl_Left, java.awt.BorderLayout.WEST);

        pnl_Top.setBackground(new java.awt.Color(246, 246, 246));
        pnl_Top.setPreferredSize(new java.awt.Dimension(607, 64));

        lbl_LogoPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tuCafeteria_logo.png"))); // NOI18N

        lbl_LogoName.setFont(new java.awt.Font("Josefin Sans", 1, 18)); // NOI18N
        lbl_LogoName.setForeground(new java.awt.Color(102, 102, 102));
        lbl_LogoName.setText("Tech University");

        lbl_Quit.setFont(new java.awt.Font("Myanmar Sangam MN", 1, 20)); // NOI18N
        lbl_Quit.setForeground(new java.awt.Color(102, 102, 102));
        lbl_Quit.setText("X");
        lbl_Quit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_QuitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_TopLayout = new javax.swing.GroupLayout(pnl_Top);
        pnl_Top.setLayout(pnl_TopLayout);
        pnl_TopLayout.setHorizontalGroup(
            pnl_TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TopLayout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addComponent(lbl_LogoPic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_LogoName)
                .addGap(197, 197, 197)
                .addComponent(lbl_Quit)
                .addGap(37, 37, 37))
        );
        pnl_TopLayout.setVerticalGroup(
            pnl_TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TopLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnl_TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_LogoPic)
                    .addGroup(pnl_TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_LogoName)
                        .addComponent(lbl_Quit)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(pnl_Top, java.awt.BorderLayout.PAGE_START);

        pnl_Bottom.setBackground(new java.awt.Color(66, 33, 11));
        pnl_Bottom.setPreferredSize(new java.awt.Dimension(607, 64));

        lbl_RnName.setFont(new java.awt.Font("Josefin Sans", 1, 18)); // NOI18N
        lbl_RnName.setForeground(new java.awt.Color(255, 189, 49));
        lbl_RnName.setText("Runner name");

        lbl_RnId.setFont(new java.awt.Font("Josefin Sans", 3, 14)); // NOI18N
        lbl_RnId.setForeground(new java.awt.Color(153, 153, 153));
        lbl_RnId.setText("Runner ID");

        btn_Review.setText(" Reviews");
        btn_Review.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReviewActionPerformed(evt);
            }
        });

        btn_Income.setText(" Income");
        btn_Income.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IncomeActionPerformed(evt);
            }
        });

        btn_Dashboard.setText("Dashboard");
        btn_Dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DashboardActionPerformed(evt);
            }
        });

        btn_Task.setText(" Tasks");
        btn_Task.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TaskActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_BottomLayout = new javax.swing.GroupLayout(pnl_Bottom);
        pnl_Bottom.setLayout(pnl_BottomLayout);
        pnl_BottomLayout.setHorizontalGroup(
            pnl_BottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_BottomLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_BottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_RnName)
                    .addComponent(lbl_RnId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Task, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Review, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Income, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        pnl_BottomLayout.setVerticalGroup(
            pnl_BottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_BottomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_RnName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_RnId)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_BottomLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_BottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btn_Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Task, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Review, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Income, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lbl_RnName.getAccessibleContext().setAccessibleName("rnName");

        getContentPane().add(pnl_Bottom, java.awt.BorderLayout.PAGE_END);

        pnl_Right.setBackground(new java.awt.Color(246, 246, 246));

        lbl_MenuName.setFont(new java.awt.Font("Josefin Sans", 1, 28)); // NOI18N
        lbl_MenuName.setForeground(new java.awt.Color(102, 102, 102));
        lbl_MenuName.setText("Dashboard");
        lbl_MenuName.setPreferredSize(new java.awt.Dimension(429, 435));

        lst_Location.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scrl_List.setViewportView(lst_Location);

        lbl_RnStatus1.setFont(new java.awt.Font("Josefin Sans", 3, 14)); // NOI18N
        lbl_RnStatus1.setForeground(new java.awt.Color(153, 153, 153));
        lbl_RnStatus1.setText("Location");

        javax.swing.GroupLayout pnl_RightLayout = new javax.swing.GroupLayout(pnl_Right);
        pnl_Right.setLayout(pnl_RightLayout);
        pnl_RightLayout.setHorizontalGroup(
            pnl_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_RightLayout.createSequentialGroup()
                .addGroup(pnl_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_RightLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(pnl_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_RightLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lbl_RnStatus1))
                            .addComponent(lbl_MenuName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_RightLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(scrl_List, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        pnl_RightLayout.setVerticalGroup(
            pnl_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_RightLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbl_MenuName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_RnStatus1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrl_List, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        getContentPane().add(pnl_Right, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_QuitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_QuitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbl_QuitMouseClicked

    private void btn_ReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReviewActionPerformed
        this.dispose();
        Runner_Review rn = new Runner_Review();
        rn.setVisible(true);
    }//GEN-LAST:event_btn_ReviewActionPerformed

    private void btn_IncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IncomeActionPerformed
        this.dispose();
        Runner_Income rn = new Runner_Income();
        rn.setVisible(true);
    }//GEN-LAST:event_btn_IncomeActionPerformed

    private void btn_DashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DashboardActionPerformed
        this.dispose();
        Runner_Dashboard rn = new Runner_Dashboard();
        rn.setVisible(true);
    }//GEN-LAST:event_btn_DashboardActionPerformed

    private void btn_TaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TaskActionPerformed
        this.dispose();
        Runner_Task rn = new Runner_Task();
        rn.setVisible(true);
    }//GEN-LAST:event_btn_TaskActionPerformed

    private void cmb_StatusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_StatusItemStateChanged

    }//GEN-LAST:event_cmb_StatusItemStateChanged

    private void cmb_StatusMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_StatusMouseReleased

    }//GEN-LAST:event_cmb_StatusMouseReleased

    private void cmb_StatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_StatusMouseClicked

    }//GEN-LAST:event_cmb_StatusMouseClicked

    private void cmb_StatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_StatusActionPerformed

        String selectedStatus = cmb_Status.getSelectedItem().toString();

        String B = "Busy";

        if (!Runner_Dashboard.rnUser.getStatus().equals(selectedStatus)) {
            if (B.trim().equalsIgnoreCase(selectedStatus.trim())) {
                setRnStatus();
                JOptionPane.showMessageDialog(this, "Error while changing Status: Cannot change while 'Busy'", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    RunnerHandler hdlr = new RunnerHandler();
                    Runner oldStatus = hdlr.getRunnerDetails(Runner_Dashboard.rnUser.getUserid());

                    Runner_Dashboard.rnUser.setStatus(selectedStatus);
                    
                    hdlr.UpdateItem(oldStatus, rnUser);
                    
                } catch (IOException | ClassNotFoundException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error while changing Status: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_cmb_StatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Dashboard;
    private javax.swing.JButton btn_Income;
    private javax.swing.JButton btn_Review;
    private javax.swing.JButton btn_Task;
    private javax.swing.JComboBox<String> cmb_Status;
    private javax.swing.JLabel lbl_Cafe;
    private javax.swing.JLabel lbl_LogoName;
    private javax.swing.JLabel lbl_LogoPic;
    private javax.swing.JLabel lbl_MenuName;
    private javax.swing.JLabel lbl_Quit;
    private javax.swing.JLabel lbl_RnId;
    private javax.swing.JLabel lbl_RnName;
    private javax.swing.JLabel lbl_RnStatus;
    private javax.swing.JLabel lbl_RnStatus1;
    private javax.swing.JLabel lbl_Tech;
    private javax.swing.JLabel lbl_Uni;
    private javax.swing.JList<String> lst_Location;
    private javax.swing.JPanel pnl_Bottom;
    private javax.swing.JPanel pnl_Left;
    private javax.swing.JPanel pnl_Right;
    private javax.swing.JPanel pnl_Top;
    private javax.swing.JScrollPane scrl_List;
    // End of variables declaration//GEN-END:variables
}
