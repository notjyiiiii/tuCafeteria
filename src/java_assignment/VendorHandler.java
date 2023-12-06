package java_assignment;

import java.io.IOException;
import java.util.ArrayList;

public class VendorHandler extends BaseHandler<Vendor>{

    public VendorHandler() throws IOException, ClassNotFoundException
    {
        super("Vendor");
        
        UserHandler userHandler = new UserHandler("User", User.class);
        ArrayList<User> userArr = userHandler.GetUsersOfRole("Vendor");  
        ArrayList<Vendor> vendorInfoArr = this.LoadCollection("Vendor", Vendor.class);
        
        String abc = "abc";
        
    }
    
    public Vendor GetVendorByUserID(String userid)
    {
        for (int i = 0; i<collection.size(); i++)
        {
            if (collection.get(i).userid.equals(userid))
            {
                return collection.get(i);
            }
        }
        
        return null;
    }
    
}
