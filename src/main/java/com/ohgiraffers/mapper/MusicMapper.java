package com.ohgiraffers.mapper;

import com.ohgiraffers.common.MusicDTO;

import java.util.List;

public interface MusicMapper {
    List<MusicDTO> selectAllMusic();
}
