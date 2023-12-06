package java_assignment;

import java.io.IOException;
import java.util.ArrayList;

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
    
}
