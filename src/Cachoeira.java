public class Cachoeira extends Atracao{

    private String dificuldadeAcesso;
    private double distanciaCaminhada;
    private boolean podeMergulhar;

    public Cachoeira(String nomeAtracao, Cidade cidade, boolean propriedadePrivada, boolean ofereceAlimentacao,
                     boolean possuiEstacionamento, String dificuldadeAcesso, double distanciaCaminhada,
                     boolean podeMergulhar) {
        super(nomeAtracao, cidade, propriedadePrivada, ofereceAlimentacao, possuiEstacionamento);
        this.dificuldadeAcesso = dificuldadeAcesso;
        this.distanciaCaminhada = distanciaCaminhada;
        this.podeMergulhar = podeMergulhar;
    }
}
