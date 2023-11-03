package org.example.lesson5;

import org.example.lesson4inheritence.Task.Figure;

public class Demo {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2, 2);
        Rectangle rectangle1 = new Rectangle(2, 2);

        // расчитываем площадь треугольника
        int square = rectangle.square1();
        System.out.println(square);
        int square1 = rectangle1.square1();
        System.out.println(square1);

        System.out.println(square - square1);
        System.out.println(rectangle.square1() == rectangle1.square1());

        int count = 0;
        while (count < 5) {
            Rectangle rectangle3 = new Rectangle(3,3);
            System.out.println("создается обьект rectangle 3 ");

            System.out.println("Результат создания прямоугольника " + count);
            count = count + 1; // инкремент  ++ значит +1

            System.out.println("Cчетчик создания " + Rectangle.count);
            System.out.println(Rectangle.getCount());
        }


//
//        // пример №1
//        rectangle.sideY = 43;
//        rectangle.sideX = 23;
//
//        int result = rectangle.sideX * rectangle.sideY;
//        System.out.println(result);
//
//
//        // пример №2
//        rectangle1.sideX = 12;
//        rectangle1.sideY = 15;
//
//        int result1 = rectangle1.sideX * rectangle1.sideY;
//        System.out.println(result1);
//
//
//        // пример №3
//        rectangle.square();
//        rectangle1.square();
//
//        int square = rectangle.square1();
//        System.out.println(square);
//        int square1 = rectangle1.square1();
//        System.out.println(square1);
//
//        System.out.println("Результат №1 " + (square - square1));
//
//
//        // пример №4
//        rectangle.setSides(5,5);
//        rectangle1.setSides(3,3);
//        rectangle.square(); // присвоить к  новым переменным
//        rectangle1.square(); // присвоить к новым переменным
//        System.out.println("Результат будет следующим " + rectangle.sideY * rectangle.sideX);
//        System.out.println("Результат будет следующим " + rectangle1.sideY * rectangle1.sideX);
//        System.out.println(square - square1);
//
//
//


    }
}
