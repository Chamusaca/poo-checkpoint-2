public class Caverna extends Atracao{

    private String dificuldadeAcesso;
    private double distanciaCaminhada;
    private boolean requerEquipamento;

    public Caverna(String nomeAtracao, Cidade cidade, boolean propriedadePrivada, boolean ofereceAlimentacao,
                   boolean possuiEstacionamento, String dificuldadeAcesso, double distanciaCaminhada,
                   boolean requerEquipamento) {
        super(nomeAtracao, cidade, propriedadePrivada, ofereceAlimentacao, possuiEstacionamento);
        this.dificuldadeAcesso = dificuldadeAcesso;
        this.distanciaCaminhada = distanciaCaminhada;
        this.requerEquipamento = requerEquipamento;
    }

    @Override
    public void cobrarEntrada (double valor){
        System.out.println("Bem vindo a "+cidade.nomeCidade+". O valor da entrada mais o valor do guia em "+nomeAtracao+" é de "+valor+" reais");
    }
}
