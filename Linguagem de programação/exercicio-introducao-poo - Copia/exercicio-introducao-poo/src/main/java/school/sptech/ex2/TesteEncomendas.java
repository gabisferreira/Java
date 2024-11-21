package school.sptech.ex2;

public class TesteEncomendas {

  public static void main(String[] args) {

    Encomenda encomendas = new Encomenda();

    encomendas.tamanho = "G";
    encomendas.enderecoRemetente = "Estrada do campo limpo, 1900";
    encomendas.enderecoDestinatario = "Rua Isaac Herbst, 198";
    encomendas.distancia = 97.09;
    encomendas.valorProduto = 876.99;

    encomendas.aplicarCupomDeDesconto(7);

    Double resultadoFrete = encomendas.calcularFrete();
    System.out.println("Valor do frete R$" + resultadoFrete);

    Double resultadoFinal = encomendas.valorTotalDaEncomenda();
    System.out.println("Valor total R$" + resultadoFinal);

  }
}
