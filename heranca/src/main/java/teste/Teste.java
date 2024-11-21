/*package teste;

import heranca.Aluno;
import heranca.AlunoPos;

public class Teste {
    public static void main(String[] args) {
        Faculdade faculdade01 = new Faculdade("Sptech");

        Aluno aluno01 = new Aluno("123", "Bob", 10.0, 7.5, 0);
        Aluno aluno02 = new Aluno("234", "Xampson", 5.0, 9.2, 4);

        faculdade01.matricular(aluno01);
        faculdade01.matricular(aluno02);

        Double somaNotas = faculdade01.somaNotasEntregas();
        Double somaNotasMaiorQue5 = faculdade01.somaNotasEntregas(5.0);
        System.out.println("A soma das notas é: " + somaNotas);
        System.out.println("A soma das notas é: " + somaNotasMaiorQue5);

        /*----------------------------------TESTE DE HERANÇA---------------------------------*/
/*
        AlunoPos aluno03 = new AlunoPos("567", "Mel", 5.5, 8.0, 10, 9.0, 10.0);
        System.out.println("Nota no aluno pós:" +  aluno03.calcularMedia());

    }
} */
