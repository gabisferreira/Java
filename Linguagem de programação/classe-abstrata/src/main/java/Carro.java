public class Carro extends Veiculo{
    private Double nivelOleo;
    private Boolean possuiEstepe;

    public Carro(String nomeCliente, String marca, Integer anoFabricacao, Double nivelOleo, Boolean possuiEstepe) {
        super(nomeCliente, marca, anoFabricacao);
        this.nivelOleo = nivelOleo;
        this.possuiEstepe = possuiEstepe;
    }

    @Override
    public void exibirRelatorio() {
        System.out.println("Relatório do carro de: " + nomeCliente);
        if (possuiEstepe) {
            System.out.println("Estepe ok!");
        } else {
            System.out.println("Compre um estepe com a gente!");
        }

        if (nivelOleo <0.5) {
            System.out.println("Nível de óleo baixo, complete aqui:");
        } else {
            System.out.println("Nível de óleo ok!");
        }
    }

    public Double getNivelOleo() {
        return nivelOleo;
    }

    public void setNivelOleo(Double nivelOleo) {
        this.nivelOleo = nivelOleo;
    }

    public Boolean getPossuiEstepe() {
        return possuiEstepe;
    }

    public void setPossuiEstepe(Boolean possuiEstepe) {
        this.possuiEstepe = possuiEstepe;
    }
}
