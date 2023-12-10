package java_assignment;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Admin extends User implements IDataContainer, Serializable{
    
    public void populateUserTable(DefaultTableModel model, ArrayList<User> dataList) {
        String[] ColumnNames = {"UserID", "Username", "Email", "Contact Number", "Password","Role"};

        model.setColumnIdentifiers(ColumnNames);
        
        for (User user : dataList) {
            model.addRow(new Object[]{user.getUserid(), user.getUsername(), user.getEmail(), user.getHpnum(), user.getPassword(), user.getRole()});
        }
    }
    
    public void populateNotiTable(DefaultTableModel model, ArrayList<Notification> dataList) {
        String[] ColumnNames = {"NotiID", "SenderID", "RecipientID", "Notification Message", "Date-Time", "Status"};

        model.setColumnIdentifiers(ColumnNames);
        
        for (Notification notif : dataList) {
            model.addRow(new Object[]{notif.getNotiID(), notif.getSenderID(), notif.getRecipientID(), notif.getNotiMessage(), notif.getNotiDateTime(), notif.getNotiStatus()});
        }
    }
    
    public void filteruidpopulateUserTable(DefaultTableModel model, ArrayList<User> userList, String filterUserId) {
    // Define column names
    String[] columnNames = {"UserID", "Username", "Email", "Contact Number", "Password","Role"};

    model.setColumnIdentifiers(columnNames);

    // Populate the model with data based on the filter criteria
    for (User user : userList) {
        // Check if the user matches the filter criteria (userid)
        if (user.getUserid().equals(filterUserId)) {
            // Add the user data to the model
            model.addRow(new Object[]{user.getUserid(), user.getUsername(), user.getEmail(), user.getHpnum(), user.getPassword(), user.getRole()});
        }
    }
    }
    public void filterrolepopulateUserTable(DefaultTableModel model, ArrayList<User> userList, String filterRole) {
    // Define column names
    String[] columnNames = {"UserID", "Username", "Email", "Contact Number", "Password","Role"};

    model.setColumnIdentifiers(columnNames);

    // Populate the model with data based on the filter criteria
    for (User user : userList) {
        // Check if the user matches the filter criteria (userid)
        if (user.getRole().equals(filterRole)) {
            // Add the user data to the model
            model.addRow(new Object[]{user.getUserid(), user.getUsername(), user.getEmail(), user.getHpnum(), user.getPassword(), user.getRole()});
        }
    }
    
}
    public void filternamepopulateUserTable(DefaultTableModel model, ArrayList<User> userList, String filterName) {
    // Define column names
    String[] columnNames = {"UserID", "Username", "Email", "Contact Number", "Password","Role"};

    model.setColumnIdentifiers(columnNames);

    // Populate the model with data based on the filter criteria
    for (User user : userList) {
        // Check if the user matches the filter criteria (userid)
        if (user.getUsername().equals(filterName)) {
            // Add the user data to the model
            model.addRow(new Object[]{user.getUserid(), user.getUsername(), user.getEmail(), user.getHpnum(), user.getPassword(), user.getRole()});
        }
    }
}
}
