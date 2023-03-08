package local.host.listadeexerciciosjava.lista02.exercicio01.dominio;

public class Pessoa {
    private String nome;
    private int idade;
    private float altura;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + '\n' +
                "Idade: " + idade + '\n' +
                "Altura: " + altura + '\n';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}