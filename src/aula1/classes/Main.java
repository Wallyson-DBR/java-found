package aula1.classes;

public class Main {

    public static void main() {

        Carro carro1 = new Carro();

        carro1.cor = "Verde";
        carro1.anoFabricacao = 2025;
        carro1.finalPlaca ='0';
        carro1.temTetoSolar = false;
        carro1.valorAluguel = 1499.99;

        Carro carro2 = new Carro("Preto", 2026);

        System.out.println(carro2.cor);
        System.out.println(carro2.anoFabricacao);
    }

}
