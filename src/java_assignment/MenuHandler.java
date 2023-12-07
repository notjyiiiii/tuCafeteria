package java_assignment;

import java.io.IOException;
import java.util.ArrayList;


public class MenuHandler extends BaseHandler<Menu>{

    public MenuHandler(String filePath, Class<Menu> clazz) throws IOException, ClassNotFoundException {
        super(filePath, clazz);
    }

    
    public ArrayList<Menu> GetVendorMenu(String vendorID)
    {
        ArrayList<Menu> vendorMenu = new ArrayList<Menu>();
        
        for(int i = 0; i<this.collection.size(); i++)
        {
            Menu menu = collection.get(i);
            
            if (menu.getUserid().equals(vendorID))
            {
                vendorMenu.add(menu);
            }
        }
        
        return vendorMenu;
    }
    
    
    
    
    public void updateItem(){
        
    }
    
    public void deleteItem(){
        
    }
    
    public void filterMenu(){
        
    }
      
    public void searchMenu(){
        
    }
}
