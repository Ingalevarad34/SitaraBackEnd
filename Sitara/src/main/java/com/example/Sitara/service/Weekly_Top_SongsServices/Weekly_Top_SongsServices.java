package com.example.Sitara.service.Weekly_Top_SongsServices;

import java.util.List;

import com.example.Sitara.Entites.Weekly_Top_Songs;

public interface Weekly_Top_SongsServices {
	String addweeklyTopSongs(List<Weekly_Top_Songs> l);

	Iterable<Weekly_Top_Songs> getAllweeklyTopSongs();

	String deleteAllweeklyTopSongs();

	String deleteweeklyTopSongsItem(int musicId);
}
