package aula1.atividades;

import org.xml.sax.helpers.ParserAdapter;

public class Aluno {

    //Características
    public String nome;
    public String matricula;
    public String turma;
    public double media;

    public Aluno(){
    }

    public Aluno(double media, String turma, String matricula, String nome) {
        this.media = media;
        this.turma = turma;
        this.matricula = matricula;
        this.nome = nome;
    }

    //Ações
    public String exibirBoletim(){
        return "a";
    }

    public void atualizarMedia(double media){
        media = 5.5;
    }

    public boolean isAprovado(){
        if(media <= 5){
            return true;
        }
        else
            return false;
    }

    public void alterarTurma(String novaTurma){
        //Altera a turma do aluno
    }

}
