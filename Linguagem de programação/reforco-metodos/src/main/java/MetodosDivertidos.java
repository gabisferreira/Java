import java.util.concurrent.ThreadLocalRandom;

public class MetodosDivertidos {

    Integer avaliandoSorte(Integer numero) {
        // Começa do 11 pq ele começa a contar do 0 então fica 0,1,2,3,4,5,6,7,8,9 tem 10 numeros pq o 0 tbm conta
        Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0,11);
        Integer qtdTentativas = 1; // Começa em

        while (!numeroSorteado.equals(numero)){
            qtdTentativas++;
            numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);
        }
        return qtdTentativas;
    }

    Integer exibeSomaSorteio(Integer numeroEscolhido) {
        Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);
        Integer somaSorteado = 0;

        while (!numeroSorteado.equals(numeroEscolhido)) {
                somaSorteado += numeroSorteado;

                numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);
        }
        return somaSorteado;
    }

    void exibeImpares() {

        Integer impares = 0;

        for (int i = 0; i <=90; i++) {

            if (i % 2 == 0) {
                impares = i;
                System.out.println("""
                Números impares de 0 a 90: %d""".formatted(impares));
            }
        }
    }


}
