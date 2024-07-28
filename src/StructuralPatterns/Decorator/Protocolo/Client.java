package StructuralPatterns.Decorator.Protocolo;

import StructuralPatterns.Decorator.Protocolo.Component.Protocolo;
import StructuralPatterns.Decorator.Protocolo.ConcreteComponent.TCPIP;
import StructuralPatterns.Decorator.Protocolo.ConcreteDecorator.SSL;

public class Client {
    public static void main(String[] args) {
        Protocolo protocolo = new SSL(new TCPIP());
        protocolo.send("Olá Mundo");
    }
}
