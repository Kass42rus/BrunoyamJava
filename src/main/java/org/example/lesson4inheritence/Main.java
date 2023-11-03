package org.example.lesson4inheritence;

public class Main {
    public static void main(String[] args) {
        /*
       №1  заменить все грустные смайлы :( в строке на веселые :)
         */
        String string = "Привет :( Как дела? :( ";
        String replacedStr = string.replace(":(", ":)");
        System.out.println(replacedStr);

        /*
       № 2 реализуйте метод, который принимает в качестве аргумента строку, содержащую текст
        Метод должен разделить текст на слова и вернуть строку. состоящую из полученных слов, где каждое
        слово будет на отедельной строке
        Знаки препинания и числа не являются словами
         */
        String input = "Hello how are u :(. I am :( fine thanks";
        String[] str = input.split(" ");
        for (String s : str) {
            System.out.println(s);
        }

        /*
        № 3 Подсчитать количество всех точек, запятых и восклицательных знаков в строке
         */

        String substring = input.substring(4);
        System.out.println(input.indexOf("H"));
        System.out.println(substring);
        char[] charArray = input.toCharArray();
        boolean equals = Character.valueOf('?').equals('!');
        System.out.println(equals);

    }
}
