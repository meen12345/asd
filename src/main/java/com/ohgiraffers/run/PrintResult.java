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
            case "registMusic" :
                System.out.println("노래 추가 실패");
        }

    }

    public void successMessage(String success) {

        switch (success){
            case "registMusic" :
                System.out.println("노래 추가 성공");
        }



    }
}
