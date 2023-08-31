package br.com.biblioteca.itens;

import br.com.biblioteca.itens.Itens;

public class Livro extends Itens {
    private String autor;
    private String editora;
    private int numeroPaginas;

    public Livro() {
    }

    public Livro(int codigo, String titulo, String autor, String editora, int numeroPaginas) {
        super(codigo, titulo);
        this.autor = autor;
        this.editora = editora;
        this.numeroPaginas = numeroPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    // No implementaste correctamente este método, asegúrate de implementarlo según sea necesario
    @Override
    public void setTitulo(String titulo) {
        // Implementa la lógica para establecer el título del libro
    }
}
