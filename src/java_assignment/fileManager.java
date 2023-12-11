package java_assignment;

import java.io.*;
import java.util.*;
import java.io.FileWriter;

public class fileManager {
    
    private final String userDirectory = "user.dir";
    private final String baseDirectory = "";
    private final String configDirectory = "//src//java_assignment//Config.properties";
    private final String mainFolderPath, configFilePath;
    private String configVal;
    
    // all the paths
    public fileManager(){
        String currentDirectory = System.getProperty(userDirectory);
        mainFolderPath = currentDirectory+baseDirectory;
        configFilePath = mainFolderPath + configDirectory;
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
    public void writeFile(String filePath, String[] data) throws IOException { //if something goes wrong, io is input output (so like file
        try{
            FileWriter fw = new FileWriter(filePath, true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            String textData = "";

            for (String string: data)
            {
                textData += string;
                textData += ";";
            }
           textData += "\n";
            
            
            bw.write(textData);
            bw.close();
            
        } catch (FileNotFoundException e){
            System.out.println(e);
        }
        
    }
    
    
    
    
    
    public void writeObjFile(String filePath, Object data) throws IOException { //if something goes wrong, io is input output (so like file
        try{
            FileOutputStream fos = new FileOutputStream(filePath);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
           
//            System.out.println(filePath);
            oos.writeObject(data);
            bos.close();
            oos.close();
            fos.close();
            
            
        } catch (FileNotFoundException e){
            System.out.println(e);
        }
        
    }
    
    
    
    public Object readObjFile(String filePath) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(filePath);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        Object obj = ois.readObject();

       return obj;
       
}

    

    public void updateFile(String filePath, String[] data) throws IOException { //if something goes wrong, io is input output (so like file
        try{
            FileWriter fw = new FileWriter(filePath, false);
            BufferedWriter bw = new BufferedWriter(fw);
            
            String textData = "";
            for (String string: data)
            {
                textData += string;
                //textData += ";";
//                textData += "\n";
            }
           
            
            
            bw.write(textData);
            bw.close();
            
        } catch (FileNotFoundException e){
            System.out.println(e);
        }
        
    }  
    
//    public void updateFile(String filePath, ArrayList<String[]> data) throws IOException{
//        try{
//            FileWriter fw = new FileWriter(filePath, false);
//            BufferedWriter bw = new BufferedWriter(fw);
//            
//            String oldText = "";
//            String newText = "";
//
//            FileReader fr = new FileReader(filePath);
//            BufferedReader br = new BufferedReader(fr);
//            
//            String line = br.readLine();
//             
//            while (line != null) 
//            {
//                oldText += line + System.lineSeparator();
//                line = br.readLine();
//                
//            for (String[] row: data)
//            {
//                for (String item: row)
//                {
//                    
//                    newText += item;
//                    newText += ";";
//                }
//                newText += "\n";
//                
//            }
//            
//            bw.write(newText);
//            bw.close();
//                }
//            } catch (FileNotFoundException e){
//            System.out.println(e);
//        }
//    }
    
    public void updateFile(String filePath, ArrayList<String[]> data) throws IOException{
        try{
            FileWriter fw = new FileWriter(filePath, false);
            BufferedWriter bw = new BufferedWriter(fw);
            
            
            String textItem = "";
            for (String[] row: data)
            {
                for (String item: row)
                {
                    
                    textItem += item;
                    textItem += ";";
                }
                textItem += "\n";
                
            }
            
            bw.write(textItem);
            bw.close();
            
        } catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
    
}             