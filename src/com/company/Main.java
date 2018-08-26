package com.company;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        Square square = new Square( 7);
        Triangle triangle = new Triangle( 2, 4,7);
        Circle circle = new Circle(10);

        System.out.println(rectangle.getPerimeterByLocale("rus"));
        System.out.println(square.getPerimeterByLocale("rus"));
        System.out.println(triangle.getPerimeterByLocale("rus"));
        System.out.println(circle.getPerimeterByLocale("rus"));

        System.out.println(rectangle.getAreaByLocale("rus"));
        System.out.println(square.getAreaByLocale("rus"));
        System.out.println(triangle.getAreaByLocale("rus"));
        System.out.println(circle.getAreaByLocale("rus"));
    }
}
