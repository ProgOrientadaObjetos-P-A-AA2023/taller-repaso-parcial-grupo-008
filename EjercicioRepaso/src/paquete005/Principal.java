/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete005;



import java.util.ArrayList;
import paquete001.Persona;
import paquete002.Ciudad;
import paquete003.BilleteraPagos;
import paquete004.Pago;
/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {

        ArrayList<Pago> listaPagos = new ArrayList<> ;

        /*private String tipoPagoAguaPotable;
    private double tarifaFija = 2.20;
    private double metrosCubicosConsumo = 100.2;
    private double costoConsumoCubicos = 0.2;

    private double tarifaFija = 2.20;
    private double metrosCubicosConsumo = 100.2;
    private double costoConsumoCubicos = 0.2;*/
        Ciudad ciudad = new Ciudad("Loja");
        Persona p = new Persona("Luis", "Armijos", 22, "99990", ciudad);
        BilleteraPagos pago = new BilleteraPagos(p, ciudad, listaPagos);

        System.out.println(pago);
    }
}
