package StructuralPatterns.Decorator.HTML.ConcreteDecorator;

import StructuralPatterns.Decorator.HTML.AbstractDecorator.AbstractDecorator;
import StructuralPatterns.Decorator.HTML.Component.VisualComponent;

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
}
