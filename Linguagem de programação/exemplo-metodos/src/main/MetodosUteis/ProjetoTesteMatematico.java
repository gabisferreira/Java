public class ProjetoTesteMatematico {
    public static void main(String[] args) {
        Double num01 = 42.0;
        Double num02 = 10.1;

        MetodosUteis metodosLegais = new MetodosUteis();

        //Criei aqui 500 variaveis para somar números diferentes
        Double resultadoSoma = metodosLegais.somar(num01, num02);
        // Precisa falar para o java pq ta fazendo isso e pedindo p/ guardar retorno se não da erro
        System.out.println(resultadoSoma);

    }
}
