package aula3.repeticao.atividades.atividade1;

public class Robo {

    public int posicao = 0;

    public Robo() {}

    public Robo(int posicao) {
        this.posicao = posicao;
    }

    public void avancar(){
        posicao ++;
    }

    public int getPosicao() {
        return posicao;
    }
}
