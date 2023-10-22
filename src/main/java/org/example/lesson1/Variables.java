package org.example.lesson1;

public class Variables {
    public static void main(String[] args) {
        int intVariable = 31;
        System.out.println(intVariable);

        double intVariable2 = 31;
        System.out.println(intVariable2);

        byte byteVariable = (byte) 128;
        short shortVariable = (short) 77_777;
        long longVariable = 378_549_854L;
        System.out.println(byteVariable);
        System.out.println(shortVariable);
        System.out.println(longVariable);

        double doubleVariable = 234.777755;
        float floatVariable = (float) 234.777755;
        System.out.println(doubleVariable);
        System.out.println(floatVariable);

        // доступные операции +, -, *, %, /

        int number = 1;
        int number2 = 2;
        System.out.println(number + number2);

        double result = (double) 22 / 3;
        System.out.println(result);

        double meters = 10.5;
        double centimeters = meters * 100;
        System.out.println("В " + meters + " метрах, " + centimeters + " сантиметров");

        double hours = 1;
        double minutes = hours * 60;
        double seconds = minutes * 60;
        System.out.println("В " + hours + " часе, " + seconds + " секуед");

        double celsius = 5;
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Градусы цельсия " + celsius + " в фарингейты " + fahrenheit);

        /*
        1. Выполнить операции используя * и + с четырьмя переменными, сделать так чтобы сложение
        выполнялось первым
        2. Выполнить деление по модулю с двумя переменными, во втором выражении результат умножить
        на первую переменную
        3. Создать переменную целночисленную и другом вырожении сложить результат ее инкремента с
        другим числом
         */

        // задание №1
        int num1 = 5;
        int num2 = 8;
        double num3 = 102.35663;
        double num4 = 173.74773;
        System.out.println(Math.round((num1 + num2) * (num3 * num4)));

        // задание №2
        int a = 10;
        int b = 3;

        int result1 = a % b * a;

        System.out.println("Результат: " + result1);

        // оператор boolean

        boolean booleanVariable = true; // принимает либо true либо false
        System.out.println(booleanVariable);

        boolean booleanVariable2 = 5 > 7; // доступные операции: >, <, >=, <=, ==, !=
        System.out.println(booleanVariable2);

        int bolleanNumber = 20;
        System.out.println(bolleanNumber == 0);
        // && (и) || (или) ! (...)
        System.out.println(!(10 > 0)); // переворачивает результат

        /* 1. Сравнить результат умножения двух переменных с результатом сложения 2х других операторов;
        2 Сохранить результат логического выражения с двумя переменными в переменной boolean
        использовать результат этой переменной в другом выражении в котором сравнивается 2 целочисленных
        значения
         */

        int c = 5;
        int d = 10;
        int sum = c * d;
        int sum1 = c + d;
        System.out.println("C+D будет равно: " + (sum >= sum1));

        boolean isTrue1 = sum > sum1;
        System.out.println(isTrue1);

        boolean isFalse = sum < sum1;
        System.out.println(isFalse);

        boolean result4 = isFalse && (10 <88);
        System.out.println(result4);

        int i = 20 * 5;
        int i1 = 15 + 70;
        boolean isTrue = i > i1;
        boolean result3 = (4 > 2) || (2 == 4) && (5 < 10);
        System.out.println(isTrue);
        System.out.println(result3);
    }
}
