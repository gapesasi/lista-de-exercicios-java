package local.host.listadeexerciciosjava.lista01.exercicio04.dominio;

public class Reta {
    private double coeficienteAngular;
    private double coeficienteLinear;
    private Ponto ponto;

    public Reta(double coeficienteAngular, double coeficienteLinear){
        this.coeficienteAngular = coeficienteAngular;
        this.coeficienteLinear = coeficienteLinear;
    }

    public Reta(Ponto ponto) {
        this.ponto = ponto;
    }



    public boolean isDotPartOf(Ponto ponto){
        double formula = (this.coeficienteAngular * ponto.getPontoX()) + this.coeficienteLinear;
        return formula == ponto.getPontoY();
    }

    @Override
    public String toString() {
            String textPontoY = (this.ponto == null) ? "y" : ""+ this.ponto.getPontoY() ;
            String textPontoX = (this.ponto == null) ? "x" : ""+ this.ponto.getPontoY() ;

            String textCoeficienteAngular = (this.coeficienteAngular == 0) ? "m" : ""+ this.coeficienteAngular;
            String textCoeficienteLinear = (this.coeficienteLinear == 0) ? "n" : ""+ this.coeficienteLinear;

            return "( " +
                    textPontoY + " = " +
                    textCoeficienteAngular + textPontoX +
                    " + " + textCoeficienteLinear +
                    " )";
    }

    public double getCoeficienteAngular() {
        return coeficienteAngular;
    }

    public void setCoeficienteAngular(double coeficienteAngular) {
        this.coeficienteAngular = coeficienteAngular;
    }

    public double getCoeficienteLinear() {
        return coeficienteLinear;
    }

    public void setCoeficienteLinear(double coeficienteLinear) {
        this.coeficienteLinear = coeficienteLinear;
    }
}
