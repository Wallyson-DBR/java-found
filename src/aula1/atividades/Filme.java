package aula1.atividades;

public class Filme {

    public String titulo;
    public String genero;
    public int duracaoMin;
    public int classificacao;

    public Filme(){
    }

    public Filme(String titulo, String genero, int duracaoMin, String classificacao) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracaoMin = duracaoMin;
        this.classificacao = classificacao;
    }

    public String exibirSinopse(){
        return "aaa";
    }

    public void reproduzirFilme(){

    }

    public void pausarFilme(){

    }

    public boolean verificarClassificao(int idade){
        if (idade >= classificacao){
            return true;
        }
        else
            return false;
    }

}
