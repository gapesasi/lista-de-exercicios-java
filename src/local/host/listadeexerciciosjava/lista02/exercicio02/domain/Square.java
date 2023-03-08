package local.host.listadeexerciciosjava.lista02.exercicio02.domain;

public class Square extends Rectangle{

    public Square(double side, String color) {
        super(side, side, color);
    }

    @Override
    public String toString() {
        return "Square {\n" +
                "side1: " + this.getSide1() +
                ", side2: " + this.getSide2() +
                ", color: " + this.getColor() +
                ", area: " + this.area() +
                "\n }";
    }
}
