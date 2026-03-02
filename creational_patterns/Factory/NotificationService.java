package creational_patterns.Factory;

public class NotificationService {
    public void sendNotification(String type, String message) {
        Notification notification = SimpleNotificationFactory.createNotification(type);
        notification.send(message);
    }
}
