package com.example.text.testproject.Model;

/**
 * Created by btplws012 on 17/7/17.
 */

public class viewPager {
    int image;
    String name;
    String subname;

    public viewPager(int image,String name,String subname){
        this.image = image;
        this.name = name;
        this.subname = subname;

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }
}
