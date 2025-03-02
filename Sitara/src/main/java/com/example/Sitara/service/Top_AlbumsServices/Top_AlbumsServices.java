package com.example.Sitara.service.Top_AlbumsServices;

import java.util.List;


import com.example.Sitara.Entites.Top_Albums;

public interface Top_AlbumsServices {

	String addTopAlbums(List<Top_Albums> l);

	Iterable<Top_Albums> getAllTopAlbums();

	String deleteAllTopAlbums();

	String deleteTopAlbumsItem(int musicId);
}
