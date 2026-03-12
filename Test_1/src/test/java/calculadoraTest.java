/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author Dani
 */
public class calculadoraTest {
    


    // Instanciem la classe que conté els mètodes (ajusta el nom si cal)
    calculadora calc = new calculadora();

    @Test
    public void testSuma() {
        assertEquals(5, calc.suma(2, 3), "2 + 3 hauria de ser 5");
    }

    @Test
    public void testResta() {
        assertEquals(1, calc.resta(3, 2), "3 - 2 hauria de ser 1");
    }

    @Test
    public void testMultiplicacio() {
        assertEquals(6, calc.multiplicacio(2, 3), "2 * 3 hauria de ser 6");
    }

    @Test
    public void testDivisio() {
        assertEquals(2, calc.divisio(4, 2), "4 / 2 hauria de ser 2");
    }

    @Test
    public void testDivisioPerZero() {
        // Verifiquem que es llanci l'excepció IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> {
            calc.divisio(10, 0);
        }, "Dividir per zero hauria de llançar IllegalArgumentException");
    }    
    
    @Test
    @DisplayName("Verifica que 10 dividit entre 2 és 5")
    public void testDivisioStandard() {
        assertEquals(5, calc.divisio(10,2), "La divisió de 10/2 ha de ser 5");
    }
    
    @Test
    @DisplayName("Verifica que la suma de dos negatius funciona")
    public void testSumaNegatius() {
        assertEquals(-15, calc.suma(-5,-10), "La suma de -5+(-10) ha de ser -15");
    }
    
    
}
    

