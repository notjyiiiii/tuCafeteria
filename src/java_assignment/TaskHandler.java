package java_assignment;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java_assignment.Enums.OrderStatus;

public class TaskHandler extends BaseHandler<Task>{
    
    private ArrayList<Task> t;

    public TaskHandler() throws IOException, ClassNotFoundException
    {
        super("Task", Task.class);        
    }
    
    public String getTaskNumber(){
        String taskid;
        int size = collection.size() + 1;
        
        if (size>=100){
            taskid = "T" + size;
        } else if (size>=10){
            taskid = "T0" + size;
        } else{
            taskid = "T00" + size;
        }
        
        return taskid;
    }
    
    public Task getTaskDetails(String taskid) {
        for (int i = 0; i<collection.size(); i++)
        {
            if (collection.get(i).getTaskid().equals(taskid))
            {
                return collection.get(i);
            }
        }
        
        throw new NoSuchElementException("No Task found with taskid: " + taskid);
    }

    public ArrayList<Task> getRunnerTasks(String userid) {
        
        ArrayList<Task> taskList = new ArrayList<Task>();
        
        for (int i = 0; i<collection.size(); i++)
        {
            if (collection.get(i).getRunnerid().equals(userid))
            {
                taskList.add(collection.get(i));
            }
        }
        this.t = taskList;
        return taskList;
    }
    
    public ArrayList<Task> getRunnerCurrentTasks(String userid) {
        
        ArrayList<Task> taskList = new ArrayList<Task>();
        
        for (int i = 0; i<collection.size(); i++)
        {
            if (collection.get(i).getRunnerid().equals(userid) && ! collection.get(i).getOrderStatus().equals(OrderStatus.DELIVERED))
            {
                taskList.add(collection.get(i));
            }
        }
        this.t = taskList;
        return taskList;
    }
    
    public ArrayList<Task> getRunnerTaskHistory(String userid) {
        
        ArrayList<Task> taskList = new ArrayList<Task>();
        
        for (int i = 0; i<collection.size(); i++)
        {
            if (collection.get(i).getRunnerid().equals(userid) && collection.get(i).getOrderStatus().equals(OrderStatus.DELIVERED))
            {
                taskList.add(collection.get(i));
            }
        }
        this.t = taskList;
        return taskList;
    }
    

    public double getDailyIncome(String userid) {
        double daily = 0.0;

        for (Task task : collection) {
            if (task.getOrderStatus().equals(OrderStatus.DELIVERED) &&
                task.getRunnerid().equals(userid) &&
                task.getTaskdate().isEqual(LocalDate.now())) {
                daily += task.getDeliveryFees();
            }
        }

        return daily;
    }
    
    public double getMonthlyIncome(String userid) {
        double monthly = 0.0;

        LocalDate firstDayOfMonth = LocalDate.now().withDayOfMonth(1);

        for (Task task : collection) {
            if (task.getOrderStatus().equals(OrderStatus.DELIVERED) &&
                task.getRunnerid().equals(userid) &&
                task.getTaskdate().isAfter(firstDayOfMonth.minusDays(1)) &&
                task.getTaskdate().isBefore(firstDayOfMonth.plusMonths(1))) {
                monthly += task.getDeliveryFees();
            }
        }

        return monthly;
    }

    public double getYearlyIncome(String userid) {
        double yearly = 0.0;

        LocalDate firstDayOfYear = LocalDate.now().withDayOfYear(1);

        for (Task task : collection) {
            if (task.getOrderStatus().equals(OrderStatus.DELIVERED) &&
                task.getRunnerid().equals(userid) &&
                task.getTaskdate().isAfter(firstDayOfYear.minusDays(1)) &&
                task.getTaskdate().isBefore(firstDayOfYear.plusYears(1))) {
                yearly += task.getDeliveryFees();
            }
        }

        return yearly;
    }
    
    public void updateOrderStatus(String taskid, OrderStatus newStatus) throws IOException {
        Task taskToUpdate = getTaskDetails(taskid);
        taskToUpdate.setOrderStatus(newStatus);

        UpdateItem(taskToUpdate, taskToUpdate);
    }
}

