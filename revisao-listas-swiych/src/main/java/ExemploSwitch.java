import java.util.Scanner;

public class ExemploSwitch {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7:");
        Integer diaSemana = leitor.nextInt();

        System.out.println(diaSemana);

/*        if (diaSemana == 1) {
            System.out.println("Domingo");
        } else if (diaSemana == 2) {
            System.out.println("Segunda");
        } else if (diaSemana == 3) {
            System.out.println("Terça");
        } else if (diaSemana == 4) {
            System.out.println("Quarta");
        } else if (diaSemana == 5) {
            System.out.println("Quinta");
        } else if (diaSemana == 6) {
            System.out.println("Sexta");
        } else if (diaSemana == 7) {
            System.out.println("Sábado");
        } else if (diaSemana >=8) {
            System.out.println("Dia da semana inválido");
        }*/

//
//        /*ISSO É A MESMA COISA DE CIMA*/
//
//        /* : e -> tem quase a mesma funcionabilidade*/
//        switch (diaSemana) {
//            case 1:
//                System.out.println("Domingo");
//                break;  /*para, se tirar vai direto para o próximo*/
//
//            /*Exemplo sem parada para dois dias do final de semana
//            case 1, 7:
//                System.out.println("Não tem aula");
//                break;  /*para, se tirar vai direto para o próximo*/
//
//            case 2:
//                System.out.println("Domingo");
//                break;
//
//            case 3:
//                System.out.println("Domingo");
//                break;
//
//            case 4:
//                System.out.println("Domingo");
//                break;
//
//            case 5:
//                System.out.println("Domingo");
//                break;
//
//            case 6:
//                System.out.println("Domingo");
//                break;
//
//            case 7:
//                System.out.println("Domingo");
//                break;
//
//            default: /*todas outras condições diferentes da definida acima vai cair aqui*/
//                System.out.println("Número da semana inválido");
//                break;
//

/*            System.out.println(diaSemana);
            switch (diaSemana) {
                case 1 -> System.out.println("Domingo");

                    case 2 -> System.out.println("Segunda");

                case 3 -> System.out.println("Terça");

                case 4 -> System.out.println("Quarta");

                case 5 -> System.out.println("Quinta");

                case 6 -> System.out.println("Sexta");

                case 7 -> System.out.println("Sábado");


            }*/


        System.out.println(diaSemana);
        String dias = switch (diaSemana) {
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            case 7 -> "Sábado";
            default -> "Não é valido";
        };
        System.out.println(dias);
    }
}
