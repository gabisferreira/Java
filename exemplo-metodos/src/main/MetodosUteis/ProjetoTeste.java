import jdk.jshell.execution.Util;

import java.util.Scanner;

public class ProjetoTeste {
    public static void main(String[] args) {
        // metodo é função no JavaScript

        //Criando um objeto para utilizar seus
        MetodosUteis metodosLegais = new MetodosUteis();
        Scanner leitor = new Scanner(System.in);
        String nomeUsuario = leitor.nextLine();

        metodosLegais.exibirUsuario(nomeUsuario);
    }
}
