package com.example.Sitara.Entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PlayListSongs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer musicId;

    private String musicName;
    private String artistName;
    private String imageUrl;
    private String audioUrl;

    public PlayListSongs() {
    }

    public PlayListSongs(Integer musicId, String musicName, String artistName, String imageUrl, String audioUrl) {
        this.musicId = musicId;
        this.musicName = musicName;
        this.artistName = artistName;
        this.imageUrl = imageUrl;
        this.audioUrl = audioUrl;
    }

    public Integer getMusicId() {
        return musicId;
    }

    public void setMusicId(Integer musicId) {
        this.musicId = musicId;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getAudioUrl() {
        return audioUrl;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }
}