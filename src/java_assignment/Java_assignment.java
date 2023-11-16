package java_assignment;

import java.io.*;
import java.util.*;

public class Java_assignment {
    
//    public static Users currentUser;

    public static void main(String[] args) throws IOException {
        
//        currentUser = new Users();
        
        fileManager fm = new fileManager();
//        
        LogIn lg = new LogIn();
//        
        String key = "User";
//        String configVar = 
        String haha = fm.getConfigVar(key, true);
//        ArrayList user = fm.readFile(configVar, key);
//        System.out.println(user);
//        System.out.println("------");
//        System.out.println(fm.readFile(configVar).get(2)[2]);
       // ArrayList<String[]> loginRecords = fm.readFile(configVar);
       fm.readFile(haha);
        

        
    }
    
}
