package java_assignment;

import java.io.*;
import java.util.*;

public class Vendor extends Users implements IDataContainer, Serializable{

//    private double ratings; //might be another class
//    private int totalpratings; //might be another class
    
    private String operatingDays;
    private String operatingHours;
    
    public Vendor(){
        
    }
    
     public Vendor(String id, String pw){
        super(id, pw);
    }
    
     public Vendor(Users user){
         this.email = user.getEmail();
         this.username = user.getUsername();
     }
     
     
    //to update details ; but in the Vendor.txt; oh wait also need to update to User.txt also... so only User.txt? then if empty part put null?
    public void updateDetails(){
        
    }
    
    public void deleteDetails(){
        
    }
    
}
