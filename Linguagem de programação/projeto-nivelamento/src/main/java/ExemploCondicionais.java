public class ExemploCondicionais {
    public static void main(String[] args) {

        Integer idade = 19;
        /* é igual no java
         if
         &&
         ||
        >
        <
        >=
        <=
        */

        if (idade >=18) {
            System.out.println("É maior de idade");
        } else {
            System.out.println("É menor de idade");
        }

        String nome01 = "Bob";
        String nome02 = "Bob";
        String nome03 = "Bob";

        /* Não pode comparar com == pois da erro!!!
        Quando usamos == o Java olha as referencias de memoria,
        exemplo: se uma você declarou aqui e outra veio do banco de dados vai dar erro

        .equals() é usado para comparar
        !.equals() com o ! na frente ele vai ver se é diferente
        Faça isso abaixo ¬¬¬¬¬¬
        Esta comparando se é igual ao 02 e diferente do 03
        */
        if (nome01.equals(nome02) && !nome01.equals(nome03)){
            System.out.println("O nome é igual!");
        } else {
            System.out.println("O nome é diferente!");
        }

        /* Operador tenário = if elegante */

        String resultadoMaioridade = idade >=18 ? "Sim" : "Não";
        Boolean ehMaiorDeIdade = idade >=18;
        System.out.println("É maior de idade: " + resultadoMaioridade);



        // ISSO É HORRIVEL E NÃO SE FAZ
        Boolean naoBloqueado = false;
        if (naoBloqueado){}

        Boolean BloqueadoouNao = false;
        if (BloqueadoouNao){}
    }
}
