public class Main {
    public static void main(String[] args) throws DataException {

        Cidade cidade1 = new Cidade("Alto Paraíso", "14/03/1968");
        Cidade cidade2 = new Cidade("São Jorge", "21/06/1987");
        Cidade cidade3 = new Cidade("Cavalcante", "30/07/1963");

        Regiao listacidades = new Regiao ("Chapada dos Veadeiros");

        listacidades.addCidade(cidade1);
        listacidades.addCidade(cidade2);
        listacidades.addCidade(cidade3);

        listacidades.listarCidades();

        listacidades.getCidade();

//        listacidades.validaEscolhaUsuario();

        Cachoeira cachoeira1 = new Cachoeira("Catarata dos Couros", cidade1, true,
                false, true, "Médio", 2.5, true);
        Cachoeira cachoeira2 = new Cachoeira("Almécegas", cidade2, true,
                true, true, "Fácil", 1.8, true);
        Cachoeira cachoeira3 = new Cachoeira("Poço Encantado", cidade3, true,
                false, true, "Fácil", 0.7, true);

        Trilha trilha1 = new Trilha("Morro da Baleia", cidade1, true, false, true, 7.6, 640, "Médio");
        Trilha trilha2 = new Trilha("Parque Nacional", cidade1, false, true, true, 11.7, 430, "Médio");
        Trilha trilha3 = new Trilha("Paredão", cidade3, true, false, true, 7.6, 570, "Difícil");

        cidade1.addTrilha(trilha1);
        cidade1.addTrilha(trilha2);

        cidade1.listarTrilhas();

        Caverna caverna1 = new Caverna("Buracão", cidade2, true, false, true, "Difícil", 4.3, false);
        Caverna caverna2 = new Caverna("Poço da Luz", cidade3, true, true, true, "Fácil", 1.2, true);
        Caverna caverna3 = new Caverna("Caverna Branca", cidade1, false, false, true, "Médio", 2.4, true);

        cachoeira1.cobrarEntrada(25);
        cachoeira2.cobrarEntrada(50);
        cachoeira3.cobrarEntrada(75);
        trilha1.cobrarEntrada(30);
        trilha2.cobrarEntrada(60);
        trilha3.cobrarEntrada(90);
        caverna1.cobrarEntrada(10);
        caverna2.cobrarEntrada(20);
        caverna3.cobrarEntrada(30);


    }

}