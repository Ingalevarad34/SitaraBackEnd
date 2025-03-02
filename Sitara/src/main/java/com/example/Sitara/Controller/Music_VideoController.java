package com.example.Sitara.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Sitara.Entites.Music_Video;
import com.example.Sitara.service.Music_VideoServices.Music_VideoServiceImple;


@RestController
public class Music_VideoController {
	
	@Autowired
	Music_VideoServiceImple obj;

	@PostMapping("/MusicVideo/addMusicVideo")
	public String addMusicVideo(@RequestBody List<Music_Video> l) {
		return obj.addMusicVideo(l);
	}

	@GetMapping("/MusicVideo/getAllMusicVideo")
	public Iterable<Music_Video> getAllMusicVideo() {
		return obj.getAllMusicVideo();
	}

	@DeleteMapping("/MusicVideo/deleteAllMusicVideo")
	public String deleteAllMusicVideo() {
		return deleteAllMusicVideo();
	}

	@DeleteMapping("/MusicVideo/MusicVideoItem/{id}")
	public String deleteMusicVideoItem(@PathVariable int musicId) {
		return deleteMusicVideoItem(musicId);
	}

}
