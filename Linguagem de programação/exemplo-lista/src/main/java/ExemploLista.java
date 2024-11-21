import java.util.ArrayList;
import java.util.List;

public class ExemploLista {
    public static void main(String[] args) {
        /*Lista é diferente de vetor, a lista tem varias funções
        * A list é um objeto
        * Só de colocar o .add ele ja adiciona na ordem*/

        /* ESSA É PROBLEMATICA, NÃO DA PARA SOMAR
        List listaEstranha = new ArrayList();
        listaEstranha.add(true);
        listaEstranha.add("Bob");
        listaEstranha.add(42);
        PROBLEMATICA*/
        /*ArrayList é só para criar a lista*/
        List<String> nomes = new ArrayList<>();
        nomes.add("Bob da Silva");
        nomes.add("José");
        nomes.add("Maria");

        System.out.println("Segundo nome da lista:" + nomes.get(1));
        /*Colocou o 1 pq começa a contar do 0 então fica 0, 1 , 2 e o 2 vira 3*/
        /*Size (é tamanho igual usavamos o lenght para saber o tamanho da lista no JS) é um metodo de tamanho */

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("""
                    Nome: %d
                    %s""".formatted(i, nomes.get(i)));
        }

        /*Principais métodos da lista no java
        * .add() - adiciona elemento
        * .size() - retorna o tamanho
        * .get(0) - busca elemento por indice
        * .set() - altera o elemento por indice
        * .remove() - remove elemento por indice
        * .isEmpty() - retorna true se a lista esta vazia
        * .clear() - limpa a lista
        * */
    }
}
