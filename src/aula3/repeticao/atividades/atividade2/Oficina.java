package aula3.repeticao.atividades.atividade2;

public class Oficina {

    int totalPecas = 0;

    public Oficina() {}

    public Oficina(int totalPecas) {
        this.totalPecas = totalPecas;
    }

    public void registrarPecas(int quantidade){
        totalPecas += quantidade;
    }

    public int getTotalPecas() {
        return totalPecas;
    }
}
