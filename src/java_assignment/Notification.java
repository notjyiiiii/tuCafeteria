package java_assignment;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Notification implements IDataContainer, Serializable {
    
    private String notiID;
    private String senderID;
    private String recipientID;
    private String notiMessage;
    private LocalDateTime notiDateTime;
    private String notiStatus;
    
    public Notification(){
        
    }
    
    public Notification(String notiID, String senderID, String recipientID, String notiMessage, LocalDateTime notiDateTime, String notiStatus) {
        this.notiID = notiID;
        this.senderID = senderID;
        this.recipientID = recipientID;
        this.notiMessage = notiMessage;
        this.notiDateTime = notiDateTime;
        this.notiStatus = notiStatus;
    }

    public String getNotiStatus() {
        return notiStatus;
    }

    public void setNotiStatus(String notiStatus) {
        this.notiStatus = notiStatus;
    }

    public String getNotiID() {
        return notiID;
    }

    public void setNotiID(String notiID) {
        this.notiID = notiID;
    }

    public String getSenderID() {
        return senderID;
    }

    public void setSenderID(String senderID) {
        this.senderID = senderID;
    }

    public String getRecipientID() {
        return recipientID;
    }

    public void setRecipientID(String recipientID) {
        this.recipientID = recipientID;
    }

    public String getNotiMessage() {
        return notiMessage;
    }

    public void setNotiMessage(String notiMessage) {
        this.notiMessage = notiMessage;
    }

    public LocalDateTime getNotiDateTime() {
        return notiDateTime;
    }

    public void setNotiDateTime(LocalDateTime notiDateTime) {
        this.notiDateTime = notiDateTime;
    }

   
    
    
    
    @Override
    public String[] SerializeData() {
        
        String[] dataString = new String[6];
        dataString[0] = this.notiID;
        dataString[1] = this.senderID;
        dataString[2] = this.recipientID;
        dataString[3] = this.notiMessage;
        dataString[4] = this.notiDateTime.toString();
        dataString[5] = this.notiStatus;
        
        return dataString;
        
    }


    @Override
    public void DeserializeData(String[] dataArray) {
        
        this.notiID = dataArray[0];
        this.senderID = dataArray[1];
        this.recipientID = dataArray[2];
        this.notiMessage = dataArray[3];
        if (!dataArray[4].equals("NULL")) {
            this.notiDateTime = LocalDateTime.parse(dataArray[4]);
        } else {
        this.notiDateTime = null;  
        } 
        this.notiStatus = dataArray[5];
    }
    
    @Override
    public String toString() {
        // Return a string representation of the Order object in the desired format
        return this.getNotiID() + ";" +
               this.getSenderID() + ";" +
               this.getRecipientID()+ ";" +
               this.getNotiMessage()+ ";" +
               this.getNotiDateTime()+ ";" +
               this.getNotiStatus();
    }
    
}