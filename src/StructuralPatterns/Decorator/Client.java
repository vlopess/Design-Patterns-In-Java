package StructuralPatterns.Decorator;

import StructuralPatterns.Decorator.Component.VisualComponent;
import StructuralPatterns.Decorator.ConcreteComponent.Text;
import StructuralPatterns.Decorator.ConcreteDecorator.DocHTML;
import StructuralPatterns.Decorator.ConcreteDecorator.Paragraph;
import StructuralPatterns.Decorator.ConcreteDecorator.Strong;

public class Client {
    public static void main(String[] args) {
        VisualComponent visualComponent = new DocHTML(new Paragraph(new Strong( new Text("Hello World!"))));
        visualComponent.draw();
    }
}
//Output:
// <!doctype html>
// <html>
//   <head>
//     <meta charset="utf-8" />
//     <meta name="viewport" content="width=device-width" />
//   </head>
//   <body>
//<p><strong>Hello World!</strong></p>
//</body>
//</html>