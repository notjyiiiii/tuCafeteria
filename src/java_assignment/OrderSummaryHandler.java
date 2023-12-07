package java_assignment;

import java.util.ArrayList;
import java.io.*;
import java.time.LocalDateTime;
import java_assignment.Enums.*;

public class OrderSummaryHandler extends BaseHandler<OrderSummary> {
    
    private static ArrayList<OrderSummary> allOrders = new ArrayList<>();
    
    public OrderSummaryHandler(String filePath, Class<OrderSummary> clazz) throws IOException, ClassNotFoundException{
        super("OrderSummary", OrderSummary.class);
        if (allOrders.isEmpty()) {
            allOrders.addAll(collection);
        }
    }
    
    public ArrayList<OrderSummary> GetCusOrderSummary(String cusID)
    {
        ArrayList<OrderSummary> orderSummary = new ArrayList<OrderSummary>();
        
        for(int i = 0; i<this.collection.size(); i++)
        {
            OrderSummary summary = collection.get(i);
            
            if (summary.getCusID().equals(cusID))
            {
                orderSummary.add(summary);
            }
        }
        
        return orderSummary;
    }
    
    public void WriteOrderSummary(String cusID, String food, String foodPrice) {
        // Create a new Review object with the provided values
        OrderSummary newOrder = new OrderSummary();
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
            for (OrderSummary order : collection) {
                data.add(order.SerializeData());
            }
            
            // Update the file with the new data
            fm.updateFile(configVar, data);
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the IOException, you might want to throw a custom exception or log the error
        }
    }
    
    
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
