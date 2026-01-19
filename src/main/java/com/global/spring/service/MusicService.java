package com.global.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.global.spring.domain.Music;
import com.global.spring.mapper.MusicMapper;

@Service
public class MusicService {

	@Autowired
	private MusicMapper musicMapper;
	
	@Transactional
	public List<Music> selectMusicList() {
		return musicMapper.selectMusicList();
	}
}
