package org.example.lesson4inheritence;

public class Mobile extends Laptop{
    int ves;
    public Mobile(int ssd, int rm, int ves) {
        super(ssd, rm);
        this.ves = ves;
        System.out.println(" В мобайл ");
    }
}
