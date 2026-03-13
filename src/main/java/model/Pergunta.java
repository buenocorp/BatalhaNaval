package model;

public class Pergunta {

    private String pergunta;
    private String[] opcoes;
    private int resposta;

    public Pergunta(String pergunta,String[] opcoes,int resposta){
        this.pergunta = pergunta;
        this.opcoes = opcoes;
        this.resposta = resposta;
    }

    public String getPergunta(){ return pergunta; }
    public String[] getOpcoes(){ return opcoes; }
    public int getResposta(){ return resposta; }

}