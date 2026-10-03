package aula2.jopition.atividade1.ingresso;

public class Ingresso {

    String evento;
    double valorUnitario;
    int quantidade;

    public Ingresso() {}

    public Ingresso(String evento, double valorUnitario, int quantidade) {
        this.evento = evento;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }

    public double calcularValorTotal() {
        return this.valorUnitario * this.quantidade;
    }
}
