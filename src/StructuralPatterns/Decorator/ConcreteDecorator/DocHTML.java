package StructuralPatterns.Decorator.ConcreteDecorator;

import StructuralPatterns.Decorator.AbstractDecorator.AbstractDecorator;
import StructuralPatterns.Decorator.Component.VisualComponent;

public class DocHTML extends AbstractDecorator {

    public DocHTML(VisualComponent component) {
        super(component);
    }

    @Override
    protected void opening() {
        System.out.print("""
        <!doctype html>
        <html>
          <head>
            <meta charset="utf-8" />
            <meta name="viewport" content="width=device-width" />
          </head>
          <body>
       """);
    }

    @Override
    protected void closing() {
        System.out.print("""
           \n</body>
        </html>
        """);
    }

    @Override
    public void draw(){
        opening();
        super.draw();
        closing();
    }
}
