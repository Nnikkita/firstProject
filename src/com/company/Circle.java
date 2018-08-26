package com.company;

public class Circle implements Figure {
  private int r;

  public Circle(int r) {
      this.r = r;
  }

  public int getArea() {
      return (int) (r * r * 3.14);
  }

    public String getAreaByLocale(String local){
        return getAreaStringByLocalization(local) + getArea();
    }

    public String getAreaStringByLocalization(String local) {
        if (local.equals("rus")) return "Площадь: ";
        if (local.equals("eng")) return "Area: ";
        if (local.equals("deut")) return "Quadrat: ";
        throw new UnsupportedOperationException("UnsupportedLocale:" + local);
    }


   public int getPerimeter() {
      return (int) (2 * r * 3.14);
   }

    public String getCircumferenceByLocale(String local){
      return getCircumferenceByLocalization(local) + getPerimeter();
    }

    private String getCircumferenceByLocalization(String local) {
        if (local.equals("rus")) return "Длина окружности: ";
        if (local.equals("eng")) return "Circumference: ";
        if (local.equals("deut")) return "Umfang: ";
        throw new UnsupportedOperationException("UnsupportedLocale:" + local);
    }






















}
