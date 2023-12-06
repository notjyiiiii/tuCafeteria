package java_assignment;

import java.io.IOException;
import java.util.ArrayList;

public class CustomerHandler extends BaseHandler<Customer>{

    public CustomerHandler(String filePath, Class<Customer> clazz) throws IOException, ClassNotFoundException{
        super(filePath, clazz);
    }

    
    public double getCredit(String customerID) throws IOException, ClassNotFoundException {
    for (Customer cs : this.collection) {
        if (cs.getUserid().equals(customerID)) {
            // If customer found, convert the String credit to double
            return Double.parseDouble(cs.getCredit());
        }
    }

    throw new RuntimeException("Customer not found with ID: " + customerID);
    }
}
