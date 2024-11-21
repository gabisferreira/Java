package agregacao;

import heranca.Aluno;
import heranca.AlunoPos;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {
    private String nome;
    private List<Aluno> alunos;

    public Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public void matricular(Aluno aluno) {
        alunos.add(aluno);
    }

    public void exibirAlunos() {
        /*O comando iter criou esse for para mim, ele é incrível*/
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public void exibirSomenteAlunos() {
        /*O comando iter criou esse for para mim, ele é incrível*/
        for (Aluno aluno : alunos) {
            if (aluno instanceof AlunoPos) {
            System.out.println(aluno);
        }
        }
    }

    public Double somaNotasDeTcc() {
        Double somaNotas = 0.0;

        for (Aluno aluno : alunos) {
            // Esta garantindo que é o AlunoPos
            if (aluno instanceof AlunoPos) {
            AlunoPos alunoPosDaVez = (AlunoPos) aluno; /*Esse aluno do final é como se fosse o .get(i) ele ta pegando o atual*/
            }
        }
        return somaNotas;
    }



}
//    public Double somaNotasEntregas() {
//        Double soma = 0.0;
//
//        for (Aluno alunoDaVez : alunos) {
//            soma += alunoDaVez.getNotaEntrega();
//        }
//        return soma;
//    }
//
//    public Double somaNotasEntregas(Double notaEntregaMinima) {
//        Double soma = 0.0;
//
//        for (Aluno alunoDaVez : alunos) {
//            if (alunoDaVez.getNotaEntrega() >= notaEntregaMinima) {
//                soma += alunoDaVez.getNotaEntrega();
//            }
//        }
//        return soma;
//    }
//
//    public List<Aluno> buscaAlunoPorNome(String nomeBusca) {
//        List<Aluno> alunosFiltrados = new ArrayList<>();
//
//        for (Aluno alunoDaVez : alunos) {
//            if (alunoDaVez.getNome().contains(nomeBusca)) {
//                alunosFiltrados.add(alunoDaVez);
//            }
//        }
//
//        return alunosFiltrados;
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public List<Aluno> getAlunos() {
//        return alunos;
//    }
//
//    public void setAlunos(List<Aluno> alunos) {
//        this.alunos = alunos;
//    }

