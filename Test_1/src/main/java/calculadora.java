/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dani
 */
public class calculadora {
    
    public int suma(int a, int b) {
        return a + b;
    }

    public int resta(int a, int b) {
        return a - b;
    }

    public int multiplicacio(int a, int b) {
        return a * b;
    }

    public int divisio(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("No es pot dividir per zero");
        return a / b;
    }
    
}
