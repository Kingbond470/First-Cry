package com.example.firstcry.ItemShowRecyclerView;

public class ItemModel {
    private int imgaeId;
    private String name;
    private String ogPrice, cutPrice, offPercent;
    private String date;

    public ItemModel(int imgaeId, String name, String ogPrice, String cutPrice, String offPercent, String date) {
        this.imgaeId = imgaeId;
        this.name = name;
        this.ogPrice = ogPrice;
        this.cutPrice = cutPrice;
        this.offPercent = offPercent;
        this.date = date;
    }

    public int getImgaeId() {
        return imgaeId;
    }

    public String getName() {
        return name;
    }

    public String getOgPrice() {
        return ogPrice;
    }

    public String getCutPrice() {
        return cutPrice;
    }

    public String getOffPercent() {
        return offPercent;
    }

    public String getDate() {
        return date;
    }
}
