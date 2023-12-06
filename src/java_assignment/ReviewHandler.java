package java_assignment;

import java.util.*;
import java.io.*;

public class ReviewHandler extends BaseHandler<Review>{
    
    public ReviewHandler(String filePath, Class<Review> clazz) throws IOException, ClassNotFoundException{
        super("Review",Review.class);
    }
    
    public ArrayList<Review> GetVendorMenu(String vendorID)
    {
        ArrayList<Review> review = new ArrayList<Review>();
        
        for(int i = 0; i<this.collection.size(); i++)
        {
            Review vdreview = collection.get(i);
            
            if (vdreview.getVendorID().equals(vendorID))
            {
                review.add(vdreview);
            }
        }
        
        return review;
    }
    
}
