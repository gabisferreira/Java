package introducao;

public class Teste {
    public static void main(String[] args) {
        // Para criar um objeto precisa instanciar um obejto = criar um objeto com NEW

        BilheteUnico bilhete01 = new BilheteUnico();
        bilhete01.nomeTitular = "Bob";
        bilhete01.saldo = 0.0;
        bilhete01.qtdVezesUsadas = 0;
        bilhete01.codigo = "B001";

        BilheteUnico bilhete02 = new BilheteUnico();
        bilhete02.nomeTitular = "José";
        bilhete02.saldo = 0.0;
        bilhete02.qtdVezesUsadas = 0;
        bilhete02.codigo = "BOO2";

        bilhete01.carregar(42.1);
        System.out.println("Saldo do B1 " + bilhete01.saldo);

        Boolean deuCerto = bilhete02.usar();
        System.out.println("Uso do B2 deu certo?" + deuCerto);

    }
}
