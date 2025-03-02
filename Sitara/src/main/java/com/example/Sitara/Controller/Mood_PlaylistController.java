package com.example.Sitara.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Sitara.Entites.Mood_Playlist;
import com.example.Sitara.service.Mood_PlaylistServices.Mood_PlaylistServiceImple;

@RestController
public class Mood_PlaylistController {
	
	@Autowired
	Mood_PlaylistServiceImple obj;

	@PostMapping("/MoodPlaylist/addMoodPlaylist")
	public String addMoodPlaylist(@RequestBody List<Mood_Playlist> l) {
		return obj.addMoodPlaylist(l);
	}

	@GetMapping("/MoodPlaylist/getAllMoodPlaylist")
	public Iterable<Mood_Playlist> getAllMoodPlaylist() {
		return obj.getAllMoodPlaylist();
	}

	@DeleteMapping("/MoodPlaylist/deleteAllMoodPlaylist") 
	public String deleteAllMoodPlaylist() {
		return deleteAllMoodPlaylist();
	}

	@DeleteMapping("/MoodPlaylist/MoodPlaylistItem/{id}")
	public String deleteMoodPlaylistItem(@PathVariable int musicId) {
		return deleteMoodPlaylistItem(musicId);
	}
	
	

}
