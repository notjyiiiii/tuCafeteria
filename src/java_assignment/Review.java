package java_assignment;


import java.util.ArrayList;
import java.io.*;
import java.time.LocalDateTime;
import java_assignment.Enums.*;


public class Review implements IDataContainer, Serializable{
    private String OrderID;
    private String VendorID;
    private String CustomerName;
    private String Review;
    private String Rating;
    private LocalDateTime ReviewDateTime;

    public Review(){}
    
    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    public LocalDateTime getReviewDateTime() {
        return ReviewDateTime;
    }

    public void setReviewDateTime(LocalDateTime ReviewDateTime) {
        this.ReviewDateTime = ReviewDateTime;
    }
    
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
        return Rating;
    }

    public void setRating(String Rating) {
        this.Rating = Rating;
    }
    public String[] SerializeData(){
        String [] dataString = new String[4];
        dataString[0] = this.VendorID;
        dataString[1] = this.CustomerName;
        dataString[2] = this.Review;
        dataString[3] = this.Rating;
        
        return dataString;
    }
    
    public void DeserializeData(String[] dataArray){
        this.VendorID = dataArray[0];
        this.CustomerName = dataArray[1];
        this.Review = dataArray[2];
        this.Rating = dataArray[3];
    }

//    public String[] SerializeData(){
//        String [] dataString = new String[5];
//        dataString[0] = this.OrderID;
//        dataString[1] = this.VendorID;
//        dataString[2] = this.CustomerName;
//        dataString[3] = this.Rating;
//        dataString[4] = this.Review;
//        dataString[5] = this.ReviewDateTime.toString();
//        return dataString;
//    }
//    
//    public void DeserializeData(String[] dataArray){
//        
//        try{
//            this.OrderID = dataArray[0];
//            this.VendorID = dataArray[1];
//            this.CustomerName = dataArray[2];
//            this.Rating = dataArray[3];
//            this.Review = dataArray[4];
//            if (!dataArray[5].equals("NULL")) {
//                this.ReviewDateTime = LocalDateTime.parse(dataArray[5]);
//                } else {
//                this.ReviewDateTime = null;  
//                }
//        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
//            System.err.println("Error while deserializing ReviewDateTime: " + e.getMessage());
//        }
//    }
    
}



   
 
    



