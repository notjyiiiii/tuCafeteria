package java_assignment;

import java.util.*;
import java.io.*;

public class OrderHandler extends BaseHandler<Order>{
    
    private static ArrayList<Order> allOrders = new ArrayList<>();
    
    public OrderHandler(){}
    
    public OrderHandler(String filePath, Class<Order> clazz) throws IOException, ClassNotFoundException{
        super("Order_1", Order.class);
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
    
    public String generateOrderID() {
        String prefix = "ORD";
        int maxOrderNumber = 0;

        // Iterate over existing order IDs to find the maximum order number
        for (Order order : allOrders) {
            String orderID = order.getOrderid();
            if (orderID != null && orderID.startsWith(prefix)) {
                try {
                    // Extract the number part and parse it
                    int orderNumber = Integer.parseInt(orderID.substring(prefix.length()));
                    // Update maxOrderNumber if the current order number is greater
                    maxOrderNumber = Math.max(maxOrderNumber, orderNumber);
                } catch (NumberFormatException e) {
                    // Handle the case where the order number is not a valid integer
                    e.printStackTrace();
                }
            }
        }

        // Increment the maximum order number and construct the new order ID
        int newOrderNumber = maxOrderNumber + 1;
        String newOrderID = prefix + newOrderNumber;

        return newOrderID;
    }
    
    
    public void WritePlaceOrder(String orderID, String cusID, String vendorID, String[] values) {
        // Create a new Review object with the provided values
        String orderidentification = generateOrderID();
        Order newOrder = new Order();
        
        // Generate a new orderID using the OrderIDGenerator
        
        newOrder.setOrderid(orderidentification);
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
    
    
    
}
