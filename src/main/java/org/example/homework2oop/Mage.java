package org.example.homework2oop;

import java.util.Random;

public class Mage extends Hero {
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        Random random = new Random();
        int damage = random.nextInt(200);
        System.out.println("Hero " + getName() + " Attack the enemy ");
        enemy.takeDamage(damage);
    }

}
