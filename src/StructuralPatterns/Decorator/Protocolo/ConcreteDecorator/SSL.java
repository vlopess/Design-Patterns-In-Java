package StructuralPatterns.Decorator.Protocolo.ConcreteDecorator;

import StructuralPatterns.Decorator.Protocolo.AbstractDecorator.AbstractDecorator;
import StructuralPatterns.Decorator.Protocolo.Component.Protocolo;

import java.util.Base64;

public class SSL extends AbstractDecorator {
    public SSL(Protocolo component) {
        super(component);
    }

    @Override
    public void send(String message) {
        super.send(encrypt(message));
    }

    private String encrypt(String message) {
        Base64.Encoder encoder = Base64.getEncoder();
        return encoder.encodeToString(message.getBytes());
    }

}
