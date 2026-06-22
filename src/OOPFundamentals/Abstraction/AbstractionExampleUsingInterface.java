package OOPFundamentals.Abstraction;

/*
We covered interfaces in a previous chapter, so we'll keep this brief. But it's worth understanding how interfaces offer a different kind of abstraction.

While abstract classes are great for related classes that share common behavior, interfaces are perfect for unrelated classes that share a common capability.

A good example is sending notifications. An EmailNotifier, SMSNotifier, and PushNotifier have nothing in common structurally but they all share one capability: sending a message.
 */
public class AbstractionExampleUsingInterface {
}


 class EmailNotifierr implements Notifiable {
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}
class SMSNotifierr implements Notifiable {
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

 class PushNotifier implements Notifiable {
    public void send(String message) {
        System.out.println("Sending Push Notification: " + message);
    }
}