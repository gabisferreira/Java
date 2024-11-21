package school.sptech.ex3;

public class TesteEmpresa {

  public static void main(String[] args) {

      Funcionario funcionarios = new Funcionario();

      funcionarios.nome = "Leonardo";
      funcionarios.cargo = "Analista Junior";
      funcionarios.salario = 5.100;

      funcionarios.reajustarSalario(8);

      Double valorPorHora = funcionarios.calcularValorHora();
      System.out.println("Valor recebido por hora trabalhada " + valorPorHora);

      Double valorExtraNoturno = funcionarios.calcularHoraExtra(25, 15);
      System.out.println("Valor recebido de adicional noturno " + valorExtraNoturno);
  }
}
