package local.host.listadeexerciciosjava.lista01.exercicio04.teste;

import local.host.listadeexerciciosjava.lista01.exercicio04.dominio.Ponto;
import local.host.listadeexerciciosjava.lista01.exercicio04.dominio.Reta;

public class RetaTeste01 {
    public static void main(String[] args) {
        Ponto ponto1 = new Ponto(2, -5);
        Ponto ponto2 = new Ponto(1, -4);

        Reta reta= new Reta(2, -6);
        Reta reta2 = new Reta(ponto2);

        System.out.println("Ponto M: " + reta.isDotPartOf(ponto1));
        System.out.println("Ponto N: " + reta.isDotPartOf(ponto2));
        System.out.println("------------------------------------");
        System.out.println(reta);
        System.out.println("------------------------------------");
        System.out.println(reta2);
    }
}
