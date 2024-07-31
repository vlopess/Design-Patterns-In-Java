package StructuralPatterns.Prova.Composite;


import StructuralPatterns.Prova.Component.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pasta extends Component {
    private List<Component> components;

    public Pasta(String name, Date creationDate) {
        super(name, creationDate);
        this.components = new ArrayList<>();
    }

    @Override
    public Long tamanho() {
        return components.stream().mapToLong(Component::tamanho).sum();
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

}
