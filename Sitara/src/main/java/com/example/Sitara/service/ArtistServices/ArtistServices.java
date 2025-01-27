package com.example.Sitara.service.ArtistServices;

import java.util.List;

import com.example.Sitara.Entites.Artist;

public interface ArtistServices {
	String addArtist(List<Artist> l);

	Iterable<Artist> getAllArtist();

	String deleteAllArtist();

	String deleteArtistItem(int artistId);
}
