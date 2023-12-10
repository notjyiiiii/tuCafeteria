package java_assignment;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java_assignment.Enums.OrderStatus;

public class TaskStatusHandler extends BaseHandler<Taskstatus>{

    public TaskStatusHandler() throws IOException, ClassNotFoundException
    {
        super("Taskstatus", Taskstatus.class);        
    }
    
    public ArrayList<Taskstatus> getAllTaskstatus() {
        ArrayList<Taskstatus> taskList = new ArrayList<Taskstatus>();
        for (int i = 0; i<collection.size(); i++)
        {

            taskList.add(collection.get(i));

        }
        return taskList;
    }
    
    public Taskstatus getTaskstatusDetails(String orderid) {
        for (int i = 0; i<collection.size(); i++)
        {
            if (collection.get(i).getOrderid().equals(orderid))
            {
                return collection.get(i);
            }
        }
        
        throw new NoSuchElementException("No Task status found with orderid: " + orderid);
    }

    public ArrayList<Taskstatus> getRunnerTaskstatus(String userid) {
        
        ArrayList<Taskstatus> taskList = new ArrayList<Taskstatus>();
        
        for (int i = 0; i<collection.size(); i++)
        {
            if (collection.get(i).getRunnerid().equals(null)){
                break;
            }
            else if (collection.get(i).getRunnerid().equals(userid))
            {
                taskList.add(collection.get(i));
            }
        }
        return taskList;
    }
    
    public void writeTaskstatus(String runnerid, String orderid, String taskstatus) throws IOException, ClassNotFoundException{
        Taskstatus newTS = new Taskstatus(runnerid ,orderid,taskstatus);
        BaseHandler hdlr = new BaseHandler("Taskstatus",Taskstatus.class);
        hdlr.AddNewItem(newTS);
    }

}

