package org.example.lesson6;

public class Main {
    public static void main(String[] args) {

//        Figure figure = new Figure(15, 15);
//        figure.sayAboutMe();

//        figure.sideX = 15;
//        figure.sideY = 15;

//        System.out.println(figure);
//        System.out.println(figure.square());

        Triangle triangle = new Triangle(5, 5, 5);
//        triangle.sayAboutMe();
        triangle.square();
//        triangle.sideX = 144;
//        triangle.sideY = 200;
//        triangle.sideZ = 300;

//        System.out.println(triangle);
//        System.out.println(triangle.square());

        Rectangle rectangle = new Rectangle(6, 6, 6, 6);
//        rectangle.sayAboutMe();
        rectangle.square();
//        System.out.println(rectangle);
//        System.out.println(rectangle.square());

        // Полиморфизм
        Figure figure = new Triangle(22, 22, 22);
        Figure figure2 = new Rectangle(22, 22, 22, 22);

        // Полиморфизм
        callFigure(figure);
        callFigure(figure2);

        Rectangle figure3 = new Rectangle(3,3,3,3);
        callRectangle(figure3);

    }

    static void callFigure(Figure figure) {
        int square = figure.square();
        System.out.println(square);
    }

    static void callRectangle(Rectangle rectangle) {
        int square = rectangle.square();
        System.out.println(square);
    }

}

