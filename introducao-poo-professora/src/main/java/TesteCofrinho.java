public class TesteCofrinho {
    public static void main(String[] args) {
        Cofrinho cofrinho01 = new Cofrinho();
        cofrinho01.meta = "Comprar um PC Gamer";
        cofrinho01.valorGuardado = 0.0;
        cofrinho01.taQuebrado = true;


        cofrinho01.depositar(50.10);
        Double valorResgatado = cofrinho01.quebrar();

        if (valorResgatado == null){
            System.out.println("Já foi quebrado");
        }else {
            System.out.println("Você quebrou e resgatou "
                    + valorResgatado);
        }
    }
}
