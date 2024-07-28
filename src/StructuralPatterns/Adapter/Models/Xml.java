package StructuralPatterns.Adapter.Models;

public class Xml {
    private String fileName;
    public Xml(String fileName) {
        this.fileName = fileName;
    }
    public String getXml() {
        return """
        <message> %s </message>
        """.formatted(fileName);
    }
}
