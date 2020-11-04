package com.example.Ropa.Model;

public class Ropa {
    private String id;
    private String name;
    private String color;
    private String size;
    private String image;

    public Ropa(){}

    public Ropa(String id, String name, String color, String size, String image) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.size = size;
        this.image = image;
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
