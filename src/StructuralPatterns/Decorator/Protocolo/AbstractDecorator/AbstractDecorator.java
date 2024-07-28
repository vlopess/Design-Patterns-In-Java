package StructuralPatterns.Decorator.Protocolo.AbstractDecorator;

import StructuralPatterns.Decorator.Protocolo.Component.Protocolo;

public abstract class AbstractDecorator implements Protocolo {
    private final Protocolo protocolo;

    public AbstractDecorator(Protocolo protocolo) {
        this.protocolo = protocolo;
    }
    @Override
    public void send(String message) {
        protocolo.send(message);
    }
}
