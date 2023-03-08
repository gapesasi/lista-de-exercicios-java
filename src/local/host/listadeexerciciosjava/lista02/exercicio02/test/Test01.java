package local.host.listadeexerciciosjava.lista02.exercicio02.test;

import local.host.listadeexerciciosjava.lista02.exercicio02.domain.Circle;
import local.host.listadeexerciciosjava.lista02.exercicio02.domain.Rectangle;
import local.host.listadeexerciciosjava.lista02.exercicio02.domain.Square;
import local.host.listadeexerciciosjava.lista02.exercicio02.domain.Triangle;

public class Test01 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4, 5, "Red");
        Circle circle = new Circle(6, "Blue");
        Rectangle rectangle = new Rectangle(8, 4, "Green");
        Square square = new Square(7, "Green");

        System.out.println(triangle);
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}
