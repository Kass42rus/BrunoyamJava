package org.example.lesson5;

import java.util.Arrays;

public class FunctionDemo {
    public static void main(String[] args) {

        FunctionDemo.say();
//        FunctionDemo.sum();
        System.out.println(sum());

        String egor = FunctionDemo.tellYourName("Egor");
        System.out.println(egor);
// или можно определить функцию через sout(tellyourname());

        int i = FunctionDemo.sameLength("Top 10");
        System.out.println(i);
// или можно определить функцию через sout (sameLength());

        System.out.println(sumOfNumber(33, 25.55));

        int a = 33;
        double b = 77.77;
        System.out.println(sumOfNumber2(a, b));

        System.out.println(wichIsBigger(77, 99));

        int[] myArray = new int[5];
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 4;
        myArray[4] = 5;

        System.out.println(arraySum(myArray));
        System.out.println(sort(myArray));

        System.out.println(Arrays.toString(reverseArray(myArray)));

        int[] arrayEqual = new int[5];
        arrayEqual[0] = 1;
        arrayEqual[1] = 2;
        arrayEqual[2] = 3;
        arrayEqual[3] = 4;
        arrayEqual[4] = 5;


    }


    static void say() {
        System.out.println("say hello java");
    }

    static int sum() {
        System.out.println("Возвращшает сумму значений 50 + 50");
        return 50 + 50;
    }

    static String tellYourName(String name) {
        System.out.println("Ваше имя ");
        return name;
    }

    static int sameLength(String word) {
        System.out.print("Длинна Вашей строки ");
        return word.length();
    }

    static double sumOfNumber(int number1, double number2) {
        System.out.print("Произведенние int + double = ");
        return number1 + number2;
    }

    static double sumOfNumber2(int a, double b) {
        System.out.print("Вызов произведения переменных int + double = ");
        return a + b;
    }

    static int wichIsBigger(int c, int d) {
        System.out.print("какое же число будет больше ??? это = ");
        return c > d ? c : d; // Условие | Блок 1 | Блок 2
    }

    static int arraySum(int[] sumOfArrays) {
        System.out.print("Сумма массиаа будет равна = ");
        int result = 0;
        for (int i = 0; i < sumOfArrays.length / 2; i++) {
            result = result + sumOfArrays[i];
        }
        return result;
    }

    static int sort(int[] massive) {
        System.out.print("Массив наоборот = ");
        int tmp = 0;
        for (int i = 0; i < massive.length; i++) {
            tmp = massive[i];
            massive[i] = massive[massive.length - i - 1];
            massive[massive.length - i - 1] = tmp;

        }
        return tmp;
    }

    static int[] reverseArray(int[] numbers) {
        System.out.println("вывод результат massive в классе ");
        int[] newArray = new int[numbers.length]; // -- вопрос ???
        int index = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            newArray[index] = numbers[i];
            index++;

        }
        return newArray;
    }



}


//    static int sum() {
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        if (true) {
//            return 50 + 50:
//        } else {
//            return 100 + 100;
//        }
//
//    }


