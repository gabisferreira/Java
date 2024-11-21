public class ExemploOperadores {
    public static void main(String[] args) {
    // Operadores:
    // + soma
    // - subtração
    // / divisão
    // * multiplicação
    // ++ soma 1
    // -- menos 1
    // +=
    // -=
    // % resto
    // ** potencia, no java usamos um método de uma classe

    Double numero01 = 42.0;
    Double numero02 = 10.0;

    System.out.println("Soma: " + (numero01 + numero02));
    System.out.println("Multiplicação:" + (numero01 * numero02));

    Double resultadoPotencia = Math.pow(numero01, numero02);
    // Esse metodo retorna um valor double e guarda dentro da variavel resultadoPotencia

    System.out.println("Resultado dessa potência:" + resultadoPotencia);
}}