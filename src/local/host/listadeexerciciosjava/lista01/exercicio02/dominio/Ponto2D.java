package local.host.listadeexerciciosjava.lista01.exercicio02.dominio;

public class Ponto2D {
    private double abcissa;
    private double ordenada;

    public Ponto2D() {
        this.abcissa = 0;
        this.ordenada = 0;
    }

    public Ponto2D(double abcissa, double ordenada) {
        this.abcissa = abcissa;
        this.ordenada = ordenada;
    }

    public Ponto2D(Ponto2D ponto2D) {
        this.abcissa = ponto2D.getAbcissa();
        this.ordenada = ponto2D.getOrdenada();
    }

    public void movimentaPonto(double abcissa, double ordenada){
        this.abcissa = abcissa;
        this.ordenada = ordenada;
    }

    public void movimentaPonto(Ponto2D ponto2D){
        this.abcissa = ponto2D.getAbcissa();
        this.ordenada = ponto2D.getOrdenada();
    }

    public boolean equals(Ponto2D ponto2D) {
        return this.abcissa == ponto2D.getAbcissa() && this.ordenada == ponto2D.getOrdenada();
    }

    @Override
    public String toString(){
        return "Ponto \n " +
                "Abcissa: " + this.abcissa
                + " Ordenada: " + this.ordenada;
    }

    public double distanciaEntrePontos(Ponto2D ponto){
        //Formula: d_AB= √( (X_B - X_A )^2  + (Y_B - Y_A)^2 )
        double valorX = Math.sqrt(ponto.getAbcissa() - this.abcissa);
        double valorY = Math.sqrt(ponto.getOrdenada() - this.ordenada);

        return Math.sqrt(valorX + valorY);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Ponto2D(this.abcissa, this.ordenada);
    }

    public double getAbcissa() {
        return this.abcissa;
    }

    public void setAbcissa(double abcissa) {
        this.abcissa = abcissa;
        System.out.println("Abcissa Alterada");
    }

    public double getOrdenada() {
        return this.ordenada;
    }

    public void setOrdenada(double ordenada) {
        this.ordenada = ordenada;
        System.out.println("Ordenada Alterada");
    }
}
