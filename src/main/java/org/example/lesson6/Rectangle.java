package org.example.lesson6;

public class Rectangle extends Figure {
    int sideZ;
    int sideW;

    public Rectangle(int sideX, int sideY, int sideZ, int sideW) {
        super(sideX, sideY);
        this.sideZ = sideZ;
        this.sideW = sideW;
        System.out.println("Создание прямоугольника ");
    }

    @Override
    int square() {
        System.out.println("расчет прямоугольника = ");
        return sideZ * sideW * getSideX() * getSideY();
    }

    @Override
    void sayAboutMe() {
        System.out.println("Я Прямоугольник");
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideX=" + getSideX() +
                ", sideY=" + getSideY() +
                ", sideZ=" + sideZ +
                ", sideW=" + sideW +
                '}';
    }
}

