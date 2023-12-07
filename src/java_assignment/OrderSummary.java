package java_assignment;

import java.util.ArrayList;
import java.io.*;
import java.time.LocalDateTime;
import java_assignment.Enums.*;

public class OrderSummary implements IDataContainer, Serializable{
    
    private String cusID;
    private String foodName;
    private String foodPrice;
    
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
        String [] dataString = new String[3];
        dataString[0] = this.cusID;
        dataString[1] = this.foodName;
        dataString[2] = this.foodPrice;
        
            return dataString;
    }
    
    public void DeserializeData(String[] dataArray){
        this.cusID = dataArray[0];
        this.foodName = dataArray[1];
        this.foodPrice = dataArray[2];
    }
}
