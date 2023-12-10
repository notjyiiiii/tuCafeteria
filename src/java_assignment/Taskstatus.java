package java_assignment;

public class Taskstatus implements IDataContainer{
    private String runnerid;
    private String orderid;
    private String taskstatus;

    public Taskstatus() {
    }
    
    public Taskstatus(String runnerid, String orderid, String taskstatus) {
        this.runnerid = runnerid;
        this.orderid = orderid;
        this.taskstatus = taskstatus;
    }

    public String getRunnerid() {
        return runnerid;
    }

    public void setRunnerid(String runnerid) {
        this.runnerid = runnerid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }
    
    public String getTaskstatus() {
        return taskstatus;
    }

    public void setTaskstatus(String taskstatus) {
        this.taskstatus = taskstatus;
    }

    @Override
    public void DeserializeData(String[] dataArray) {
        try {
            this.runnerid = dataArray[0];
            this.orderid = dataArray[1];
            this.taskstatus = dataArray[2];
         } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            System.err.println("Error while deserializing order data: " + e.getMessage());
        }
    }

    @Override
    public String[] SerializeData() {
        String[] dataString = new String[3];
        dataString[0] = this.runnerid;
        dataString[1] = this.orderid;
        dataString[2] = this.taskstatus;
        
        return dataString;
    }
    
    
}
