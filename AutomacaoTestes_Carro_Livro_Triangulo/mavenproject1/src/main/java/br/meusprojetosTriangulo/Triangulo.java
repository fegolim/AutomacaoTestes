/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.meusprojetosTriangulo;

/**
 *
 * @author dti
 */
public class Triangulo {
    int a, b, c;

    public Triangulo(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean ehTriangulo() {
        if ((a <= b + c) && (b < a + c) && (c <= a + b)) return true;
        return false;
    }

    public String tipoTriangulo() {
        if (this.ehTriangulo()){
        if ((a==b) && (b==c)) return "Equilatero";
        if ((a==b) || (a==c) || (b==c)) return "Isosceles";
        return "Escaleno";
        }
    return "Não eh triangulo"; 
    }
}
