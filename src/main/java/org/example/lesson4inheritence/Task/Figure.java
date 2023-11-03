package org.example.lesson4inheritence.Task;

public class Figure {
    int sideA;
    int sideB;

      public int SideSum() {
         return sideA * sideB;
    }

    public Figure(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;


    }


    @Override
    public String toString() {
        return "Figure{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}


