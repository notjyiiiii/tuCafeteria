package java_assignment;

import java.io.*;
import java.util.ArrayList;
import java_assignment.Enums.OperatingDay;


// Note: No longer extending from User. User info all saved to Java_assignment static var
public class Vendor implements IDataContainer, Serializable{

    private String vendorid;
    private String vendorName;
    private ArrayList<OperatingDay> operatingDays;
    private String operatingHours;
    
    // Interface Methods
    
    public ArrayList<OperatingDay> DeserializeOperatingDay(String dayString)
    {
        String[] dayStringArr = dayString.strip().split(",");
        ArrayList<OperatingDay> dayArr = new ArrayList<OperatingDay>();
        
        for (int i = 0; i < dayStringArr.length; i++)
        {
            dayArr.add(OperatingDay.valueOf(dayStringArr[i]));
        }
        
        return dayArr;
    }
    
    public String SerializeOperatingDay()
    {
        String dayString = "";
        
        for (int i = 0; i < operatingDays.size(); i++)
        {
            dayString += operatingDays.get(i).toString();
        }  
        return dayString;
    }
    
    
    @Override
     public String[] SerializeData(){
        String[] dataString = new String[4];
        dataString[0] = this.vendorid;
        dataString[1] = this.vendorName;
        dataString[2] = SerializeOperatingDay();
        dataString[3] = this.operatingHours;
        
        return dataString;
    }
    
    @Override
    public void DeserializeData(String[] dataArray){
//        UserHandler userHandler = new UserHandler();
        this.vendorid = dataArray[0];
        this.vendorName = dataArray[1];
        this.operatingDays = DeserializeOperatingDay(dataArray[2]);
        this.operatingHours = dataArray[3];
    }
//    private double ratings; //might be another class
//    private int totalpratings; //might be another class
  
     
    public String getVendorid() {
        return vendorid;
    }

    public void setVendorid(String vendorid) {
        this.vendorid = vendorid;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public ArrayList<OperatingDay> getOperatingDays() {
        return operatingDays;
    }

    public void setOperatingDays(ArrayList<OperatingDay> operatingDays) {
        this.operatingDays = operatingDays;
    }

    public String getOperatingHours() {
        return operatingHours;
    }

    public void setOperatingHours(String operatingHours) {
        this.operatingHours = operatingHours;
    }

    
}
