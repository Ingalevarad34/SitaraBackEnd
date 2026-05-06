package com.example.Sitara.service.PlaylistServices;

import java.util.List;

import com.example.Sitara.Entites.PlayListSongs;

public interface PlayListSongsService {

    String addPlayListSongs(List<PlayListSongs> l);

    Iterable<PlayListSongs> getPlayListSongs();

    String deleteAllPlayListSongs();

    String deletePlayListSongsItem(int musicId);
}