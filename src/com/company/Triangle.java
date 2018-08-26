package com.company;

public class Triangle implements Figure {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getPerimeter() {
        return a + b + c;
    }

    public String getPerimeterByLocale(String local) {
        return getPerimeterStringByLocalization(local) + getPerimeter();
    }

    public int getArea() {
        int sp = getPerimeter() / 2;
        return (int) Math.sqrt(sp * (sp - a) * (sp - b) * (sp - c));
    }

    public String getAreaByLocale(String local) {
        return getAreaStringByLocalization(local) + getArea();
    }
}
