package com.example.Sitara.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Sitara.Entites.PlayListSongs;
import com.example.Sitara.service.PlaylistServices.PlayListSongsServiceImple;

@RestController
public class PlayListSongsController {

    @Autowired
    PlayListSongsServiceImple obj;

    @PostMapping("/playListSongs/addPlayListSongs")
    public String addPlayListSongs(@RequestBody List<PlayListSongs> l) {

        return obj.addPlayListSongs(l);
    }

    @GetMapping("/playListSongs/getPlayListSongs")
    public Iterable<PlayListSongs> getPlayListSongs() {

        return obj.getPlayListSongs();
    }

    @DeleteMapping("/playListSongs/deleteAllPlayListSongs")
    public String deleteAllPlayListSongs() {

        return obj.deleteAllPlayListSongs();
    }

    @DeleteMapping("/playListSongs/deletePlayListSongsItem/{musicId}")
    public String deletePlayListSongsItem(@PathVariable int musicId) {

        return obj.deletePlayListSongsItem(musicId);
    }
}