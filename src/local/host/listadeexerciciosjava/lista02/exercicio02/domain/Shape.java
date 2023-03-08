package local.host.listadeexerciciosjava.lista02.exercicio02.domain;

public abstract class Shape {
    private String color;

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public abstract double area();
}
