package java_assignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.io.IOException;
import java.text.DecimalFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;

public class VendorInsightsPage extends javax.swing.JFrame {

    private String username;
    private String password;
    private Vendor vendor;
    private JTabbedPane tabbedPane;
    private DefaultTableModel modelReview = new DefaultTableModel();
    private DefaultTableModel modelOverview = new DefaultTableModel();
    private DefaultTableModel modelSummary = new DefaultTableModel();
    private String[] columnName = {"Name", "Review", "Rating"};
    private String[] columnNameforOv = {"ID", "Name", "Description", "Type", "Price"};
    private String[] columnNameforSum = {"ID","Status","Service","Date Time","Amount"};
    private int row=-1;
    private String vendorID;
    
    public VendorInsightsPage(Vendor v) throws IOException, ClassNotFoundException {
        initComponents();
        setVisible(true);
        this.vendor = v;
        this.vendorID = Java_assignment.LoggedInUser.userid;
        
         ratingTab();
         overviewTab();
         summaryTab();
        
    }
    
    public void ratingTab() throws IOException, ClassNotFoundException{
       modelReview.setColumnIdentifiers(columnName);
        
        jTable2.setModel(modelReview);
        
        jTable2.getColumnModel().getColumn(0).setPreferredWidth(250);
        jTable2.getColumnModel().getColumn(1).setPreferredWidth(600);
        jTable2.getColumnModel().getColumn(2).setPreferredWidth(100);
        
        ReviewHandler reviewHandler = new ReviewHandler();
        ArrayList<Review> review = reviewHandler.GetReview(vendorID);
        
        for (Review reviewList : review) {
            modelReview.addRow(new Object[]{reviewList.getCustomerName(), reviewList.getReview(), reviewList.getRating()});
        } 
    }
    
    public void overviewTab() throws IOException, ClassNotFoundException{
        MenuHandler menuHandler = new MenuHandler("Menu", Menu.class);

        menuHandler.GetVendorMenu(Java_assignment.LoggedInUser.userid); 
        int totalMenus = menuHandler.GetTotalMenusForVendor();
        
        OrderHandler oh = new OrderHandler();      
        Float incomeForToday = oh.CalculateTotalIncomeForToday(Java_assignment.LoggedInUser.userid);
        Float income = oh.CalculateTotalIncome(Java_assignment.LoggedInUser.userid);
        oh.GetOrdersByVendorID(Java_assignment.LoggedInUser.userid);
        int totalOrders = oh.GetTotalOrders();
        System.out.println(totalOrders);
        
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        String formattedDailyIncome = "RM" + decimalFormat.format(incomeForToday);
        String formattedIncome = "RM" + decimalFormat.format(income);
        lb_dailyEarningstxt.setText(String.valueOf(formattedIncome));
        lb_dailyEarningstxt1.setText(String.valueOf(formattedDailyIncome));
        lb_totalmenutxt1.setText(Integer.toString(totalOrders));
        lb_totalmenutxt.setText(Integer.toString(totalMenus));
        
        modelOverview.setColumnIdentifiers(columnNameforOv);
        
        jTable4.setModel(modelOverview);
        
        jTable4.getColumnModel().getColumn(0).setPreferredWidth(100);
        jTable4.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTable4.getColumnModel().getColumn(2).setPreferredWidth(600);
        jTable4.getColumnModel().getColumn(3).setPreferredWidth(200);
        jTable4.getColumnModel().getColumn(4).setPreferredWidth(100);
        
        OrderSummaryHandler osh = new OrderSummaryHandler("OrderSummary", OrderSummary.class);
        MenuHandler mh = new MenuHandler("Menu", Menu.class);
        
        List<String> userOrderIDs = oh.GetOrderIDbyVendorID();
        List<OrderSummary> userOrders = osh.GetOrderByOrderIDs(userOrderIDs);
        // get the food names from ordersummary
        List<String> foodNames = userOrders.stream().map(OrderSummary::getFoodName).collect(Collectors.toList());
        //System.out.println(foodNames);
        List<Menu> menuList = mh.GetVendorMenu(vendorID);
        Map<String, Menu> menuMap = menuList.stream().collect(Collectors.toMap(Menu::getItemName, Function.identity()));
        Map<String, Long> foodOccurrences = Stream.concat(foodNames.stream(), menuList.stream().map(Menu::getItemName))
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        List<String> uniqueFoodNames = foodOccurrences.entrySet().stream()
        .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
        .map(Map.Entry::getKey)
        .collect(Collectors.toList());
        
        uniqueFoodNames.sort(Comparator.comparing(foodOccurrences::get).reversed());
        
        for (String foodName : uniqueFoodNames) {
            Menu menu = menuMap.get(foodName);
            if (menu != null) {
                modelOverview.addRow(new Object[]{menu.getItemid(), menu.getItemName(), menu.getItemDesc(), menu.getItemType(), menu.getItemPrice()});
            } 
        }
    }
    
