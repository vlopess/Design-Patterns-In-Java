package StructuralPatterns.Adapter.Models;

public class Json {
    private String json;
    public Json(String json) {
        this.json = json;
    }
    public String getData(){
        return json;
    }
    public String getJson() {
        return """
        {
          "value": %s
        }
        """.formatted(json);
    }
}
