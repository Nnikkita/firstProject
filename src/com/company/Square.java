package com.company;

public class Square implements Figure {
    protected int width;

    public Square(int width) {
        this.width = width;

    }

    public int getPerimeter() {
        return width * 4;
    }

    public String getPerimeterByLocale(String local) {
        return getPerimeterStringByLocalization(local) + getPerimeter();
    }

    public int getArea() {
        return width * width;
    }

    public String getAreaByLocale(String local) {
        return getAreaStringByLocalization(local) + getArea();
    }
}


















