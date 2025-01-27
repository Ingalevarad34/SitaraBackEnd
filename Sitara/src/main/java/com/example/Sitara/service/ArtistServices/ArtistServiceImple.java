package com.example.Sitara.service.ArtistServices;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Sitara.Entites.Artist;
import com.example.Sitara.repositories.ArtistRepository;

@Service
public class ArtistServiceImple implements ArtistServices {
	@Autowired
	ArtistRepository obj;

	public String addArtist(List<Artist> l) {
		obj.saveAll(l);
		return "Added all items";
	}

	public Iterable<Artist> getAllArtist() {
		return obj.findAll();
	}

	public String deleteAllArtist() {
		obj.deleteAll();
		return "Deleted all items";
	}

	public String deleteArtistItem(int artistId) {
		obj.deleteById(artistId);
		return "Deleted the item";
	}
}
