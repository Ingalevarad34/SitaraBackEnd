package com.example.Sitara.service.AllSongsServices;

import java.util.List;

import com.example.Sitara.Entites.AllSongs;

public interface AllSongServices {
	String addAllSongs(List<AllSongs> l);

	Iterable<AllSongs> getAllSongs();

	String deleteAllSongs();

	String deleteAllSongsItem(int musicId);
}
