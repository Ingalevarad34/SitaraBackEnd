package com.example.Sitara.Entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Trending_Songs {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int musicId;
	private String musicName;
	private String artistName;
	private String smallDesc;
	private String musicType;
	private String language;
	private String imageUrl;
	private String audioUrl;
	private Boolean preimum;
	
	public int getMusicId() {
		return musicId;
	}
	public void setMusicId(int musicId) {
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
	public String getSmallDesc() {
		return smallDesc;
	}
	public void setSmallDesc(String smallDesc) {
		this.smallDesc = smallDesc;
	}
	public String getMusicType() {
		return musicType;
	}
	public void setMusicType(String musicType) {
		this.musicType = musicType;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
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
	public Boolean getPreimum() {
		return preimum;
	}
	public void setPreimum(Boolean preimum) {
		this.preimum = preimum;
	}
	
	

}
