package school.sptech.ex1;

public class TesteConfeitaria {

  public static void main(String[] args) {

      Bolo bolos = new Bolo();
      bolos.sabor = "Chocolate com menta";
      bolos.valor = 55.56;
      bolos.quantidadeEmEstoque = 77;
      bolos.quantidadeVendida = 29;

      bolos.venderBolo(10);

      bolos.aumentarEstoque(65);

      Integer retornoEstoque = bolos.quantidadeDisponivel();
      System.out.println("Estoque de bolos atualizado: " + retornoEstoque);

      Double retornoSaldo = bolos.totalVendido();
      System.out.println("Valor total vendido R$" + retornoSaldo);
  }
}
