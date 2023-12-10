package java_assignment;

import java.io.IOException;
import java.util.ArrayList;
import java_assignment.Enums.OrderStatus;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;



public class Runner_CurrentTask extends javax.swing.JFrame {
    
    private DefaultListModel<String> listModel = new DefaultListModel<>();
    private ArrayList<Task> rnTask;
    private String orderid;

    public Runner_CurrentTask() {
        try {
            initComponents();
            setVisible(true);
            
            populatelstCurrntTask();

            lbl_RnName.setText( Runner_Dashboard.rnUser.getUsername());
            lbl_RnId.setText(Runner_Dashboard.rnUser.getUserid());
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error initializing Current Task Menu: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void populatelstCurrntTask(){
            
            listModel.clear(); 
            lst_CurrentTask.setModel(listModel);
            
            
            try {
                TaskHandler hdlr = new TaskHandler();
                rnTask = hdlr.getRunnerCurrentTasks(Runner_Dashboard.rnUser.getUserid());
                
                if (rnTask.isEmpty()){
                    listModel.addElement("No Accepted Tasks.");
                }else{            
                    for (Task task : rnTask) {
                        listModel.addElement(task.getTaskid() + " - " + task.getOrderid() + " - " + task.getDeliveryLocation()+ " - " + task.getOrderStatus() + " - " + task.getDeliveryFees());
                    }
                    if(!Runner_Dashboard.rnUser.getStatus().equals("Busy")){
                        try {
                            RunnerHandler thdlr = new RunnerHandler();
                            Runner oldStatus = thdlr.getRunnerDetails(Runner_Dashboard.rnUser.getUserid());

                            Runner_Dashboard.rnUser.setStatus("Busy");

                            thdlr.UpdateItem(oldStatus, Runner_Dashboard.rnUser);

                        } catch (IOException | ClassNotFoundException ex) {
                            ex.printStackTrace();
                            JOptionPane.showMessageDialog(this, "Error while changing Status: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
            catch(IOException | ClassNotFoundException ex)
            {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error retieving Runner Task Details: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }  
            
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Top = new javax.swing.JPanel();
        lbl_LogoPic = new javax.swing.JLabel();
        lbl_LogoName = new javax.swing.JLabel();
        lbl_Quit = new javax.swing.JLabel();
        pnl_Left = new javax.swing.JPanel();
        lbl_Cafe = new javax.swing.JLabel();
        lbl_Tech = new javax.swing.JLabel();
        lbl_Uni = new javax.swing.JLabel();
        btn_NewOrder = new javax.swing.JButton();
        btn_CurrentTask = new javax.swing.JButton();
        btn_TaskHistory = new javax.swing.JButton();
        lbl_Instructions = new javax.swing.JLabel();
        pnl_Right = new javax.swing.JPanel();
        lbl_MenuName = new javax.swing.JLabel();
        btn_Update = new javax.swing.JButton();
        scrl_List = new javax.swing.JScrollPane();
        lst_CurrentTask = new javax.swing.JList<>();
        pnl_Bottom = new javax.swing.JPanel();
        lbl_RnName = new javax.swing.JLabel();
        lbl_RnId = new javax.swing.JLabel();
        btn_Task = new javax.swing.JButton();
        btn_Review = new javax.swing.JButton();
        btn_Income = new javax.swing.JButton();
        btn_Dashboard = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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
                .addContainerGap(210, Short.MAX_VALUE)
                .addComponent(lbl_LogoPic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_LogoName)
                .addGap(200, 200, 200)
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

        pnl_Left.setBackground(new java.awt.Color(246, 246, 246));

        lbl_Cafe.setFont(new java.awt.Font("Josefin Sans", 1, 28)); // NOI18N
        lbl_Cafe.setForeground(new java.awt.Color(255, 189, 49));
        lbl_Cafe.setText("Cafeteria");

        lbl_Tech.setFont(new java.awt.Font("Josefin Sans", 1, 28)); // NOI18N
        lbl_Tech.setForeground(new java.awt.Color(102, 102, 102));
        lbl_Tech.setText("University");

        lbl_Uni.setFont(new java.awt.Font("Josefin Sans", 1, 28)); // NOI18N
        lbl_Uni.setForeground(new java.awt.Color(102, 102, 102));
        lbl_Uni.setText("Tech");

        btn_NewOrder.setText("New Orders");
        btn_NewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NewOrderActionPerformed(evt);
            }
        });

        btn_CurrentTask.setText("Current Tasks");
        btn_CurrentTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CurrentTaskActionPerformed(evt);
            }
        });

        btn_TaskHistory.setText("Task History");
        btn_TaskHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TaskHistoryActionPerformed(evt);
            }
        });

        lbl_Instructions.setFont(new java.awt.Font("Josefin Sans", 3, 14)); // NOI18N
        lbl_Instructions.setForeground(new java.awt.Color(153, 153, 153));
        lbl_Instructions.setText("Select From List");

        javax.swing.GroupLayout pnl_LeftLayout = new javax.swing.GroupLayout(pnl_Left);
        pnl_Left.setLayout(pnl_LeftLayout);
        pnl_LeftLayout.setHorizontalGroup(
            pnl_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_LeftLayout.createSequentialGroup()
                .addGroup(pnl_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_LeftLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(pnl_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Uni)
                            .addComponent(lbl_Tech)
                            .addComponent(lbl_Cafe, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnl_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btn_TaskHistory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_CurrentTask, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                .addComponent(btn_NewOrder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(pnl_LeftLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lbl_Instructions)))
                .addContainerGap(19, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Instructions)
                .addGap(19, 19, 19)
                .addComponent(btn_NewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_CurrentTask, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_TaskHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        getContentPane().add(pnl_Left, java.awt.BorderLayout.CENTER);

        pnl_Right.setBackground(new java.awt.Color(246, 246, 246));
        pnl_Right.setPreferredSize(new java.awt.Dimension(429, 435));

        lbl_MenuName.setFont(new java.awt.Font("Josefin Sans", 1, 28)); // NOI18N
        lbl_MenuName.setForeground(new java.awt.Color(102, 102, 102));
        lbl_MenuName.setText("Current Tasks");

        btn_Update.setText("Update Order Status");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });

        lst_CurrentTask.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scrl_List.setViewportView(lst_CurrentTask);

        javax.swing.GroupLayout pnl_RightLayout = new javax.swing.GroupLayout(pnl_Right);
        pnl_Right.setLayout(pnl_RightLayout);
        pnl_RightLayout.setHorizontalGroup(
            pnl_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_RightLayout.createSequentialGroup()
                .addGroup(pnl_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_RightLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lbl_MenuName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE))
                    .addGroup(pnl_RightLayout.createSequentialGroup()
                        .addContainerGap(43, Short.MAX_VALUE)
                        .addComponent(scrl_List, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 38, Short.MAX_VALUE))
            .addGroup(pnl_RightLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_RightLayout.setVerticalGroup(
            pnl_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_RightLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbl_MenuName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrl_List, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        getContentPane().add(pnl_Right, java.awt.BorderLayout.LINE_END);

        pnl_Bottom.setBackground(new java.awt.Color(66, 33, 11));
        pnl_Bottom.setPreferredSize(new java.awt.Dimension(607, 64));

        lbl_RnName.setFont(new java.awt.Font("Josefin Sans", 1, 18)); // NOI18N
        lbl_RnName.setForeground(new java.awt.Color(255, 189, 49));
        lbl_RnName.setText("Runner name");
        lbl_RnName.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbl_RnId.setFont(new java.awt.Font("Josefin Sans", 3, 14)); // NOI18N
        lbl_RnId.setForeground(new java.awt.Color(153, 153, 153));
        lbl_RnId.setText("Runner ID");

        btn_Task.setText(" Tasks");
        btn_Task.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TaskActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout pnl_BottomLayout = new javax.swing.GroupLayout(pnl_Bottom);
        pnl_Bottom.setLayout(pnl_BottomLayout);
        pnl_BottomLayout.setHorizontalGroup(
            pnl_BottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_BottomLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_BottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_RnName)
                    .addComponent(lbl_RnId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
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
                .addGroup(pnl_BottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_BottomLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(pnl_BottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btn_Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Task, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Review, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Income, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_BottomLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_RnName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_RnId)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbl_RnName.getAccessibleContext().setAccessibleName("rnName");

        getContentPane().add(pnl_Bottom, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_QuitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_QuitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbl_QuitMouseClicked

    private void btn_TaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TaskActionPerformed
        this.dispose();
        Runner_CurrentTask rn = new Runner_CurrentTask();
        rn.setVisible(true);
    }//GEN-LAST:event_btn_TaskActionPerformed

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

    private void btn_NewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NewOrderActionPerformed
        this.dispose();
        Runner_Task rn = new Runner_Task();
        rn.setVisible(true);
    }//GEN-LAST:event_btn_NewOrderActionPerformed

    private void btn_CurrentTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CurrentTaskActionPerformed
        this.dispose();
        Runner_CurrentTask rn = new Runner_CurrentTask();
        rn.setVisible(true);
    }//GEN-LAST:event_btn_CurrentTaskActionPerformed

    private void btn_TaskHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TaskHistoryActionPerformed
        this.dispose();
        Runner_TaskHistory rn = new Runner_TaskHistory();
        rn.setVisible(true);
    }//GEN-LAST:event_btn_TaskHistoryActionPerformed

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        Task selectedTask;
        if(lst_CurrentTask.getSelectedIndex() != -1){
            selectedTask = rnTask.get(lst_CurrentTask.getSelectedIndex());
            this.orderid = selectedTask.getOrderid();
        } else {
            selectedTask = rnTask.get(1);
            this.orderid = selectedTask.getOrderid();
        }
        
        
        if (selectedTask.getOrderStatus().equals(OrderStatus.AWAIT_PICK_UP)){
            try {
                
                OrderHandler hdlr = new OrderHandler();
                
                
                hdlr.updateOrderStatus(this.orderid, OrderStatus.DELIVERING);
            }
            catch(IOException | ClassNotFoundException ex)
            {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error updating OrderStatus for Order.txt: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } 
            try {
                TaskHandler hdlr = new TaskHandler();
                
                hdlr.updateOrderStatus(selectedTask.getTaskid(), OrderStatus.DELIVERING);
            }
            catch(IOException | ClassNotFoundException ex)
            {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error updating OrderStatus for Task.txt: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } 
            
            selectedTask.setOrderStatus(OrderStatus.DELIVERING);
            
        } else if (selectedTask.getOrderStatus().equals(OrderStatus.DELIVERING)){
            try {
                OrderHandler hdlr = new OrderHandler();
                
                hdlr.updateOrderStatus(selectedTask.getOrderid(), OrderStatus.DELIVERED);
            }
            catch(IOException | ClassNotFoundException ex)
            {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error updating OrderStatus for Order.txt: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } 
            try {
                TaskHandler hdlr = new TaskHandler();
                
                hdlr.updateOrderStatus(selectedTask.getTaskid(), OrderStatus.DELIVERED);
            }
            catch(IOException | ClassNotFoundException ex)
            {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error updating OrderStatus for Task.txt: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } 
            
            selectedTask.setOrderStatus(OrderStatus.DELIVERED);
            try {
                    RunnerHandler hdlr = new RunnerHandler();
                    Runner oldStatus = hdlr.getRunnerDetails(Runner_Dashboard.rnUser.getUserid());

                    Runner_Dashboard.rnUser.setStatus("Standby");

                    hdlr.UpdateItem(oldStatus, Runner_Dashboard.rnUser);

                } catch (IOException | ClassNotFoundException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error while changing Status: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
        }
        
        populatelstCurrntTask();
    }//GEN-LAST:event_btn_UpdateActionPerformed

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//            }
//        });
//    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CurrentTask;
    private javax.swing.JButton btn_Dashboard;
    private javax.swing.JButton btn_Income;
    private javax.swing.JButton btn_NewOrder;
    private javax.swing.JButton btn_Review;
    private javax.swing.JButton btn_Task;
    private javax.swing.JButton btn_TaskHistory;
    private javax.swing.JButton btn_Update;
    private javax.swing.JLabel lbl_Cafe;
    private javax.swing.JLabel lbl_Instructions;
    private javax.swing.JLabel lbl_LogoName;
    private javax.swing.JLabel lbl_LogoPic;
    private javax.swing.JLabel lbl_MenuName;
    private javax.swing.JLabel lbl_Quit;
    private javax.swing.JLabel lbl_RnId;
    private javax.swing.JLabel lbl_RnName;
    private javax.swing.JLabel lbl_Tech;
    private javax.swing.JLabel lbl_Uni;
    private javax.swing.JList<String> lst_CurrentTask;
    private javax.swing.JPanel pnl_Bottom;
    private javax.swing.JPanel pnl_Left;
    private javax.swing.JPanel pnl_Right;
    private javax.swing.JPanel pnl_Top;
    private javax.swing.JScrollPane scrl_List;
    // End of variables declaration//GEN-END:variables
}
