package model;

import enun.Color;

public class Elipse extends Shape{

    private Double width;
    private Double height;

    public Elipse(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Elipse() {
        super();
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public Double area() {
        return Math.PI * ((width /2) * (height/2));
    }
}
