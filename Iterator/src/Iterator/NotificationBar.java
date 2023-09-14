package iterator;

public class NotificationBar {
    Notification notifications;

    public NotificationBar() {
        this.notifications =
        new Notification(null);
    }

    public void printNotifications() {
        Iterator iterator =
        notifications.createIterator();
        System.out.println(
            "-----------------NOTIFICATION BAR--------------");
            while (iterator.hasNext()) {
                Notification h =
                (Notification)iterator.next();
                Notification n;
                System.out.print(n.getNotification());
            }
    }
}
