import java.util.List;

public class MetodosComLista {
    /* Só exibe pq ele não da retorno, void é nada*/
    void exibeListaDeNomes(List<String> nomes) {

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("""
                    Nome: %d
                    %s""".formatted(i, nomes.get(i)));

        }
    }

}
