package teste;

import agregacao.Faculdade;
import heranca.Aluno;
import heranca.AlunoPos;

public class Testte {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("RA123", "Bob da silva", 5.6, 8.9, 2);
        AlunoPos alunoPos01 = new AlunoPos("RA456","Gibi santos",9.7,8.1,5, 7.0, 8.0);

        Faculdade faculdade01 = new Faculdade("Sptech");
        faculdade01.matricular(aluno01);
        faculdade01.matricular(alunoPos01);

        System.out.println("Exibindo todos os alunos:");
        faculdade01.exibirAlunos();

        System.out.println("Nota aluno pos:");
        faculdade01.somaNotasDeTcc();
    }
}