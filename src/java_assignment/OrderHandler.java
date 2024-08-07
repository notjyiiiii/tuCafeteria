package java_assignment;

import com.jcalendar.event.CalendarEvent;
import java.util.*;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java_assignment.Enums.OrderStatus;
import java_assignment.Enums.OrderType;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java_assignment.Enums.OrderStatus;
import javax.swing.table.DefaultTableModel;

public class OrderHandler extends BaseHandler<Order>{
    
    private static ArrayList<Order> allOrders = new ArrayList<>();
    private DefaultTableModel orderTableModel;
    
    public OrderHandler(){
        super("Order", Order.class);
    }
    
    public OrderHandler(DefaultTableModel orderTableModel) {
        this.orderTableModel = orderTableModel;
    }
    
    public OrderHandler(String filePath, Class<Order> clazz) throws IOException, ClassNotFoundException{
        super("Order", Order.class);
        if (allOrders.isEmpty()) {
            allOrders.addAll(collection);
        }
    }
    
    public Order GetOrderByOrderID(String orderID)
    {
        for (int i = 0; i<collection.size(); i++)
        {
            if (collection.get(i).getOrderid().equals(orderID))
            {
                return collection.get(i);
            }
        }
        
        return null;
    }
    
    public ArrayList<Order> GetOrdersByCustomerID(String userID)
    {
        ArrayList<Order> orderList = new ArrayList<Order>();
        
        for (int i = 0; i<collection.size(); i++)
        {
            if (collection.get(i).getCustomerid().equals(userID))
            {
                orderList.add(collection.get(i));
            }
        }
        this.allOrders = orderList;
        return orderList;
    }
    
    public List<String> GetOrderIDbyVendorID()
    {
        List<String> userOrderIDs = new ArrayList<>();
        
        for (int i = 0; i<collection.size(); i++)
        {
            if (collection.get(i).getVendorid().equals(Java_assignment.LoggedInUser.userid))
            {
                userOrderIDs.add(collection.get(i).getOrderid());
            }
        }
        return userOrderIDs;
    }
    
   
    private int getMaxOrderNumber(String lastOrderID) {
        String prefix = "ORD";
        int maxOrderNumber = 0;

        // Extract the number part and parse it
        try {
            int lastOrderNumber = Integer.parseInt(lastOrderID.substring(prefix.length()));
            // Update maxOrderNumber if the last order number is greater
            maxOrderNumber = Math.max(maxOrderNumber, lastOrderNumber);
        } catch (NumberFormatException e) {
            // Handle the exception (e.g., log it) and proceed with the default maxOrderNumber
        }

        return maxOrderNumber;
    }
    
    public String generateOrderID() {
        String prefix = "ORD";
        int maxOrderNumber = 0;

        try {
            // Load the last used order ID from persistent storage
            fileManager fm = new fileManager();
            String configVar = fm.getConfigVar("lastOrderID", true);
            String lastOrderID = fm.readFile(configVar).get(0)[0];

            // Get the maximum order number
            maxOrderNumber = getMaxOrderNumber(lastOrderID);
        } catch (NumberFormatException e) {
            // Handle the IOException or NumberFormatException (e.g., log it) and proceed with the default maxOrderNumber
        }

        // Increment the maximum order number and construct the new order ID
        int newOrderNumber = maxOrderNumber + 1;
        String newOrderID = prefix + newOrderNumber;

        // Save the new order ID to persistent storage for future use
        try {
            fileManager fm2 = new fileManager();
            String configVar2 = fm2.getConfigVar("lastOrderID", true);
            fm2.updateFile(configVar2, new String[]{newOrderID});
        } catch (IOException e) {
            // Handle the IOException (e.g., log it)
            e.printStackTrace();
        }

        return newOrderID;
    }
    
    
    public void WritePlaceOrder(String orderID, String cusID, String vendorID, LocalDateTime orderDateTime,String[] values) throws IOException {
        // Create a new Review object with the provided values
//        String orderidentification = generateOrderID();
        Order newOrder = new Order();
        
        // Generate a new orderID using the OrderIDGenerator
        
        newOrder.setOrderid(orderID);
        newOrder.setCustomerid(cusID);
        newOrder.setVendorid(vendorID);
        newOrder.setOrderDateTime(orderDateTime); 
        
        newOrder.setOrderStatus(OrderStatus.valueOf(values[0]));
        newOrder.setOrderType(OrderType.valueOf(values[1]));
        newOrder.setDeliveryLocation(values[2]);
        newOrder.setOrderAmount(Float.parseFloat(values[3].replace("RM ", "")));
        newOrder.setDeliveryFees(Float.parseFloat(values[4].replace("RM ", "")));
        newOrder.setTotalAmount(Float.parseFloat(values[5].replace("RM ", "")));

        
        // Add the new review to the collection
        collection.add(newOrder);

        // Save the updated collection to the file
        fileManager fm = new fileManager();
        String configVar = fm.getConfigVar(this.filePath, true);
        ArrayList<String[]> data = new ArrayList<>();
        // Convert the Review objects in the collection to String arrays
        for (Order order : collection) {
            data.add(order.SerializeData());
        }
        // Update the file with the new data
        fm.updateFile(configVar, data);
    }
    
