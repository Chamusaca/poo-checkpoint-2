import java.util.ArrayList;

public class Trilha extends Atracao{

    private double distanciaTotal;
    private double elevacaoTotal;
    private String nivelDificuldade;

    //Construtor
    public Trilha(String nomeAtracao, Cidade cidade, boolean propriedadePrivada, boolean ofereceAlimentacao,
                  boolean possuiEstacionamento, double distanciaTotal, double elevacaoTotal, String nivelDificuldade) {
        super(nomeAtracao, cidade, propriedadePrivada, ofereceAlimentacao, possuiEstacionamento);
        this.distanciaTotal = distanciaTotal;
        this.elevacaoTotal = elevacaoTotal;
        this.nivelDificuldade = nivelDificuldade;
    }

    //Métodos


    //Getters e Setters
    public double getDistanciaTotal() {
        return distanciaTotal;
    }

    public void setDistanciaTotal(double distanciaTotal) {
        this.distanciaTotal = distanciaTotal;
    }

    public double getElevacaoTotal() {
        return elevacaoTotal;
    }

    public void setElevacaoTotal(double elevacaoTotal) {
        this.elevacaoTotal = elevacaoTotal;
    }

    public String getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(String nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }
}
