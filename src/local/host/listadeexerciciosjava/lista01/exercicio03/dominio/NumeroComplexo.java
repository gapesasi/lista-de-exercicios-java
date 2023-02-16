package local.host.listadeexerciciosjava.lista01.exercicio03.dominio;

public class NumeroComplexo {
    private double parteReal;
    private double parteImaginaria;

    public NumeroComplexo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public void somar(NumeroComplexo numeroComplexoSomar) {
        this.parteReal = this.parteReal + numeroComplexoSomar.parteReal;
        this.parteImaginaria = this.parteImaginaria + numeroComplexoSomar.parteImaginaria;
        System.out.println("Numero após a soma: \n" + this);
    }

    public void multiplicar(NumeroComplexo numeroComplexoSomar) {

        this.parteReal = (this.parteReal * numeroComplexoSomar.parteReal) - (this.parteImaginaria * numeroComplexoSomar.parteImaginaria);
        this.parteImaginaria = (this.parteReal * numeroComplexoSomar.parteImaginaria) + (this.parteImaginaria * numeroComplexoSomar.parteReal);
        System.out.println("Numero após a multiplicação: \n" + this);
    }

    public void subtrair(NumeroComplexo numeroComplexoSomar) {
        this.parteReal = this.parteReal - numeroComplexoSomar.parteReal;
        this.parteImaginaria = this.parteImaginaria - numeroComplexoSomar.parteImaginaria;
        System.out.println("Numero após a subtração: \n" + this);
    }

    @Override
    public String toString() {
        return this.parteReal + " + " + this.parteImaginaria + "i";
    }

    public void setParteReal(double parteReal) {
        this.parteReal = parteReal;
    }

    public double getParteReal() {
        return this.parteReal;
    }

    public void setParteImaginaria(double parteImaginaria) {
        this.parteImaginaria = parteImaginaria;
    }

    public double getParteImaginaria() {
        return this.parteImaginaria;
    }

}
