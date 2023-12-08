package java_assignment;

import java.io.*;
import java.util.ArrayList;
import java.util.stream.Collectors;
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
        String[] dayStringArr = dayString.split(",");
        ArrayList<OperatingDay> dayArr = new ArrayList<>();

        for (String day : dayStringArr) {
            dayArr.add(OperatingDay.valueOf(day));
        }

        return dayArr;
    }
    
    public String SerializeOperatingDay()
    {
        return operatingDays.stream()
            .map(OperatingDay::toString)
            .collect(Collectors.joining(","));
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

   @Override
    public String toString() {
        // Format the OperatingDays as a comma-separated string without square brackets
        String operatingDaysString = this.getOperatingDays().stream()
                .map(OperatingDay::toString)
                .collect(Collectors.joining(";"));

        

        // Return the formatted string
        return this.getVendorid() + ";" +
                this.getVendorName() + ";" +
                operatingDaysString + ";" +
                this.getOperatingHours();
    }
    
    
}
