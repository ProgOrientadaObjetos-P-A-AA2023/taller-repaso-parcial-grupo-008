/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

import paquete001.Persona;
import paquete002.Propiedad;

/**
 *
 * @author reroes
 */
public class PagoPredial extends Pago {

    private double valorPropiedad;
    private double porcentaje;
    //private double pago;

    public void establecerValorPropiedad(double valorPropiedad) {
        this.valorPropiedad = valorPropiedad;
    }

    public void establecerPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public void calcularPago() {
        valorPropiedad = 56000;
        porcentaje = 10;
        pago = valorPropiedad - ((valorPropiedad * porcentaje) / 100);

    }

    public double obtenerValorPropiedad() {
        return valorPropiedad;
    }

    public double obtenerPorcentaje() {
        return porcentaje;
    }
    
     @Override
    public String toString() {
        String mensaje = "Pago predial : \n";

        mensaje = String.format("%s\nPago total predial: %.2f\n",
                mensaje,
                pago);
        return mensaje;
    }

}
