import java.util.concurrent.ThreadLocalRandom;

public class ExemploNumerosAleatorios {
    public static void main(String[] args) {

        /*Criando numero aleatorio inteiro
        Integer inteiroAleatorio = ThreadLocalRandom.current().nextInt();
        System.out.println("Inteiro sorteado:" + inteiroAleatorio);

        //Criando numero aleatorio inteiro
        Integer inteiroAleatorio10 = ThreadLocalRandom.current().nextInt(0,11);
        System.out.println("Inteiro sorteado:" + inteiroAleatorio10); */

        //Enquanto não sortear o numero 3, continue sorteando
        Integer inteiroAleatorio3 = ThreadLocalRandom.current().nextInt(0, 6);
        // Vai cair aqui se for DIFERENTE DE 3
        while (inteiroAleatorio3 !=3){
            System.out.println("Não sorteou, sorteado:" + inteiroAleatorio3);
            /* Tem que gerar novamente para o número mudar se não
             nunca vai sair desse while e vai ser infinito */
            inteiroAleatorio3 = ThreadLocalRandom.current().nextInt(0, 6);
        }
            System.out.println("Número sorteado:" + inteiroAleatorio3);
    }
}