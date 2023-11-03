package org.example.lesson4inheritence;

public class Computer {
    int ssd;
    int rm;



    public Computer(int ssd, int rm) {
        this.ssd = ssd;
        this.rm = rm;
        System.out.println("В комьютере");
    }



    public void startUp() {
        System.out.println("Я запустился");
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }
}
