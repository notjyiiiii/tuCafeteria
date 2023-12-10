package java_assignment;


import java.io.EOFException;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.*;





public class BaseHandler<T extends IDataContainer> {
    
    public ArrayList<T> collection = new ArrayList<T>();
    public String filePath;
    
    public BaseHandler(){}
    
    public BaseHandler(String filePath) 
    {
        this.filePath = filePath;
    }
    
    // Used to auto load
    public BaseHandler(String filePath, Class<T> clazz) 
    {
        this.filePath = filePath;
        collection = LoadCollection(filePath, clazz);    
    }
    
    public ArrayList<T> LoadCollection(String filePath, Class<T> clazz)
    {
        fileManager fm = new fileManager();
        String configVar = fm.getConfigVar(filePath, true);
        
        ArrayList<String[]> recordList = fm.readFile(configVar);

        ArrayList<T> tList = new ArrayList<T>();

        for(int i = 0; i<recordList.size(); i++){
            String[] record = recordList.get(i);
            
            // Validate if use other overriden blank class params will it work
            T classRecord = InstantiateHandler(clazz);
            classRecord.DeserializeData(record); 
            tList.add(classRecord);

        }
        
        return tList;
    }
    
    public void SaveCollection() {
        try {
            fileManager fm = new fileManager();
            String get = fm.getConfigVar(this.filePath, true);

            Object[] objArray = collection.toArray(new Object[0]);

            String[] strarr = new String[objArray.length];
            for (int i = 0; i < objArray.length; i++) {
                strarr[i] = objArray[i].toString() + "\n";
            }
            fm.updateFile(get, strarr);
        } catch (IOException e) {
           
        }
    }
    
    private T InstantiateHandler(Class<T> clazz) {
        try {
            Constructor<T> constructor = clazz.getConstructor();
            return constructor.newInstance();
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    // or could return custom exception instead
    public void AddNewItem(T item)
    {
        collection.add(item); 
        
        try {
            fileManager fm = new fileManager();
            String get = fm.getConfigVar(this.filePath, true);
            fm.writeFile(get, item.SerializeData());

        }
        catch(Exception e)
        {
            System.out.println("Error: Unable to add new item");
            // TODO: Look at how you want to handle error exception
            // Maybe to put a popup stating the error?
        }

    } 
    
    public void DeleteItem(T item)throws IOException
    {
        try{
        collection.remove(item); 
            fileManager fm = new fileManager();
            String get = fm.getConfigVar(this.filePath, true);

             Object[] objArray = collection.toArray(new Object[0]);

        String[] strarr = new String[objArray.length];
        for (int i = 0; i < objArray.length; i++) {
            strarr[i] = objArray[i].toString() + "\n";
        }
            fm.updateFile(get,strarr);
        }

        catch(Exception e)
        {
            System.out.println("Error: Unable to delete item");
        }
    }
        
        public void UpdateItem(T item1,T item2)throws IOException
    {
        try{
        collection.remove(item1); 
        collection.add(item2);
            fileManager fm = new fileManager();
            String get = fm.getConfigVar(this.filePath, true);

             Object[] objArray = collection.toArray(new Object[0]);

        String[] strarr = new String[objArray.length];
        for (int i = 0; i < objArray.length; i++) {
            strarr[i] = objArray[i].toString() + "\n";
        }
            fm.updateFile(get,strarr);
        }

        catch(Exception e)
        {
            System.out.println("Error: Unable to delete item");
        }
    }
   
    
    
}
