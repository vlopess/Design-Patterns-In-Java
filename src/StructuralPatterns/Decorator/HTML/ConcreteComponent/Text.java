package StructuralPatterns.Decorator.HTML.ConcreteComponent;

import StructuralPatterns.Decorator.HTML.Component.VisualComponent;

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
