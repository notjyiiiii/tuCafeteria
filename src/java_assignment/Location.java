package java_assignment;

public class Location implements IDataContainer{
    
    private String locationid;
    private String locationname;
    private String details;
    
    
    public String getLocationname() {
        return locationname;
    }

    public void setLocationname(String locationname) {
        this.locationname = locationname;
    }

    public String getLocationid() {
        return locationid;
    }

    public void setLocationid(String locationid) {
        this.locationid = locationid;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }


    @Override
    public String toString() {
        return getLocationid()+";"+getDetails();
    }
    
    @Override
    public String[] SerializeData() {
        String[] dataString = new String[3];
        dataString[0] = this.locationid;
        dataString[1] = this.locationname;
        dataString[2] = this.details;

        return dataString;
    }

    @Override
    public void DeserializeData(String[] dataArray) {
        this.locationid = dataArray[0];
        this.locationname = dataArray[1];
        this.details = dataArray[2];
        
    }
}
