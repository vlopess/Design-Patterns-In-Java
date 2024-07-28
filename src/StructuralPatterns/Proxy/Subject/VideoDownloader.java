package StructuralPatterns.Proxy.Subject;

import StructuralPatterns.Proxy.Models.Video;

public interface VideoDownloader {
    Video getVideo(String url);
}
