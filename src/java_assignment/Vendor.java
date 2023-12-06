package java_assignment;

import java.io.*;
import java.util.ArrayList;
import java_assignment.Enums.OperatingDay;

public class Vendor extends User implements IDataContainer, Serializable{

    private OperatingDay[] operatingDays;
    
    // Interface Methods
    
    public OperatingDay[] DeserializeOperatingDay(String dayString)
    {
        String[] dayStringArr = dayString.strip().split(",");
        ArrayList<OperatingDay> dayArr = new ArrayList<OperatingDay>();
        
        for (int i = 0; i < dayStringArr.length; i++)
        {
            dayArr.add(OperatingDay.valueOf(dayStringArr[i]));
        }
        
        return (OperatingDay[]) dayArr.toArray();
    }
    
    public String SerializeOperatingDay()
    {
        String dayString = "";
        
        for (int i = 0; i < operatingDays.length; i++)
        {
            dayString += operatingDays[i].toString();
        }  
        return dayString;
    }
    
    
    @Override
     public String[] SerializeData(){
        String[] dataString = new String[6];
        dataString[0] = this.userid;
        dataString[1] = this.username;
        dataString[2] = this.email;
        dataString[3] = this.hpnum;
        dataString[4] = this.password;
        dataString[5] = this.role;
        dataString[6] = this.SerializeOperatingDay();
        
        return dataString;
    }
    
    @Override
    public void DeserializeData(String[] dataArray){
        super.DeserializeData(dataArray);
//        UserHandler userHandler = new UserHandler();

        this.operatingDays = DeserializeOperatingDay(dataArray[6]);
    }
//    private double ratings; //might be another class
//    private int totalpratings; //might be another class
  
     
    
}
