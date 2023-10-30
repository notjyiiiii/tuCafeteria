package java_assignment;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Menu {
    
    private String itemid;
    private String itemName;
    private double itemPrice;
    private String itemDesc;
    private String userid;
    private String itemPic;
    private String itemType;
    private Vendor vendor;
    
    
    public Menu(Vendor v){
        this.vendor = v;
        this.userid = vendor.getUserid();
        getMenu();
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
    
    
    // to get the menu from the text file
    public void getMenu(){
        fileManager fm = new fileManager();
        String key = "Menu";
        String configVar = fm.getConfigVar(key, true);
        
        ArrayList<String[]> recordList = fm.readFile(configVar);
        
        
        
        for(int i = 0; i<recordList.size(); i++){
            if (recordList.get(i)[0].equals(userid)){
                LoadData(recordList.get(i));
            }
        }
        
    }
    
    private void LoadData(String[] dataArray){
        this.itemid = dataArray[1];
        this.itemDesc = dataArray[4];
        this.itemPic = dataArray[2];
        this.itemType = dataArray[5];
        this.itemName = dataArray [3];
        
        // Remove non-numeric characters and then parse the double ; 
        String itemPriceString = dataArray[6].replaceAll("[^0-9.]", "");
        this.itemPrice = Double.parseDouble(itemPriceString);
    }
    
    // don't know where i will use but just in case
    public String toString(){
		return String.format("%1s %-10s %1s  %-20s %1s  %.2f %1s ", "|",getItemName(),"|",getItemDesc(),"|",getItemPrice(),"|");
	}
    
    
    
    //for getting the next primary key ? ( itemID )
    public int getNextPK(){
        int nextItemID = Integer.parseInt(itemid) + 1;
        return nextItemID;
        
    }
    
    public void addItem(){
        
    }
    
    public void updatItem(){
        
    }
    
    public void deleteItem(){
        
    }
    
    public void filterMenu(){
        
    }
      
    public void searchMenu(){
        
    }
    
}
