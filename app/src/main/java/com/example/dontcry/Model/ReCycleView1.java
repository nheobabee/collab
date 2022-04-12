package com.example.dontcry.Model;

public class ReCycleView1 {
    private Integer Image;
    private String Name;

    public Integer getImage() {
        return Image;
    }

    public void setImage(Integer image) {
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ReCycleView1(Integer image, String name) {
        Image = image;
        Name = name;
    }

    public ReCycleView1() {
    }
}
