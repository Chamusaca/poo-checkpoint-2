import java.util.ArrayList;
import java.util.Scanner;

public class Regiao {

    private String nome;
    Cidade cidade;
    ArrayList<Cidade> cidades = new ArrayList<>();

    //Construtor
    public Regiao(String nome) {
        this.nome = nome;
    }

    //Método para adicinas as cidades nas lista de cidades e para o usuário poder escolher qual cidade gostaria de ver as atrações
    public void getCidade () throws DataException{
        int escolhaUsuario;
        System.out.println("Escolha a cidade:");
        for (Cidade c: cidades){
            System.out.println(cidades.indexOf(c) + ". "+ c.getNomeCidade());
        };
        Scanner scan = new Scanner(System.in);
        escolhaUsuario = scan.nextInt();
        if (escolhaUsuario >= cidades.size()){
            throw new DataException("Esse número não é válido. Tente de novo!");
        }
        System.out.println("Você escolheu a cidade " + escolhaUsuario);
    }

//    public void validaEscolhaUsuario () throws DataException{
//
//    }

    public void addCidade(Cidade cidade){
        cidades.add(cidade);
    }

    public void listarCidades(){
        for (Cidade cidade: cidades){
            System.out.println("Cidade: " + cidade.getNomeCidade());
        }
    }
}
