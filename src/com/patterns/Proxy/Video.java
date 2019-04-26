package com.patterns.Proxy;

public class Video {
    public String id;
    public String title;
    public String data;

    Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random video.";
    }

    Video(String id, String title, String data) {
        this(id, title);
        this.data = data;
    }
}