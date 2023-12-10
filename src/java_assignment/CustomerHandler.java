package java_assignment;

import java.io.IOException;
import java.util.ArrayList;

public class CustomerHandler extends BaseHandler<Customer>{

    public CustomerHandler(String filePath, Class<Customer> clazz) throws IOException, ClassNotFoundException{
        super(filePath, clazz);
    }

    
    
    
    
//    public ArrayList<Customer> filterCustomer(String customerID) throws IOException, ClassNotFoundException{
//        CustomerHandler ch = new CustomerHandler("Customer", Customer.class);
//        ArrayList<Customer> cslist = new ArrayList<Customer>();
//        //i don't know what i'm doing
//        for(int i = 0; i<this.collection.sizpe(); i++)
//        {
//            Customer cs = collection.get(i);
//            
//            if (cs.getUserid().equals(customerID)){
//                cslist.add(cs);
//                System.out.println(cslist.add(cs));
//            }
//        }
//        
//        return null;
//    }
    


    
    public double getCredit(String customerID) throws IOException, ClassNotFoundException {
    for (Customer cs : this.collection) {
        if (cs.getUserid().equals(customerID)) {
            // If customer found, convert the String credit to double
            return Double.parseDouble(cs.getCredit());
        }
    }

    throw new RuntimeException("Customer not found with ID: " + customerID);
    }
    
    
//    public String updateCredit(String customerID, String newCredit){
//        for(Customer cs : this.collection){
//            cs.setCredit(newCredit);
//            
//            try{
//                fileManager fm = new fileManager();
//                String configVar = fm.getConfigVar(this.filePath, true);
//                
//                ArrayList<String[]> data = new ArrayList<>();
//                for (Customer customer : this.collection) {
//                    data.add(customer.serializeData());
//                }
//                fm.updateFile(configVar, data);
//            }catch (IOException e) {
//                e.printStackTrace();
//                // Handle the IOException, you might want to throw a custom exception or log the error
//            }
//            
//        }
//    }
    
    public double updateCredit(String customerID, String newCredit) {
        for (Customer cs : this.collection) {
            if (cs.getUserid().equals(customerID)) {
                // Update the credit of the identified customer in-memory
                cs.setCredit(newCredit);

                try {
                    // Save the updated collection to the file using the updateFile method
                    fileManager fm = new fileManager();
                    String configVar = fm.getConfigVar(this.filePath, true);

                    // Convert the Customer objects in the collection to String arrays
                    ArrayList<String[]> data = new ArrayList<>();
                    for (Customer customer : this.collection) {
                        data.add(customer.SerializeData());
                    }

                    // Update the file with the new data
                    fm.updateFile(configVar, data);
                } catch (IOException e) {
                    e.printStackTrace();
                    // Handle the IOException, you might want to throw a custom exception or log the error
                }

                // Return the updated credit
                return Double.parseDouble(newCredit);
            }
        }

        // If the customer is not found, you might want to throw an exception or handle the case accordingly
        throw new IllegalArgumentException("Customer not found with ID: " + customerID);
    }
    
    public User GetCustomerByCustomerID(String userid)
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
