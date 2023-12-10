package java_assignment;

import java.time.LocalDate;
import java_assignment.Enums.OrderStatus;


public class Task implements IDataContainer{
       
    private String taskid;
    private String runnerid;
    private LocalDate taskdate;
    private String orderid;
    private OrderStatus orderStatus;
    private double deliveryFees;
    private String deliveryLocation;

    public Task() {
    }
    
    public Task(String taskid, String runnerid, LocalDate taskdate, String orderid, OrderStatus orderStatus, double deliveryFees, String deliveryLocation) {
        this.taskid = taskid;
        this.runnerid = runnerid;
        this.taskdate = taskdate;
        this.orderid = orderid;
        this.orderStatus = orderStatus;
        this.deliveryFees = deliveryFees;
        this.deliveryLocation = deliveryLocation;
    }

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid;
    }

    public String getRunnerid() {
        return runnerid;
    }

    public void setRunnerid(String runnerid) {
        this.runnerid = runnerid;
    }

    public LocalDate getTaskdate() {
        return taskdate;
    }

    public void setTaskdate(LocalDate taskdate) {
        this.taskdate = taskdate;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public double getDeliveryFees() {
        return deliveryFees;
    }

    public void setDeliveryFees(double deliveryFees) {
        this.deliveryFees = deliveryFees;
    }

    public String getDeliveryLocation() {
        return deliveryLocation;
    }

    public void setDeliveryLocation(String deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }

    public String toString() {
        return getTaskid()+";"+getOrderid()+";"+getRunnerid()+";"+getOrderStatus()+";"+getDeliveryFees()+";"+getDeliveryLocation()+";"+getTaskdate();
    }     
        
    public String[] SerializeData(){
        String[] dataString = new String[7];
        dataString[0] = this.taskid;
        dataString[1] = this.orderid;
        dataString[2] = this.runnerid;
        dataString[3] = this.orderStatus.toString();
        dataString[4] = Double.toString(this.deliveryFees);
        dataString[5] = this.deliveryLocation;
        dataString[6] = this.taskdate.toString();

        return dataString;
    }
    
    public void DeserializeData(String[] dataArray){
        try {
            this.taskid = dataArray[0];
            this.orderid = dataArray[1];
            this.runnerid = dataArray[2];
            this.orderStatus = OrderStatus.valueOf(dataArray[3]);;
            this.deliveryFees = Double.parseDouble(dataArray[4]);
            this.deliveryLocation = dataArray[5];
            if (!dataArray[6].equals("NULL")) {
                this.taskdate = LocalDate.parse(dataArray[6]);
            } else {
            this.taskdate = null;  
            }
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            System.err.println("Error while deserializing order data: " + e.getMessage());
        }
    }
}
