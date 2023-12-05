package java_assignment;

import java.util.ArrayList;
import java.io.*;
import java.util.Date;

public class Order implements IDataContainer, Serializable{
    private String userid;
    private String orderStatus;
    private String orderType;
    private Date orderDate;
    private String orderLocation;
    private double orderAmt;
    private double deliveryFee;
    private double totalAmt;
    
    
    public Order(){
        
    }

    
    
    
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
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

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderLocation() {
        return orderLocation;
    }

    public void setOrderLocation(String orderLocation) {
        this.orderLocation = orderLocation;
    }

    public double getOrderAmt() {
        return orderAmt;
    }

    public void setOrderAmt(double orderAmt) {
        this.orderAmt = orderAmt;
    }

    public double getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public double getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(double totalAmt) {
        this.totalAmt = totalAmt;
    }
    
    
    
    
    
    
    
   
    
    public String[] SerializeData(){
        String [] dataString = new String[8];
        dataString[0] = this.userid;
        dataString[1] = this.orderStatus;
        dataString[2] = this.orderType;
        //dataString[3] = Date.toString(this.orderDate);
        dataString[4] = this.orderLocation;
        dataString[5] = Double.toString(this.orderAmt);
        dataString[6] = Double.toString(this.deliveryFee);
        dataString[7] = Double.toString(this.totalAmt);
        
        return dataString;
    }
    
    
    public void DeserializeData(String[] dataArray){
        this.userid = dataArray[0];
        this.orderStatus = dataArray[1];
        this.orderType = dataArray[2];
       //this.orderDate = Date.parse(dataArray[3]);
       this.orderLocation = dataArray[4];
       this.orderAmt = Double.parseDouble(dataArray[5]);
       this.deliveryFee = Double.parseDouble(dataArray[6]);
       this.totalAmt = Double.parseDouble(dataArray[7]);
       
    }
    
    
}
