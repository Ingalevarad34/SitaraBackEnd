package com.example.Sitara.service.New_Release_SongsServices;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Sitara.Entites.New_Release_Songs;
import com.example.Sitara.repositories.New_Release_SongsRepository;

@Service
public class New_Release_SongsServiceImple {
		
		@Autowired
		New_Release_SongsRepository obj;
		
		public String addNewReleaseSongs(List<New_Release_Songs> l) {
			obj.saveAll(l);
			return "Added all items";
		}

		public Iterable<New_Release_Songs> getAllNewReleaseSongs() {
			return obj.findAll();
		}

		public String deleteAllNewReleaseSongs() {
			obj.deleteAll();
			return "Deleted all items";
		}

		public String deleteNewReleaseSongs(int musicId) {
			obj.deleteById(musicId);
			return "Deleted the item";
		}
		
}
