package StructuralPatterns.Decorator.Protocolo.ConcreteComponent;

import StructuralPatterns.Decorator.Protocolo.Component.Protocolo;

public class TCPIP implements Protocolo {

    @Override
    public void send(String message) {
        System.out.println("TCP/IP sends message: " + message);
    }

}
