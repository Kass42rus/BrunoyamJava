package org.example.homework1;

public class Demo {
    public static void main(String[] args) {

        Elevator elevator = new Elevator(1, 10);
        elevator.getCurrentFloor();
        elevator.moveDown();
        elevator.moveUP();
        elevator.move(15);


    }
}
