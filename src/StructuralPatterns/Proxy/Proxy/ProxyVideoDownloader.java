package StructuralPatterns.Proxy.Proxy;

import StructuralPatterns.Proxy.Models.Video;
import StructuralPatterns.Proxy.RealSubject.RealVideoDownloader;
import StructuralPatterns.Proxy.Subject.VideoDownloader;

import java.util.HashMap;

public class ProxyVideoDownloader implements VideoDownloader {
    private final HashMap<String, Video> videosCache = new HashMap<>();
    private final RealVideoDownloader videoDownloader = new RealVideoDownloader();
    @Override
    public Video getVideo(String url) {
        if (url.startsWith("http:")) {
            System.out.println("HTTP links are not secure");
            return null;
        }
        if (url.contains(".mp3")) {
            System.out.println("Não é possivel baixar mp3!");
            return null;
        }
        if (!videosCache.containsKey(url)) {
            videosCache.put(url, videoDownloader.getVideo(url));
        }
        return videosCache.get(url);
    }
}
