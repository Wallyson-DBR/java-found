package aula2.jopition.exemplo1;

public class Produto {

    //Atributos
    String nome;
    double preco;
    int codigo;
    int quanidade;

    public Produto(){}

    public Produto(String nome, double preco, int codigo, int quanidade) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
        this.quanidade = quanidade;
    }

    public double calcularValorEstoque(){

        double valorEstoque = preco * quanidade;

        return valorEstoque;
    }
}
