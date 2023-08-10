package com.ohgiraffers.run;

import com.ohgiraffers.common.MusicDTO;

import java.util.List;

public class PrintResult {
    public void printAllMusic(List<MusicDTO> musicList) {
        musicList.forEach(System.out::println);
    }

    public void errorMessage(String error) {
        switch (error) {
            case "selectAllMenu":
                System.out.println("목록 조회 실패");
            case "searchMusic":
                System.out.println("목록 검색 실패");
        }

    }


}
