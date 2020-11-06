package com.example.Ropa.Model;

public class Ropa {
    private String id;
    private String name;
    private String color;
    private String size;
    private String image;
    private String precio;

    public Ropa(){}

    public Ropa(String id, String name, String color, String size, String image,String precio) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.size = size;
        this.image = image;
        this.precio = precio;
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

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

}
