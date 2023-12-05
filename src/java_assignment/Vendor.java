package java_assignment;

import java.io.*;
import java_assignment.Enums.OperatingDay;

public class Vendor extends User implements IDataContainer, Serializable{

    private OperatingDay[] operatingDays;
    
    // Interface Methods
    
    @Override
    public String[] SerializeData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void DeserializeData(String[] dataArray) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

//    private double ratings; //might be another class
//    private int totalpratings; //might be another class
  
     
    
}
