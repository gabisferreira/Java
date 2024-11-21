import java.util.Scanner;

public class DesafioSwitch {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Escolha uma opção: \n" +
                "1 - Somar\n" +
                "2 - Subtrair\n" +
                "3 - Multiplicar\n" +
                "4 - Sair");
        Integer opcao = leitor.nextInt();

        while (opcao > 4 || opcao <= 0) {
            System.out.println("Escolha uma opção valida: \n" +
                    "1 - Somar\n" +
                    "2 - Subtrair\n" +
                    "3 - Multiplicar\n" +
                    "4 - Sair");
            opcao = leitor.nextInt();
        }

        if (opcao.equals(1) && opcao.equals(2) && opcao.equals(3)) {

            System.out.println("Insira o 1° número:");
            Integer numero1 = leitor.nextInt();

            System.out.println("Insira o 2° número:");
            Integer numero2 = leitor.nextInt();


            switch (opcao) {
                case 1:
                    Integer soma = numero1 + numero2;
                    System.out.println("Soma:" + soma);
                    break;

                case 2:
                    Integer subtrair = numero1 - numero2;
                    System.out.println("Subtrair" + subtrair);

                case 3:
                    Integer multiplicar = numero1 * numero2;
                    System.out.println("Multiplicar" + multiplicar);
            }
        } else {

        }
    }
}