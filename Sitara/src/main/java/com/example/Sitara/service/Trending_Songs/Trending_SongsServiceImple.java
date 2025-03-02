package com.example.Sitara.service.Trending_Songs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Sitara.Entites.Trending_Songs;
import com.example.Sitara.repositories.Trending_SongsRepository;

@Service
public class Trending_SongsServiceImple {

	@Autowired
	Trending_SongsRepository obj;
	
	public String addTrendingSongs(List<Trending_Songs> l) {
		obj.saveAll(l);
		return "Added all items";
	}

	public Iterable<Trending_Songs> getAllTrendingSongs() {
		return obj.findAll();
	}

	public String deleteAllTrendingSongs() {
		obj.deleteAll();
		return "Deleted all items";
	}

	public String deleteTrendingSongsItem(int musicId) {
		obj.deleteById(musicId);
		return "Deleted the item";
	}
}
