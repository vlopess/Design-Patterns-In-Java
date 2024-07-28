package StructuralPatterns.Adapter.Adapter;

import StructuralPatterns.Adapter.Adaptee.DisplayerLegacy;
import StructuralPatterns.Adapter.Models.Json;
import StructuralPatterns.Adapter.Models.Xml;
import StructuralPatterns.Adapter.Target.Target;

//Adapter de objeto
public class DisplayAdapter implements Target {
    private final DisplayerLegacy displayer = new DisplayerLegacy();

    @Override
    public void display(Json data) {
        Xml dataXml = convertJsonToXml(data);
        displayer.display(dataXml);
    }

    private Xml convertJsonToXml(Json data) {
        return new Xml(data.getData());
    }
}

//Adapter de classe
//public class DisplayAdapter extends DisplayerLegacy implements Target {
//
//    @Override
//    public void display(Json data) {
//        Xml dataXml = convertJsonToXml(data);
//        super.display(dataXml);
//    }
//
//    private Xml convertJsonToXml(Json data) {
//        return new Xml(data.getData());
//    }
//}
