public class Caverna extends Atracao{

    private String dificuldadeAcesso;
    private double distanciaCaminhada;
    private boolean requerEquipamento;

    //Construtor
    public Caverna(String nomeAtracao, Cidade cidade, boolean propriedadePrivada, boolean ofereceAlimentacao,
                   boolean possuiEstacionamento, String dificuldadeAcesso, double distanciaCaminhada,
                   boolean requerEquipamento) {
        super(nomeAtracao, cidade, propriedadePrivada, ofereceAlimentacao, possuiEstacionamento);
        this.dificuldadeAcesso = dificuldadeAcesso;
        this.distanciaCaminhada = distanciaCaminhada;
        this.requerEquipamento = requerEquipamento;
    }

    //Métodos
    @Override
    public void cobrarEntrada (double valor){
        System.out.println("Bem vindo a "+cidade.nomeCidade+". O valor da entrada mais o valor do guia em "+nomeAtracao+" é de "+valor+" reais");
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

    public boolean isRequerEquipamento() {
        return requerEquipamento;
    }

    public void setRequerEquipamento(boolean requerEquipamento) {
        this.requerEquipamento = requerEquipamento;
    }
}
