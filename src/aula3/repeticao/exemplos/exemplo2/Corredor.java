package aula3.repeticao.exemplos.exemplo2;

public class Corredor {

    String nome;
    int voltas;
    double tempo;

    public Corredor() {}

    public Corredor(String nome, int voltas, double tempo) {
        this.nome = nome;
        this.voltas = voltas;
        this.tempo = tempo;
    }

    public Corredor(String nome, int voltas) {
        this.nome = nome;
        this.voltas = voltas;
    }

    public void completarVoltas(){
        voltas ++;
    }

    public void atualizarTempo(double tempoVolta){
        tempo += tempoVolta;
    }

    public int getVoltas() {
        return voltas;
    }

    public double getTempo() {
        return tempo;
    }
}
