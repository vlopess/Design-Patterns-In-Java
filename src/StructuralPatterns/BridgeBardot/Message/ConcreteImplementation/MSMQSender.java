package StructuralPatterns.BridgeBardot.Message.ConcreteImplementation;

import StructuralPatterns.BridgeBardot.Message.Implementation.MessageSender;

public class MSMQSender implements MessageSender {
    @Override
    public void sendMessage(String subject, String body) {
        System.out.println("Sending Message in MSMQ: " + subject + " " + body);
    }
}
