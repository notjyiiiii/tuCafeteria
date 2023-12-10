package java_assignment;

import java.util.*;
import java.io.*;
import java.time.LocalDateTime;

public class ReviewHandler extends BaseHandler<Review>{
    
    private static ArrayList<Review> allReviews = new ArrayList<>();
    
    public ReviewHandler() throws IOException, ClassNotFoundException{
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
//        // Create a new Review object with the provided values
//        Review newReview = new Review();
//        newReview.setOrderID(values[0]);
//        newReview.setVendorID(vendorID);
//        newReview.setCustomerName(values[1]);
//        newReview.setRating(values[2]);
//        newReview.setReview(values[3]);
//        newReview.setReviewDateTime(LocalDateTime.now());
//
//        // Add the new review to the collection
//        collection.add(newReview);
//
//        try {
//            // Save the updated collection to the file
//            fileManager fm = new fileManager();
//            String configVar = fm.getConfigVar(this.filePath, true);
//            ArrayList<String[]> data = new ArrayList<>();
//            
//            // Convert the Review objects in the collection to String arrays
//            for (Review review : collection) {
//                data.add(review.SerializeData());
//            }
//            
//            // Update the file with the new data
//            fm.updateFile(configVar, data);
//        } catch (IOException e) {
//            e.printStackTrace();
//            // Handle the IOException, you might want to throw a custom exception or log the error
//        }
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

    public double GetAverageRating(String vendorID) {
        ArrayList<Review> reviews = new ArrayList<>();

        for (int i = 0; i < this.collection.size(); i++) {
            Review vdreview = collection.get(i);

            if (vdreview.getVendorID().equals(vendorID)) {
                reviews.add(vdreview);
            }}
        
        if (reviews.isEmpty()) {
            return 0.0;
        }

        int totalRating = 0;
        for (Review review : reviews) {
            int rating = Integer.parseInt(review.getRating());
            totalRating += rating;
        }

        double averageRating = (double) totalRating / reviews.size();
        return averageRating;
    }
    
    
}
