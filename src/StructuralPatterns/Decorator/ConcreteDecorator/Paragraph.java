package StructuralPatterns.Decorator.ConcreteDecorator;

import StructuralPatterns.Decorator.AbstractDecorator.AbstractDecorator;
import StructuralPatterns.Decorator.Component.VisualComponent;

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

    @Override
    public void draw(){
        opening();
        super.draw();
        closing();
    }
}
