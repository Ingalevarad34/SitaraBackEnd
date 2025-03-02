package com.example.Sitara.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Sitara.Entites.Music_Genres;
import com.example.Sitara.service.Music_GenresServices.Music_GenresServiceImple;

@RestController
public class Music_GenresController {

	@Autowired
	Music_GenresServiceImple obj;

	@PostMapping("/MusicGenres/addMusicGenres")
	public String addMusicGenres(@RequestBody List<Music_Genres> l) {
		return obj.addMusicGenres(l);
	}

	@GetMapping("/MusicGenres/getAllMusicGenres")
	public Iterable<Music_Genres> getAllMusicGenres() {
		return obj.getAllMusicGenres();
	}

	@DeleteMapping("/MusicGenres/deleteAllMusicGenres")
	public String deleteAllMusicGenres() {
		return deleteAllMusicGenres();
	}

	@DeleteMapping("/MusicGenres/MusicGenresItem/{id}")
	public String deleteMusicGenresItem(@PathVariable int musicId) {
		return deleteMusicGenresItem(musicId);
	}

}
