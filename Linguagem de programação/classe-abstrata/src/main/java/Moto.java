public class Moto extends Veiculo{
    private Boolean possuiCapacete;

    public Moto(String nomeCliente, String marca, Integer anoFabricacao, Boolean possuiCapacete) {
        super(nomeCliente, marca, anoFabricacao);
        this.possuiCapacete = possuiCapacete;
    }

    @Override
    public void exibirRelatorio() {
        System.out.println("Relatório da moto de: " + nomeCliente);

        if (possuiCapacete) {
            System.out.println("Temos capacetes melhores que o seu");
        } else {
            System.out.println("Muito perigoso, compre um capacete aqui");
        }
    }

    public Boolean getPossuiCapacete() {
        return possuiCapacete;
    }

    public void setPossuiCapacete(Boolean possuiCapacete) {
        this.possuiCapacete = possuiCapacete;
    }
}
