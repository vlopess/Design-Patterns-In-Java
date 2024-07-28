package StructuralPatterns.Composite.Components;

public abstract class Componente {

    public void add(Componente componente){
        throw new UnsupportedOperationException("Leaves don't have child components");
    }
    public void remove(Componente componente){
        throw new UnsupportedOperationException("Leaves don't have child components");
    }
    public Componente getByIndex(int index){
        throw new UnsupportedOperationException("Leaves don't have child components");
    }
    public abstract double getPrice();
}
