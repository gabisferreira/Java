package heranca;

public class Aluno {
    protected String ra;
    protected String nome;
    protected Double notaEntrega;
    protected Double notaPratica;
    protected Integer qtdFaltas;

    /* Default - Todas as Class no mesmo pacote pode usar livremente
    Protected - Todas as Class no mesmo pacote pode usar livremente
    * Protected X Default - No protected qualquer class filha dentro de outro pacote também pode acessar*/

    public Aluno(String ra, String nome, Double notaEntrega, Double notaPratica, Integer qtdFaltas) {
        this.ra = ra;
        this.nome = nome;
        this.notaEntrega = notaEntrega;
        this.notaPratica = notaPratica;
        this.qtdFaltas = qtdFaltas;
    }

    @Override
    public String toString() {
        return """
                RA: %s
                Nome: %s
                Nota de entrega: %.2f
                Nota prática: %.2f
                Faltas: %d
                """.formatted(ra, nome, notaEntrega, notaPratica, qtdFaltas);
    }

    public Double calcularMedia() {
        return (notaEntrega + notaPratica) / 2.0;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNotaEntrega() {
        return notaEntrega;
    }

    public void setNotaEntrega(Double notaEntrega) {
        this.notaEntrega = notaEntrega;
    }

    public Double getNotaPratica() {
        return notaPratica;
    }

    public void setNotaPratica(Double notaPratica) {
        this.notaPratica = notaPratica;
    }

    public Integer getQtdFaltas() {
        return qtdFaltas;
    }

    public void setQtdFaltas(Integer qtdFaltas) {
        this.qtdFaltas = qtdFaltas;
    }
}
