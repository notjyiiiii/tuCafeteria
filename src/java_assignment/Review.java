package java_assignment;

import java.util.ArrayList;
import java.io.*;
import java.time.LocalDateTime;
import java_assignment.Enums.*;

public class Review implements IDataContainer, Serializable{
    private String VendorID;
    private String CustomerName;
    private String Review;
    private String rating;

    public Review(){}
    
    public String getVendorID() {
        return VendorID;
    }

    public void setVendorID(String VendorID) {
        this.VendorID = VendorID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getReview() {
        return Review;
    }

    public void setReview(String Review) {
        this.Review = Review;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
    

    public String[] SerializeData(){
        String [] dataString = new String[4];
        dataString[0] = this.VendorID;
        dataString[1] = this.CustomerName;
        dataString[2] = this.Review;
        dataString[3] = this.rating;
        
        return dataString;
    }
    
    public void DeserializeData(String[] dataArray){
        this.VendorID = dataArray[0];
        this.CustomerName = dataArray[1];
        this.Review = dataArray[2];
        this.rating = dataArray[3];
    }
    
}

