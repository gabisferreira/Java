public class teste {
    public static void main(String[] args) {
        Carro carro01 = new Carro("Bob da Silva", "Fiat", 2008, 3.4, false);
        Bicicleta bicicleta01 = new Bicicleta("Luan Souza", "caloi",2023, 0.9);
        // Não pode criar o veículo pq ele não pode ser instanciado (ser criado um objeto) ele é abstrato
//        Veiculo veiculo01 = new Veiculo("Tomas Pedro", "xyz", 2010);
        Moto moto01 = new Moto("Mel", "Top", 2008, false);
        // Classe abstrata não permite instância
//        veiculo01.exibirRelatorio();


        carro01.exibirRelatorio();
        bicicleta01.exibirRelatorio();
        moto01.exibirRelatorio();


    }
}
