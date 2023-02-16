package local.host.listadeexerciciosjava.lista01.exercicio01.teste;

import local.host.listadeexerciciosjava.lista01.exercicio01.dominio.Contador;

public class ContadorTeste01 {
    public static void main(String[] args) {
        Contador contador = new Contador();

        contador.incrementarValor(2);
        System.out.println(contador.retornarValor());
        System.out.println();
        contador.zerarValor();
        System.out.println(contador.retornarValor());

    }
}
