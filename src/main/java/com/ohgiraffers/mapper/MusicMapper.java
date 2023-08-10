package com.ohgiraffers.mapper;

import com.ohgiraffers.common.MusicDTO;

import java.util.List;
import java.util.Map;

public interface MusicMapper {
    List<MusicDTO> selectAllMusic();

    List<MusicDTO> searchMusic(Map<String, Object> criteria);

    int registMusic(MusicDTO music);
}
