package StructuralPatterns.Adapter;

import StructuralPatterns.Adapter.Adapter.DisplayAdapter;
import StructuralPatterns.Adapter.Models.Json;
import StructuralPatterns.Adapter.Target.Displayer;
import StructuralPatterns.Adapter.Target.Target;

public class Client {
    public static void main(String[] args) {
        Target displayer = new DisplayAdapter();
        displayer.display(new Json("Content"));

    }
}
//Output:
//<message> Content </message>