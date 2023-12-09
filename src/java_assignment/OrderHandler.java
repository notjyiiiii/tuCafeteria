package java_assignment;

import java.util.*;
import java.io.*;
import javax.swing.table.DefaultTableModel;

public class OrderHandler extends BaseHandler<Order>{
    
    private static ArrayList<Order> allOrders = new ArrayList<>();
    private DefaultTableModel orderTableModel;
    
    public OrderHandler(){}
    
    public OrderHandler(DefaultTableModel orderTableModel) {
        this.orderTableModel = orderTableModel;
    }
    
    public OrderHandler(String filePath, Class<Order> clazz) throws IOException, ClassNotFoundException{
        super("Order_1", Order.class);
        if (allOrders.isEmpty()) {
            allOrders.addAll(collection);
        }
    }
    
//    public Order GetOrderByOrderID(String orderID)
//    {
//        for (int i = 0; i<collection.size(); i++)
//        {
//            if (collection.get(i).getOrderid().equals(orderID))
//            {
//                return collection.get(i);
//            }
//        }
//        
//        return null;
//    }
    
    public Order[] GetOrdersByUserID(String userID)
    {
        ArrayList<Order> orderList = new ArrayList<Order>();
        
        for (int i = 0; i<collection.size(); i++)
        {
            if (collection.get(i).getCustomerid().equals(userID))
            {
                orderList.add(collection.get(i));
            }
        }
        
        return (Order[]) orderList.toArray();
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
    
    
    public void WritePlaceOrder(String orderID, String cusID, String vendorID, String[] values) {
        // Create a new Review object with the provided values
//        String orderidentification = generateOrderID();
        Order newOrder = new Order();
        
        // Generate a new orderID using the OrderIDGenerator
        
        newOrder.setOrderid(orderID);
        newOrder.setCustomerid(cusID);
        newOrder.setVendorid(vendorID);
        
        newOrder.setOrderStatus(values[0]);
        newOrder.setOrderType(values[1]);
        newOrder.setDeliveryLocation(values[2]);
        newOrder.setOrderAmount(Double.parseDouble(values[3].replace("RM ", "")));
        newOrder.setDeliveryFees(Double.parseDouble(values[4].replace("RM ", "")));
        newOrder.setTotalAmount(Double.parseDouble(values[5].replace("RM ", "")));

        
        // Add the new review to the collection
        collection.add(newOrder);

        try {
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
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the IOException, you might want to throw a custom exception or log the error
        }
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
    //somehow correct??
    public ArrayList<Order> GetCompletedOrderByUserID(String cusID){
        
        ArrayList<Order> orderstatus = new ArrayList<>();
        
        for(Order orderStatus : this.collection)
        {
            if(orderStatus.getCustomerid().equals(cusID) && orderStatus.getOrderStatus().equalsIgnoreCase("DELIVERED"))
            {
                orderstatus.add(orderStatus);
            }
        }
       //System.out.println(orderstatus);
        return orderstatus;
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
    
}
