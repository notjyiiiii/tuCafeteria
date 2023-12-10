package java_assignment;

public class Runner extends User{
    
    private String status;
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String Status) {
        this.status = Status;
    }

    @Override
    public String toString() {
        return getUserid()+";"+getUsername()+";"+getStatus();
    }
    
    @Override
    public String[] SerializeData() {
        String[] dataString = new String[2];
        dataString[0] = this.userid;
        dataString[1] = this.username;
        dataString[2] = this.status;

        return dataString;
    }

    @Override
    public void DeserializeData(String[] dataArray) {
        this.userid = dataArray[0];
        this.username = dataArray[1];
        this.status = dataArray[2];
        
    }
}