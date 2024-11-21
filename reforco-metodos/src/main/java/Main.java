public class Main {
    public static void main(String[] args) {
        MetodosDivertidos exercicios = new MetodosDivertidos();

        Integer numero = 8;
        Integer resultadoAleatorio1 = exercicios.avaliandoSorte(numero);
        System.out.println("""
                Tentativas usadas: %d""".formatted(resultadoAleatorio1));

        Integer numeroEscolhido = 0;
        Integer resultadoAleatorio2 = exercicios.exibeSomaSorteio(numeroEscolhido);
        System.out.println("""
                Soma das tentativas: %d""".formatted(resultadoAleatorio2));


        exercicios.exibeImpares();

    }
}
