package com.global.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.global.spring.domain.Music;
import com.global.spring.service.MusicService;

@RestController
@RequestMapping(value = "/api/music/")
public class MusicRestController {
	
	@Autowired
	private MusicService musicService;
	
	@GetMapping("/list")
	public List<Music> selectMusicList(){
		return musicService.selectMusicList();
	}

}
