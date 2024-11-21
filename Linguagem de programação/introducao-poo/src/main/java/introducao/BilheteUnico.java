package introducao;

public class BilheteUnico {
    //Atributos = Caracteristicas do objeto

    String nomeTitular;
    Double saldo;
    String codigo;
    Integer qtdVezesUsadas;

    //Metodos = Comportamentos
    // Não precisa receber como argumento igual esta comentado abaixo
    // void carregar(String nomeTitular, Double saldo, String codigo, Integer qtdVezesUsadas){

    // Só coloquei aqui pq ele não existia em cima, foi criado ali dentro

    // void pq não precisa de retorno = return
    void carregar(Double valorRecarga){
        if (valorRecarga > 0.0) {
            saldo += valorRecarga;
            System.out.println("Recarga efetuada!");
        } else {
            System.out.println("Valor inválido");
        }
    }

//    void usar() {
//        if (saldo >= 5.0){
//        saldo -= 5.0;
//        qtdVezesUsadas ++;
//            System.out.println("Bilhete utilizado!");
//        } else {
//            System.out.println("Saldo insuficiente.");
//        }
//    }

    Boolean usar() {
        if (saldo >= 5.0){
            saldo -= 5.0;
            qtdVezesUsadas ++;
            System.out.println("Bilhete utilizado!");
            return true;
        }
            System.out.println("Saldo insuficiente.");
        return false;
    }
}
