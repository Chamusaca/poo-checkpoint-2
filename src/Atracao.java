public abstract class Atracao {

    protected String nomeAtracao;
    protected Cidade cidade;
    protected boolean propriedadePrivada;
    protected boolean ofereceAlimentacao;
    protected boolean possuiEstacionamento;

    public Atracao(String nomeAtracao, Cidade cidade, boolean propriedadePrivada, boolean ofereceAlimentacao, boolean possuiEstacionamento) {
        this.nomeAtracao = nomeAtracao;
        this.cidade = cidade;
        this.propriedadePrivada = propriedadePrivada;
        this.ofereceAlimentacao = ofereceAlimentacao;
        this.possuiEstacionamento = possuiEstacionamento;
    }

    public void cobrarEntrada(double valor){
        System.out.println("Bem vindo a "+cidade.nomeCidade+". O valor da entrada em "+nomeAtracao+" é de "+valor+" reais");
    }
}
