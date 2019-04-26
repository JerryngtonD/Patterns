package com.patterns.Proxy;

import java.util.HashMap;

public interface Service {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
