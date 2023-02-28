package local.host.listadeexerciciosjava.lista02.exercicio01.dominio;

public class Agenda {
    private Pessoa pessoas[];

    public Agenda(int quantidade) {
        this.pessoas = new Pessoa[quantidade];
    }

    public void armazenaPessoa(String nome, int idade, float altura) {
        boolean cadastrado = false;

        for (int i = 0; i < this.pessoas.length; i++) {
            if (pessoas[i] == null) {
                Pessoa pessoa = new Pessoa(nome, idade, altura);
                pessoas[i] = pessoa;
                cadastrado = true;
                break;
            }
        }

        if (cadastrado) {
            System.out.println("\nCadastro efetuado com sucesso!");
        } else {
            System.out.println("\nNão foi possível realizar o cadastro.");
        }
    }

    public void removePessoa(String nome) {
        boolean removido = false;

        for (int i = 0; i < this.pessoas.length; i++) {
            if (pessoas[i] != null) {
                if (pessoas[i].getNome().equals(nome)) {
                    pessoas[i] = null;
                    removido = true;
                    break;
                }
            }
        }
        if (removido) {
            System.out.println("\nRemocão efetuada com sucesso!");
        } else {
            System.out.println("\nNão foi possível remover a pessoa com o nome que foi especificado.");
        }
    }

    public int buscaPessoa(String nome) {
    int index = -1;

        for (int i = 0; i < this.pessoas.length ; i++) {
            if (pessoas[i] != null) {
                if (pessoas[i].getNome().equals(nome)) {
                    index = i;
                    break;
                }
            }
        }

        return index;
    }

    public void imprimeAgenda() {
        for (int i = 0; i < this.pessoas.length ; i++) {
            if (pessoas[i] != null) {
                System.out.println(pessoas[i]);
            }
        }
    }

    public void imprimePessoa(int index) {
        if((index < 0) || (index > (pessoas.length - 1))){
            System.out.println("\nÍndice inválido");
        } else{
            if (pessoas[index] != null) {
                System.out.println(pessoas[index]);
            } else {
                System.out.println("\nNão há pessoa cadastrada no index informado.");
            }
        }
    }

}
