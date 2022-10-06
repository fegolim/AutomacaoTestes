/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.meusprojetosLivros;
import br.meusprojetosLivros.Livro;
import br.meusprojetosLivros.Autor;


/**
 *
 * @author dti
 */
public class Livro {

    private String isbn;
    private String titulo;
    private Autor autor;
    private Editora editora;
    private int numedicao;
    private int ano;
    private int numpaginas;
    private String sobrenome;
    private String nome;

    public Livro(String isbn, String titulo, Autor autor,
            Editora ed, int ano, int numpaginas) {
        setIsbn(isbn);
        setTitulo(titulo);
        setAutor(autor);
        numedicao = 1;
        editora = ed;
        setAno(ano);
        setNumpaginas(numpaginas);
    }

    public Livro(String titulo, Autor autor) {
        setTitulo(titulo);
        setAutor(autor);
    }

    public int getNumedicao() {
        return numedicao;
    }

    public void setNumedicao(int numedicao) {
        this.numedicao = numedicao;
    }

    public void escrevaReferencia1() {
        System.out.println(autor.getSobrenome() + "." + autor.getNome() + "."
                + titulo + "." + numedicao + "ed." + editora.getCidade() + ":"
                + editora.getNome() + "," + ano + "," + numpaginas + ".");
    }

    public String escrevaReferencia() {
        return (sobrenome + "." + nome + "."
                + titulo + "." + numedicao + "ed." + editora.getCidade() + ":"
                + editora.getNome() + "," + ano + "," + numpaginas + ".");
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNumpaginas() {
        return numpaginas;
    }

    public void setNumpaginas(int numpaginas) {
        this.numpaginas = numpaginas;
    }
}
