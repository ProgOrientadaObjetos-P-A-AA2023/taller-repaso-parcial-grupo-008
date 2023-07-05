/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete006;


import paquete001.Persona;
import paquete002.Ciudad;
import paquete003.BilleteraPagos;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        Ciudad c = new Ciudad("Loja");
        Persona  p = new Persona("Juan", "Andrade", 19, "1100594",c);
        
        BilleteraPagos pago = new BilleteraPagos(p);
        
        
        
        
        System.out.println(pago);
    }
}
