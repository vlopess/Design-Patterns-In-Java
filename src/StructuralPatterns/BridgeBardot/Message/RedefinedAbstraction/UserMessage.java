package StructuralPatterns.BridgeBardot.Message.RedefinedAbstraction;

import StructuralPatterns.BridgeBardot.Message.Abstraction.Message;

public class UserMessage extends Message {
    public String message;
    @Override
    public void sendMessage() {
        String fullBody = body + ",\nUser Comments: " + message;
        super.messageSender.sendMessage(subject, fullBody);
    }
}
