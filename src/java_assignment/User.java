//IGNORE THIS CLASS!!!
package java_assignment;

import java.awt.Window;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class User {
    
    //declaration
    private String password;
    private String userid;

    
    //getter & setter
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
    
    
    //empty constructor because why not
    public User(){
        
    }
    
    
    //constructor with parameters
    public User(String id, String pw){
        this.userid = id;
        this.password = pw;
    }
    
    
    //log in function
    public void logIn(Window currentWindow){
        
//        checkIfExist();
        if(checkIfExist() == true){
            fileManager fm = new fileManager();
            String key = "User";
            String configVar = fm.getConfigVar(key, true);
//            fm.readFile(configVar);
            ArrayList<String[]> recordList = fm.readFile(configVar);
            boolean successLogin = false;
            String[] userDetail = new String[0]; //why 0 though : cos he wants empty array
            for(String[] record: recordList){
                
                if (record[0].equals(userid) && record[4].equals(password)){
                    successLogin = true;
                    userDetail = record;
                    break;
                }
            }
            
            if (successLogin == true){
                if (userDetail[5].equals("Vendor")){
//                    currentWindow.dispose(); //so... kudo say i stupid.. so i will try use his way
//                    VendorMenuPage vmenup = new VendorMenuPage();
//                    vmenup.setVisible(true);
                } else {
                    VendorRegister vr = new VendorRegister();
                    vr.setVisible(true);
                }
            }
                    
                    
        } else {
            
        }
        
    }
    
    
    //check if the text fields is empty or not because kudo says so
    public boolean checkIfExist(){
        
        boolean x;
        if(password.isEmpty() || userid.isEmpty()){
            int a = JOptionPane.showConfirmDialog(null, "Please enter valid UserID and Password.","Error", JOptionPane.OK_OPTION);
            x = false;
            System.out.println(a);
        }
        return true;
    }
}
