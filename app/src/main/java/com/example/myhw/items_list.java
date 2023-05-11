package com.example.myhw;

public class items_list {
    int image;
    String flower;
    String description;


    public items_list(int image,String flower,String description) {
        this.image=image;
        this.flower = flower;
        this.description=description;


    }
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getFlower() {return flower;}

    public void setFlower(String flower) {
        this.flower = flower;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
