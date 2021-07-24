package com.example.firstcry.Shopping;

public class Image_Model {
    private int imageId;
    private  String category;

    public Image_Model(int imageId, String category) {
        this.imageId = imageId;
        this.category = category;
    }

    public int getImageId() {
        return imageId;
    }

    public String getCategory() {
        return category;
    }
}