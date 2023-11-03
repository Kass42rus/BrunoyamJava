package org.example.lesson4inheritence;

public class ComputerRunner {
    public static void main(String[] args) {

//        Mobile mobile = new Mobile(22,22);
        Laptop laptop = new Laptop(22,22);

        laptop.startUp();
        System.out.println(laptop.ssd);
    }
}
