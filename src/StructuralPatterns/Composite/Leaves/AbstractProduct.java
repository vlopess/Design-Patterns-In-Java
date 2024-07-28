package StructuralPatterns.Composite.Leaves;

import StructuralPatterns.Composite.Components.Componente;

public abstract class AbstractProduct extends Componente {
    protected String name;
    protected double price;
    public AbstractProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
