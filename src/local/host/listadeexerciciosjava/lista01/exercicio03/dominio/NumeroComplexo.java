package local.host.listadeexerciciosjava.lista01.exercicio03.dominio;

public class NumeroComplexo {
    private double parteReal;
    private double parteImaginaria;

    public NumeroComplexo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public void somar(NumeroComplexo numeroComplexo) {
        this.parteReal = this.parteReal + numeroComplexo.parteReal;
        this.parteImaginaria = this.parteImaginaria + numeroComplexo.parteImaginaria;
        System.out.println("Numero após a soma: \n" + this);
    }

    public void subtrair(NumeroComplexo numeroComplexo) {
        this.parteReal = this.parteReal - numeroComplexo.getParteReal();
        this.parteImaginaria = this.parteImaginaria - numeroComplexo.getParteImaginaria();
        System.out.println("Numero após a subtração: \n" + this);
    }


    public void multiplicar(NumeroComplexo numeroComplexo) {

        this.parteReal = (this.parteReal * numeroComplexo.getParteReal()) - (this.parteImaginaria * numeroComplexo.getParteImaginaria());
        this.parteImaginaria = (this.parteReal * numeroComplexo.getParteImaginaria()) + (this.parteImaginaria * numeroComplexo.getParteReal());
        System.out.println("Numero após a multiplicação: \n" + this);
    }

    public void dividir(NumeroComplexo numeroComplexo) {
        double etapaUmParteReal = (this.parteReal * numeroComplexo.getParteReal()) + (this.parteImaginaria * numeroComplexo.getParteImaginaria());
        double etapaDoisParteReal = (Math.pow(numeroComplexo.getParteReal(), 2)) + (Math.pow(numeroComplexo.getParteImaginaria(), 2));
        this.parteReal = etapaUmParteReal /etapaDoisParteReal;

        double etapaUmParteImaginaria = (this.parteImaginaria * numeroComplexo.getParteReal()) - (this.parteReal * numeroComplexo.getParteImaginaria());
        double etapaDoisParteImaginaria = (Math.pow(numeroComplexo.getParteReal(), 2)) + (Math.pow(numeroComplexo.getParteImaginaria(), 2));
        this.parteImaginaria = etapaUmParteImaginaria / etapaDoisParteImaginaria;

        System.out.println("Numero após a divisão: \n" + this);
    }

    public double getModulo(){
        return Math.sqrt(Math.pow(this.parteReal, 2) + Math.pow(this.parteImaginaria, 2));
    }

    public boolean equals(NumeroComplexo numeroComplexo) {
        return this.parteReal == numeroComplexo.getParteReal() && this.parteImaginaria == numeroComplexo.getParteImaginaria();
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
