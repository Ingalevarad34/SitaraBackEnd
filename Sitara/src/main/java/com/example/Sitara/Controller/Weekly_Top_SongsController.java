package com.example.Sitara.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Sitara.Entites.Weekly_Top_Songs;
import com.example.Sitara.service.Weekly_Top_SongsServices.Weekly_Top_SongsServiceImple;

@RestController
public class Weekly_Top_SongsController { 
	@Autowired
	Weekly_Top_SongsServiceImple obj;

	@PostMapping("/weeklyTopSongs/addweeklyTopSongs")
	public String addweeklyTopSongs(@RequestBody List<Weekly_Top_Songs> l) {
		return obj.addweeklyTopSongs(l);
	}

	@GetMapping("/weeklyTopSongs/getAllweeklyTopSongs")
	public Iterable<Weekly_Top_Songs> getAllweeklyTopSongs() {
		return obj.getAllweeklyTopSongs();
	}

	@DeleteMapping("/weeklyTopSongs/deleteAllweeklyTopSongs")
	public String deleteAllweeklyTopSongs() {
		return deleteAllweeklyTopSongs();
	}

	@DeleteMapping("/weeklyTopSongs/deleteweeklyTopSongsItem/{id}")
	public String deleteweeklyTopSongsItem(@PathVariable int musicId) {
		return deleteweeklyTopSongsItem(musicId);
	}

}
