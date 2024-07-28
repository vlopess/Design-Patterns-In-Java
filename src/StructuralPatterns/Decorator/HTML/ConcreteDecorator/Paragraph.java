package StructuralPatterns.Decorator.HTML.ConcreteDecorator;

import StructuralPatterns.Decorator.HTML.AbstractDecorator.AbstractDecorator;
import StructuralPatterns.Decorator.HTML.Component.VisualComponent;

public class Paragraph extends AbstractDecorator {

    public Paragraph(VisualComponent component) {
        super(component);
    }
    @Override
    protected void opening() {
        System.out.print("<p>");
    }

    @Override
    protected void closing() {
        System.out.print("</p>");
    }
}
