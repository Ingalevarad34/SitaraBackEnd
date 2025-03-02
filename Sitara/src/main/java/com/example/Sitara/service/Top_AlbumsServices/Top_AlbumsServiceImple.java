package com.example.Sitara.service.Top_AlbumsServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Sitara.Entites.Top_Albums;
import com.example.Sitara.repositories.Top_AlbumsRepository;

@Service
public class Top_AlbumsServiceImple implements Top_AlbumsServices{

	@Autowired
	Top_AlbumsRepository obj;
	
	public String addTopAlbums(List<Top_Albums> l) {
		obj.saveAll(l);
		return "Added all items";
	}

	public Iterable<Top_Albums> getAllTopAlbums() {
		return obj.findAll();
	}

	public String deleteAllTopAlbums() {
		obj.deleteAll();
		return "Deleted all items";
	}

	public String deleteTopAlbumsItem(int musicId) {
		obj.deleteById(musicId);
		return "Deleted the item";
	}
}
