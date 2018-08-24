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

    private String getAreaStringByLocalization(String local) {
        if (local.equals("rus")) return "Площадь: ";
        if (local.equals("eng")) return "Area: ";
        throw new UnsupportedOperationException("UnsupportedLocale:" + local);
    }


   public int getСircumference() {
      return (int) (2 * r * 3.14);
   }

    public String getCircumferenceByLocale(String local){
      return getCircumferenceByLocalization(local) + getСircumference();
    }

    private String getCircumferenceByLocalization(String local) {
        if (local.equals("rus")) return "Длина окружности: ";
        if (local.equals("eng")) return "Circumference: ";
        throw new UnsupportedOperationException("UnsupportedLocale:" + local);
    }






















}
