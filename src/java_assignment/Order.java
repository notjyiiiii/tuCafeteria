package java_assignment;

import java.util.ArrayList;
import java.io.*;
import java.time.LocalDateTime;
import java_assignment.Enums.*;

public class Order implements IDataContainer, Serializable{

    private String orderid;
    private String customerid;
    private String vendorid;
    private OrderStatus orderStatus;
    private OrderType orderType;
    private LocalDateTime orderDateTime;
    private String deliveryLocation;
    private float orderAmount;
    private float deliveryFees;
    private float totalAmount;
//    private OrderItem[] orderList;
    
    
    public Order(){
        
    }

    public String[] SerializeData(){
        String [] dataString = new String[10];
        dataString[0] = this.orderid;
        dataString[1] = this.customerid;
        dataString[2] = this.vendorid;
        dataString[3] = this.orderStatus.toString();
        dataString[4] = this.orderType.toString();
        dataString[5] = this.orderDateTime.toString();
        dataString[6] = this.deliveryLocation;
        dataString[7] = Float.toString(this.orderAmount);
        dataString[8] = Float.toString(this.deliveryFees);
        dataString[9] = Float.toString(this.totalAmount);
        
        return dataString;
    }
    
    
    public void DeserializeData(String[] dataArray) {
    try {
        this.orderid = dataArray[0];
        this.customerid = dataArray[1];
        this.vendorid = dataArray[2];
        this.orderStatus = OrderStatus.valueOf(dataArray[3]);
        this.orderType = OrderType.valueOf(dataArray[4]);
        if (!dataArray[5].equals("NULL")) {
            this.orderDateTime = LocalDateTime.parse(dataArray[5]);
        } else {
        this.orderDateTime = null;  
        }
        this.deliveryLocation = dataArray[6];
        this.orderAmount = Float.parseFloat(dataArray[7]);
        this.deliveryFees = Float.parseFloat(dataArray[8]);
        this.totalAmount = Float.parseFloat(dataArray[9]);
    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
        System.err.println("Error while deserializing order data: " + e.getMessage());
    }
}
    
//    private OrderStatus mapOrderStatus(String status) {
//    try {
//        return OrderStatus.valueOf(status.toUpperCase());
//    } catch (IllegalArgumentException e) {
//        System.err.println("Invalid OrderStatus: " + status);
//        return OrderStatus.CANCELLED; 
//    }
//}
    
    
    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getVendorid() {
        return vendorid;
    }

    public void setVendorid(String vendorid) {
        this.vendorid = vendorid;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public LocalDateTime getOrderDateTime() {
        return orderDateTime;
    }

    public void setOrderDateTime(LocalDateTime orderDateTime) {
        this.orderDateTime = orderDateTime;
    }

    public String getDeliveryLocation() {
        return deliveryLocation;
    }

    public void setDeliveryLocation(String deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }

    public float getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(float orderAmount) {
        this.orderAmount = orderAmount;
    }

    public float getDeliveryFees() {
        return deliveryFees;
    }

    public void setDeliveryFees(float deliveryFees) {
        this.deliveryFees = deliveryFees;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        // Return a string representation of the Order object in the desired format
        return this.getOrderid() + ";" +
               this.getCustomerid() + ";" +
               this.getVendorid() + ";" +
               this.getOrderStatus() + ";" +
               this.getOrderType() + ";" +
               this.getOrderDateTime() + ";" +
               this.getDeliveryLocation() + ";" +
               this.getOrderAmount() + ";" +
               this.getDeliveryFees()+ ";" +
               this.getTotalAmount();
    }
}
