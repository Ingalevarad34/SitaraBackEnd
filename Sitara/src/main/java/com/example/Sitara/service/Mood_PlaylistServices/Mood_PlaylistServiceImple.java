package com.example.Sitara.service.Mood_PlaylistServices;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Sitara.Entites.Mood_Playlist;
import com.example.Sitara.repositories.Mood_PlaylistRepository;

@Service
public class Mood_PlaylistServiceImple implements Mood_PlaylistServices{

	@Autowired
	Mood_PlaylistRepository obj;
	
	public String addMoodPlaylist(List<Mood_Playlist> l) {
		obj.saveAll(l);
		return "Added all items";
	}

	public Iterable<Mood_Playlist> getAllMoodPlaylist() {
		return obj.findAll();
	}

	public String deleteAllMoodPlaylist() {
		obj.deleteAll();
		return "Deleted all items";
	}

	public String deleteMoodPlaylistItem(int musicId) {
		obj.deleteById(musicId);
		return "Deleted the item";
	}
}
