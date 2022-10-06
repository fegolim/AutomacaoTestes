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
public class Editora {

    private String nome;
    private String cidade;
    private String uf;

    //método construtor
    public Editora(String nome, String cidade, String uf) {
        setNome(nome);
        setCidade(cidade);
        setUf(uf);
    }

    //métodos de acesso <=> getters
    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    //métodos de definição <=> setters	
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
