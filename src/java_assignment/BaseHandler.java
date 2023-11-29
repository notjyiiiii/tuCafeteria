package java_assignment;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class BaseHandler<T extends IDataContainer> {
    
    public ArrayList<T> collection = new ArrayList<T>();
    
    public BaseHandler(String filePath, Class<T> clazz)
    {
        fileManager fm = new fileManager();
        String configVar = fm.getConfigVar(filePath, true);
        
        ArrayList<String[]> recordList = fm.readFile(configVar);
        
//        collection = (T[]) new IDataContainer[recordList.size()];
//        collection = new ArrayList<T>();

        for(int i = 0; i<recordList.size(); i++){
            String[] record = recordList.get(i);
            
            // Validate if use other overriden blank class params will it work
            T classRecord = InstantiateHandler(clazz);
            classRecord.SerializeData(record);
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
}
