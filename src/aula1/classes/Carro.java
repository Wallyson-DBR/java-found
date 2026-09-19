package aula1.classes;

public class Carro {

    //Atributos - Caracteristicas (Coisas que o carro TEM)
    public int numPortas;
    public String tipo;
    public String cor;
    public double quilometragem;
    public boolean temTetoSolar;
    public double consumo;
    public char finalPlaca;
    public double valorAluguel;
    public int anoFabricacao;

    //Construtor
    public Carro(){
    }

    public Carro(String cor, int anoFabricacao){
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
    }

    //Alt + Insert/Constructor
    public Carro(String tipo, String cor, boolean temTetoSolar, int anoFabricacao) {
        this.tipo = tipo;
        this.cor = cor;
        this.temTetoSolar = temTetoSolar;
        this.anoFabricacao = anoFabricacao;
    }

    //Métodos - Ações (Coisas que o carro FAZ)
    public void ligarFarol(){
        //Como o farol é ligado
    }

    public void deslocar(double distancia){
        //Como o carro se desloca
    }

    public void daSeta(char lado){
        //Como o carro dá seta
    }

    public int verificarVelocidade(){
        int velocidade = 10;
        return velocidade;
    }

    public  void atualizarQuilometragem(double quilometragem){

    }

}
