import java.util.ArrayList;
import java.util.List;

public class RevisaoListas {

    public static void main(String[] args) {
/*        List<String> frutas =  new ArrayList<>();
        frutas.add("Laranja");
        frutas.add("Goiaba");

        System.out.println(frutas);*/

        List<String> frutasImutavel = List.of("Laranja", "Goiaba", "Limão");
        System.out.println(frutasImutavel);

/*
        frutasImutavel.add("Mamão"); Não pode fazer
*/

        List<String> frutasMutavel = new ArrayList<>(List.of("Laranja", "Goiaba", "Limão"));

        frutasMutavel.add("Uva");
        System.out.println(frutasMutavel);

        frutasMutavel.set(2, "Melancia");
        System.out.println(frutasMutavel);

        frutasMutavel.remove(0);
        System.out.println(frutasMutavel);

        frutasMutavel.remove("Goiaba");
        System.out.println(frutasMutavel);

        System.out.println("Interando lista com for: ");
        for (int i = 0; i < frutasImutavel.size(); i++) {
            System.out.println(frutasImutavel.get(i));
        }

        System.out.println("Interando lista com for aprimorado");
        for (String frutaDaVez : frutasMutavel) {
            System.out.println(frutaDaVez);
        }
        /*frutasImutavel.fori é um atalho para esse for*/
        for (int i = 0; i < frutasImutavel.size(); i++) {

        }
        /*frutasImutavel.fori é um atalho para esse for inverso, que começa do fim*/
        for (int i = frutasMutavel.size() - 1; i >= 0; i--) {

        }
    }
}
