package java_assignment;

import java.io.IOException;
import java.lang.System.Logger;
import java.util.ArrayList;
import java_assignment.Enums.OperatingDay;

public class VendorHandler extends BaseHandler<Vendor>{

    public VendorHandler() throws IOException, ClassNotFoundException
    {
        super("Vendor");
        
        UserHandler userHandler = new UserHandler("User", User.class);
        collection = this.LoadCollection("Vendor", Vendor.class);
        
        
    }
    
    public Vendor GetVendorByVendorID(String vendorid)
    {
        for (int i = 0; i<collection.size(); i++)
        {
            if (collection.get(i).getVendorid().equals(vendorid))
            {
                return collection.get(i);
            }
        }
        
        return null;
    }
    
    public Vendor GetVendorByVendorName(String name)
    {
        for (int i = 0; i<collection.size(); i++)
        {
            if (collection.get(i).getVendorName().equals(name))
            {
                return collection.get(i);
            }
        }
        
        return null;
    }
    
    
    public void updateOperatingDays(String vendorid, ArrayList<OperatingDay> newOperatingDays) {
        Vendor vendorToUpdate = GetVendorByVendorID(vendorid);
        if (vendorToUpdate != null) {
            vendorToUpdate.setOperatingDays(newOperatingDays);
            this.SaveCollection();
        } else {
            System.out.println("Vendor not found with ID: " + vendorid);
        }
    }
    
}
