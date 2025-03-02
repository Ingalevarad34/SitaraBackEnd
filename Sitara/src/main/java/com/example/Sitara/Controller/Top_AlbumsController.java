package com.example.Sitara.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.Sitara.Entites.Top_Albums;
import com.example.Sitara.service.Top_AlbumsServices.Top_AlbumsServiceImple;

@RestController
public class Top_AlbumsController {

	@Autowired
	Top_AlbumsServiceImple obj;

	@PostMapping("/TopAlbums/addTopAlbums")
	public String addTopAlbums(@RequestBody List<Top_Albums> l) {
		return obj.addTopAlbums(l);
	}

	@GetMapping("/TopAlbums/getAllTopAlbums")
	public Iterable<Top_Albums> getAllTopAlbums() {
		return obj.getAllTopAlbums();
	}

	@DeleteMapping("/TopAlbums/deleteAllTopAlbums") 
	public String deleteAllTopAlbums() {
		return deleteAllTopAlbums();
	}

	@DeleteMapping("/TopAlbums/TopAlbumsItem/{id}")
	public String deleteTopAlbumsItem(@PathVariable int musicId) {
		return deleteTopAlbumsItem(musicId);
	}
	
}
