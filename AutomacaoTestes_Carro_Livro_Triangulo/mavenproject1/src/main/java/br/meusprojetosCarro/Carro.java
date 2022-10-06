/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.meusprojetosCarro;

/**
 *
 * @author dti
 */
public class Carro {
    //atributos

    private String marca;
    private String modelo;
    private int ano;

    private int potencia;
    private int velocidade;

    //método construtor
    public Carro(int potencia, int velocidade) {
        this.potencia = potencia;
        this.velocidade = velocidade;
    }

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    //métodos
    public void acelerar() {
        velocidade = velocidade + 10;
    }

    private void parar() {
        velocidade = 0;
    }

    public void reduzir() {
        while (velocidade > 10) {
            velocidade = velocidade - 7;
        }
    }

    public void frear() {
        reduzir();
        parar();
    }

    //métodos de acesso e modificadores getters e setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public Carro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
