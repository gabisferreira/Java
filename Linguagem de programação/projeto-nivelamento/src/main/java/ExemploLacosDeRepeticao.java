public class ExemploLacosDeRepeticao {
    public static void main(String[] args) {
        // For que exibe numeros de 0 a 10
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        /* Se tem condição de parada use for ex: de 0 a 10
         Se não sabe quantas condições até parar use o while */

        // while = "enquanto acontece isso continue fazendo o que esta dentro desse código" de 0 a 10

        /* While de 0 a 10
        Aqui ele começou em zero e não muda então ele vai ser infinito
        Integer contador = 0;
        while (contador <10){
            System.out.println(contador);
        } */

        /* While de 0 a 10
        Aqui esta somando então cada vez que passar ele vai
        somar um e assim vai funcionar da forma correta */
        Integer contador = 0;
        while (contador <=10){
            System.out.println(contador);
        contador++;
        }
        System.out.println("Terminei o while");
        // Se tem condição de parada use for ex: de 0 a 10
        // Se não sabe quantas condições até parar use o while
    }
}
