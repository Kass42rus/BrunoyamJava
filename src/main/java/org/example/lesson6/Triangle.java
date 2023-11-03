package org.example.lesson6;

public class Triangle extends Figure {

    int sideZ;

    public Triangle(int sideX, int sideY, int sideZ) {
        super(sideX, sideY);
        this.sideZ = sideZ;
        System.out.println("Создание треугольника ");
    }

    public Triangle(int sideZ) {
        this.sideZ = sideZ;
    }

    public Triangle() {

    }

    @Override
    int square() {
        System.out.println("Расчет треугольника = ");
        return sideZ * getSideX() * getSideY();
    }

    @Override
    void sayAboutMe() {
        System.out.println("Я треугольник");
    }

    public int getSideZ() {
        return sideZ;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideX=" + getSideX() +
                ", sideY=" + getSideY() +
                ", sideZ=" + sideZ +
                '}';
    }
}


