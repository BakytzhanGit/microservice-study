package com.bakytzhan.gallery.entities;

import java.util.List;

public class Gallery {
    private int id;
    private List images;

    public Gallery() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List getImages() {
        return images;
    }

    public void setImages(List images) {
        this.images = images;
    }
}
