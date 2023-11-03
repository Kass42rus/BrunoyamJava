package org.example.homework2oop;

public class Enemy implements Mortal {
    private int health;


    public Enemy(int health) {
        this.health = 100;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println("Enemy get damage " + damage + " and left "
                + health + " healt");
    }

    @Override
    public boolean isAlive() {
        System.out.println("Enemy is Alive !!! " + health);
        return health > 0;
    }
}
