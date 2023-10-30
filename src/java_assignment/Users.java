package java_assignment;

import java.awt.*;
import java.util.*;
import javax.swing.*;



public class Users {
    
    //declaration
    protected String password;
    protected String userid;
    protected String username;
    protected String email;
    protected String role;
    protected String hpnum;
    protected boolean valid = false;
    
    //getter & setter

    public String getPassword() {
        return password;
    }

    public String getUserid() {
        return userid;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }
    
    public String getHP() {
        return hpnum;
    }
    
    
    
    //empty constructor because why not
    public Users(){
        
    }
    
    
    //constructor with parameters
    public Users(String id, String pw){
        this.userid = id;
        this.password = pw;
        valid = getDetails();
    }
    
    
    
    
    //to get user details
    public boolean getDetails(){
        if(checkIfExist() == false){
            return false;
        }
        fileManager fm = new fileManager();
        String key = "User";
        String configVar = fm.getConfigVar(key, true);
        ArrayList<String[]> recordList = fm.readFile(configVar);
        
        //check userid and password
        for(int i = 0; i<recordList.size(); i++){
            if (recordList.get(i)[0].equals(userid) && recordList.get(i)[4].equals(password)){
                LoadData(recordList.get(i));
                return true;
            }
        }
        
        return false;
    }
    
    //put the data into the variables
    private void LoadData(String[] dataArray)
    {
        this.username = dataArray[1];
        this.password = dataArray[4];
        this.email = dataArray[2];
        this.role = dataArray[5];
        this.hpnum = dataArray [3];
    }    
    
    //check if the text fields is empty or not because kudo says so
    public boolean checkIfExist(){
        if(userid == null || userid.length() == 0 || password == null || password.length() == 0){
            return false;
        }
        return true;
    }
}
