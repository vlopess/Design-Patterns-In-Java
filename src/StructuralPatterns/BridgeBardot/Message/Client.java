package StructuralPatterns.BridgeBardot.Message;

import StructuralPatterns.BridgeBardot.Message.Abstraction.Message;
import StructuralPatterns.BridgeBardot.Message.ConcreteImplementation.EmailSender;
import StructuralPatterns.BridgeBardot.Message.ConcreteImplementation.MSMQSender;
import StructuralPatterns.BridgeBardot.Message.Implementation.MessageSender;
import StructuralPatterns.BridgeBardot.Message.RedefinedAbstraction.SystemMessage;
import StructuralPatterns.BridgeBardot.Message.RedefinedAbstraction.UserMessage;

public class Client {
    public static void main(String[] args) {
        MessageSender email = new EmailSender();
        MessageSender queue = new MSMQSender();

        Message message = new SystemMessage();
        message.subject = "victor@gmail.com";
        message.body = "System Message";

        message.messageSender = queue;
        message.sendMessage();

        UserMessage usermsg = new UserMessage();
        usermsg.subject = "Mensagem Teste";
        usermsg.body = "Olá, Essa é uma mensagem de teste";
        usermsg.message = "Espero que todos consigam fazer o exemplo";

        usermsg.messageSender = email;
        usermsg.sendMessage();
    }
}
