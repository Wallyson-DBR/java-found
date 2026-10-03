package aula2.decisao.exemplo;

public class Aluno {
    String nome;
    double media;

    public Aluno() {}

    public Aluno(String nome, double media) {
        this.nome = nome;
        this.media = media;
    }

    public String verificarSituacao(){

        String situacao = "";

        if (media >= 50) {
            situacao = "Aprovado";
        }
        else if (media >= 40){
            situacao = "Recuperação";
        }
        else {
            situacao = "Reprovado";
        }

        return situacao;
    }
}
