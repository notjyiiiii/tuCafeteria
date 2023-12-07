package java_assignment;

import java.io.*;
import java.util.*;
import java.io.FileWriter;

public class fileManager {
    
    private final String userDirectory = "user.dir";
    private final String baseDirectory = "";
    private final String configDirectory = "/src/java_assignment/Config.properties";
    private final String mainFolderPath, configFilePath;
//    private final String delimiter = ";";
//    private static boolean check;
    private String configVal;
//    private String userid;
//    private String pw;
//    private final String tempFile = "temp.txt";
    
    //all the paths
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
            fw.close();
            
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
        
        //if hard code then can lorh
//        Menu m1 = (Menu)ois.readObject();
//        System.out.println(m1.getItemid());
//        System.out.println(m1.getUserid());
        //System.out.println(ois.readLine());

       return obj;
       
    }
    
//    public void deleteRecord(String filePath, String[] data) throws IOException { 
//        
//        File oldFile = new File(filePath);
//        File newFile = new File(tempFile);
//        
//        String currentLine;
//        String oldData[];
//        String newData [] = data[0].split(",");
//        
//        try{
//            FileWriter fw = new FileWriter(tempFile, true);
//            BufferedWriter bw = new BufferedWriter(fw);
//            PrintWriter pw = new PrintWriter(bw);
//            
//            FileReader fr = new FileReader(filePath);
//            BufferedReader br = new BufferedReader(fr);
//            
//            while((currentLine = br.readLine()) != null)
//            {
//                oldData = currentLine.split(";");
//                
//                if (!(oldData[0].equalsIgnoreCase(newData[0])))
//                {
//                    pw.println(currentLine);
//                }
//            }
//            
//            pw.flush();
//            pw.close();
//            fr.close();
//            br.close();
//            fw.close();
//            bw.close();
//            
//            oldFile.delete();
//            File dump = new File(filePath);
//            newFile.renameTo(dump);
//            
//        } catch (FileNotFoundException e){
//            System.out.println(e);
//        }
//        
//    }
    
    public void deleteRecord(String filePath, String data) throws IOException { 

        File oldFile = new File(filePath);
        File tempFile = File.createTempFile("temp", ".txt");

        String currentLine;
        String oldData[];
        String newData [] = data.split(",");
         ArrayList<String> newDataList = new ArrayList<>(Arrays.asList(newData));
         
         
        try (FileWriter fw = new FileWriter(tempFile, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter pw = new PrintWriter(bw);
             FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {
            
            while ((currentLine = br.readLine()) != null) {
                oldData = currentLine.split("\\|");
                for (int i = 0; i < oldData.length; i++) {
                    oldData[i] = oldData[i].trim();
                }

            // Check if oldData[0] is in newDataList
                if (!newDataList.contains(oldData[0])) {
                    pw.println(currentLine);
                }
            }
            
            oldFile.delete();
            File dump = new File(filePath);
            tempFile.renameTo(dump);
            
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    } 


    
  /*  public void updateFile(String filePath, ArrayList<String[]> data) throws IOException{
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
    */
    
    
    
//    public void updateFile(String filePath, String[] oldData, String[] newData) throws IOException{
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
//                 
//                line = br.readLine();
//            }
//            
//            for (int i = 0; i < oldData.length; i++) {
//                newText = oldText.replaceAll(oldData[i], newData);
//            }
//            
//            bw.write(newText);
//            bw.close();
//            
//       } catch (FileNotFoundException e){
//            System.out.println(e);
//        }
//    }
    
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
