package StructuralPatterns.BridgeBardot.Message.Abstraction;

import StructuralPatterns.BridgeBardot.Message.Implementation.MessageSender;

public abstract class Message {
    public MessageSender messageSender;
    public String subject;
    public String body;
    public abstract void sendMessage();
}
