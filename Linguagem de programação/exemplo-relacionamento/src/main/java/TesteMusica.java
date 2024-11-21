public class TesteMusica {
    public static void main(String[] args) {

             Musica musica01 = new Musica("Billie Jean", "Michael", 4.5);
             musica01.curtir();
             musica01.curtir();
             musica01.curtir();
             Musica musica02 = new Musica("Exagerado", "Cazuza", 4.5);
             musica02.curtir();

        Album album01 = new Album("Tops 90s", 2);
        album01.adicionarMusica(musica01);
        /*Se tivesse deixado a lista cheia no Album aqui iria pedir o nome das musicas*/

        Album album02 = new Album("Favoritas", 10);
        album02.adicionarMusica(musica01);
        album02.adicionarMusica(musica02);

        System.out.println(musica01);
        System.out.println(musica02);

        System.out.println("Exibindo músicas por likes");
        album02.exibeMusicasPorQtdLikes(2);

        /*Como relacionar uma coisa com outra, exemplo: Essa música é desse album
        * Temos duas classes sendo a Album o todo e a Musica a parte pq ta dentro de um album
        *Agregação fica um diamante sem pintar
        * Composição fica um diamante pintado
        * Nesse exemplo o diamante ta do lado do album e sem pintar
        * A musica não depende do album para existir*/
         }
    }

