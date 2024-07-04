package java_assignment;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class UserHandler extends BaseHandler<User>{
    
    public UserHandler(String filePath, Class<User> clazz) throws IOException, ClassNotFoundException{
        super(filePath, clazz);
    }
    
    public User GetUserByUserID(String userid)
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
    
    public ArrayList<User> GetUsersOfRole(String role)
    {
        ArrayList<User> userArr = new ArrayList<User>();
        
        for (int i = 0; i<collection.size(); i++)
        {
            if (collection.get(i).getRole().equals(role))
            {
                userArr.add(collection.get(i));
            }
        }
        
        return userArr;
    }
    
    public User ValidateUserCredential(String userid, String password)
    {
         for (int i = 0; i<collection.size(); i++)
        {
            if (collection.get(i).userid.equals(userid) && collection.get(i).password.equals(password))
            {
                return collection.get(i);
            }
        }
        
        return null;
    }
}
