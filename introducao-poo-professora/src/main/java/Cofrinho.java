import java.util.concurrent.ThreadLocalRandom;

public class Cofrinho {
    String meta;
    Double valorGuardado;
    Boolean taQuebrado;

    void depositar(Double valorDeposito){
        if (!taQuebrado && valorDeposito > 0.0){
            valorGuardado += valorDeposito;
            System.out.println("Deposito realizado");
        }else {
            System.out.println("Erro no deposito");
        }
    }

    Double agitar(){
        if (!taQuebrado){
            Double valorAleatorio =
                    ThreadLocalRandom.current().nextDouble(0, valorGuardado);
            valorGuardado -= valorAleatorio;
            return  valorAleatorio;
        }
        return null;
    }

    Double quebrar(){
        if (!taQuebrado){
            Double valorAntesDeZerar = valorGuardado;
            valorGuardado = 0.0;
            taQuebrado = true;
            return valorAntesDeZerar;
        }
        return null;
    }
}
