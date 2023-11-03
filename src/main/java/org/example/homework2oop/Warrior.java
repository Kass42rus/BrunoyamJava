package org.example.homework2oop;

import java.util.Random;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }


    @Override
    public void attackEnemy(Enemy enemy) {
        Random random = new Random();
        int damage = random.nextInt(200);
        enemy.takeDamage(damage);
        if (!enemy.isAlive()) {
            System.out.println("Враг побежден!");
        }
        System.out.println("Hero " + getName() + " Attack the enemy ");
        enemy.takeDamage(damage);
    }


}
