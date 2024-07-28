package StructuralPatterns.Proxy;

import StructuralPatterns.Proxy.Proxy.ProxyVideoDownloader;
import StructuralPatterns.Proxy.Subject.VideoDownloader;

public class Client {
    public static void main(String[] args) {
        VideoDownloader videoDownloader = new ProxyVideoDownloader();
        videoDownloader.getVideo("https://youtube.mp4");
        videoDownloader.getVideo("https://instagram.mp4");
        videoDownloader.getVideo("https://youtube.mp4");
        videoDownloader.getVideo("https://youtube.mp4");
        videoDownloader.getVideo("https://instagram.mp4");
        videoDownloader.getVideo("https://youtube.mp4");
        videoDownloader.getVideo("https://instagram.mp4");
        videoDownloader.getVideo("https://instagram.mp3");
        videoDownloader.getVideo("http://teste.com");
    }
}
//Output:
//Connecting to internet...
//Downloading video: https://youtube.mp4
//Connecting to internet...
//Downloading video: https://instagram.mp4
//Não é possivel baixar mp3!
//HTTP links are not secure