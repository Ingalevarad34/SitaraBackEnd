package com.example.Sitara.service.Music_VideoServices;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Sitara.Entites.Music_Video;


@Service
public interface Music_VideoServices {
	
	String addMusicVideo(List<Music_Video> l);

	Iterable<Music_Video> getAllMusicVideo();

	String deleteAllMusicVideo();

	String deleteMusicVideoItem(int musicId);

}
