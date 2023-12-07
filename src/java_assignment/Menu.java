package java_assignment;

import java.io.*;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class Menu implements IDataContainer, Serializable {
    
    private String itemid;
    private String itemName;
    private double itemPrice;
    private String itemDesc;
    private String userid;
    private String itemPic;
    private String itemType;
    
    public Menu()
    {
       // itemid = "Empty Test";
    }

//    public static ArrayList<Menu> readMenuDataFromFile(String filePath) {
//        ArrayList<Menu> menuList = new ArrayList<>();
//
//        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                String[] data = line.split(";");
//
//                Menu menu = new Menu();
//                menu.setUserid(data[0]);
//                menu.setItemid(data[1]);
//                menu.setItemPic(data[2]);
//                menu.setItemName(data[3]);
//                menu.setItemDesc(data[4]);
//                menu.setItemType(data[5]);
//                menu.setItemPrice(Double.parseDouble(data[6]));
//
//                menuList.add(menu);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return menuList;
//    }
    // No setters here

    /**
     *
     * @return
     */
    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getItemPic() {
        return itemPic;
    }

    public void setItemPic(String itemPic) {
        this.itemPic = itemPic;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
    
   
    // don't know where i will use but just in case
    public String toString(){
		return getUserid()+";"+getItemid()+";"+getItemPic()+";"+getItemName()+";"+getItemDesc()+";"+getItemPrice();
	}
    
    @Override
    public String[] SerializeData() {
        String[] dataString = new String[7];
        dataString[0] = this.userid;
        dataString[1] = this.itemid;
        dataString[2] = this.itemPic;
        dataString[3] = this.itemName;
        dataString[4] = this.itemDesc;
        dataString[5] = this.itemType;
        dataString[6] = Double.toString(this.itemPrice);
        
        return dataString;
        
    }

    @Override
    public void DeserializeData(String[] dataArray) {
        this.userid = dataArray[0];
        this.itemid = dataArray[1];
        this.itemPic = dataArray[2];
        this.itemName = dataArray[3];
        this.itemDesc = dataArray[4];
        this.itemType = dataArray[5];
        
//         Remove non-numeric characters and then parse the double ; 
              //  String itemPriceString = dataArray[6].replaceAll("[^0-9.]", "");
//        this.itemPrice = Double.parseDouble(dataArray[6]);  
       // this.itemPrice = Double.parseDouble(itemPriceString);
    }
    
}
