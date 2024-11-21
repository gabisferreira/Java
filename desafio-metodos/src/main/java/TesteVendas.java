import java.util.ArrayList;
import java.util.List;

public class TesteVendas {
    public static void main(String[] args) {

        RelatorioMetodos testarMetodos = new RelatorioMetodos();

        List<Double> precos = new ArrayList<>();
        precos.add(8.73);
        precos.add(3.45);
        precos.add(5.97);
        precos.add(2.90);
        precos.add(1.08);
        precos.add(6.99);
        precos.add(8.65);
        precos.add(10.0);
        precos.add(7.83);
        precos.add(9.10);

        Integer inteiroTeste = testarMetodos.buscarQuantidadeVendas(precos);
        System.out.println("Número de preços da lista: " + inteiroTeste);

        Double somaTeste = testarMetodos.somarVendas(precos);
        System.out.println("Soma dos números: " + somaTeste);

        Double precoPesquisa = 5.55;

        Boolean precoParaPesquisar = testarMetodos.buscarPreco(precos, precoPesquisa);
        System.out.println("Tem algum valor igual ao da pesquisa na lista? " + precoParaPesquisar);

        Double buscandoMaiorPreco = testarMetodos.buscarMaiorPreco(precos);
        System.out.println("Maior preço da lista: " + buscandoMaiorPreco);

        Double buscandoMenorPreco = testarMetodos.buscarMenorPreco(precos);
        System.out.println("Menor preço da lista: " + buscandoMenorPreco);

        Double filtro = 8.0;

        List <Double> filtrandoListas = testarMetodos.buscarPorPrecoMinimo(precos, filtro);
        System.out.println("Números maiores ou iguais a " + filtro + ": " + filtrandoListas);
    }
}
