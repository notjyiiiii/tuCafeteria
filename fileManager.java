package java_assignment;

import java.io.*;
import java.util.*;

public class fileManager {
    
    private final String userDirectory = "user.dir";
    private final String baseDirectory = "";
    private final String configDirectory = "/src/java_assignment/Config.properties";
    private final String mainFolderPath, configFilePath;
    private final String delimiter = ";";
    private static boolean check;
    private String configVal;
    private boolean append_to_file = false;
    
    //all the paths
    public fileManager(){
        String currentDirectory = System.getProperty(userDirectory);
        mainFolderPath = currentDirectory+baseDirectory;
        System.out.println(mainFolderPath);
        configFilePath = mainFolderPath + configDirectory;
        System.out.println(configFilePath);
    }
    
    
    //get config path's values
    public String getConfigVar(String configVar, boolean filePath){
        try {
            FileInputStream propsInput = new FileInputStream(configFilePath);
            Properties prop = new Properties();
            prop.load(propsInput);
            if(filePath){
                configVal = mainFolderPath + prop.getProperty(configVar);
            }else{
                configVal = prop.getProperty(configVar);
            }
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
        return configVal;
    }
    
    //read the data in the file
    public ArrayList<String[]> readFile (String filePath) {
        ArrayList<String[]> dataList = new ArrayList<String[]>();
        try{
            Scanner scanner = new Scanner(new File(filePath));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] dataRecords = line.strip().split(";");
                dataList.add(dataRecords);
            }
            scanner.close();
            
        } catch (FileNotFoundException e){
            System.out.println(e);
        }
        return dataList;
    }
    
    //write data into file
    public void writeFile(String filePath, String data) {
        try {
            PrintWriter out = new PrintWriter(new FileWriter(filePath, append_to_file));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
