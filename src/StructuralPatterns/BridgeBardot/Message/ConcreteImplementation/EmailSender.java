package StructuralPatterns.BridgeBardot.Message.ConcreteImplementation;

import StructuralPatterns.BridgeBardot.Message.Implementation.MessageSender;

public class EmailSender implements MessageSender {

    @Override
    public void sendMessage(String subject, String body) {
        System.out.println("Email sent to " + subject + "\n Subject: " + body);
    }
}
