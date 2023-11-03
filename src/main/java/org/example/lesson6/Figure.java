package org.example.lesson6;

public abstract class Figure {
    private int sideX;
    private int sideY;

    public Figure(int sideX, int sideY) {
        this.sideX = sideX;
        this.sideY = sideY;
        System.out.println("Создание фигуры ");
    }

    void sayAboutMe() {
        System.out.println("Я фигура");
    }

    abstract int square();

    public Figure() {

    }

//    int square() {
//        return sideX * sideY;
//    }

    public int getSideX() {
        return sideX;
    }

    public int getSideY() {
        return sideY;
    }

    @Override
    public String toString() {
        return "Inheritance{" +
                "sideX=" + sideX +
                ", sideY=" + sideY +
                '}';
    }
}


