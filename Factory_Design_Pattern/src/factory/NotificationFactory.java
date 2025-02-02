package factory;

import model.EmailNotification;
import model.Notification;
import model.PushNotification;
import model.SMSNotification;

public class NotificationFactory {
    public static Notification getNotification(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        if (type.equalsIgnoreCase("SMS")) {
            return new SMSNotification();
        } else if (type.equalsIgnoreCase("EMAIL")) {
            return new EmailNotification();
        } else if (type.equalsIgnoreCase("PUSH")) {
            return new PushNotification();
        }
        return null;
    }
}
