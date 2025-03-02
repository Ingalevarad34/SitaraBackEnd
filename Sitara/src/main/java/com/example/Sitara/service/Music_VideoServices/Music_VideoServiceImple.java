package com.example.Sitara.service.Music_VideoServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Sitara.Entites.Music_Video;
import com.example.Sitara.repositories.Music_VideoRepository;

@Service
public class Music_VideoServiceImple {

	@Autowired
	Music_VideoRepository obj;
	
	public String addMusicVideo(List<Music_Video> l) {
		obj.saveAll(l);
		return "Added all items";
	}

	public Iterable<Music_Video> getAllMusicVideo() {
		return obj.findAll();
	}

	public String deleteAllMusicVideo() {
		obj.deleteAll();
		return "Deleted all items";
	}

	public String deleteMusicVideo(int musicId) {
		obj.deleteById(musicId);
		return "Deleted the item";
	}
	
}
