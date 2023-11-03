package org.example.lesson4inheritence;

public class Laptop extends Computer{

    public Laptop(int ssd, int rm) {
        super(ssd, rm);
        System.out.println("В Ноутбуке");
    }
}
