package com.leo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private final Music music;
    private final Music music1;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music, @Qualifier("classicalMusic") Music music1) {
        this.music = music;
        this.music1 = music1;
    }

    public String playMusic() {
        return "Playing: " + music.getSong() + ", " + music1.getSong();
    }
}
