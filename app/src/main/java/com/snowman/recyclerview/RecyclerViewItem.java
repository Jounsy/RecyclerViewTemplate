package com.snowman.recyclerview;

public class RecyclerViewItem {

    private int imageRecource;
    private String text1;
    private String text2;
    private String internetLink;

    public RecyclerViewItem(int imageRecource, String text1, String text2, String internetLink) {
        this.imageRecource = imageRecource;
        this.text1 = text1;
        this.text2 = text2;
        this.internetLink = internetLink;
    }

    public int getImageRecource() {
        return imageRecource;
    }

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }
}
