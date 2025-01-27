package com.example.Sitara.service.Weekly_Top_SongsServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Sitara.Entites.Weekly_Top_Songs;
import com.example.Sitara.repositories.Weekly_Top_SongsRepository;

@Service
public class Weekly_Top_SongsServiceImple implements Weekly_Top_SongsServices {
	@Autowired
	Weekly_Top_SongsRepository obj;
	
	public String addweeklyTopSongs(List<Weekly_Top_Songs> l) {
		obj.saveAll(l);
		return "Added all items";
	}

	public Iterable<Weekly_Top_Songs> getAllweeklyTopSongs() {
		return obj.findAll();
	}

	public String deleteAllweeklyTopSongs() {
		obj.deleteAll();
		return "Deleted all items";
	}

	public String deleteweeklyTopSongsItem(int musicId) {
		obj.deleteById(musicId);
		return "Deleted the item";
	}
}
