public class BilheteUnico {

    //Atributos = Caracteristicas do objeto
    String nomeTitular;
    Double saldo;
    String codigo;
    Integer quantidadeVezesUsada;

    //Métodos = Comportamentos
    void carregar(Double valorRecarga){
        if (valorRecarga > 0.0){
            saldo += valorRecarga;
            System.out.println("Recarga efetuada!");
        }else {
            System.out.println("Valor inválido!");
        }
    }

    Boolean usar(){
        if (saldo >= 5.0){
            saldo -= 5.0;
            quantidadeVezesUsada++;
            return true;
        }
        return false;

    }
}
