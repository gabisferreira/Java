public class MetodosUteis {
    /*Método possui
    retorno: esse é void sem retorno, então não mostra o resultado
    nome: exibirUsuario
    argumentos: nomeUsuario
    corpo: faz um print enfeitado com o nome
    */

    void exibirUsuario(String nome) {
        System.out.println("""
                *----------*-----------*
                Usuario logado:" %s "
                *----------*-----------*
                """.formatted(nome));

    }


    Double somar(Double num01, Double num02) {
    return  num01 + num02;
    };
}