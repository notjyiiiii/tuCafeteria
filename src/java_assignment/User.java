package java_assignment;

import java.util.ArrayList;
import java.io.*;
import java.util.*;



public class User implements IDataContainer{
    
    protected String userid;
    protected String username;
    protected String email;
    protected String hpnum;
    protected String password; 
    protected String role; 
    
    // Interface Methods
    public String[] SerializeData(){
        String[] dataString = new String[6];
        dataString[0] = this.userid;
        dataString[1] = this.username;
        dataString[2] = this.email;
        dataString[3] = this.hpnum;
        dataString[4] = this.password;
        dataString[5] = this.role;
        
        return dataString;
    }
    
    public void DeserializeData(String[] dataArray){
        this.userid = dataArray[0];
        this.username = dataArray[1];
        this.email = dataArray[2];
        this.hpnum = dataArray[3];
        this.password = dataArray[4];
        this.role = dataArray[5];
    }
    
    
    
    // Getters and setters
    
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHpnum() {
        return hpnum;
    }

    public void setHpnum(String hpnum) {
        this.hpnum = hpnum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    // Variables
    public void setRole(String role) {
        this.role = role;
    }
    
    
    //to get user details
//    public boolean checkIdPass(){
//        fileManager fm = new fileManager();
//        String key = "User";
//        String configVar = fm.getConfigVar(key, true);
//        ArrayList<String[]> recordList = fm.readFile(configVar);
//        
//        //check userid and password
//        for(int i = 0; i<recordList.size(); i++){
//            if (recordList.get(i)[0].equals(userid) && recordList.get(i)[4].equals(password)){
//                DeserializeData(recordList.get(i));
//                return true;
//            }
//        }
//        
//        return false;
//    }
    
    //put the data into the variables
//    private void LoadData(String[] dataArray)
//    {
//        this.username = dataArray[1];
//        this.password = dataArray[4];
//        this.email = dataArray[2];
//        this.role = dataArray[5];
//        this.hpnum = dataArray [3];
//    }    
//    
//    //check if the text fields is empty or not because kudo says so
//    public boolean checkIfExist(){
//        if(userid == null || userid.length() == 0 || password == null || password.length() == 0){
//            return false;
//        }
//        return true;
//    }
    
//    public boolean writeDetails(){ //not done
//        fileManager fm = new fileManager();
//        String key = "User";
//        String configVar = fm.getConfigVar(key, true);
//        ArrayList<String[]> recordList = fm.readFile(configVar);
//        
//        //check userid and password
//        for(int i = 0; i<recordList.size(); i++){
//            if (recordList.get(i)[0].equals(userid) && recordList.get(i)[4].equals(password)){
//                LoadData(recordList.get(i));
//                return true;
//            }
//        }
//        
//        return false;
//    }

    
}
