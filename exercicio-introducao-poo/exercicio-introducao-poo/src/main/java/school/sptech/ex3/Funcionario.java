package school.sptech.ex3;

public class Funcionario {

    String nome;
    String cargo;
    Double salario;
    Double valorHora = 0.0;

    void reajustarSalario(Integer reajuste) {
        salario += (salario * reajuste) / 100.0;
        System.out.println("Salário com reajuste " + salario);
    }

    Double calcularValorHora() {
        valorHora += salario / 220.0;
        return valorHora;
    }

    Double calcularHoraExtra(Integer quantidadeHoraExtra, Integer percentualNoturno) {

//        Double valorExtra = 0.0;
//        valorExtra += (valorHora * percentualNoturno) / 100.0;
//        valorExtra = valorExtra + valorHora;
//        valorExtra = valorExtra * quantidadeHoraExtra;

        Double valorHoraAtual = (salario / 220) * quantidadeHoraExtra;
        Double percentualHora = (valorHoraAtual / 100) * percentualNoturno;
        Double valorExtra = valorHoraAtual + percentualHora;
        System.out.println(valorExtra);
        return valorExtra;
    }

}
