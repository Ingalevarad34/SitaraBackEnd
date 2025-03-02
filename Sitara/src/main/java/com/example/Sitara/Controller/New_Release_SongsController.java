package com.example.Sitara.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Sitara.Entites.New_Release_Songs;
import com.example.Sitara.service.New_Release_SongsServices.New_Release_SongsServiceImple;

@RestController
public class New_Release_SongsController {
	
	@Autowired
	New_Release_SongsServiceImple obj;

	@PostMapping("/NewReleaseSongs/addNewReleaseSongs")
	public String addNewReleaseSongs(@RequestBody List<New_Release_Songs> l) {
		return obj.addNewReleaseSongs(l);
	}

	@GetMapping("/NewReleaseSongs/getAllNewReleaseSongs")
	public Iterable<New_Release_Songs> getAllNewReleaseSongs() {
		return obj.getAllNewReleaseSongs();
	}

	@DeleteMapping("/NewReleaseSongs/deleteAllNewReleaseSongs")
	public String deleteAllNewReleaseSongs() {
		return deleteAllNewReleaseSongs();
	}

	@DeleteMapping("/NewReleaseSongs/deleteNewReleaseSongsItem/{id}")
	public String deleteNewReleaseSongsItem(@PathVariable int musicId) {
		return deleteNewReleaseSongsItem(musicId);
	}
}
