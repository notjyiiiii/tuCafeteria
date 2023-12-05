package java_assignment;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class UsersHandler extends BaseHandler<Users>{
    
    public UsersHandler(String filePath, Class<Users> clazz) throws IOException, ClassNotFoundException{
        super(filePath, clazz);
    }
    
    
    public Users getusers(String userid)
    {
       
        for(int i = 0; i<this.collection.size(); i++)
        {
            Users user = collection.get(i);
            
            if (user.getUserid().equals(userid))
            {
                return user;
            }
        }
        
        return null;
    }
   
    
    
    
}