    public void summaryTab() throws IOException, ClassNotFoundException{
        modelSummary.setColumnIdentifiers(columnNameforSum);
        jTable3.setModel(modelSummary);

        OrderHandler oh = new OrderHandler();      
        
        jTable3.getColumnModel().getColumn(0).setPreferredWidth(80);
        jTable3.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTable3.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTable3.getColumnModel().getColumn(3).setPreferredWidth(300);
        jTable3.getColumnModel().getColumn(4).setPreferredWidth(80);
        
        
        ArrayList<Order> order = oh.GetOrdersByVendorID(Java_assignment.LoggedInUser.userid);
        populateComboBox1(order);
        populateComboBox2(order);
        
        for (Order orderItem : order) {
            modelSummary.addRow(new Object[]{orderItem.getOrderid(), orderItem.getOrderStatus(), orderItem.getOrderType(), orderItem.getOrderDateTime(), orderItem.getOrderAmount()});
        }
    }
    
    private void populateComboBox1(ArrayList<Order> order) {
        Set<String> uniqueOrderTypes = new HashSet<>();

        for (Order orderItem : order) {
            uniqueOrderTypes.add(orderItem.getOrderType().toString());
        }

        String[] orderTypesArray = uniqueOrderTypes.toArray(new String[0]);

        String[] comboBoxItems = new String[orderTypesArray.length + 1];
        comboBoxItems[0] = "Filter by...";
        System.arraycopy(orderTypesArray, 0, comboBoxItems, 1, orderTypesArray.length);

        DefaultComboBoxModel<String> typeComboBoxModel = new DefaultComboBoxModel<>(comboBoxItems);
        cb_type2.setModel(typeComboBoxModel);

        // Add action listener to the combo box
        cb_type2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    updateTable();
                } catch (IOException ex) {
                    Logger.getLogger(VendorOrdersPage.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(VendorOrdersPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    private void populateComboBox2(ArrayList<Order> order) {
        Set<String> uniqueOrderStatus = new HashSet<>();

        for (Order orderItem : order) {
            uniqueOrderStatus.add(orderItem.getOrderStatus().toString());
        }

        String[] orderStatusArray = uniqueOrderStatus.toArray(new String[0]);

        String[] comboBoxItems = new String[orderStatusArray.length + 1];
        comboBoxItems[0] = "Filter by...";
        System.arraycopy(orderStatusArray, 0, comboBoxItems, 1, orderStatusArray.length);

        DefaultComboBoxModel<String> statusComboBoxModel = new DefaultComboBoxModel<>(comboBoxItems);
        cb_service2.setModel(statusComboBoxModel);

        // Add action listener to the combo box
        cb_service2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    updateTable();
                } catch (IOException ex) {
                    Logger.getLogger(VendorOrdersPage.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(VendorOrdersPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    private void updateTable() throws IOException, ClassNotFoundException {
        String selectedOrderType = cb_type2.getSelectedItem().toString();
        String selectedOrderStatus = cb_service2.getSelectedItem().toString();

        // Filter the table based on selected values
        modelSummary.setRowCount(0);
        OrderHandler oh = new OrderHandler();
        ArrayList<Order> order = oh.GetOrdersByVendorID(Java_assignment.LoggedInUser.userid);

        for (Order orderItem : order) {
            if (("Filter by...".equals(selectedOrderType) || orderItem.getOrderType().toString().equals(selectedOrderType)) &&
                ("Filter by...".equals(selectedOrderStatus) || orderItem.getOrderStatus().toString().equals(selectedOrderStatus))) {
                modelSummary.addRow(new Object[]{orderItem.getOrderid(), orderItem.getOrderStatus(), orderItem.getOrderType(), orderItem.getOrderDateTime(), orderItem.getOrderAmount()});
            }
        }
    }

    
    
    private void updateReviewTable() throws IOException, ClassNotFoundException {
        String selectedRating = (String) cb_star.getSelectedItem();

        ArrayList<Review> filteredReviews = filterReviews(selectedRating);

        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);

        for (Review review : filteredReviews) {
            Object[] rowData = { review.getCustomerName(), review.getReview(), review.getRating()};
            model.addRow(rowData);
        }
    }
    
    private ArrayList<Review> filterReviews(String selectedRating) throws IOException, ClassNotFoundException {
        ReviewHandler reviewHandler = new ReviewHandler();
        ArrayList<Review> review = reviewHandler.GetReview(vendorID);
        ArrayList<Review> filteredReviews = new ArrayList<>();

        for (Review reviewList : review) {
            if (("All".equals(selectedRating) || reviewList.getRating().equals(selectedRating))) {
                filteredReviews.add(reviewList);
            }
        }

        return filteredReviews;
    }
    
    public JTabbedPane getTabbedPane() {
        return tp_insights;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topPanel1 = new javax.swing.JPanel();
        lb_logoPic1 = new javax.swing.JLabel();
        lb_logoName1 = new javax.swing.JLabel();
        lb_quit1 = new javax.swing.JLabel();
        leftPanel = new javax.swing.JPanel();
        lb_cafeName = new javax.swing.JLabel();
        lb_tuName = new javax.swing.JLabel();
        lb_tuName1 = new javax.swing.JLabel();
        btn_Profile = new java.awt.Button();
        btn_Settings = new java.awt.Button();
        lb_dailyEarningstxt = new javax.swing.JLabel();
        lb_dailyEarnings1 = new javax.swing.JLabel();
        btn_Credits = new java.awt.Button();
        rightPanel = new javax.swing.JPanel();
        tp_insights = new javax.swing.JTabbedPane();
        jp_overview = new javax.swing.JPanel();
        lb_service = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        lb_dailyEarnings = new javax.swing.JLabel();
        lb_dailyEarningstxt1 = new javax.swing.JLabel();
        lb_totalmenu = new javax.swing.JLabel();
        lb_totalmenutxt = new javax.swing.JLabel();
        lb_totalmenu1 = new javax.swing.JLabel();
        lb_totalmenutxt1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lb_month1 = new javax.swing.JLabel();
        cb_star = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        lb_month2 = new javax.swing.JLabel();
        cb_month2 = new javax.swing.JComboBox<>();
        lb_type2 = new javax.swing.JLabel();
        cb_type2 = new javax.swing.JComboBox<>();
        lb_service2 = new javax.swing.JLabel();
        cb_service2 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        bottomPanel = new javax.swing.JPanel();
        btn_noti = new javax.swing.JButton();
        btn_orders = new javax.swing.JButton();
        btn_dashb = new javax.swing.JButton();
        btn_insights = new javax.swing.JButton();
        btn_menu = new javax.swing.JButton();

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
                .addGap(197, 197, 197)
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

        leftPanel.setBackground(new java.awt.Color(246, 246, 246));

        lb_cafeName.setFont(new java.awt.Font("Josefin Sans", 1, 28)); // NOI18N
        lb_cafeName.setForeground(new java.awt.Color(255, 189, 49));
        lb_cafeName.setText("Cafeteria");

        lb_tuName.setFont(new java.awt.Font("Josefin Sans", 1, 28)); // NOI18N
        lb_tuName.setText("University");

        lb_tuName1.setFont(new java.awt.Font("Josefin Sans", 1, 28)); // NOI18N
        lb_tuName1.setText("Tech");

        btn_Profile.setLabel("Profile");
        btn_Profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProfileActionPerformed(evt);
            }
        });

        btn_Settings.setLabel("Settings");
        btn_Settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SettingsActionPerformed(evt);
            }
        });

