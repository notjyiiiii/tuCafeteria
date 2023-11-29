package java_assignment;

import java.io.*;
import java.util.*;

public class Java_assignment {
    
//    public static Users currentUser;

    public static void main(String[] args) throws IOException {
        
//        currentUser = new Users();
        
        fileManager fm = new fileManager();
//        
     //  LogIn lg = new LogIn();
//        
        String key = "User_1";
//        String configVar = 
        String get = fm.getConfigVar(key, true);
//        ArrayList user = fm.readFile(configVar, key);
//        System.out.println(user);
//        System.out.println("------");
//        System.out.println(fm.readFile(configVar).get(2)[2]);
       // ArrayList<String[]> loginRecords = fm.readFile(configVar);
     //  fm.readFile(get);
     
     
//        ArrayList<String> data = new ArrayList<String>();
//        data.add("DR14");
//        data.add("DR14"); 
//        data.add("DR14");   
//        data.add("DR14");   
//        data.add("DR14");   
//        fm.writeFile(get, data);

        
        
//        ArrayList<String[]> data = fm.readFile(get);
//        for(String[] string : data)
//        {
//            for(String dataString : string)
//            {
//                System.out.println(dataString);
//
//            }
//        }

        MenuHandler menuHandler = new MenuHandler("Menu", Menu.class);
//        ArrayList<Menu> menuList = menuHandler.GetVendorMenu("VD001");

        // ArrayList<String[]> dataList = fm.readFile(get);
         // dataList.get(2)[1] = "nyanyaaaaaa";
         // fm.updateFile(get, dataList);
         
        // ArrayList<String> data = new ArrayList<String>();
//        data.add("DR14");
//        data.add("DR14"); 
//        data.add("DR14");   
//        data.add("DR14");   
//        data.add("DR14");   
//        fm.writeFile(get, data);
        String abc = "sdf";
    }
    
}
