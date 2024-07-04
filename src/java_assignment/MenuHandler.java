package java_assignment;

import java.io.IOException;
import java.util.ArrayList;


public class MenuHandler extends BaseHandler<Menu>{
    
    private ArrayList<Menu> menu;

    public MenuHandler(String filePath, Class<Menu> clazz) throws IOException, ClassNotFoundException {
        super(filePath, clazz);
    }

    
    public ArrayList<Menu> GetVendorMenu(String vendorID)
    {
        ArrayList<Menu> vendorMenu = new ArrayList<Menu>();
        System.out.println(vendorMenu);
        
        for(int i = 0; i<this.collection.size(); i++)
        {
            Menu menu = collection.get(i);

            if (menu.getUserid().equals(vendorID))
            {
                vendorMenu.add(menu);
                        System.out.println(menu);
            }
        }
        this.menu = vendorMenu;
        return vendorMenu;

    }
    
    
    public int GetTotalMenusForVendor() {
        if (menu != null) {
            return menu.size();
        } else {
            return 0;
        }
    }
    
    
    public Menu GeMenuByItemID(String itemID)
    {
        for (int i = 0; i<collection.size(); i++)
        {
            if (collection.get(i).getItemid().equals(itemID))
            {
                return collection.get(i);
            }
        }
        
        return null;
    }
}
