import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private String nome;
    private List<Contato> contatos;

    public Grupo(String nome) {
        this.nome = nome;
        this.contatos = new ArrayList<>();

        /*Mesmo que não vai usar o contato ali em cima a lista vai ficar null e vai dar erro,
        temos que definir que ela vai nascer como vazia*/
    }

    public void adicionar(Contato c) {
        contatos.add(c);
    }

    public void removerPorNome(String nomeRemover) {
        for (int i = 0; i < contatos.size(); i++) {
            Contato contatoDaVez = contatos.get(i);

            if (contatoDaVez.getNome().equals(nomeRemover)) {
                contatos.remove(i);
            }
        }
    }

    public void removerPorTipo(String tipoRemover) {
        for (int i = 0; i < contatos.size(); i++) {
            Contato contatoDaVez = contatos.get(i);

            if (contatoDaVez.getTipoContato().equals(tipoRemover)) {
                contatos.remove(i);
            }
        }
    }

    /*Criando assinatura do método*/

    public Integer getQuantidadeBloqueador() {

        Integer quantidadeBloqueados = 0;

        for (int i = 0; i < contatos.size(); i++) {
            Contato contatoDaVez = contatos.get(i);

            if (contatoDaVez.getBloqueado()) {
                quantidadeBloqueados ++;
            }
        }
        return quantidadeBloqueados;
    }

    /*Crie na classe contato um atributo chamado valorDoacao
    * Nessa classe, complete o seguinte método */
    public Double somaValorDoacoes(String valorDoado) {

        Double valor = 0.0;

        for (int i = 0; i < contatos.size(); i++) {
            Contato contatoDaVez = contatos.get(i);

            if (contatoDaVez.getValorDoacao().equals(valorDoado)) {
               valor += contatoDaVez.getValorDoacao();
            }
        }

        return valor;
    }
}
