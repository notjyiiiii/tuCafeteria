package java_assignment;


import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;



public class BaseHandler<T extends IDataContainer> {
    
    public ArrayList<T> collection = new ArrayList<T>();
    public String filePath;
    
    
    public BaseHandler(String filePath, Class<T> clazz) throws IOException, ClassNotFoundException
    {
        this.filePath = filePath;
        
        fileManager fm = new fileManager();
        String configVar = fm.getConfigVar(filePath, true);
        
        ArrayList<String[]> recordList = fm.readFile(configVar);

        for(int i = 0; i<recordList.size(); i++){
            String[] record = recordList.get(i);
            
            // Validate if use other overriden blank class params will it work
            T classRecord = InstantiateHandler(clazz);
            classRecord.DeserializeData(record); 
            collection.add(classRecord);

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
}