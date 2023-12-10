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
