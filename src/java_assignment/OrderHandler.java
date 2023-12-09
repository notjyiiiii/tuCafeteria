package java_assignment;

import com.jcalendar.event.CalendarEvent;
import java.util.*;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java_assignment.Enums.OrderStatus;
import java_assignment.Enums.OrderType;

public class OrderHandler extends BaseHandler<Order>{
    
    private ArrayList<Order> ol;
    
    public OrderHandler() throws IOException, ClassNotFoundException{
        super("Order", Order.class);
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
        this.ol = orderList;
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
    
    
    public void WritePlaceOrder(String orderID, String cusID, String vendorID, String[] values) throws IOException {
        // Create a new Review object with the provided values
//        String orderidentification = generateOrderID();
        Order newOrder = new Order();
        
        // Generate a new orderID using the OrderIDGenerator
        
        newOrder.setOrderid(orderID);
        newOrder.setCustomerid(cusID);
        newOrder.setVendorid(vendorID);
        
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
        this.ol = orderList;
        return orderList;
    }
    
    
    public int GetTotalOrders() {
        if (ol != null) {
            return ol.size();
        } else {
            return 0;
        }
    }

    
    
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


}
