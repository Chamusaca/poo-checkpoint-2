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
    public void getCidade (){
        System.out.println("Escolha a cidade:");
        for (Cidade c: cidades){
            System.out.println(cidades.indexOf(c) + ". "+ c.getNomeCidade());
        };
        int escolhaUsuario;
        Scanner scan = new Scanner(System.in);
        escolhaUsuario = scan.nextInt();

    }

    public void addCidade(Cidade cidade){
        cidades.add(cidade);
    }

    public void listarCidades(){
        for (Cidade cidade: cidades){
            System.out.println("Cidade: " + cidade.getNomeCidade());
        }
    }
}
