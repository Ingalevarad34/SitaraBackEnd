package com.example.Sitara.service.AllSongsServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Sitara.Entites.AllSongs;
import com.example.Sitara.repositories.AllSongsRepository;

@Service
public class AllSongsServiceImple implements AllSongServices {
	@Autowired
	AllSongsRepository obj;

	public String addAllSongs(List<AllSongs> l) {
		obj.saveAll(l);
		return "Added all items";
	}

	public Iterable<AllSongs> getAllSongs() {
		return obj.findAll();
	}

	public String deleteAllSongs() {
		obj.deleteAll();
		return "Deleted all items";
	}

	public String deleteAllSongsItem(int musicId) {
		obj.deleteById(musicId);
		return "Deleted the item";
	}
}
