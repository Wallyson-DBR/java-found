package aula5.listas.atividades.atividade8;

public class Produto {

    private String nome;
    private double preco;

    public Produto() {}
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void aplicarDesconto(double porcentagem){
        preco = preco * (1.0-(porcentagem/100));
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
