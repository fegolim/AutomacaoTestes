/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package testeTriangulo;

import br.meusprojetosTriangulo.Triangulo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author dti
 */
public class TesteTriangulo {
    @Test
    public void testeEhTrianguloFalso1(){
        Triangulo figura1 = new Triangulo(1, 4, 10);
        assertFalse(figura1.ehTriangulo());
    }
    
    @Test
    public void testeEhTrianguloFalso2(){
        Triangulo figura1 = new Triangulo(10, 4, 1);
        assertFalse(figura1.ehTriangulo());
    }
    
    @Test
    public void testeEhTrianguloFalso3(){
        Triangulo figura1 = new Triangulo(4, 10, 1);
        assertFalse(figura1.ehTriangulo());
    }
    
    @Test
    public void testeEhTrianguloVerdadeiro(){
        Triangulo figura1 = new Triangulo(1, 1, 2);
        assertTrue(figura1.ehTriangulo());
    }
    
    @Test
    public void testeEhTriangulo(){
        Triangulo figura1 = new Triangulo(1, 1, 1);
        assertEquals(true, figura1.ehTriangulo());
    }

    @Test
    public void testeTipoEquilatero(){
        Triangulo figura1 = new Triangulo(10, 10, 10);
        assertEquals("Equilatero", figura1.tipoTriangulo());
    }
        
    @Test
    public void testeTipoEscaleno(){
        Triangulo figura1 = new Triangulo(1, 2, 3);
        assertEquals("Escaleno", figura1.tipoTriangulo());
    }
    
    @Test
    public void testeTipoNaoEhTriangulo(){
        Triangulo figura1 = new Triangulo(10, 2, 3);
        assertEquals("Não é triângulo!", figura1.tipoTriangulo());
    }
    
    @Test
    public void testeTipoIsosceles1(){
        Triangulo figura1 = new Triangulo(10, 10, 5);
        assertEquals("Isosceles", figura1.tipoTriangulo());
    }

    @Test
    public void testeTipoIsosceles2(){
        Triangulo figura1 = new Triangulo(5, 10, 10);
        assertEquals("Isosceles", figura1.tipoTriangulo());
    }

    @Test
    public void testeTipoIsosceles3(){
        Triangulo figura1 = new Triangulo(10, 5, 10);
        assertEquals("Isosceles", figura1.tipoTriangulo());
    }
}
