package StructuralPatterns.Decorator.HTML.AbstractDecorator;

import StructuralPatterns.Decorator.HTML.Component.VisualComponent;

public abstract class AbstractDecorator implements VisualComponent {
    private final VisualComponent component;

    public AbstractDecorator(VisualComponent component) {
        this.component = component;
    }

    protected abstract void opening();
    protected abstract void closing();

    @Override
    public void draw(){
        opening();
        component.draw();
        closing();
    }
}
