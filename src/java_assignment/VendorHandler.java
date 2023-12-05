package java_assignment;

import java.io.IOException;
import java.util.ArrayList;

public class VendorHandler extends BaseHandler<Vendor>{

    public VendorHandler(String filePath, Class<Vendor> clazz) throws IOException, ClassNotFoundException{
        super(filePath, clazz);
        
        
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
