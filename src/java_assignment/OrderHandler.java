package java_assignment;

import java.util.*;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

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
    
}
