package java_assignment;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sharkie
 */
public class NotificationHandler extends BaseHandler<Notification> {
    
    private ArrayList<Notification> notificationList;
    
    
    public NotificationHandler (String filePath, Class<Notification> clazz) throws IOException, ClassNotFoundException {
        super(filePath, clazz);
        
        this.notificationList = new ArrayList<>();
        this.notificationList.addAll(LoadCollection(filePath, clazz));
    }
    
    public ArrayList<Notification> getNotificationsByVendorID(String vendorID) {
        ArrayList<Notification> notificationList = new ArrayList<>();

        for (int i = 0; i < collection.size(); i++) {
            Notification notification = collection.get(i);

            if (notification.getRecipientID().equals(vendorID)) {
                notificationList.add(notification);
            }
        }

        this.notificationList = notificationList;

        return notificationList;
    }
   
    public ArrayList<Notification> getNotificationsByVendorIDAndMonth(String vendorID, String month) {
        ArrayList<Notification> filteredNotifications = new ArrayList<>();
        ArrayList<Notification> notificationList = this.getNotificationsByVendorID(vendorID);

        for (Notification notification : notificationList) {
            String notificationMonth = notification.getNotiDateTime().getMonth().toString();
                
            String inputMonth = month.toUpperCase();

            if (notificationMonth.equalsIgnoreCase(inputMonth)) {
                    filteredNotifications.add(notification);
                
            }
        }
        return filteredNotifications;
    }
    
    public Notification createNotification(String senderID, String recipientID, String message, String status) {
        String notiID = String.format("%03d", new Random().nextInt(1000));
        
        Notification newNotification = new Notification(
            notiID,
            senderID,
            recipientID,
            message,
            LocalDateTime.now(),
            status
        );

        collection.add(newNotification);
        this.AddNewItem(newNotification);
        return newNotification;
    }
    
    
    public ArrayList<Notification> getNotificationsByVendorIDAndStatus(String vendorID, String status) {
        ArrayList<Notification> filteredNotifications = new ArrayList<>();
        ArrayList<Notification> notificationList = this.getNotificationsByVendorID(vendorID);

        for (Notification notification : notificationList) {
            if (notification.getRecipientID().equals(vendorID) && notification.getNotiStatus().equalsIgnoreCase(status)) {
                filteredNotifications.add(notification);
            }
        }

        return filteredNotifications;
    }
    
    public void markNotificationAsRead(String notiID, String vendorID) {
        ArrayList<Notification> notificationList = this.getNotificationsByVendorID(vendorID);
        for (Notification notification : notificationList) {
            if (notification.getNotiID().equals(notiID) && notification.getRecipientID().equals(vendorID)) {
                notification.setNotiStatus("Read");
                try {
                    saveNotificationsToDataStore();
                } catch (IOException ex) {
                    Logger.getLogger(NotificationHandler.class.getName()).log(Level.SEVERE, null, ex);
                }
                return;
            }
        }
    }

    private void saveNotificationsToDataStore() throws IOException {
        Notification[] notificationArray = notificationList.toArray(new Notification[0]);

        for (Notification notification : notificationArray) {
            this.UpdateItem(notification, notification);
        }
    }
    
    
}
