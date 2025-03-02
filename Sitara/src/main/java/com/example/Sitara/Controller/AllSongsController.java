package com.example.Sitara.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Sitara.Entites.AllSongs;
import com.example.Sitara.service.AllSongsServices.AllSongsServiceImple;

@RestController
public class AllSongsController {
	@Autowired
	AllSongsServiceImple obj;

	@PostMapping("/allSongs/addAllSongs")
	public String addAllSongs(@RequestBody List<AllSongs> l) {
		return obj.addAllSongs(l);
	}

	@GetMapping("/allSongs/getAllSongs")
	public Iterable<AllSongs> getAllSongs() {
		return obj.getAllSongs();
	}

	@DeleteMapping("/allSongs/deleteAllSongs")
	public String deleteAllSongs() {
		return deleteAllSongs();
	}

	@DeleteMapping("/allSongs/deleteAllSongsItem/{id}")
	public String deleteAllSongsItem(@PathVariable int musicId) {
		return deleteAllSongsItem(musicId);
	}
}
