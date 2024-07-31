package StructuralPatterns.Prova.Component;

import StructuralPatterns.Prova.Models.Credencial;

import java.util.Date;

public abstract class Component {
    protected String name;
    protected Date creationDate;

    public Component(String name, Date creationDate) {
        this.name = name;
        this.creationDate = creationDate;
    }

    public String getName() {
        return name;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public abstract Long tamanho();

    public void add(Component component) throws Exception {
        throw new Exception("Not implemented yet");
    }

    public void remove(Component component) throws Exception {
        throw new Exception("Not implemented yet");
    }

    public void ler(Credencial credencial) throws Exception {
        throw new Exception("Not implemented yet");
    }

}
