package java_assignment;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Menu implements IDataContainer {
    
    private String itemid;
    private String itemName;
    private double itemPrice;
    private String itemDesc;
    private String userid;
    private String itemPic;
    private String itemType;
    
    public Menu()
    {
        itemid = "Empty Test";
    }
    
    public String getItemid() {
        return itemid;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public String getUserid() {
        return userid;
    }

    public String getItemPic() {
        return itemPic;
    }

    public String getItemType() {
        return itemType;
    }
    
    // don't know where i will use but just in case
    public String toString(){
		return String.format("%1s %-10s %1s  %-20s %1s  %.2f %1s ", "|",getItemName(),"|",getItemDesc(),"|",getItemPrice(),"|");
	}

    @Override
    public void SerializeData(String[] dataArray) {
        this.itemid = dataArray[1];
        this.itemDesc = dataArray[4];
        this.userid = dataArray[0];
        this.itemPic = dataArray[2];
        this.itemType = dataArray[5];
        this.itemName = dataArray [3];
        
        // Remove non-numeric characters and then parse the double ; 
//        String itemPriceString = dataArray[6].replaceAll("[^0-9.]", "");
        this.itemPrice = Double.parseDouble(dataArray[6]);
    }
    
    
}
