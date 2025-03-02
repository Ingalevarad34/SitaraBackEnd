package com.example.Sitara.service.New_Release_SongsServices;

import java.util.List;

import com.example.Sitara.Entites.New_Release_Songs;



public interface New_Release_SongsService {

	String addweeklyTopSongs(List<New_Release_Songs> l);

	Iterable<New_Release_Songs> getAllNewReleaseSongs();

	String deleteAllNewReleaseSongs();

	String deleteNewReleaseSongsItem(int musicId);
}
