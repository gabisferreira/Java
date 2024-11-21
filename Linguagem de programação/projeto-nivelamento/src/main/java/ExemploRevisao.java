public class ExemploRevisao {
    public static void main(String[] args) {
        // Esse \n quebra linha
        // Dentro de uma class possui metodos
        // Tipos de variaveis que mais usaremos
        // Classe não possui valor inicial
        // Tipos Wrapper não tem valor inicial e são classes e possue métodos que ajudam
        String nome = "Bob da Silva"; // texto
        Integer idade = 42; // Número inteiro
        Double altura = 1.55; // Para números quebrados
        Boolean bloqueado = false; //false
        /*Exemplo de Tipos Wrapper que começa sem valor inicial
        String nomePet;
        nomePet = "Teste";*/

        //Somente println
        System.out.println("Meu nome é:" + nome +
                ", minha altura é:" + altura +
                "\n e minha idade é: " + idade);

        // Esta criando uma string com o ""
        // %s é a String nome, %.2f é o Double para ter dois números depois do .
        // %d é o Integer número inteiro


        // println usando interpolação
        System.out.println("Meu nome é %s, minha altura é %.2f e minha idade é %d"
                .formatted(nome, altura, idade));

        // println usando interpolação e text block, com esse modo quebra linha automatico
        System.out.println("""
                Nome: %s
                Idade: %d
                Altura: %.2f
                Nome do Pet: %s
                """.formatted(nome, idade, altura, "Caramelo"));
        // colocamos o nome do cachorro dentro do formatted,
        // nele tambem podemos realizar contas e somar variaveis


        // tipo primitivo sempre tem valor inicial e não é classe,
        // ele só guarda o valor, não tem métodos
        // não vamos usar
        boolean bloqueado02 = false;
        int numero = 42;
    }
}



