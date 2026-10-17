package aula3.repeticao.exemplos.exemplo1;

import javax.swing.*;

public class Cofrinho {

    String nome;
    double meta;
    double saldo;

    public Cofrinho() {}

    public Cofrinho(double saldo, double meta, String nome) {
        this.saldo = saldo;
        this.meta = meta;
        this.nome = nome;
    }

    public void depositar(double valor){
        //Não pode depositar valor negativo
        if (valor > 0) {
            saldo += valor;
        }
        else {
            JOptionPane.showMessageDialog(null, "Valor inválido! informe um valor maior que 0");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public double getMeta() {
        return meta;
    }
}
