package java_assignment;

import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class Customer extends User implements IDataContainer, Serializable{
    //private double credit; 
    private String credit;
    
    public Customer(){}
    
    
    
    
    public Customer(User user){
        this.userid = user.getUserid();
        this.username = user.getUsername();
    }

//    public void setCredit(double credit) {
//        this.credit = credit;
//    }

    public void setCredit(String credit) {
        this.credit = credit;
    }
    
    public String getCredit() {
        return credit;
    }
    
    
    
    
    @Override
    public String[] SerializeData(){
        String[] dataString = new String[2];
        dataString[0] = this.userid;
        //dataString[1] = Double.toString(this.credit);
        dataString[1] = this.credit;
        
        return dataString;
    }
    
    @Override
    public void DeserializeData(String[] dataArray){
        this.userid = dataArray[0];
        //this.credit = Double.parseDouble(dataArray[1]);
        this.credit = dataArray[1];
    }
    
}