    public String getCustomerIDForOrder(String orderId) {
        Order order = this.GetOrderByOrderID(orderId);
        return order.getCustomerid();
    }

    
    public ArrayList<Order> GetOrdersByVendorID(String userID)
    {
        ArrayList<Order> orderList = new ArrayList<Order>();
        
        for (int i = 0; i<collection.size(); i++)
        {
            if (collection.get(i).getVendorid().equals(userID))
            {
                orderList.add(collection.get(i));
            }
        }
        this.allOrders = orderList;
        return orderList;
    }
    //order status
    
    public ArrayList<Order> GetOrderStatusByOrderID(String orderID){
        
        ArrayList<Order> orderstatus = new ArrayList<>();
        
        for(int i = 0; i<this.collection.size(); i++)
        {
            Order orderStatus = collection.get(i);
            
            if(orderStatus.getOrderid().equals(orderID))
            {
                orderstatus.add(orderStatus);
            }
        }
        return orderstatus;
    }
    
    
    public int GetTotalOrders() {
        if (allOrders != null) {
            return allOrders.size();
        } else {
            return 0;
        }
    }

    public ArrayList<String> GetOrderIDsByUserID(String cusID) {
    ArrayList<String> orderIDs = new ArrayList<>();

        for (int i = 0; i < this.collection.size(); i++) {
            Order order = collection.get(i);

            if (order.getCustomerid().equals(cusID)) {
                orderIDs.add(order.getOrderid());
            }
        }
        return orderIDs;
    }
    
    public String getVendorIDByOrderID(String orderID) {
    for (int i = 0; i < this.collection.size(); i++) {
        Order orderStatus = collection.get(i);

        if (orderStatus.getOrderid().equals(orderID)) {
            // Assuming there is a method in your Order class to get vendorID, replace it with the actual method
            return orderStatus.getVendorid();
        }
    }
    return null; // If no matching orderID is found
}
    
