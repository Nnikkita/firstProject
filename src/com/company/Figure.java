package com.company;

public interface Figure {
    int getPerimeter();
    int getArea();

    default String getPerimeterStringByLocalization(String local) {
        if (local.equals("rus")) return "Периметр: ";
        if (local.equals("eng")) return "Perimeter: ";
        if (local.equals("deut")) return "Umfang: ";
        throw new UnsupportedOperationException("UnsupportedLocale:" + local);
    }

    default String getAreaStringByLocalization(String local) {
        if (local.equals("rus")) return "Площадь: ";
        if (local.equals("eng")) return "Area: ";
        if (local.equals("deut")) return "Quadrat: ";
        throw new UnsupportedOperationException("UnsupportedLocale:" + local);
    }
}
