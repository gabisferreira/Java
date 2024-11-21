public class Contato {

    private String nome;
    private String telefone;
    private Boolean bloqueado;
    private String tipoContato;
    private Double valorDoacao;

    public Contato(String nome, String telefone, String tipoContato, Double valorDoacao) {
        this.nome = nome;
        this.telefone = telefone;
        this.bloqueado = false; /*Começa como falso pq não adianta criar um contato já bloqueado né*/
        this.tipoContato = tipoContato;
        this.valorDoacao = valorDoacao;
    }

    public void bloquear() {
        bloqueado = true;
    }

    public void desbloquear() {
        bloqueado = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Boolean getBloqueado() {
        return bloqueado;
    }

    public String getTipoContato() {
        return tipoContato;
    }

    public void setTipoContato(String tipoContato) {
        this.tipoContato = tipoContato;
    }

    public Double getValorDoacao() {
        return valorDoacao;
    }

    public void setValorDoacao(Double valorDoacao) {
        this.valorDoacao = valorDoacao;
    }

    @Override
    public String toString() {
        return """
                Nome: %s
                Telefone: %s
                Bloqueado: $s""".formatted(nome, telefone, (bloqueado ? "Sim" : "Não"));
    }
    /*É para tornar tudo em texto e facilitar o print
    * Nós sobrescrevemos o .toString original para ficar bonitinho
    * Esse bloqueado é para não ficar false ou true*/

}
