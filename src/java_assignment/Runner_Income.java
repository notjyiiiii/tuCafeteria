package java_assignment;

import java.io.IOException;
import javax.swing.JOptionPane;


public class Runner_Income extends javax.swing.JFrame {

    public Runner_Income() {
        try {
            initComponents();
            setVisible(true);
            
            double rnIncomeD = 0;
            double rnIncomeM = 0;
            double rnIncomeY = 0;
            
            try{
                TaskHandler hdlr = new TaskHandler();
                rnIncomeD = hdlr.getDailyIncome(Runner_Dashboard.rnUser.getUserid());
                rnIncomeM = hdlr.getMonthlyIncome(Runner_Dashboard.rnUser.getUserid());
                rnIncomeY = hdlr.getYearlyIncome(Runner_Dashboard.rnUser.getUserid());
            }catch(IOException | ClassNotFoundException ex)
            {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error retieving Runner Income Details: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } 
            
            lbl_Daily.setText(String.valueOf(rnIncomeD));
            lbl_Monthly.setText(String.valueOf(rnIncomeM));
            lbl_Yearly.setText(String.valueOf(rnIncomeY));
            lbl_RnName.setText(Runner_Dashboard.rnUser.getUsername());
            lbl_RnId.setText(Runner_Dashboard.rnUser.getUserid());
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error initializing Income Menu: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Left = new javax.swing.JPanel();
        lbl_Cafe = new javax.swing.JLabel();
        lbl_Tech = new javax.swing.JLabel();
        lbl_Uni = new javax.swing.JLabel();
        pnl_Top = new javax.swing.JPanel();
        lbl_LogoPic = new javax.swing.JLabel();
        lbl_LogoName = new javax.swing.JLabel();
        lbl_Quit = new javax.swing.JLabel();
        pnl_Bottom = new javax.swing.JPanel();
        lbl_RnName = new javax.swing.JLabel();
        lbl_RnId = new javax.swing.JLabel();
        btn_Task = new javax.swing.JButton();
        btn_Review = new javax.swing.JButton();
        btn_Income = new javax.swing.JButton();
        btn_Dashboard = new javax.swing.JButton();
        pnl_Right = new javax.swing.JPanel();
        lbl_MenuName = new javax.swing.JLabel();
        lbl_MenuName1 = new javax.swing.JLabel();
        lbl_MenuName2 = new javax.swing.JLabel();
        lbl_MenuName3 = new javax.swing.JLabel();
        lbl_Daily = new javax.swing.JLabel();
        lbl_Monthly = new javax.swing.JLabel();
        lbl_Yearly = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(607, 578));
        setMinimumSize(new java.awt.Dimension(607, 578));
        setPreferredSize(new java.awt.Dimension(605, 578));
        setResizable(false);

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

        javax.swing.GroupLayout pnl_LeftLayout = new javax.swing.GroupLayout(pnl_Left);
        pnl_Left.setLayout(pnl_LeftLayout);
        pnl_LeftLayout.setHorizontalGroup(
            pnl_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_LeftLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnl_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Tech)
                    .addComponent(lbl_Uni)
                    .addComponent(lbl_Cafe))
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
                .addContainerGap(212, Short.MAX_VALUE))
        );

        getContentPane().add(pnl_Left, java.awt.BorderLayout.CENTER);

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
                .addContainerGap(165, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btn_Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Task, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Review, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Income, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        pnl_BottomLayout.setVerticalGroup(
            pnl_BottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_BottomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_RnName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_RnId)
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_BottomLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_BottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Task, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Review, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Income, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lbl_RnName.getAccessibleContext().setAccessibleName("rnName");

        getContentPane().add(pnl_Bottom, java.awt.BorderLayout.PAGE_END);

        pnl_Right.setBackground(new java.awt.Color(246, 246, 246));
        pnl_Right.setPreferredSize(new java.awt.Dimension(429, 435));

        lbl_MenuName.setFont(new java.awt.Font("Josefin Sans", 1, 28)); // NOI18N
        lbl_MenuName.setForeground(new java.awt.Color(102, 102, 102));
        lbl_MenuName.setText("Income");

        lbl_MenuName1.setFont(new java.awt.Font("Josefin Sans", 1, 20)); // NOI18N
        lbl_MenuName1.setForeground(new java.awt.Color(102, 102, 102));
        lbl_MenuName1.setText("Daily:");

        lbl_MenuName2.setFont(new java.awt.Font("Josefin Sans", 1, 20)); // NOI18N
        lbl_MenuName2.setForeground(new java.awt.Color(102, 102, 102));
        lbl_MenuName2.setText("Monthly:");

        lbl_MenuName3.setFont(new java.awt.Font("Josefin Sans", 1, 20)); // NOI18N
        lbl_MenuName3.setForeground(new java.awt.Color(102, 102, 102));
        lbl_MenuName3.setText("Yearly:");

        lbl_Daily.setFont(new java.awt.Font("Josefin Sans", 1, 20)); // NOI18N
        lbl_Daily.setForeground(new java.awt.Color(255, 189, 49));
        lbl_Daily.setText("0");

        lbl_Monthly.setFont(new java.awt.Font("Josefin Sans", 1, 20)); // NOI18N
        lbl_Monthly.setForeground(new java.awt.Color(255, 189, 49));
        lbl_Monthly.setText("0");

        lbl_Yearly.setFont(new java.awt.Font("Josefin Sans", 1, 20)); // NOI18N
        lbl_Yearly.setForeground(new java.awt.Color(255, 189, 49));
        lbl_Yearly.setText("0");

        javax.swing.GroupLayout pnl_RightLayout = new javax.swing.GroupLayout(pnl_Right);
        pnl_Right.setLayout(pnl_RightLayout);
        pnl_RightLayout.setHorizontalGroup(
            pnl_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_RightLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnl_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_MenuName)
                    .addGroup(pnl_RightLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(pnl_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_MenuName1)
                            .addComponent(lbl_MenuName2)
                            .addComponent(lbl_MenuName3))
                        .addGap(34, 34, 34)
                        .addGroup(pnl_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Yearly)
                            .addComponent(lbl_Monthly)
                            .addComponent(lbl_Daily))))
                .addContainerGap(261, Short.MAX_VALUE))
        );
        pnl_RightLayout.setVerticalGroup(
            pnl_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_RightLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbl_MenuName)
                .addGap(18, 18, 18)
                .addGroup(pnl_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_MenuName1)
                    .addComponent(lbl_Daily))
                .addGap(18, 18, 18)
                .addGroup(pnl_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_MenuName2)
                    .addComponent(lbl_Monthly))
                .addGap(18, 18, 18)
                .addGroup(pnl_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_MenuName3)
                    .addComponent(lbl_Yearly))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        getContentPane().add(pnl_Right, java.awt.BorderLayout.LINE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_QuitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_QuitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbl_QuitMouseClicked

    private void btn_TaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TaskActionPerformed
        this.dispose();
        Runner_Task rn = new Runner_Task();
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

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//            }
//        });
//    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Dashboard;
    private javax.swing.JButton btn_Income;
    private javax.swing.JButton btn_Review;
    private javax.swing.JButton btn_Task;
    private javax.swing.JLabel lbl_Cafe;
    private javax.swing.JLabel lbl_Daily;
    private javax.swing.JLabel lbl_LogoName;
    private javax.swing.JLabel lbl_LogoPic;
    private javax.swing.JLabel lbl_MenuName;
    private javax.swing.JLabel lbl_MenuName1;
    private javax.swing.JLabel lbl_MenuName2;
    private javax.swing.JLabel lbl_MenuName3;
    private javax.swing.JLabel lbl_Monthly;
    private javax.swing.JLabel lbl_Quit;
    private javax.swing.JLabel lbl_RnId;
    private javax.swing.JLabel lbl_RnName;
    private javax.swing.JLabel lbl_Tech;
    private javax.swing.JLabel lbl_Uni;
    private javax.swing.JLabel lbl_Yearly;
    private javax.swing.JPanel pnl_Bottom;
    private javax.swing.JPanel pnl_Left;
    private javax.swing.JPanel pnl_Right;
    private javax.swing.JPanel pnl_Top;
    // End of variables declaration//GEN-END:variables
}
