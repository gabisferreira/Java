package cofrinho;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Cofrinho cofrinho01 = new Cofrinho(
                "Comprar um carro",
                false);

        Cofrinho cofrinho02 = new Cofrinho(
                "Comprar casa",
                false);

        Cofrinho cofrinho03 = new Cofrinho(
                false);


        cofrinho01.depositarDinheiro(50.10);
        cofrinho01.depositarDinheiro(10.0, 5.0);
        Double valorResgatado = cofrinho01.quebrarCofre();

        System.out.println("Saldo do cofre 01:" + cofrinho01.getValorGuardado());
        // assim consegue acessar o valor privado pq o metodo pode ver

        // mudei de ideia sobre a meta
        cofrinho01.setMeta("Comprar um livro de Java");

        if (valorResgatado == null) {
            System.out.println("Já foi quebrado");
        } else {
            System.out.println("Você quebrou e resgatou " + valorResgatado);
        }

        List<Cofrinho> cofre = new ArrayList<>();
        List<Cofrinho> cofresDosFilhos = new ArrayList<>();


    }
}
