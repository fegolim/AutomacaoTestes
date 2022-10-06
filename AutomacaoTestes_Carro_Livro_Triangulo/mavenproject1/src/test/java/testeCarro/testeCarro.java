/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testeCarro; /*FERNANDA*/

import br.meusprojetosCarro.Carro;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author dti
 */
public class testeCarro {
/*
    @Test
    public void testePegaMarcav1() {
        Carro modelo1 = new Carro("gm", "onix", 2022);
        assertEquals("gm", modelo1.getMarca());
    }

    @Test
    public void testePegaModelov1() {
        Carro modelo1 = new Carro("gm", "onix", 2022);
        assertEquals("onix", modelo1.getModelo());
    }

    @Test
    public void testePegaAnov1() {
        Carro modelo1 = new Carro("gm", "onix", 2022);
        assertEquals(2022, modelo1.getAno());
    }

    @Test
    public void testePegaMarcav2() {
        Carro modelo1 = new Carro("fiat", "toro", 2022);
        assertNotEquals("gm", modelo1.getMarca());
    }

    @Test
    public void testePegaModelov2() {
        Carro modelo1 = new Carro("fiat", "toro", 2022);
        assertNotEquals("onix", modelo1.getModelo());
    }

    @Test
    public void testePegaAnov2() {
        Carro modelo1 = new Carro("fiat", "toro", 2020);
        assertNotEquals(2022, modelo1.getAno());
    }

    @Test
    public void testeCaseSensitivePegaMarcav1() {
        Carro modelo1 = new Carro("gm", "onix", 2022);
        assertNotEquals("Gm", modelo1.getMarca());
    }

    @Test
    public void testeCaseSensitivePegaModelov1() {
        Carro modelo1 = new Carro("gm", "onix", 2022);
        assertNotEquals("Onix", modelo1.getAno());
    }

    @Test
    public void testeSetCarroMarca() {
        Carro modelo2 = new Carro("gm", "onix", 2022);
        modelo2.setMarca("vw");
        modelo2.setModelo("virtus");
        modelo2.setAno(2021);
        assertEquals("vw", modelo2.getMarca());
    }

    @Test
    public void testeSetCarroModelo() {
        Carro modelo2 = new Carro("gm", "onix", 2022);
        modelo2.setModelo("virtus");
        assertEquals("virtus", modelo2.getModelo());
    }

    @Test
    public void testeSetCarroAno() {
        Carro modelo2 = new Carro("gm", "onix", 2022);
        modelo2.setAno(2021);
        assertEquals(2021, modelo2.getAno());
    }

    @Test
    public void testeSetCarroAnov1() {
        Carro modelo2 = new Carro("gm", "onix", 2022);
        modelo2.setAno(2021);
        assertNotEquals(2022, modelo2.getAno());
    }

    @Test
    public void testeNotNullMarcav1() {
        Carro modelo2 = new Carro("gm", "onix", 2022);
        modelo2.setMarca("Renault");
        assertNotNull(modelo2.getMarca());
    }

    @Test
    public void testeNotNullModelov1() {
        Carro modelo2 = new Carro("gm", "onix", 2022);
        modelo2.setModelo("sandero");
        assertNotNull(modelo2.getModelo());
    }

    @Test
    public void testeNotNullAnov1() {
        Carro modelo2 = new Carro("gm", "onix", 2022);
        modelo2.setAno(2021);
        assertNotNull(modelo2.getAno());
    }

    @Test
    public void testeTrueMarcav1() {
        Carro modelo2 = new Carro("gm", "onix", 2022);
        assertTrue(true, modelo2.getMarca());
    }

    @Test
    public void testeTrueModelov1() {
        Carro modelo2 = new Carro("gm", "onix", 2022);
        assertTrue(true, modelo2.getModelo());
    }

    @Test
    public void testeTrueModelov2() {
        Carro modelo2 = new Carro("gm", "onix", 2022);
        assertTrue(true, "onix");
    }
*/
    @Test
    public void testeFalseModelov1() {
        Carro modelo2 = new Carro("gm", "onix", 2022);
        assertFalse(false, "fusca");
    }
}
