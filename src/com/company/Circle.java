package com.company;

public class Circle implements Figure {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    public int getArea() {
        return (int) (r * r * 3.14);
    }

    public int getPerimeter() {
        return (int) (2 * r * 3.14);
    }

    public String getAreaByLocale(String local) {
        return getAreaStringByLocalization(local) + getArea();
    }

    public String getPerimeterByLocale(String local) {
        return getPerimeterStringByLocalization(local) + getPerimeter();
    }
}