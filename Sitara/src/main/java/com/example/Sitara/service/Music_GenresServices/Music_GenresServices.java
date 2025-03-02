package com.example.Sitara.service.Music_GenresServices;

import java.util.List;
import com.example.Sitara.Entites.Music_Genres;


public interface Music_GenresServices {
	
	String addMusicGenres(List<Music_Genres> l);

	Iterable<Music_Genres> getAllMusicGenres();

	String deleteAllMusicGenres();

	String deleteMusicGenresItem(int musicId);
}
