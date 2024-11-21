package school.sptech.ex1;

public class Bolo {

    String sabor;
    Double valor;
    Integer quantidadeVendida;
    Integer quantidadeEmEstoque;

    void venderBolo(Integer quantidadeDesejada) {
        if (quantidadeDesejada >=0 && quantidadeDesejada <= quantidadeEmEstoque) {
            quantidadeVendida += quantidadeDesejada;
            quantidadeEmEstoque -= quantidadeVendida;
            System.out.println("Venda realizada, quantidade atual do estoque: " + quantidadeEmEstoque);
        }
    }

    void aumentarEstoque(Integer quantidadeAdicionada) {
        if (quantidadeAdicionada >=0) {
            quantidadeEmEstoque += quantidadeAdicionada;
            System.out.println("Saiu do forno " + quantidadeAdicionada + " bolos para o estoque");
        }
    }

    Integer quantidadeDisponivel() {
        return quantidadeEmEstoque;
    }

    Double totalVendido() {
        return valor * quantidadeVendida;
    }
}
