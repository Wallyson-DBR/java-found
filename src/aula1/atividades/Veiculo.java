package aula1.atividades;

public class Veiculo {

    public String modelo;
    public String placa;
    public int ano;
    public double quilometragem;

    public Veiculo(){

    }

    public Veiculo(String modelo, String placa, int ano, double quilometragem) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }

    public void ligarVeiculo(){

    }

    public void desligarVeiculo(){

    }

    public void acelerar(int velocidade){
        velocidade++;
    }

    public void registarDistancia(int distancia){

    }

}
