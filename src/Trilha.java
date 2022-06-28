public class Trilha extends Atracao{

    private double distanciaTotal;
    private double elevacaoTotal;
    private String nivelDificuldade;

    public Trilha(String nomeAtracao, Cidade cidade, boolean propriedadePrivada, boolean ofereceAlimentacao,
                  boolean possuiEstacionamento, double distanciaTotal, double elevacaoTotal, String nivelDificuldade) {
        super(nomeAtracao, cidade, propriedadePrivada, ofereceAlimentacao, possuiEstacionamento);
        this.distanciaTotal = distanciaTotal;
        this.elevacaoTotal = elevacaoTotal;
        this.nivelDificuldade = nivelDificuldade;
    }

}
