package local.host.listadeexerciciosjava.lista02.exercicio02.domain;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color){
        this.radius = radius;
        this.setColor(color);
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getDiameter(){
        return this.radius * 2;
    }

    @Override
    public String toString() {
        return "Circle {\n" +
                "radius: " + radius +
                ", diameter: " + getDiameter() +
                ", area: " + area() +
                ", color: " + this.getColor() +
                "\n }";
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }


}
