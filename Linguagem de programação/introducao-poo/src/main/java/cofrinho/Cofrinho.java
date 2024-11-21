package cofrinho;

import java.util.concurrent.ThreadLocalRandom;

public class Cofrinho {


    /* Tem três modificadores de acesso: Private, default, public e (protected que não vai ser ensinado hoje)
    Quando coloca public pode usar em outros pacotes
    Quando coloca default só usa dentro do mesmo pacote
    Protected todo mundo que esta no mesmo pacote pode acessar livremente,
    a diferença é que se tiver uma class herdeira em outro pacote ela também vai poder utilizar
    Private não deixa alterar e nem ver a classe
    Encapsulamento é uma boa prática
    Modificador de acesso deixa os atributos privados
    * No caso ele não permite que você modifique depois e adicione mais dinheiro
    * Nem no sout para printar você consegue acessar mais
    * Complexidade acidental = Cria algo tão bom que cria outro problema para você resolver*/
    private Double saldo;
    private String meta;
    private Boolean quebradoOuNao;

    /*Metodo vs Construtor
     * Precisa especificar retorna VS construtor não possui
     * Padrão de nomes: camelCase VS PascalCase
     * Qualquer nome VS Mesmo nome da classe
     * Chama quando quiser VS chama na instância
     *
     *
     * Para usar o construtor precisa colocar new para ele se construir
     * */

    // metodo construtor pode montar sozinho ou clicar no botão direito na linha > ir em generate > constructor
    public Cofrinho(String propositoDinheiro, Boolean quebradoOuNao) {
        this.saldo = 0.0;
        this.meta = propositoDinheiro;
        this.quebradoOuNao = quebradoOuNao;
    }

    public Cofrinho(Boolean quebradoOuNao) {
        this.meta = "Não tem";
        this.saldo = 0.0;
        this.quebradoOuNao = quebradoOuNao;
    }

    void depositarDinheiro(Double valorRecebido) {
        if (!quebradoOuNao && valorRecebido > 0.0) {
            this.saldo += valorRecebido;
            System.out.println("Depósito realizado");
        } else {
            System.out.println("Erro no depósito");
        }
    }

    /*Metodo sobrecarregado*/
    void depositarDinheiro(Double valorRecebido, Double valorDesconto) {
        ThreadLocalRandom.current().nextInt();
//        if (!quebradoOuNao && valorRecebido > 0.0) {
        if (podeDepositar(valorRecebido)) {
            this.saldo += (valorRecebido - valorDesconto);
            System.out.println("Depósito realizado");
        } else {
            System.out.println("Erro no depósito");
        }
    }

    /*Ao invés de deixar esses IF repetitivos*/
    Boolean podeDepositar(Double valorRecebido) {
        if (!quebradoOuNao && valorRecebido > 0.0) {
            return true;
        } else {
            return false;
        }
    }

    Double agitarCofre() {
        if (!quebradoOuNao) {
            Double valorAleatorio = ThreadLocalRandom.current().nextDouble(0.0, saldo);
            saldo -= valorAleatorio;
            return valorAleatorio;
        }
        return null;
    }

    Double quebrarCofre() {
        if (!quebradoOuNao) {
            Double valorAnterior = saldo;
            saldo = 0.0;
            quebradoOuNao = true; // quebrei e devolvi o dinheiro para o dono, não tirei
            return saldo;
        }
        return null;
    }

    // assim consegue acessar o valor privado pq o metodo pode ver


    public Double getSaldo() {
        return saldo;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    /*Com boleano a IDE pode colocar is ou has ao invés de get eles significam um ou outro*/
}