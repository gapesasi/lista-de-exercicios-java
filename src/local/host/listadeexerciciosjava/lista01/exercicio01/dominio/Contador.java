package local.host.listadeexerciciosjava.lista01.exercicio01.dominio;

public class Contador {
    private int valor;

    public void zerarValor(){
        this.valor = 0;
    }

    public void incrementarValor(int valor){
        this.valor = this.valor + valor;
    }

    public int retornarValor(){
        return this.valor;
    }


    @Override
    public String toString() {
        return "Contador{" +
                "valor=" + valor +
                '}';
    }
}
