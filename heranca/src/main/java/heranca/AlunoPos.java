package heranca;/*Estamos fazendo herança, tudo que fez na outra class esta aqui
* Super significa que foi herdado da class mãe
* Só pode herdar de uma class, não tem heranças multiplas
* Mas pode fazer uma herança em cascata,
* Tudo que tem na class Animal vai ter na class Silvestre, tudo da class Animal vai ter na class doméstico e tudo
* que tem na class doméstico vai ter na class cachorro
*                               Animal
*                Silvestre                   Doméstico
*                                          gato    cachorro
*
* Sobrecarga - Fazendo muita coisa, esta sobrecarregado
* Sobreescrevendo - Para de fazer tal tarefa e começa fazer outra
* */

public class AlunoPos extends Aluno{
    private Double notaTcc;
    private Double notaArtigo;

    public AlunoPos(String ra,
                    String nome,
                    Double notaEntrega,
                    Double notaPratica,
                    Integer qtdFaltas,
                    Double notaTcc,
                    Double notaArtigo) {
        super(ra, nome, notaEntrega, notaPratica, qtdFaltas);
        this.notaTcc = notaTcc;
        this.notaArtigo = notaArtigo;
    }

    /*Esta sobrescrevendo o calcularMedia da class mãe*/
    @Override
    public Double calcularMedia() {
        return (notaEntrega + notaPratica + notaArtigo + notaTcc) / 4.0;
//        return (super.calcularMedia() + notaArtigo + notaTcc) + 4;
        /* O super esta usando a soma da class mãe */
    }

    @Override
    public String toString() {
        return """
                %s
                Nota TCC: %.2f
                Nota artigo: %.2f
                """.formatted(super.toString(), notaTcc, notaArtigo);
    }

    public Double getNotaTcc() {
        return notaTcc;
    }

    public void setNotaTcc(Double notaTcc) {
        this.notaTcc = notaTcc;
    }

    public Double getNotaArtigo() {
        return notaArtigo;
    }

    public void setNotaArtigo(Double notaArtigo) {
        this.notaArtigo = notaArtigo;
    }
}
