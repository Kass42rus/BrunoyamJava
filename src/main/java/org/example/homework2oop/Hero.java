package org.example.homework2oop;

import java.util.Random;

public abstract class Hero {

    private String name;


    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void attackEnemy(Enemy enemy);
//    {
//        Random random = new Random();
//        int damage = random.nextInt(101);
//        System.out.println("Hero " + name + " Attack the enemy ");
//        enemy.takeDamage(damage);
//    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                '}';
    }
}
