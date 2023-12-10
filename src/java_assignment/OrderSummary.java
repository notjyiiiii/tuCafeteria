package java_assignment;

import java.util.ArrayList;
import java.io.*;
import java.time.LocalDateTime;
import java_assignment.Enums.*;

public class OrderSummary implements IDataContainer, Serializable{
    
    private String orderIDforSummary;
    private String cusID;
    private String foodName;
    private String foodPrice;

    public String getOrderIDforSummary() {
        return orderIDforSummary;
    }

    public void setOrderIDforSummary(String orderIDforSummary) {
        this.orderIDforSummary = orderIDforSummary;
    }
    
    public OrderSummary(){}

    public String getCusID() {
        return cusID;
    }

    public void setCusID(String cusID) {
        this.cusID = cusID;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(String foodPrice) {
        this.foodPrice = foodPrice;
    }
    
    
    
    public String[] SerializeData(){
        String [] dataString = new String[4];
        dataString[0] = this.orderIDforSummary;
        dataString[1] = this.cusID;
        dataString[2] = this.foodName;
        dataString[3] = this.foodPrice;
        
            return dataString;
    }
    
    public void DeserializeData(String[] dataArray){
        this.orderIDforSummary = dataArray[0];
        this.cusID = dataArray[1];
        this.foodName = dataArray[2];
        this.foodPrice = dataArray[3];
    }
    
    public String toString() {
        // Return a string representation of the Order object in the desired format
    return this.getOrderIDforSummary() + ";" + 
            this.getCusID() + ";" +
            this.getFoodName() + "'" +
            this.getFoodPrice();
            
    }
    
}
