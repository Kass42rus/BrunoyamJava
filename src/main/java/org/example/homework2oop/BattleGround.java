package org.example.homework2oop;

public class BattleGround {
    public static void main(String[] args) {
        Hero warrior = new Warrior("Kass");
        Enemy enemy = new Enemy(0);
        warrior.attackEnemy(enemy);

        Hero mage = new Warrior("Kass");
        Enemy enemy2 = new Enemy(0);
        mage.attackEnemy(enemy2);

        Hero archer = new Warrior("Kass");
        Enemy enemy3 = new Enemy(0);
        archer.attackEnemy(enemy3);
    }
}
