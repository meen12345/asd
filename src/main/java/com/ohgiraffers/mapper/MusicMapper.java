package com.ohgiraffers.mapper;

import com.ohgiraffers.common.CategoryDTO;
import com.ohgiraffers.common.MusicDTO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface MusicMapper {
    List<MusicDTO> selectAllMusic();

    List<MusicDTO> searchMusic(Map<String, Object> criteria);

    int registMusic(MusicDTO music);


    int modifyMusic(MusicDTO music);

    int deleteMusic(int no);

    List<MusicDTO> randomList(HashMap<String, List<Integer>> randomList);

    List<CategoryDTO> MusicByCategory(HashMap<String, Integer> categoryCode);
}
