package java_assignment;

import java.util.ArrayList;
import java.io.*;
import java.time.LocalDateTime;
import java_assignment.Enums.*;

public class OrderMiddleManHandler extends BaseHandler<OrderMiddleMan> {
    
    private static ArrayList<OrderMiddleMan> allOrders = new ArrayList<>();
    
    public OrderMiddleManHandler(String filePath, Class<OrderMiddleMan> clazz) throws IOException, ClassNotFoundException{
        super("OrderMiddleMan", OrderMiddleMan.class);
        if (allOrders.isEmpty()) {
            allOrders.addAll(collection);
        }
    }
    
    public void clearOrderMiddleManFile() {
        String filePath = "OrderMiddleMan.txt"; // Update with your actual file path

        try {
            FileWriter fw = new FileWriter(filePath, false);
            PrintWriter pw = new PrintWriter(fw, false);
            pw.flush();
            pw.close();
            fw.close();
        } catch (Exception exception) {
            System.out.println("Exception has been caught");
        }
    }
    
    public ArrayList<OrderMiddleMan> GetCusOrderSummary(String cusID)
    {
        ArrayList<OrderMiddleMan> orderSummary = new ArrayList<OrderMiddleMan>();
        
        for(int i = 0; i<this.collection.size(); i++)
        {
            OrderMiddleMan summary = collection.get(i);
            
            if (summary.getCusID().equals(cusID))
            {
                orderSummary.add(summary);
            }
        }
        
        return orderSummary;
    }
    
    public ArrayList<OrderMiddleMan> GetOrderID(String orderID){
        ArrayList<OrderMiddleMan> orderSummary = new ArrayList<OrderMiddleMan>();
        
        for(int i = 0; i<this.collection.size(); i++)
        {
            OrderMiddleMan orderIDsummary = collection.get(i);
            
            if (orderIDsummary.getOrderIDforSummary().equals(orderID))
            {
                orderSummary.add(orderIDsummary);
            }
        }
        
        return orderSummary;
    }
    
    
        
    public void WriteOrderSummary(String orderIDforSummary, String cusID, String food, String foodPrice) {
        // Create a new Review object with the provided values
        OrderMiddleMan newOrder = new OrderMiddleMan();
        newOrder.setOrderIDforSummary(orderIDforSummary);
        newOrder.setCusID(cusID);
        newOrder.setFoodName(food);
        newOrder.setFoodPrice(foodPrice);
        // Add the new review to the collection
        collection.add(newOrder);

        try {
            // Save the updated collection to the file
            fileManager fm = new fileManager();
            String configVar = fm.getConfigVar(this.filePath, true);
            ArrayList<String[]> data = new ArrayList<>();
            
            // Convert the Review objects in the collection to String arrays
            for (OrderMiddleMan order : collection) {
                data.add(order.SerializeData());
            }
            
            // Update the file with the new data
            fm.updateFile(configVar, data);
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the IOException, you might want to throw a custom exception or log the error
        }
    }
    
    public ArrayList<OrderMiddleMan> getOrderSummaryByOrderID(String orderID) {
    ArrayList<OrderMiddleMan> orderSummaries = new ArrayList<>();

        for (OrderMiddleMan orderSummary : this.collection) {
            if (orderSummary.getOrderIDforSummary().equals(orderID)) {
                orderSummaries.add(orderSummary);
            }
        }

        return orderSummaries;
    }

    
//    public ArrayList<OrderSummary> GetOrderSummaryByOrderID(String orderID)
//    {
//        ArrayList<OrderSummary> orderSummary = new ArrayList<OrderSummary>();
//        
//        for(int i = 0; i<this.collection.size(); i++)
//        {
//            OrderSummary summary = collection.get(i);
//            
//            if (summary.getOrderIDforSummary().equals(orderID))
//            {
//                orderSummary.add(summary);
//            }
//        }
//        
//        return orderSummary;
//    }
//    
    
//    public ArrayList<OrderSummary> ReadOrderSummariesFromFile() {
//        // Load the collection from the file
//        fileManager fm = new fileManager(); // Handle the IOException, you might want to throw a custom exception or log the error
//        ArrayList<String[]> fileData = fm.readFile(this.filePath);
//        // Convert the String arrays from the file to OrderSummary objects
//        ArrayList<OrderSummary> loadedOrders = new ArrayList<>();
//        for (String[] rowData : fileData) {
//            OrderSummary orderSummary = new OrderSummary();
//            orderSummary.DeserializeData(rowData);
//            loadedOrders.add(orderSummary);
//        }
//        return loadedOrders;
//    }
//    
}
