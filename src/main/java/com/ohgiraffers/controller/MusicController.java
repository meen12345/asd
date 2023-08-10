package com.ohgiraffers.controller;

import com.ohgiraffers.common.MusicDTO;
import com.ohgiraffers.run.PrintResult;
import com.ohgiraffers.service.MusicService;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MusicController {
    MusicService musicService = new MusicService();
    PrintResult printResult = new PrintResult();
    public void selectAllMusic() {

        List<MusicDTO> musicList = musicService.selectAllMusic();

        if (musicList != null){
            printResult.printAllMusic(musicList);
        }else {
            printResult.errorMessage("selectAllMenu");
        }
    }

    public void SearchMusic(Map<String, Object> stringObjectMap) {


    }
}