package java_assignment;

import java.util.*;
import java.io.*;

public class OrderHandler extends BaseHandler<Order>{
    
    public OrderHandler(String filePath) throws IOException, ClassNotFoundException{
        super(filePath, Order.class);
    }
    
    public OrderHandler(String filePath, Class<Order> clazz) throws IOException, ClassNotFoundException{
        super(filePath, clazz);
    }
    
    
    
}
