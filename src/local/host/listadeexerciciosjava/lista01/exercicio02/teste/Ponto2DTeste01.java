package local.host.listadeexerciciosjava.lista01.exercicio02.teste;

import local.host.listadeexerciciosjava.lista01.exercicio02.dominio.Ponto2D;

public class Ponto2DTeste01 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Ponto2D ponto01 = new Ponto2D();
        System.out.println("Ponto na origem: " + ponto01);
        System.out.println();

        Ponto2D ponto02 = new Ponto2D(12, 15);
        System.out.println("Ponto definido manualmente: " + ponto02);
        System.out.println();

        Ponto2D ponto03 = new Ponto2D(ponto02);
        System.out.println("Ponto definido por outro ponto: " + ponto02);
        System.out.println();

        ponto03.setAbcissa(20);
        ponto03.setOrdenada(10);
        System.out.println("Get/Set Abcissa " + ponto03.getAbcissa());
        System.out.println("Get/Set Ordenada " + ponto03.getOrdenada());
        System.out.println();

        ponto03.movimentaPonto(16, 17);
        System.out.println("Ponto movimentado manualmente: " + ponto03);
        ponto03.movimentaPonto(ponto01);
        System.out.println("Ponto movimentado por outro ponto: " + ponto03);
        System.out.println();

        System.out.println("Comparação semântica do ponto 01 e ponto 02:" + ponto01.equals(ponto02));
        System.out.println();

        System.out.println("Distância entre pontos 03 e ponto 02:" + ponto03.distanciaEntrePontos(ponto02));

        Ponto2D ponto04 = (Ponto2D) ponto02.clone();
        System.out.println("Ponto criado a partir de clonagem: " + ponto04.toString());


    }
}
