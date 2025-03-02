package com.example.Sitara.service.Mood_PlaylistServices;

import java.util.List;

import com.example.Sitara.Entites.Mood_Playlist;


public interface Mood_PlaylistServices {
	
	String addMoodPlaylist(List<Mood_Playlist> l);

	Iterable<Mood_Playlist> getAllMoodPlaylist();

	String deleteAllMoodPlaylist();

	String deleteMoodPlaylistItem(int musicId);
}
