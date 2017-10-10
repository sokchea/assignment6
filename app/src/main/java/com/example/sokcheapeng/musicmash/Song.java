package com.example.sokcheapeng.musicmash;

/**
 * Created by sokcheapeng on 10/9/17.
 */

public class Song {
    private String title;
    private String linked;
    private String singer;
    private String album;

    public Song(String title) {
        this.title = title;
    }

    public Song(String title, String linked, String singer, String album) {
        this.title = title;
        this.linked = linked;
        this.singer = singer;
        this.album = album;
    }
}
