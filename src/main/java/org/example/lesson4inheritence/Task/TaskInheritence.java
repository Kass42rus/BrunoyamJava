package org.example.lesson4inheritence.Task;

public class TaskInheritence {
    public static void main(String[] args) {
        /*
        Easy Создать иерархию классов описывающих 2-D фигуры у каждого класса должно быть нахождение
        периметра и вычисление площади. Взять квадрат и прямоугольник
         */
        Figure Square = new Square(10,10,10,10);
        System.out.println(Square/*toString()*/);

        Square.SideSum();
        System.out.println("Суммированный реузльтат " +
                Square.SideSum());






    }
}


        /*
        К задаче выше взять дополнительно эллипс и окружность
         */

        /*
        К задаче выше взять трапецию, треугольник
         */

