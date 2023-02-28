package local.host.listadeexerciciosjava.lista02.exercicio01.teste;

import local.host.listadeexerciciosjava.lista02.exercicio01.dominio.Agenda;

import java.util.Scanner;

public class Principal {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        Agenda agenda = new Agenda(10);
        String nome;
        int idade;
        float altura;

        while (true) {
            System.out.println("\n1. Nova Pessoa");
            System.out.println("2. Excluir Pessoa");
            System.out.println("3. Buscar Pessoa");
            System.out.println("4. Imprimir Agenda");
            System.out.println("5. Imprimir Pessoa (Índice)");
            System.out.println("6. Sair");
            System.out.print("Sua opção: ");
            int opcao = Integer.parseInt(entrada.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println("\nInforme o nome: ");
                    nome = entrada.nextLine();

                    System.out.println("\nInforme a idade: ");
                    idade = Integer.parseInt(entrada.nextLine());

                    System.out.println("\nInforme a altura (utilizando ponto): ");
                    altura = Float.parseFloat(entrada.nextLine());

                    agenda.armazenaPessoa(nome, idade, altura);
                    break;

                case 2:

                    System.out.println("\n Informe o nome a ser removido: ");
                    nome = entrada.nextLine();
                    agenda.removePessoa(nome);
                    break;

                case 3:
                    System.out.println("\n Informe o nome a ser buscado: ");
                    nome = entrada.nextLine();

                    int indiceResultado = agenda.buscaPessoa(nome);
                    if (indiceResultado < 0){
                        System.out.println("A pessoa não foi encontrada");
                    } else {
                        System.out.println("A pessoa foi encontrada no indice: " + indiceResultado);
                    }
                    break;

                case 4:
                    agenda.imprimeAgenda();
                    break;

                case 5:
                    System.out.println("\n Informe o índex a ser buscado: ");
                    int indiceBusca = Integer.parseInt(entrada.nextLine());

                    agenda.imprimePessoa(indiceBusca);
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("\nOpção inválida\n");
                    break;
            }



        }
    }
}
