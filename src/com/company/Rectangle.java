package com.company;

public class Rectangle extends Square {


    private int height;

    public Rectangle(int width, int height) {
       super(width);
       this.height = height;


    }
    @Override
    public int getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public int getArea() {
       return width * height;
    }



}
