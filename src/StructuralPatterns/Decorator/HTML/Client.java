package StructuralPatterns.Decorator.HTML;

import StructuralPatterns.Decorator.HTML.Component.VisualComponent;
import StructuralPatterns.Decorator.HTML.ConcreteComponent.Text;
import StructuralPatterns.Decorator.HTML.ConcreteDecorator.DocHTML;
import StructuralPatterns.Decorator.HTML.ConcreteDecorator.Paragraph;
import StructuralPatterns.Decorator.HTML.ConcreteDecorator.Strong;

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