package com.example.Sitara.Entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mood_Playlist {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int musicId;
	private String albumName;
	private String artistName;
	private String imageUrl;
	@Column(columnDefinition = "TEXT")
	private String albumSongs;
	
	public int getMusicId() {
		return musicId;
	}
	public void setMusicId(int musicId) {
		this.musicId = musicId;
	}
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
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
	public String getAlbumSongs() {
		return albumSongs;
	}
	public void setAlbumSongs(String albumSongs) {
		this.albumSongs = albumSongs;
	}
	
	
}
