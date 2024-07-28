package StructuralPatterns.Adapter.Target;

import StructuralPatterns.Adapter.Models.Json;

public class Displayer implements Target {

    @Override
    public void display(Json data) {
        System.out.println(data.getJson());
    }
}
