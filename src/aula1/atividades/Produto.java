package aula1.atividades;

public class Produto {

    //Características
    public String nome;
    public int codigo;
    public double preco;
    public int quantidade;

    //Construtores
    public Produto(){
    }

    public Produto(String nome, int codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Ações
    public String exibirDados(){
        String dados = "123123";
        return dados;
    }

    public void adcionarUnidades(int qtd){
        qtd = quantidade + 1;
    }

    public void removerUnidades(int qtd){
        qtd = quantidade - 1;
    }

    public int CalcQuantidadeEstoque(){
        return quantidade;
    }

}
