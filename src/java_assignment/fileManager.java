package java_assignment;

import java.io.*;
import java.util.*;
import java.io.FileWriter;

public class fileManager {
    
    private final String userDirectory = "user.dir";
    private final String baseDirectory = "";
    private final String configDirectory = "//src//java_assignment//Config.properties";
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
        
        //if hard code then can lorh
//        Menu m1 = (Menu)ois.readObject();
//        System.out.println(m1.getItemid());
//        System.out.println(m1.getUserid());
        //System.out.println(ois.readLine());

       return obj;
       
}
    public void updateFile(String filePath, String[] oldData, String[] newData) throws IOException{
        try{
            FileWriter fw = new FileWriter(filePath, false);
            BufferedWriter bw = new BufferedWriter(fw);
            
            String oldText = "";
            String newText = "";

            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
            
            String line = br.readLine();
             
            while (line != null) 
            {
                oldText += line + System.lineSeparator();
                 
                line = br.readLine();
            }
            
            for (int i = 0; i < oldData.length; i++) {
                newText = oldText.replaceAll(oldData[i], newData[i]);
            }
            
            bw.write(newText);
            bw.close();
            
        } catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
    
    public void updateFile2(String filePath, ArrayList<String[]> data) throws IOException{
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
    
    
//    public void deleteRecord(String filePath, String[] newData) throws IOException { 
//        
//        File tempFile = File.createTempFile("temp", ".txt");
//        System.out.println("newData");
//        System.out.println(newData);
//        File oldFile = new File(filePath);
//        
//        String currentLine;
//        String oldData[];
//        
//        try{
//            FileWriter fw = new FileWriter("Temporary", true);
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
//                for (int i=0;i<oldData.length;i=i+7){
//                    if (!(oldData[i].equalsIgnoreCase(newData[i])))
//                {
//                    pw.println(currentLine);
//               }
//                }
////                if (!(oldData[0].equalsIgnoreCase(newData[0])))
////                {
////                    pw.println(currentLine);
////                }
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
//            tempFile.renameTo(dump);
//            System.out.println("fm");
//            
//        } 
//        catch (FileNotFoundException e){
//            System.out.println(e);
//        }
//    }
//    
//    public void delWriteFile(String filePath, String [] arrData) throws IOException { //if something goes wrong, io is input output (so like file
//        try{
//            FileWriter fw = new FileWriter(filePath, false);
//            BufferedWriter bw = new BufferedWriter(fw);
//            
//
//             int size = arrData.length;
//             for (int i=0;i<size;i++) {
//                String str = arrData[i].toString();
//                bw.write(str);
//                    if(i < size-1)//This prevent creating a blank like at the end of the file
//                        bw.write("\n");
//                    }
//                fw.close();
//            bw.close();
//            
//        } 
//        catch (FileNotFoundException e){
//            System.out.println(e);
//        }
//        
//    }
    public void writeFile2(String filePath, String[] data) throws IOException { //if something goes wrong, io is input output (so like file
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
}                
    


//    public void deleteRecord(String filePath, String[] newData) throws IOException {
//        File tempFile = File.createTempFile("temp", ".txt");
//        File oldFile = new File(filePath);
//
//        try (FileWriter fw = new FileWriter(tempFile, true);
//             BufferedWriter bw = new BufferedWriter(fw);
//             PrintWriter pw = new PrintWriter(bw);
//             FileReader fr = new FileReader(filePath);
//             BufferedReader br = new BufferedReader(fr)) {
//
//            String currentLine;
//            String[] oldData;
//
//            while ((currentLine = br.readLine()) != null) {
//                oldData = currentLine.split(";");
//                newData = currentLine.split(";");
//
//                boolean shouldKeep = true;
//                for (int i = 0; i < newData.length; i++) {
//                    if (!(oldData[i].equalsIgnoreCase(newData[i]))) {
//                        shouldKeep = false;
//                        break;
//                    }
//                }
//
//                if (shouldKeep) {
//                    pw.println(currentLine);
//                }
//            }
//        }
//
//        // Delete the old file and rename the temp file
//        oldFile.delete();
//        File dump = new File(filePath);
//        tempFile.renameTo(dump);
//
//        System.out.println("File updated successfully.");
//    }}

//    public void deleteRecord(String filePath, String[] newData) throws IOException {
//        File tempFile = File.createTempFile("temp", ".txt");
//        File oldFile = new File(filePath);
//
//        try (FileWriter fw = new FileWriter(tempFile, true);
//             BufferedWriter bw = new BufferedWriter(fw);
//             PrintWriter pw = new PrintWriter(bw);
//             FileReader fr = new FileReader(filePath);
//             BufferedReader br = new BufferedReader(fr)) {
//
//            String currentLine;
//            String[] oldData;
//
//            while ((currentLine = br.readLine()) != null) {
//                oldData = currentLine.split(";");
//
//                String[] lineData = currentLine.split(";");
//
//                boolean shouldKeep = true;
//                for (int i = 0; i < newData.length; i++) {
//                    if (!(oldData[i].equalsIgnoreCase(lineData[i]))) {
//                        shouldKeep = false;
//                        break;
//                    }
//                    if (shouldKeep) {
//                        pw.println(currentLine);
//                    }
//                }
//
//            }
//        }}}

    
//    public void deleteRecord(String filePath, String[] newData) throws IOException { 
//        
//        File tempFile = File.createTempFile("temp", ".txt");
//        
//        File oldFile = new File(filePath);
//        
//        try (FileWriter fw = new FileWriter(tempFile, true);
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
//                for (int i=0;i<oldData.length;i=i+7);
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
//            tempFile.renameTo(dump);
//            System.out.println("fm");
//            
//        } catch (FileNotFoundException e){
//            System.out.println(e);
//        }
//        
//    }
        // Delete the old file and rename the temp file
//        oldFile.delete();
//        File dump = new File(filePath);
//        tempFile.renameTo(dump);
//
//        System.out.println("File updated successfully.");
//    }}
    
//    
    
//    public void deleteRecord(String filePath, String data) throws IOException { 
//        
//        File oldFile = new File(filePath);
//        File tempFile = File.createTempFile("temp", ".txt");
//        
//        String currentLine;
//        String oldData[];
//        String newData [] = data.split(";");
//         ArrayList<String> newDataList = new ArrayList<>(Arrays.asList(newData));
//
//        try{
//            FileWriter fw = new FileWriter(tempFile, true);
//            BufferedWriter bw = new BufferedWriter(fw);
//            PrintWriter pw = new PrintWriter(bw);
//            
//            FileReader fr = new FileReader(filePath);
//            BufferedReader br = new BufferedReader(fr);
//            
//            while ((currentLine = br.readLine()) != null) {
//            // Trim whitespace from each part of oldData
//            oldData = currentLine.split("\\|");
//            for (int i = 0; i < oldData.length; i++) {
//                oldData[i] = oldData[i].trim();
//            }
//
//            // Check if oldData[0] is in newDataList
//            if (!newDataList.contains(oldData[0])) {
//                pw.println(currentLine);
//            }
//        }
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
//            tempFile.renameTo(dump);
//            
//        } catch (FileNotFoundException e){
//            System.out.println(e);
//        }
//        
//    }}
//    public void deleteRecord(String filePath, String[] newData) throws IOException {
//        File tempFile = File.createTempFile("temp", ".txt");
//        File oldFile = new File(filePath);
//
//        try (FileWriter fw = new FileWriter(tempFile, true);
//             BufferedWriter bw = new BufferedWriter(fw);
//             PrintWriter pw = new PrintWriter(bw);
//             FileReader fr = new FileReader(filePath);
//             BufferedReader br = new BufferedReader(fr)) {
//
//            String currentLine;
//            String[] oldData;
//
//            while ((currentLine = br.readLine()) != null) {
//                oldData = currentLine.split(";");
//                for (String i : newData) {
//
//                    if (!(oldData[0].equalsIgnoreCase(i)))
//                    {
//                        pw.println(currentLine);
//                    }
//            }
//        }
//
//        // Delete the old file and rename the temp file
//        oldFile.delete();
//        File dump = new File(filePath);
//        tempFile.renameTo(dump);
//
//        System.out.println("File updated successfully.");
//    
//        }}}
    /*public void deleteRecord(String filePath, String[] newData) throws IOException { 
        
    String temporaryPath = "src" + File.separator + "txtFile" + File.separator + "Temp.txt";
        
    File oldFile = new File(filePath);
    File newFile = new File(temporaryPath);
        
    String currentLine;
    String oldData[];
        
    try {
        // Ensure parent directories for the temporary file exist
        newFile.getParentFile().mkdirs();
        
        FileWriter fw = new FileWriter(newFile, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
            
        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);
            
        while ((currentLine = br.readLine()) != null) {
            oldData = currentLine.split(";");
            if (!(oldData[0].equalsIgnoreCase(newData[0]))) {
                pw.println(currentLine);
            }
        }
            
        pw.flush();
        pw.close();
        fr.close();
        br.close();
        fw.close();
        bw.close();
            
        // Close the file before renaming
        fr.close();
        br.close();
        
        oldFile.delete();
        newFile.renameTo(new File(filePath));
            
    } catch (FileNotFoundException e) {
        System.out.println(e);
    }*/


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
    
  /*      public void delete(String filePath, String[] Data) throws IOException{
        try{
            FileWriter fw = new FileWriter(filePath, false);
            BufferedWriter bw = new BufferedWriter(fw);
            
            String oldText = "";
            String newText = "";

            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
            
            String line = br.readLine();
             
            while (line != null) 
            {
                oldText += line + System.lineSeparator();
                line = br.readLine();
                
            for (String[] row: data)
            {
                for (String item: row)
                {
                    
                    newText += item;
                    newText += ";";
                }
                newText += "\n";
                
            }
            
            bw.write(newText);
            bw.close();
                }
            }
            
        }   
        } 

        catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
    
    */
