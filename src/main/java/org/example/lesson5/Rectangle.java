package org.example.lesson5;

public class Rectangle {
    //Константа - все прямоугольники будут называться Rectangle
    static  final String NAME = "Rectangle";
    int sideX;
    int sideY;
    static int count;

    void square() {
        System.out.println("Данны два числа " + sideX + " , " + sideY);
        System.out.println("Сумма площади будет = " + sideX * sideY);
    }

    int square1(){
        System.out.println("Возврат умножения площад Return: ");
        return sideX*sideY;
    }

    void setSides(int newSideX, int newSideY){
        sideX = newSideX;
        sideY = newSideY;

    }
    Rectangle(int sideX, int sideY){
        this.sideX = sideX;
        this.sideY = sideY;
        count++;
    }

    public int getSideX() {
        return sideX;
    }

    public void setSideX(int sideX) {
        this.sideX = sideX;
    }

    public int getSideY() {
        return sideY;
    }

    public void setSideY(int sideY) {
        this.sideY = sideY;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Rectangle.count = count;
    }
}

