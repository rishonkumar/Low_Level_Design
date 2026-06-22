package OOPFundamentals.Abstraction;

public class AbstractionExample {
}

abstract class Notifier {
    protected String senderName;

    public Notifier(String senderName) {
        this.senderName = senderName;
    }

    // Every subclass MUST implement this in their own way
    abstract void send(String message);

    // Shared logic — written once, used by everyone
    String formatMessage(String message) {
        return "[" + senderName + "] " + message;
    }
}

class EmailNotifier extends Notifier {
    public EmailNotifier(String senderName) {
        super(senderName);
    }

    @Override
    void send(String message) {
        System.out.println("Sending Email: " + formatMessage(message));
    }
}

class SMSNotifier extends Notifier {
    private String phoneNumber;

    public SMSNotifier(String senderName, String phoneNumber) {
        super(senderName);
        this.phoneNumber = phoneNumber;
    }

    @Override
    void send(String message) {
        System.out.println("Sending SMS to " + phoneNumber + ": " + formatMessage(message));
    }
}
