package java_assignment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class RunnerHandler extends BaseHandler<Runner>{

    public RunnerHandler() throws IOException, ClassNotFoundException
    {
        super("Runner", Runner.class);        
    }
    
    public Runner getRunnerDetails(String userid) {
        for (int i = 0; i<collection.size(); i++)
        {
            if (collection.get(i).userid.equals(userid))
            {
                return collection.get(i);
            }
        }
        
        throw new NoSuchElementException("No runner found with userid: " + userid);
    }
    
    public ArrayList<Runner> getStandybyRunner() {

        ArrayList<Runner> rnList = new ArrayList<Runner>();

        for (int i = 0; i<collection.size(); i++)
        {
            if (collection.get(i).getStatus().equals("Standby"))
            {
                rnList.add(collection.get(i));
            }
        }
        return rnList;
    }
}