package com.example.Sitara.service.PlaylistServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Sitara.Entites.PlayListSongs;
import com.example.Sitara.repositories.PlayListSongsRepository;

@Service
public class PlayListSongsServiceImple implements PlayListSongsService {

    @Autowired
    PlayListSongsRepository obj;

    public String addPlayListSongs(List<PlayListSongs> l) {

        obj.saveAll(l);
        return "Added all items";
    }

    public Iterable<PlayListSongs> getPlayListSongs() {

        return obj.findAll();
    }

    public String deleteAllPlayListSongs() {

        obj.deleteAll();
        return "Deleted all items";
    }

    public String deletePlayListSongsItem(int musicId) {

        obj.deleteById(musicId);
        return "Deleted the item";
    }
}