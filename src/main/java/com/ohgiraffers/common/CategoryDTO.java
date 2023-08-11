package com.ohgiraffers.common;

import java.util.List;

public class CategoryDTO {
    private int categoryCode;
    private String categoryName;
    private List<MusicDTO> musicdto;

    public CategoryDTO() {
    }


    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public CategoryDTO(int categoryCode, String categoryName, List<MusicDTO> musicdto) {
        this.categoryCode = categoryCode;
        this.categoryName = categoryName;
        this.musicdto = musicdto;
    }

    public List<MusicDTO> getMusicdto() {
        return musicdto;
    }


    public void setMusicdto(List<MusicDTO> musicdto) {
        this.musicdto = musicdto;
    }

    @Override
    public String toString() {
        return "CategoryDTO{" +
                "categoryCode=" + categoryCode +
                ", categoryName='" + categoryName + '\'' +
                ", musicdto=" + musicdto +
                '}';
    }
}
