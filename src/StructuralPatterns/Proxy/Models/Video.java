package StructuralPatterns.Proxy.Models;

public class Video {
    private final String url;

    public Video(String title) {
        this.url = title;
    }
    public String getUrl() {
        return url;
    }

}
