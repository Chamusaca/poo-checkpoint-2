import java.util.ArrayList;

public class Cidade {

    protected String nomeCidade;
    protected String dataFundacao;

    ArrayList<Trilha> trilhas = new ArrayList<>();

    //Construtor
    public Cidade(String nomeCidade, String dataFundacao) {
        this.nomeCidade = nomeCidade;
        this.dataFundacao = dataFundacao;
    }

    //Métodos
    //Métodos para adicionar trilhas à lista de trilhas da cidade
    public void addTrilha(Trilha trilha){
        trilhas.add(trilha);
    }

    public void listarTrilhas (){
        for (Trilha trilha: trilhas){
            System.out.println("Cidade: " + this.getNomeCidade() + ". Nome da trilha: " + trilha.getNomeAtracao());
        }
    }

    //Getters e setters
    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(String dataFundacao) {
        this.dataFundacao = dataFundacao;
    }
}
