import java.util.ArrayList;
import java.util.List;

public class RelatorioMetodos {

    Integer buscarQuantidadeVendas(List<Double> precos) {

        Integer inteiro = precos.size();
//        System.out.println(inteiro);
        return inteiro;
    }

    Double somarVendas(List<Double> precos) {

        Double soma = 0.0;

        for (int i = 0; i < precos.size() ; i++) {
            soma += precos.get(i);
        }
//        System.out.println(soma);
        return soma;
    }

    Boolean buscarPreco(List<Double> precos, Double precoPesquisa) {

        for (int i = 0; i < precos.size(); i++) {
            if (precos.get(i).equals(precoPesquisa)) {
                return true;
            }
        }
                return false;
    }

    Double buscarMaiorPreco(List<Double> precos) {
        Double maiorPreco = 0.0;

        for (int i = 0; i < precos.size(); i++) {
            if (precos.get(i) > maiorPreco) {
                maiorPreco = precos.get(i);
            }
        }
        return maiorPreco;
    }

    Double buscarMenorPreco(List<Double> precos) {
        Double menorPreco = precos.get(0); // começa no primeiro valor da lista e depois vai mudando

        for (int i = 0; i < precos.size(); i++) {
            if (precos.get(i) < menorPreco) {
                menorPreco = precos.get(i);
            }
        }
        return menorPreco;
    }

    List <Double> buscarPorPrecoMinimo(List<Double> precos, Double filtro) {

        List <Double> filtrandoPreco = new ArrayList<>();

        for (int i = 0; i < precos.size(); i++) {
            if (precos.get(i) >= filtro) {
                filtrandoPreco.add(precos.get(i));
            }
        }

        return filtrandoPreco;
    }

}
