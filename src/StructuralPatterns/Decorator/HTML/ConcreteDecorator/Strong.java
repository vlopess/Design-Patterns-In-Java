package StructuralPatterns.Decorator.HTML.ConcreteDecorator;

import StructuralPatterns.Decorator.HTML.AbstractDecorator.AbstractDecorator;
import StructuralPatterns.Decorator.HTML.Component.VisualComponent;

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
}
