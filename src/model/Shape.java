package model;

import enun.Color;

public abstract class Shape {
    private Color color;
    public abstract Double area();

    public Shape(Color color) {
        this.color = color;
    }

    public Shape() {
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
