package StructuralPatterns.Adapter.Adaptee;

import StructuralPatterns.Adapter.Models.Xml;

public class DisplayerLegacy {
    public void display(Xml data) {
        System.out.println(data.getXml());
    }
}
