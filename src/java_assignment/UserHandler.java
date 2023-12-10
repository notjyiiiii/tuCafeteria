package java_assignment;

import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;

public class UsersHandler<T extends Users> extends BaseHandler<T>{
    
//    public UsersHandler(String filePath) throws IOException, ClassNotFoundException{
//        super(filePath, Users.class);
//    }
    
//    public UsersHandler(String filePath, Class<Users> clazz) throws IOException, ClassNotFoundException{
//        super(filePath, clazz);
//    }
    
    public UsersHandler(String filePath, Class<T> clazz) throws IOException, ClassNotFoundException{
        super(filePath, clazz);
    }
    
    
   // public Users getAuthenticatedUser(String userid, String password) {
       // ArrayList<Users> userList = ; // Implement this method to get all users from your data source
       // for (Users user : userList) {
         //   if (user.getUserid().equals(userid) && user.getPassword().equals(password)) {
         //       return user;
          //  }
   // }
   // return null;
  //  }

   
    
}
