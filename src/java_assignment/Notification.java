package java_assignment;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;

public class Notification implements IDataContainer, Serializable {
    
    private String notiID;
    private String senderID;
    private String recipientID;
    private String notiMessage;
    private LocalDate notiDate;
    private LocalTime notiTime;
    private String date;
    
    public Notification(){
        
    }
    
    @Override
    public String[] SerializeData() {
        
        DateFormat df = new SimpleDateFormat(date);
        
        String[] dataString = new String[7];
        dataString[0] = this.notiID;
        dataString[1] = this.senderID;
        dataString[2] = this.recipientID;
        dataString[3] = this.notiMessage;
        dataString[4] = df.format(this.notiDate);
        dataString[5] = df.format(this.notiTime);
        
        return dataString;
        
    }


    @Override
    public void DeserializeData(String[] dataArray) {
        DateFormat df = new SimpleDateFormat(date);
        
        this.notiID = dataArray[0];
        this.senderID = dataArray[1];
        this.recipientID = dataArray[2];
        this.notiMessage = dataArray[3];
        this.notiDate = LocalDate.parse(dataArray[4]);
        this.notiTime = LocalTime.parse(dataArray[6]);    
    }
    
}
