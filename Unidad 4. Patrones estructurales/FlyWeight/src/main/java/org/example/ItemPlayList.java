package org.example;

import java.util.Arrays;

public class ItemPlayList {

    private Long id;
    private String songName;
    private byte[] song = new byte[1000000];

    public ItemPlayList(Long id, String songName) {
        this.id = id;
        this.songName = songName;
    }

    public ItemPlayList() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public byte[] getSong() {
        return song;
    }

    public void setSong(byte[] song) {
        this.song = song;
    }

    @Override
    public String toString() {
        return "ItemPlayList{" +
                "id=" + id +
                ", songName='" + songName + '\'' +
                '}';
    }
}
