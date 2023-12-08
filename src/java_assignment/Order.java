package java_assignment;

import java.util.ArrayList;
import java.io.*;
import java.time.LocalDateTime;
import java_assignment.Enums.*;

public class Order implements IDataContainer, Serializable{

    private String orderid;
    private String customerid;
    private String vendorid;
    private String orderStatus;
    private String orderType;
    //private LocalDateTime orderDateTime;
    private String deliveryLocation;
    private double orderAmount;
    private double deliveryFees;
    private double totalAmount;
//    private OrderItem[] orderList;
    
    
    public Order(){
        
    }

    public String[] SerializeData(){

        String [] dataString = new String[9];
        dataString[0] = this.orderid;
        dataString[1] = this.customerid;
        dataString[2] = this.vendorid;
        dataString[3] = this.orderStatus;
        dataString[4] = this.orderType;
        dataString[5] = this.deliveryLocation;
        dataString[6] = Double.toString(this.orderAmount);
        dataString[7] = Double.toString(this.deliveryFees);
        dataString[8] = Double.toString(this.totalAmount)   ;
        
//        String [] dataString = new String[11];
//        dataString[0] = this.orderid;
//        dataString[1] = this.customerid;
//        dataString[2] = this.vendorid;
//        dataString[3] = this.orderStatus;
//        dataString[4] = this.orderType;
//        dataString[5] = this.orderDateTime.toString();
//        dataString[6] = this.deliveryLocation;
//        dataString[7] = Double.toString(this.orderAmount);
//        dataString[8] = Double.toString(this.deliveryFees);
//        dataString[9] = Double.toString(this.totalAmount);
        
        
        
        return dataString;
    }
    
    
    public void DeserializeData(String[] dataArray){

//        this.orderid = dataArray[0];
//        this.customerid = dataArray[1];
//        this.vendorid = dataArray[2];
//        this.orderStatus = dataArray[3];
//        this.orderType = dataArray[4];
//        this.deliveryLocation = dataArray[5];
//        this.orderAmount = Double.parseDouble(dataArray[6]);
//        this.deliveryFees = Double.parseDouble(dataArray[7]);
//        this.totalAmount = Double.parseDouble(dataArray[8]);
        if (dataArray.length == 9) {
            this.orderid = dataArray[0];
            this.customerid = dataArray[1];
            this.vendorid = dataArray[2];
            this.orderStatus = dataArray[3];
            this.orderType = dataArray[4];
            this.deliveryLocation = dataArray[5];
            this.orderAmount = Double.parseDouble(dataArray[6]);
            this.deliveryFees = Double.parseDouble(dataArray[7]);
            this.totalAmount = Double.parseDouble(dataArray[8]);
        } else {
            // Handle the case where the array doesn't have the expected length
            // For example, log an error or throw an exception
            System.err.println("Error: Invalid array length");
        }
        
        
//        this.orderid = dataArray[0];
//        this.customerid = dataArray[1];
//        this.vendorid = dataArray[2];
//        this.orderStatus = dataArray[3];
//        this.orderType = dataArray[4];
//        this.orderDateTime = LocalDateTime.parse(dataArray[5]);
//        this.deliveryLocation = dataArray[6];
//        this.orderAmount = Double.parseDouble(dataArray[7]);
//        this.deliveryFees = Double.parseDouble(dataArray[8]);
//        this.totalAmount = Double.parseDouble(dataArray[9]);
       
    }
    
    
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

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

//    public LocalDateTime getOrderDateTime() {
//        return orderDateTime;
//    }
//
//    public void setOrderDateTime(LocalDateTime orderDateTime) {
//        this.orderDateTime = orderDateTime;
//    }

    public String getDeliveryLocation() {
        return deliveryLocation;
    }

    public void setDeliveryLocation(String deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public double getDeliveryFees() {
        return deliveryFees;
    }

    public void setDeliveryFees(double deliveryFees) {
        this.deliveryFees = deliveryFees;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

}
