package StructuralPatterns.BridgeBardot.Message.RedefinedAbstraction;

import StructuralPatterns.BridgeBardot.Message.Abstraction.Message;

public class SystemMessage extends Message {
    @Override
    public void sendMessage() {
        super.messageSender.sendMessage(subject, body);
    }
}
