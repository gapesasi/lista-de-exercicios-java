package local.host.listadeexerciciosjava.lista02.exercicio02.domain;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height, String color) {
        this.base = base;
        this.height = height;
        this.setColor(color);
    }

    @Override
    public double area(){
       return (base * height)/2;
    }

    @Override
    public String toString() {
        return "Triangle { \n" +
                "base: " + base +
                ", height: " + height +
                ", area: " + this.area() +
                ", color: " + this.getColor() +
                "\n}";
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
