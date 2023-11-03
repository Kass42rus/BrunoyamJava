package org.example.homework1;

public class Elevator {

    int currentFloor;
    int minFloor;
    int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        currentFloor = 1;
    }

    public int getCurrentFloor() {
        System.out.println("Текущий этаж: " + currentFloor);
        return currentFloor;
    }

    void moveDown() {
        if (currentFloor > minFloor) {
            currentFloor--;
            System.out.println("Лифт перемещен на этаж " + currentFloor);
        } else {
            System.out.println("Ошибка: Лифт уже находится на минимальном этаже");
        }
    }

    void moveUP() {
        if (currentFloor < maxFloor) {
            currentFloor++;
            System.out.println("Лифт перемещен на этаж " + currentFloor);
        } else {
            System.out.println("Ошибка: Лифт уже находится на максимальном этаже");
            System.exit(11);
        }
    }

    void move(int floor) {
        if (minFloor >= 1 && maxFloor <= 10) {
            System.out.println("Лифт едет на этаж: ");
            int direction = Integer.compare(floor, currentFloor);
            while (currentFloor != floor) {
                if (direction == 1) {
                    moveUP();
                } else {
                    moveDown();
                }
            }
        } else {
            System.out.println("Ошибка: Некорректный этаж");
        }
    }
}


