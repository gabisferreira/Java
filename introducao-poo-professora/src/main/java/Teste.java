import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        //Instânciar um objeto = criar um objeto
        BilheteUnico bilhete01 = new BilheteUnico();
        bilhete01.nomeTitular = "Bob";
        bilhete01.saldo = 0.0;
        bilhete01.quantidadeVezesUsada = 0;
        bilhete01.codigo = "B001";

        BilheteUnico bilhete02 = new BilheteUnico();
        bilhete02.nomeTitular = "José";
        bilhete02.saldo = 0.0;
        bilhete02.quantidadeVezesUsada = 0;
        bilhete02.codigo = "B002";


        bilhete01.carregar(42.1);
        System.out.println("Saldo do B1: " + bilhete01.saldo);
        Boolean deuCerto = bilhete02.usar();
        System.out.println("Uso do B2 deu certo? " + deuCerto);
    }
}