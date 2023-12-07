package java_assignment;

import java.util.*;
import java.io.*;

public class ReviewHandler extends BaseHandler<Review>{
    
    private static ArrayList<Review> allReviews = new ArrayList<>();
    
    public ReviewHandler(String filePath, Class<Review> clazz) throws IOException, ClassNotFoundException{
        super("Review",Review.class);
        if (allReviews.isEmpty()) {
            allReviews.addAll(collection);
        }
    }
    
    public ArrayList<Review> GetReview(String vendorID)
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
    
    public void WriteReview(String vendorID, String[] values) {
        // Create a new Review object with the provided values
        Review newReview = new Review();
        newReview.setVendorID(vendorID);
        newReview.setCustomerName(values[0]);
        newReview.setReview(values[1]);
        newReview.setRating(values[2]);

        // Add the new review to the collection
        collection.add(newReview);

        try {
            // Save the updated collection to the file
            fileManager fm = new fileManager();
            String configVar = fm.getConfigVar(this.filePath, true);
            ArrayList<String[]> data = new ArrayList<>();
            
            // Convert the Review objects in the collection to String arrays
            for (Review review : collection) {
                data.add(review.SerializeData());
            }
            
            // Update the file with the new data
            fm.updateFile(configVar, data);
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the IOException, you might want to throw a custom exception or log the error
        }
    }
    
    public void addReview(Review review) {
        allReviews.add(review);
    }
    
    public ArrayList<Review> getReviewsForVendor(String vendorID) {
        ArrayList<Review> vendorReviews = new ArrayList<>();
        for (Review review : allReviews) {
            if (review.getVendorID().equals(vendorID)) {
                vendorReviews.add(review);
            }
        }
        return vendorReviews;
    }

    
}
