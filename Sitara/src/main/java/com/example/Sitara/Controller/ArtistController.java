package com.example.Sitara.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.Sitara.Entites.Artist;
import com.example.Sitara.service.ArtistServices.ArtistServiceImple;

@RestController
public class ArtistController {
	@Autowired
	ArtistServiceImple obj;

	@PostMapping("/artist/addArtist")
	public String addArtist(@RequestBody List<Artist> l) {
		return obj.addArtist(l);
	}

	@GetMapping("/artist/getAllArtist")
	public Iterable<Artist> getAllArtist() {
		return obj.getAllArtist();
	}

	@DeleteMapping("/artist/deleteAllArtist")
	public String deleteAllArtist() {
		return deleteAllArtist();
	}

	@DeleteMapping("/artist/deleteArtistItem/{id}")
	public String deleteArtistItem(@PathVariable int artistId) {
		return deleteArtistItem(artistId);
	}
}
