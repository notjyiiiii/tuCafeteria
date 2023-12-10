package java_assignment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class LocationHandler extends BaseHandler<Location>{

    public LocationHandler() throws IOException, ClassNotFoundException
    {
        super("Location", Location.class);        
    }
    
    public ArrayList<Location> getLocationDetails() {
        ArrayList<Location> Location = new ArrayList<Location>();
        for (int i = 0; i<collection.size(); i++)
        {

            Location.add(collection.get(i));

        }
        return Location;
    }
}