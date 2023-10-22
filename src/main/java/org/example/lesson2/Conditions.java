package org.example.lesson2;

import java.util.Random;
import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        // пример №1

        int number = 10;
        if (number == 0) {
            System.out.println("Вывод № 1 = 10 больше нуля");
        } else {
            System.out.println("Вывод № 2 = 10 меньше нуля");
        }

        // пример №2

        int numer = 10;
        if (numer > 0) {
            System.out.println("Выврл № 3 = 10 больше нуля");
        } else if (numer == 0) {
            System.out.println("numer равен нулю");
        } else {
            System.out.println("Вывод № 4 = 10 меньше нуля");
        }

        //easy
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите порядковый номер месяца");
        int input;
        input = scanner.nextInt();

        if (input == 1) {
            System.out.println("Январь - ЗИМА");
        } else if (input == 2) {
            System.out.println("Февраль - ЗИМА");
        } else if (input == 3) {
            System.out.println("Март - ВЕСНА");
        } else if (input == 4) {
            System.out.println("Апрель - ВЕСНА");
        } else if (input == 5) {
            System.out.println("Май - ВЕСНА");
        } else if (input == 6) {
            System.out.println("Июнь - ЛЕТО");
        } else if (input == 7) {
            System.out.println("Июль - ЛЕТО");
        } else if (input == 8) {
            System.out.println("Август - ЛЕТО");
        } else if (input == 9) {
            System.out.println("Сентябрь - ОСЕНЬ");
        } else if (input == 10) {
            System.out.println("Октябрь - ОСЕНЬ");
        } else if (input == 11) {
            System.out.println("Ноябрь - ОСЕНЬ");
        } else if (input == 12) {
            System.out.println("Декабрь - ЗИМА");
        } else
            System.out.println("Такого месяца не существует - вы ОШИБЛИСЬ !!!");

        //normal
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Дано целое число. Опредилить, является ли последняя цифра этого числа" +
                "- цифрой 3");

        int input1;
        input1 = scanner1.nextInt();

        Random rnd = new Random();
        int numer3 = rnd.nextInt(4);
        System.out.println("Выводит сген число: " + numer3);

        if (input1 != numer3 % 10) {
            System.out.println("последняя цифра этого числа НЕ ЯВЛЯЕТСЯ цифрой 3");
        } else {
            System.out.println("последняя цифра этого числа ЯВЛЯЕТСЯ цифрой 3");
        }

        //hard
        /*
        Имеется целое число. Это число - сумма денег в рубях
        Вывести это число, добавив к нему слово "рубль" в правильном падеже
        ("рубль", "рулей" или "рубля)

        рубль 1 !11

        рублей 5 6 7 8 9 10 11-19

        рубля 2 3 4

         */
        Scanner scanner3 = new Scanner(System.in);
        int fullnumber = scanner3.nextInt();

        if ((fullnumber % 10 == 1) && fullnumber % 100 != 11) {
            System.out.println("Рубль");

        } else if ((fullnumber % 10 == 2 || fullnumber % 10 == 3 || fullnumber % 10 == 4)
                && !(fullnumber % 100 == 12 || fullnumber == 13 || fullnumber % 10 == 14)) {
            System.out.println("Рубля");
        } else {
            System.out.println("Рублей");
        }

        System.out.println("Загадайте число от 1 до 5 включительно");
        input = scanner.nextInt();

        switch (input) {
            case 1:
                System.out.println("Вы загадали цифру один");
                break;
            case 2:
                System.out.println("Вы загадали цифру два");
                break;
            case 3:
                System.out.println("Вы загадали цифру три");
                break;
            case 4:
                System.out.println("Вы загадали цифру четыре");
                break;
            case 5:
                System.out.println("Вы загадали цифру пять");
                break;
            default:
                System.out.println("Некорректный ввод");
        }

//        int value = 4;
//        switch (value){
//            case 1, 2, 3 -> System.out.println("Равна 1");
//            case 4 -> System.out.println("Равна 4");
//            default -> System.out.println("Не равно");

        Scanner scanner6 = new Scanner(System.in);
        System.out.println("Введите номер месяца года");
        int mounth = scanner6.nextInt();

        switch (mounth) {
            case 1, 2, 3 -> {
                System.out.println("Январь Февраль Март");
                if (mounth == 1) System.out.println("Январь");
            }
            case 4, 5, 6 -> System.out.println("Апрель Май Июнь");
            case 7, 8, 9 -> System.out.println("Июль Август Сентябрь");
            case 10, 11, 12 -> System.out.println("Октябрь Ноябрь Декабрь");
        }
    }
}


