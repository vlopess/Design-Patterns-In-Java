package StructuralPatterns.Decorator.ConcreteDecorator;

import StructuralPatterns.Decorator.AbstractDecorator.AbstractDecorator;
import StructuralPatterns.Decorator.Component.VisualComponent;

public class Strong extends AbstractDecorator {
    public Strong(VisualComponent component) {
        super(component);
    }

    @Override
    protected void opening() {
        System.out.print("<strong>");
    }

    @Override
    protected void closing() {
        System.out.print("</strong>");
    }

    @Override
    public void draw(){
        opening();
        super.draw();
        closing();
    }
}