    public void updateOrderStatusToCompleted(String orderID) {
        try {
            fileManager fm = new fileManager();
            ArrayList<String[]> fileContent = fm.readFile(this.filePath);

            // Identify and update the line with the selected order ID to "COMPLETED"
            for (int i = 0; i < fileContent.size(); i++) {
                String[] parts = fileContent.get(i);

                // Assuming the order ID is at index 0 (adjust if it's at a different index)
                if (parts.length > 0 && parts[0].equals(orderID)) {
                    // Update the status to "COMPLETED"
                    parts[3] = "COMPLETED";

                    // If you need to update other fields, do it here

                    // Reconstruct the line with the updated status
                    fileContent.set(i, parts);
                    break; // Exit the loop after updating the matching order ID
                }
            }

            // Write the updated data back to the file
            fm.updateFile(this.filePath, fileContent);

            System.out.println("Order status updated to COMPLETED successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    //somehow correct??
    public ArrayList<Order> GetCompletedOrderByUserID(String cusID){
        
        ArrayList<Order> orderstatus = new ArrayList<>();
        
        for(Order orderStatus : this.collection)
        {
            if(orderStatus.getCustomerid().equals(cusID) && orderStatus.getOrderStatus().equals(OrderStatus.DELIVERED))
            {
                orderstatus.add(orderStatus);
            }
        }
       //System.out.println(orderstatus);
        return orderstatus;
    }
    
//    public Order GetOrderByOrderID(String orderID) {
//    for (Order order : collection) {
//        if (order.getOrderid().equals(orderID)) {
//            return order;
//        }
//    }
//    return null; // Return null if the order with the specified ID is not found
//    }
    
    public static void clearOrderMiddleManFile() {
        String filePath = "OrderMiddleMan.txt";

        try {
            FileWriter fw = new FileWriter(filePath, false);
            PrintWriter pw = new PrintWriter(fw, false);
            pw.flush();
            pw.close();
            fw.close();
            System.out.println("OrderMiddleMan.txt file cleared successfully.");
        } catch (IOException exception) {
            System.out.println("Exception caught while clearing OrderMiddleMan.txt file.");
            exception.printStackTrace();
        }
    }
//    public ArrayList<Order> GetCompletedOrderByUserID(String cusID) {
//    ArrayList<Order> orderstatus = new ArrayList<>();
//
//    for (Order orderStatus : this.collection) {
//        System.out.println("Order ID: " + orderStatus.getOrderid());
//        System.out.println("Customer ID: " + cusID);
//        System.out.println("Order Status: " + orderStatus.getOrderStatus());
//
//        if (orderStatus.getCustomerid().equals(cusID) && orderStatus.getOrderStatus().equalsIgnoreCase("Delivered")) {
//            orderstatus.add(orderStatus);
//        }
//    }
//    System.out.println(orderstatus);
//    return orderstatus;
//    }
    
    
    public float CalculateTotalIncomeForToday(String userID) {
        float totalIncome = 0;

        LocalDate today = LocalDate.now();
        //System.out.println(today);

        for (Order order : collection) {
            LocalDateTime orderDateTime = order.getOrderDateTime();
            //System.out.println(orderDateTime);

            if (orderDateTime != null && orderDateTime.toLocalDate().equals(today) && order.getVendorid().equals(userID)) {
                totalIncome += order.getOrderAmount();
            }
        }

        return totalIncome;
    }
    
    
    public float CalculateTotalIncome(String userID) {
        float totalIncome = 0;

        for (Order order : collection) {
            if (order.getVendorid().equals(userID)) {
                totalIncome += order.getOrderAmount();
            }
        }

        return totalIncome;
    }
    
    public ArrayList<Order> GetTodayOrdersByVendorID(String vendorID) {
        ArrayList<Order> todayOrders = new ArrayList<>();
        LocalDate today = LocalDate.now();

        for (Order order : collection) {
            LocalDateTime orderDateTime = order.getOrderDateTime();

            if (orderDateTime != null && orderDateTime.toLocalDate().equals(today) && order.getVendorid().equals(vendorID)) {
                todayOrders.add(order);
            }
        }

        return todayOrders;
    }

    
    public ArrayList<Order> getOrdersByDateRange(LocalDate startDate, LocalDate endDate) {
        ArrayList<Order> ordersWithinDateRange = new ArrayList<>();

        for (Order order : collection) {
            LocalDate orderDate = order.getOrderDateTime().toLocalDate();

            if (!orderDate.isBefore(startDate) && !orderDate.isAfter(endDate)) {
                ordersWithinDateRange.add(order);
            }
        }

        return ordersWithinDateRange;
    }
    
    public void updateOrderStatus(String orderId, OrderStatus newStatus) throws IOException {
        Order orderToUpdate = GetOrderByOrderID(orderId);
        orderToUpdate.setOrderStatus(newStatus);

        UpdateItem(orderToUpdate, orderToUpdate);
    }

    public void deleteOrder(String orderId) throws IOException {
        Order orderToDelete = GetOrderByOrderID(orderId);

        DeleteItem(orderToDelete);
    }
    
    public ArrayList<Order> GetNewDeliveryOrder()
    {
        ArrayList<Order> orderList = new ArrayList<Order>();

        for (int i = 0; i<collection.size(); i++)
        {
            if(collection.get(i).getOrderType().equals(OrderType.DELIVERY) && collection.get(i).getOrderStatus().equals(OrderStatus.AWAIT_PICK_UP)){
                orderList.add(collection.get(i));
            }
        }
        this.allOrders = orderList;
        return orderList;

    }
    

//olo
}
