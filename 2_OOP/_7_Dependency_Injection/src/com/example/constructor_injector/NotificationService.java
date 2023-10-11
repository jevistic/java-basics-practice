package com.example.constructor_injector;

public class NotificationService {
    private final MessageSender messageSender;

    // Constructor injection
    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void sendNotification(String message) {
        // Using the injected messageSender to send the message
        messageSender.send(message);
    }
}
