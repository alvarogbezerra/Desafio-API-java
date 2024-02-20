package buscadordelivros;

public class Livro {
    String titulo;
    String autor;
    Editora editora;

    public Livro(String titulo, String autor, Editora editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
    }

    public Livro(LivroGoogleBooks livro) {
        this.titulo = livro.volumeInfo.title;
        this.autor = String.join(", ", livro.volumeInfo.authors);
        this.editora = livro.volumeInfo.publisher;
    }

    public String toString() {
        return "Titulo= '" + titulo + '\'' +
                ", Autor= '" + autor + "'," +
                " Editora= " + editora.getNome();
    }
}
