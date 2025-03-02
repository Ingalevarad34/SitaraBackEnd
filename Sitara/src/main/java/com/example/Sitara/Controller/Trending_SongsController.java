package com.example.Sitara.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.Sitara.Entites.Trending_Songs;
import com.example.Sitara.service.Trending_Songs.Trending_SongsServiceImple;

@RestController
public class Trending_SongsController {

	@Autowired
	Trending_SongsServiceImple obj;

	@PostMapping("/TrendingSongs/addTrendingSongs")
	public String addTrendingSongs(@RequestBody List<Trending_Songs> l) {
		return obj.addTrendingSongs(l);
	}

	@GetMapping("/TrendingSongs/getAllTrendingSongs")
	public Iterable<Trending_Songs> getAllTrendingSongs() {
		return obj.getAllTrendingSongs();
	}

	@DeleteMapping("/TrendingSongs/deleteAllTrendingSongs") 
	public String deleteAllTrendingSongs() {
		return deleteAllTrendingSongs();
	}

	@DeleteMapping("/TrendingSongs/TrendingSongsItem/{id}")
	public String deleteTrendingSongsItem(@PathVariable int musicId) {
		return deleteTrendingSongsItem(musicId);
	}
}
