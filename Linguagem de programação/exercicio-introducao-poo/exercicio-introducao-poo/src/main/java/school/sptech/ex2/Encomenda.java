package school.sptech.ex2;

public class Encomenda {
    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorProduto;

    Double valorFrete = 0.0;

    Double calcularFrete() {

        if (tamanho.equals("P")) {
            valorFrete += (valorProduto * 1) / 100.0;
        } else if (tamanho.equals("M")) {
            valorFrete += (valorProduto * 3) / 100.0;
        } else if (tamanho.equals("G")) {
            valorFrete += (valorProduto * 5) / 100.0;
        }

        if (distancia <= 50) {
            valorFrete += 3.0;
        }
        if (distancia > 50 && distancia <= 200) {
            valorFrete += 5.0;
        }
        if (distancia > 200) {
            valorFrete += 7.0;
        }

        return valorFrete;
    }

    void aplicarCupomDeDesconto(Integer desconto) {
        Double descontoFinal = (valorProduto * desconto) / 100.0;

        valorProduto -= descontoFinal;
        System.out.println("Valor do produto com desconto de " + desconto + "% R$" + valorProduto);
    }

    Double valorTotalDaEncomenda() {
        Double somaFinal = valorProduto + valorFrete;

        return somaFinal;
    }

}
