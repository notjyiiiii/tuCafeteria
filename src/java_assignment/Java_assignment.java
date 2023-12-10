package java_assignment;

import java.io.*;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Java_assignment {
    
    public static User LoggedInUser = null;

    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        fileManager fm = new fileManager();
        LogIn lg = new LogIn();

    }

}



//       float incomeForToday = oh.CalculateTotalIncomeForToday(Java_assignment.LoggedInUser.userid);
//       System.out.println("Total Income for Today: " + incomeForToday);
//       String userID = "VD001";
//       OrderHandler oh = new OrderHandler();
//       System.out.println(oh.CalculateTotalIncome(userID));
//        
       // String key = "Menu";
//        String configVar = 
//        String get = fm.getConfigVar(key, true);
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
// VD001;MD021;null;TomYum Soup;Thai cooked soup spicy and hot;Main Dish;12.00null;MD022;null;null;null;null;0.0;
//        MenuHandler menuHandler = new MenuHandler("Menu", Menu.class);
//        ArrayList<Menu> menuList = menuHandler.GetVendorMenu("VD001");
//        System.out.print(menuList);
//        Menu menu = new Menu();
//       menu.setUserid("VD001");
//        menu.setItemid("MD022");
//        menu.setItemPic("null");
//        menu.setItemPrice(8);
//        menu.setItemType("Main Dish");
//        menu.setItemName("Tom Yam Soup");
//        menu.setItemDesc("Spicy and Sour soup made in Thailand");
//        menuHandler.AddNewItem(menu);
////        
////        
//        Menu abs = menuList.get(0);
//        
//        //System.out.print(abs);
//        System.out.println(abs.getItemName()+"\n");
//        System.out.println(menuList);

//        ArrayList<String[]> data = fm.readFile(get);
//        for(String[] string : data)
//        {
//            for(String dataString : string)
//            {
//                System.out.println(dataString);
//
//            }
//        }

//        MenuHandler mh = new MenuHandler("Menu", Menu.class);
//        ArrayList<Menu> menu = mh.GetVendorMenu("VD001");
//        Menu del = menu.get(0);
//        mh.DeleteItem(del);
//        System.out.println(del);

//        del.setItemDesc("Fat ric ony mah");
//        mh.UpdateItem(del,del);


        

//
//        MenuHandler menuHandler = new MenuHandler("Menu", Menu.class);
//        ArrayList<Menu> menuList = menuHandler.GetVendorMenu("VD001");
//
//        Menu menu1 = new Menu();
//        menu1.setItemName("hhuhushdushduhuhus");
//
//        // Assuming you want to update the first item in menuList
//        Menu existingMenu = menuList.get(0);
//
//        // Update the item in the collection and the file
//        menuHandler.UpdateItem(existingMenu, menu1);
//        

//        MenuHandler menuHandler = new MenuHandler("Menu", Menu.class);
//        ArrayList<Menu> menuList = menuHandler.GetVendorMenu("VD001");
//        Menu menu = new Menu();
//        menu.SetItemid("MD022");
//        menu.Setuserid("VD001");
//        menuHandler.AddNewItem(menu);
//        MenuHandler menuHandler = new MenuHandler("ObjUser", Menu.class);
//        ArrayList<Menu> menuList = menuHandler.GetVendorMenu("VD001");
//        Menu menu = new Menu();
//        menu.SetItemid("MD022");
//        menu.Setuserid("VD001");
//        menuList.add(menu);
//        menuHandler.AddNewObjItem(menu);
        
        //menuHandler.AddNewObjItem(menu);
        
//        MenuHandler menuHandler = new MenuHandler("ObjUser", Menu.class);
//        ArrayList<Menu> menuList = menuHandler.GetVendorMenu("VD001");
//        Menu menu = new Menu();
//        System.out.println(menu.getUserid());
        

//        MenuHandler menuHandler = new MenuHandler("ObjUser", Menu.class);
//        ArrayList<Menu> menuList = menuHandler.GetVendorMenu("VD001");
//
//        if (!menuList.isEmpty()) {
//            Menu menu = menuList.get(0); // Assuming at least one menu item is in the list
//            System.out.println(menu.getUserid());
//        }
//        else{
//            System.out.println("Die! Die! DIE!");
//        }
    //if hard code then can lah r
       // fm.readObjFile(get);
        

        // ArrayList<String[]> dataList = fm.readFile(get);
         // dataList.get(2)[1] = "nyanyaaaaaa";
         // fm.updateFile(get, dataList);
         
//        ArrayList<String> data = new ArrayList<String>();
//        data.add("DR14");  
//        fm.writeFile(get, data);
        //String abc = "sdf";
        
        

        
//        CustomerHandler customerHandler = new CustomerHandler("Customer", Customer.class);
//        ArrayList<Customer> customer = customerHandler.GetCustomer("CS006");
//        Customer cs = customer.get(0);
//        Customer getCredit = credit.get(1);
//        System.out.println(getCredit);
//        
//        MenuHandler mh = new MenuHandler("Menu", Menu.class);
//        ArrayList<Menu> menuList = mh.GetVendorMenu("VD001");
//        Menu abs = menuList.get(3);
//        
//        //System.out.print(abs);
//        System.out.println(abs.getItemName());
//        System.out.println(abs.getItemPrice());
        
        
