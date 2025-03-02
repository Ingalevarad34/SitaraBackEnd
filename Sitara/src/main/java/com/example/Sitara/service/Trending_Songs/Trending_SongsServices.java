package com.example.Sitara.service.Trending_Songs;

import java.util.List;
import com.example.Sitara.Entites.Trending_Songs;

public interface Trending_SongsServices {
	
	String addTrendingSongs(List<Trending_Songs> l);

	Iterable<Trending_Songs> getAllTrendingSongs();

	String deleteAllTrendingSongs();

	String deleteTrendingSongsItem(int musicId);

}
