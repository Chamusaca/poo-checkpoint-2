public class Cachoeira extends Atracao{

    private String dificuldadeAcesso;
    private double distanciaCaminhada;
    private boolean podeMergulhar;

    //Construtor
    public Cachoeira(String nomeAtracao, Cidade cidade, boolean propriedadePrivada, boolean ofereceAlimentacao,
                     boolean possuiEstacionamento, String dificuldadeAcesso, double distanciaCaminhada,
                     boolean podeMergulhar) {
        super(nomeAtracao, cidade, propriedadePrivada, ofereceAlimentacao, possuiEstacionamento);
        this.dificuldadeAcesso = dificuldadeAcesso;
        this.distanciaCaminhada = distanciaCaminhada;
        this.podeMergulhar = podeMergulhar;
    }

    //Getters e setters
    public String getDificuldadeAcesso() {
        return dificuldadeAcesso;
    }

    public void setDificuldadeAcesso(String dificuldadeAcesso) {
        this.dificuldadeAcesso = dificuldadeAcesso;
    }

    public double getDistanciaCaminhada() {
        return distanciaCaminhada;
    }

    public void setDistanciaCaminhada(double distanciaCaminhada) {
        this.distanciaCaminhada = distanciaCaminhada;
    }

    public boolean isPodeMergulhar() {
        return podeMergulhar;
    }

    public void setPodeMergulhar(boolean podeMergulhar) {
        this.podeMergulhar = podeMergulhar;
    }
}
