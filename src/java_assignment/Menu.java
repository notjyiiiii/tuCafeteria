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
    
    // No setters here
    
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
    
    public void SetItemid(String itemid)
    {
        this.itemid = itemid;
    }
    
    // don't know where i will use but just in case
    public String toString(){
		return String.format("%1s %-10s %1s  %-20s %1s  %.2f %1s ", "|",getItemName(),"|",getItemDesc(),"|",getItemPrice(),"|");
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
        
        // Remove non-numeric characters and then parse the double ; 
        //        String itemPriceString = dataArray[6].replaceAll("[^0-9.]", "");
        this.itemPrice = Double.parseDouble(dataArray[6]);    
    }
    
}
