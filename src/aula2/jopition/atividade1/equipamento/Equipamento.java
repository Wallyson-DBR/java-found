package aula2.jopition.atividade1.equipamento;

public class Equipamento {

    String nome;
    int potenciaWatts;
    int horasUso;

    public Equipamento() {}

    public Equipamento(String nome, int potenciaWatts, int horasUso) {
        this.nome = nome;
        this.potenciaWatts = potenciaWatts;
        this.horasUso = horasUso;
    }

    public double calcularConsumoKWh(){
        double consumo = (potenciaWatts * horasUso) / 1000;
        return consumo;
    }

    public String exibirDados(){

        return "Dados do Equipamento: \n" +
                "Nome: " + this.nome + "\n" +
                "Potência: " + this.potenciaWatts + "\n" +
                "Horas de Uso: " + this.horasUso + "h\n\n" +
                "Consumo Total: " + this.calcularConsumoKWh() + " kWh";
    }
}
