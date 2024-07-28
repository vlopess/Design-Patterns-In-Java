package StructuralPatterns.Proxy.RealSubject;

import StructuralPatterns.Proxy.Models.Video;
import StructuralPatterns.Proxy.Subject.VideoDownloader;

public class RealVideoDownloader implements VideoDownloader {
    @Override
    public Video getVideo(String url) {
        System.out.println("Connecting to internet...");
        System.out.println("Downloading video: " + url);
        return new Video(url);
    }
}
