import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        /* O que era parâmetro no JS aqui é argumento
        Scanner permite que o usuario possa digitar no console para interagir
        * Isso significa que estou pegando algo do teclado*/
        /*Scanner = Métodos*/
        /* SEMPRE que colocamos new vira objeto
        * O bouffer de memória Scanner usa um pedacinho da memória next
        * Se estiver pulando linha e não deixar respondeer crie outro scanner*/
        Scanner leitor = new Scanner(System.in);
        //Esta falando que quero ver coisa
        //Não use só next, pois só pega a primeira palavra
        System.out.println("Digite seu nome:");
        String nomeUsuario = leitor.nextLine();
        // Se for texto é nextLine

        System.out.println("Digite sua idade:");
        Integer idadeUsuario = leitor.nextInt();
        // Se for numero é nextInt

        System.out.println("Digite sua altura:");
        Double alturaUsuario = leitor.nextDouble();
        // Se for numero duplo é nextDouble

        // Após as 3 aspas duplas deve dar enter p/ separar se não da erro
        System.out.println(""" 
                O nome digitado foi: %s \n
                A sua idade é: %d \n
                A sua altura é: %.2f \n""".formatted(nomeUsuario, idadeUsuario, alturaUsuario));

    }
}
