package local.host.listadeexerciciosjava.lista02.exercicio02.domain;

public class Rectangle extends Shape{
    double side1;
    double side2;

    public Rectangle(double side1, double side2, String color) {
        this.side1 = side1;
        this.side2 = side2;
        this.setColor(color);
    }

    @Override
    public double area(){
        return side1 * side2;
    }


    @Override
    public String toString() {
        return "Rectangle {\n" +
                "side1: " + side1 +
                ", side2: " + side2 +
                ", area: " + area() +
                ", color: " + this.getColor() +
                "\n}";
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }
}
