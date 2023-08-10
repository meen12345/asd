package com.ohgiraffers.common;

public class Search {
    private String conditon;
    private String value;

    private String value2;

    private int categoryValue;

    public Search() {
    }

    public Search(String conditon, String value, String value2) {
        this.conditon = conditon;
        this.value = value;
        this.value2 = value2;
    }

    public int getCategoryValue() {
        return categoryValue;
    }

    public void setCategoryValue(int categoryValue) {
        this.categoryValue = categoryValue;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public String getConditon() {
        return conditon;
    }

    public void setConditon(String conditon) {
        this.conditon = conditon;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Search{" +
                "conditon='" + conditon + '\'' +
                ", value='" + value + '\'' +
                ", value2='" + value2 + '\'' +
                '}';
    }
}
