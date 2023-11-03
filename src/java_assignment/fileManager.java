package java_assignment;

import java.io.*;
import java.util.*;
import java.io.FileWriter;

public class fileManager {
    
    private final String userDirectory = "user.dir";
    private final String baseDirectory = "";
    private final String configDirectory = "/src/java_assignment/Config.properties";
    private final String mainFolderPath, configFilePath;
    private final String delimiter = ";";
    private static boolean check;
    private String configVal;
    private String userid;
    private String pw;
    
    //all the paths
    public fileManager(){
        String currentDirectory = System.getProperty(userDirectory);
        mainFolderPath = currentDirectory+baseDirectory;
//        System.out.println(mainFolderPath);
        configFilePath = mainFolderPath + configDirectory;
//        System.out.println(configFilePath);
    }
    
    public fileManager(String userid, String pw){
        String currentDirectory = System.getProperty(userDirectory);
        mainFolderPath = currentDirectory+baseDirectory;
        configFilePath = mainFolderPath + configDirectory;
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
    public void writeFile(String filePath, String data) throws IOException { //if something goes wrong, io is input output (so like file
        FileWriter writer = new FileWriter(filePath);
        writer.write(data + System.lineSeparator());
        writer.close();
    }
    
    // I'M ACTUALLY CONFUSED I THINK THIS CAN BE SOMETHING TO CALL SINCE EVERYTIME WE HAVE A CLASS WE GOTTA USE THIS
//    public boolean getDetails(String fileName){
//        fileManager fm = new fileManager();
//        String key = fileName;
//        String configVar = fm.getConfigVar(key, true);
//        ArrayList<String[]> recordList = fm.readFile(configVar);
//        
//        //check userid and password
//        for(int i = 0; i<recordList.size(); i++){
//            if (recordList.get(i)[0].equals(userid) && recordList.get(i)[4].equals(pw)){
//                LoadData(recordList.get(i));
//                return true;
//            }
//        }
//        
//        return false;
//    }
//    
    
//    //put the data into the variables
//    private void LoadData(String[] dataArray)
//    {
//        this.username = dataArray[1];
//        this.password = dataArray[4];
//        this.email = dataArray[2];
//        this.role = dataArray[5];
//        this.hpnum = dataArray [3];
//    }
    
}