        lb_dailyEarningstxt.setFont(new java.awt.Font("Malayalam MN", 1, 25)); // NOI18N

        lb_dailyEarnings1.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_dailyEarnings1.setText("TU - E Credits:");

        btn_Credits.setActionCommand("Credits");
        btn_Credits.setLabel("Credits");
        btn_Credits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CreditsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Credits, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_dailyEarnings1)
                    .addComponent(btn_Settings, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_tuName)
                    .addComponent(lb_tuName1)
                    .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lb_dailyEarningstxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_cafeName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lb_tuName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_tuName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_cafeName)
                .addGap(24, 24, 24)
                .addComponent(lb_dailyEarnings1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_dailyEarningstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(btn_Credits, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(btn_Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(btn_Settings, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rightPanel.setBackground(new java.awt.Color(246, 246, 246));

        lb_service.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_service.setText("Most Popular Item");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        lb_dailyEarnings.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_dailyEarnings.setText("Daily Earnings");

        lb_dailyEarningstxt1.setFont(new java.awt.Font("Malayalam MN", 1, 25)); // NOI18N

        lb_totalmenu.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_totalmenu.setText("Total Menu");

        lb_totalmenutxt.setFont(new java.awt.Font("Malayalam MN", 1, 25)); // NOI18N

        lb_totalmenu1.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_totalmenu1.setText("Total Orders");

        lb_totalmenutxt1.setFont(new java.awt.Font("Malayalam MN", 1, 25)); // NOI18N

        javax.swing.GroupLayout jp_overviewLayout = new javax.swing.GroupLayout(jp_overview);
        jp_overview.setLayout(jp_overviewLayout);
        jp_overviewLayout.setHorizontalGroup(
            jp_overviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_overviewLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jp_overviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_overviewLayout.createSequentialGroup()
                        .addGroup(jp_overviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_totalmenu)
                            .addComponent(lb_totalmenutxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jp_overviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_totalmenu1)
                            .addComponent(lb_totalmenutxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(jp_overviewLayout.createSequentialGroup()
                        .addGroup(jp_overviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_dailyEarnings)
                            .addComponent(lb_dailyEarningstxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_service))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jp_overviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jp_overviewLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(15, Short.MAX_VALUE)))
        );
        jp_overviewLayout.setVerticalGroup(
            jp_overviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_overviewLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lb_service)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 250, Short.MAX_VALUE)
                .addComponent(lb_dailyEarnings)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_dailyEarningstxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jp_overviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_overviewLayout.createSequentialGroup()
                        .addComponent(lb_totalmenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_totalmenutxt, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_overviewLayout.createSequentialGroup()
                        .addComponent(lb_totalmenu1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_totalmenutxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
            .addGroup(jp_overviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jp_overviewLayout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(244, Short.MAX_VALUE)))
        );

        tp_insights.addTab("Overview", jp_overview);

        lb_month1.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_month1.setText("Stars");

        cb_star.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose...", "1", "2", "3", "4", "5" }));
        cb_star.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_starActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_month1)
                            .addComponent(cb_star, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(116, 303, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lb_month1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_star, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tp_insights.addTab("Ratings", jPanel2);

        lb_month2.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_month2.setText("View by:");

        cb_month2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filter by...", "Daily", "Weekly", "Monthly", "Yearly" }));
        cb_month2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_month2ActionPerformed(evt);
            }
        });

        lb_type2.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_type2.setText("Type");

        cb_type2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lb_service2.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        lb_service2.setText("Service");

        cb_service2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_month2)
                            .addComponent(cb_month2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_type2)
                            .addComponent(cb_type2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_service2)
                            .addComponent(cb_service2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_type2)
                    .addComponent(lb_month2)
                    .addComponent(lb_service2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_month2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_type2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_service2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        tp_insights.addTab("Summary", jPanel3);

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tp_insights)
                .addContainerGap())
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tp_insights))
        );

        bottomPanel.setBackground(new java.awt.Color(66, 33, 11));

        btn_noti.setText("Notification");
        btn_noti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_notiActionPerformed(evt);
            }
        });

        btn_orders.setText("Orders");
        btn_orders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ordersMouseClicked(evt);
            }
        });
        btn_orders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ordersActionPerformed(evt);
            }
        });

        btn_dashb.setText("Dashboard");
        btn_dashb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dashbMouseClicked(evt);
            }
        });

        btn_insights.setText("Insights");
        btn_insights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insightsActionPerformed(evt);
            }
        });

        btn_menu.setText("Menu");
        btn_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_menuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btn_noti)
                .addGap(28, 28, 28)
                .addComponent(btn_orders, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_dashb)
                .addGap(32, 32, 32)
                .addComponent(btn_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_insights, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_noti, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_insights, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_dashb, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_orders, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(bottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb_quit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_quit1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_lb_quit1MouseClicked

    private void btn_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_menuMouseClicked
        try {
            this.dispose();
            VendorMenuPage vmenup = new VendorMenuPage(vendor);
            vmenup.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(VendorInsightsPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorInsightsPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_menuMouseClicked

    private void btn_dashbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dashbMouseClicked
        try {
            this.dispose();
            VendorMainPage vip = new VendorMainPage(vendor);
            vip.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(VendorInsightsPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorInsightsPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_dashbMouseClicked

    private void btn_ordersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ordersMouseClicked
        try {
            this.dispose();
            VendorOrdersPage vop = new VendorOrdersPage(vendor);
            vop.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorInsightsPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VendorInsightsPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_ordersMouseClicked

    private void cb_starActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_starActionPerformed
        try {
            updateReviewTable();
        } catch (IOException ex) {
            Logger.getLogger(VendorInsightsPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorInsightsPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cb_starActionPerformed

    private void btn_CreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CreditsActionPerformed
        try {
            this.dispose();
            VendorCreditPage vcp = new VendorCreditPage(vendor);
            vcp.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(VendorProfilePage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorProfilePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_CreditsActionPerformed

    private void btn_ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProfileActionPerformed
        try {
            this.dispose();
            VendorProfilePage vpp = new VendorProfilePage(vendor);
            vpp.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(VendorProfilePage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorProfilePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_ProfileActionPerformed

    private void btn_SettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SettingsActionPerformed
        this.dispose();
        VendorSettingsPage vsp = new VendorSettingsPage(vendor);
        vsp.setVisible(true);
    }//GEN-LAST:event_btn_SettingsActionPerformed

    private void btn_notiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_notiActionPerformed
        try {
            this.dispose();
            Notification_Page noti = new Notification_Page(vendor);
            noti.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(VendorInsightsPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorInsightsPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_notiActionPerformed

    private void btn_ordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ordersActionPerformed
        try {
            this.dispose();
            VendorOrdersPage vop = new VendorOrdersPage(vendor);
            vop.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorProfilePage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VendorProfilePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_ordersActionPerformed

    private void btn_insightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insightsActionPerformed
        try {
            this.dispose();
            VendorInsightsPage vip = new VendorInsightsPage(vendor);
            vip.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(VendorProfilePage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorProfilePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_insightsActionPerformed

    private void cb_month2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_month2ActionPerformed
        try {
            this.filterByDateRange();
        } catch (IOException ex) {
            Logger.getLogger(OrderHistory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OrderHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cb_month2ActionPerformed

    private void filterByDateRange() throws IOException, ClassNotFoundException {
        String selectedViewBy = cb_month2.getSelectedItem().toString();
        modelSummary.setRowCount(0);
        OrderHandler oh = new OrderHandler();
        ArrayList<Order> order = oh.GetOrdersByVendorID(Java_assignment.LoggedInUser.userid);

        switch (selectedViewBy) {
            case "Daily":
                ArrayList<Order> orderDaily = oh.GetTodayOrdersByVendorID(Java_assignment.LoggedInUser.userid);
                populateTable(orderDaily);
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
            modelSummary.addRow(new Object[]{orderItem.getOrderid(), orderItem.getOrderStatus(), orderItem.getOrderType(), orderItem.getOrderDateTime(), orderItem.getOrderAmount()});
        }
    }

    // Helper method to filter orders by week
    private void filterByWeekly(ArrayList<Order> order) {
        LocalDate startDate = LocalDate.now().with(DayOfWeek.MONDAY);
        LocalDate endDate = LocalDate.now().with(DayOfWeek.SUNDAY);
        for (Order orderItem : order) {
            LocalDate orderDate = orderItem.getOrderDateTime().toLocalDate();
            if (!orderDate.isBefore(startDate) && !orderDate.isAfter(endDate)) {
                modelSummary.addRow(new Object[]{orderItem.getOrderid(), orderItem.getOrderStatus(), orderItem.getOrderType(), orderItem.getOrderDateTime(), orderItem.getOrderAmount()});
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
                modelSummary.addRow(new Object[]{orderItem.getOrderid(), orderItem.getOrderStatus(), orderItem.getOrderType(), orderItem.getOrderDateTime(), orderItem.getOrderAmount()});
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
                modelSummary.addRow(new Object[]{orderItem.getOrderid(), orderItem.getOrderStatus(), orderItem.getOrderType(), orderItem.getOrderDateTime(), orderItem.getOrderAmount()});
            }
        }
    }

    // Helper method to filter all orders based on type and status
    private void filterAllOrders(ArrayList<Order> order, String selectedOrderType, String selectedOrderStatus) {
        for (Order orderItem : order) {
            if (("Filter by...".equals(selectedOrderType) || orderItem.getOrderType().toString().equals(selectedOrderType)) &&
                    ("Filter by...".equals(selectedOrderStatus) || orderItem.getOrderStatus().toString().equals(selectedOrderStatus))) {
                modelSummary.addRow(new Object[]{orderItem.getOrderid(), orderItem.getOrderStatus(), orderItem.getOrderType(), orderItem.getOrderDateTime(), orderItem.getOrderAmount()});
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
    private javax.swing.JPanel bottomPanel;
    private java.awt.Button btn_Credits;
    private java.awt.Button btn_Profile;
    private java.awt.Button btn_Settings;
    private javax.swing.JButton btn_dashb;
    private javax.swing.JButton btn_insights;
    private javax.swing.JButton btn_menu;
    private javax.swing.JButton btn_noti;
    private javax.swing.JButton btn_orders;
    private javax.swing.JComboBox<String> cb_month2;
    private javax.swing.JComboBox<String> cb_service2;
    private javax.swing.JComboBox<String> cb_star;
    private javax.swing.JComboBox<String> cb_type2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JPanel jp_overview;
    private javax.swing.JLabel lb_cafeName;
    private javax.swing.JLabel lb_dailyEarnings;
    private javax.swing.JLabel lb_dailyEarnings1;
    private javax.swing.JLabel lb_dailyEarningstxt;
    private javax.swing.JLabel lb_dailyEarningstxt1;
    private javax.swing.JLabel lb_logoName1;
    private javax.swing.JLabel lb_logoPic1;
    private javax.swing.JLabel lb_month1;
    private javax.swing.JLabel lb_month2;
    private javax.swing.JLabel lb_quit1;
    private javax.swing.JLabel lb_service;
    private javax.swing.JLabel lb_service2;
    private javax.swing.JLabel lb_totalmenu;
    private javax.swing.JLabel lb_totalmenu1;
    private javax.swing.JLabel lb_totalmenutxt;
    private javax.swing.JLabel lb_totalmenutxt1;
    private javax.swing.JLabel lb_tuName;
    private javax.swing.JLabel lb_tuName1;
    private javax.swing.JLabel lb_type2;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JPanel topPanel1;
    private javax.swing.JTabbedPane tp_insights;
    // End of variables declaration//GEN-END:variables
}
