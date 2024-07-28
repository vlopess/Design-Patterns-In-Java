package StructuralPatterns.Decorator.ConcreteComponent;

import StructuralPatterns.Decorator.Component.VisualComponent;

public class Text implements VisualComponent {
    private final String text;

    public Text(String text) {
        this.text = text;
    }
    @Override
    public void draw() {
        System.out.print(text);
    }
}
