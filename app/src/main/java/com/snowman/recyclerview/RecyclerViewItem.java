package com.snowman.recyclerview;

public class RecyclerViewItem {

    private int imageRecource;
    private String pizzaName;
    private String description;
    private String internetLink;

    public RecyclerViewItem(int imageRecource, String pizzaName, String description, String internetLink) {
        this.imageRecource = imageRecource;
        this.pizzaName = pizzaName;
        this.description = description;
        this.internetLink = internetLink;
    }

    public int getImageRecource() {
        return imageRecource;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public String getDescription() {
        return description;
    }

    public String getInternetLink() {
        return internetLink;
    }
}
