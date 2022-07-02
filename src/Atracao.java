public abstract class Atracao {

    protected String nomeAtracao;
    protected Cidade cidade;
    protected boolean propriedadePrivada;
    protected boolean ofereceAlimentacao;
    protected boolean possuiEstacionamento;

    //Construtor
    public Atracao(String nomeAtracao, Cidade cidade, boolean propriedadePrivada, boolean ofereceAlimentacao, boolean possuiEstacionamento) {
        this.nomeAtracao = nomeAtracao;
        this.cidade = cidade;
        this.propriedadePrivada = propriedadePrivada;
        this.ofereceAlimentacao = ofereceAlimentacao;
        this.possuiEstacionamento = possuiEstacionamento;
    }

    //Métodos
    public void cobrarEntrada(double valor){
        System.out.println("Bem vindo a "+cidade.nomeCidade+". O valor da entrada em "+nomeAtracao+" é de "+valor+" reais");
    }



    //Getters e setters
    public String getNomeAtracao() {
        return nomeAtracao;
    }

    public void setNomeAtracao(String nomeAtracao) {
        this.nomeAtracao = nomeAtracao;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public boolean isPropriedadePrivada() {
        return propriedadePrivada;
    }

    public void setPropriedadePrivada(boolean propriedadePrivada) {
        this.propriedadePrivada = propriedadePrivada;
    }

    public boolean isOfereceAlimentacao() {
        return ofereceAlimentacao;
    }

    public void setOfereceAlimentacao(boolean ofereceAlimentacao) {
        this.ofereceAlimentacao = ofereceAlimentacao;
    }

    public boolean isPossuiEstacionamento() {
        return possuiEstacionamento;
    }

    public void setPossuiEstacionamento(boolean possuiEstacionamento) {
        this.possuiEstacionamento = possuiEstacionamento;
    }
}
