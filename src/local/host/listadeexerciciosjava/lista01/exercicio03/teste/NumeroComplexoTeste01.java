package local.host.listadeexerciciosjava.lista01.exercicio03.teste;

import local.host.listadeexerciciosjava.lista01.exercicio03.dominio.NumeroComplexo;

public class NumeroComplexoTeste01 {
    public static void main(String[] args) {
        NumeroComplexo numeroComplexo = new NumeroComplexo(15, 20);
        NumeroComplexo numeroComplexo2 = new NumeroComplexo(1, 5);

        System.out.println(numeroComplexo.equals(numeroComplexo2));
        System.out.println("--------------------");
        numeroComplexo.somar(numeroComplexo2);
        System.out.println("--------------------");
        numeroComplexo.subtrair(numeroComplexo2);
        System.out.println("--------------------");
        numeroComplexo.multiplicar(numeroComplexo2);
        System.out.println("--------------------");
        numeroComplexo.dividir(numeroComplexo2);
        System.out.println("--------------------");
        System.out.println(numeroComplexo.getModulo());
    }
}
