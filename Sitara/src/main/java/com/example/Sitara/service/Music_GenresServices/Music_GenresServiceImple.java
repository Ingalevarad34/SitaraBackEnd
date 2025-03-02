package com.example.Sitara.service.Music_GenresServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Sitara.Entites.Music_Genres;
import com.example.Sitara.repositories.Music_GenresRepository;

@Service
public class Music_GenresServiceImple implements Music_GenresServices{

	@Autowired
	Music_GenresRepository obj;
	
	public String addMusicGenres(List<Music_Genres> l) {
		obj.saveAll(l);
		return "Added all items";
	}

	public Iterable<Music_Genres> getAllMusicGenres() {
		return obj.findAll();
	}

	public String deleteAllMusicGenres() {
		obj.deleteAll();
		return "Deleted all items";
	}

	public String deleteMusicGenresItem(int musicId) {
		obj.deleteById(musicId);
		return "Deleted the item";
	}



	
}
