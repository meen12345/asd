package com.ohgiraffers.controller;

import com.ohgiraffers.common.CategoryDTO;
import com.ohgiraffers.common.MusicDTO;
import com.ohgiraffers.run.PrintResult;
import com.ohgiraffers.service.MusicService;
import jdk.jfr.Category;
import org.apache.ibatis.session.SqlSession;

import java.util.*;

public class MusicController {
    MusicService musicService = new MusicService();
    PrintResult printResult = new PrintResult();

    public void selectAllMusic() {
        List<MusicDTO> musicList = musicService.selectAllMusic();

        if (musicList != null) {
            printResult.printAllMusic(musicList);
        } else {
            printResult.errorMessage("selectAllMenu");
        }

    }

    public void SearchMusic(Map<String, Object> criteria) {

        List<MusicDTO> musicList = musicService.searchMusic(criteria);

        if (musicList != null) {
            printResult.printAllMusic(musicList);
        } else {
            printResult.errorMessage("searchMusic");
        }
    }

    public void registMusic(MusicDTO music) {
        int result = musicService.registMusic(music);

        if (result > 0) {
            printResult.successMessage("registMusic");
        } else {
            printResult.errorMessage("registMusic");
        }

    }

    public void modifyMusic(MusicDTO music) {
        int result = musicService.modifyMusic(music);

        if (result > 0) {
            printResult.successMessage("modify");
        } else {
            printResult.errorMessage("modify");
        }

    }

    public void deleteMusic(int no) {
        int result = musicService.deleteMusic(no);

        if (result > 0) {
            printResult.successMessage("delete");
        } else {
            printResult.errorMessage("delete");
        }
    }

    public void randomMusic(List<Integer> list) {
        HashMap<String, List<Integer>> randomList = new HashMap<>();
        randomList.put("random", list);

        List<MusicDTO> musicList = musicService.randomMusic(randomList);

        if (musicList != null) {
            printResult.printAllMusic(musicList);
        } else {
            printResult.errorMessage("searchMusic");
        }
    }

    public void CategoryMusic(int no) {
        HashMap<String, Integer> categoryCode = new HashMap<>();
        categoryCode.put("category", no);

        List<CategoryDTO> list = musicService.MusicByCategoryCode(categoryCode);

        if(list != null){
            printResult.printMusicByCategory(list);
        } else {
            printResult.errorMessage("searchMusic");
        }

    }
}
