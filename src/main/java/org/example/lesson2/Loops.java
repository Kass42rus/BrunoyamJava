package org.example.lesson2;

public class Loops {
    public static void main(String[] args) {
        int count = 0;
        while (count < 5) {
            System.out.println("Hello java" + count);
            count = count + 1; // инкремент  ++ значит +1
        }

        int simplenumber = 0;
        do {
            System.out.println("В цикле " + simplenumber);
            simplenumber++;
        } while (simplenumber <= 5);

        // easy вывести сумму числе в интервале от n до m

        int n = 0;
        int m = 31;

        while (n < m) {
            System.out.println("Вывел сумму " + (n + m));
            n++;
        }

        //normal вывести все квадраты чисел в интевале от n до m
        int e = 0;
        int f = 31;
        while (e < f) {
            System.out.println("Вывел квадрат " + (e * e));
            e++;
        }

        // hard - в  интервале от 0 до 10 вывести только четные числа
        // % 2 = 0
        // % 2 != 0

//        Scanner scanner = new Scanner(System.in);
//        int input;
//        do {
//            System.out.println("Чтобы подтвердить, что вы не робот, введите 555");
//            input = scanner.nextInt();
//        } while (input != 555);
//        System.out.println("Урааа! Вы успешно подтвердили, что вы не робот");
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }

        // написать программу рассчиттывающую факториал введенного целого числа
        //Easy
        int numerE = 5;
        int result = 1;
        for (int i = 1; i <= numerE; i++) {
            result = result * i;
        }
        System.out.println("Факториал " + result);

        // medium
        /*
        Написать программу определяющую , является ли введенное цеое число простым, т.е делится без
        остатка только на 1 и само на себя
         */

        int simple = 5;
        boolean isSimple = false;
        for (int i = 2; i < simple; i++){
            if (simple % i == 0){
                isSimple = false;
                break;
            } else {
                isSimple = true;
            }
        }
        System.out.println("Число " + simple + " Простое? " + isSimple);
    }
}
