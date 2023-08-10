package com.ohgiraffers.common;

public class MusicDTO {
    private int code;
    private String name;
    private String singer;

    private int categoryCode;

    public MusicDTO() {
    }

    public MusicDTO(int code, String name, String singer, int categoryCode) {
        this.code = code;
        this.name = name;
        this.singer = singer;
        this.categoryCode = categoryCode;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    @Override
    public String toString() {
        return "MusicDTO{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", singer='" + singer + '\'' +
                ", categoryCode=" + categoryCode +
                '}';
    }
}
