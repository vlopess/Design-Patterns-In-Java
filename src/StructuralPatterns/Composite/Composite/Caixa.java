package StructuralPatterns.Composite.Composite;


import StructuralPatterns.Composite.Components.Componente;

import java.util.ArrayList;
import java.util.List;

public class Caixa extends Componente {
    private final List<Componente> components;
    public Caixa() {
        components = new ArrayList<>();
    }
    public Caixa(Componente... components) {
        this.components = List.of(components);
    }

    @Override
    public void add(Componente componente) {
        components.add(componente);
    }

    @Override
    public void remove(Componente componente) {
        components.remove(componente);
    }

    @Override
    public Componente getByIndex(int index){
        return components.get(index);
    }

    @Override
    public double getPrice() {
       return components.stream().mapToDouble(Componente::getPrice).sum();
    }
}
