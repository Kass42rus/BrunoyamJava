package org.example.lesson4inheritence.Task;

public class Square extends Figure {
    int sideC;
    int sideD;


    Square(int sideA, int sideB, int sideC, int sideD) {
        super(sideA, sideB);
            this.sideC = sideC;
            this.sideD = sideD;
        }

    @Override
    public String toString() {
        return "Square{" +
                "sideC=" + sideC +
                ", sideD=" + sideD +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}





