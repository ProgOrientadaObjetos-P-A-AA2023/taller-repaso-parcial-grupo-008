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

    private Propiedad propiedad;
    private double porcentaje;
    //private double pago;
    
    public PagoPredial(Propiedad p, double po) {
        propiedad = p;
        porcentaje = po;
    }
    

    public void establecerValorPropiedad(Propiedad valorPropiedad) {
        this.propiedad = valorPropiedad;
    }

    public void establecerPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public void calcularPago() {

        pago = propiedad.obtenerCostoPropiedad() - ((propiedad.obtenerCostoPropiedad() * porcentaje) / 100);

    }
    public Propiedad obtenerValorPropiedad() {
        return propiedad;
    }

    public double obtenerPorcentaje() {
        return porcentaje;
    }
    
     @Override
   public String toString() {

        String mensaje = String.format("Pago predial:\n"
                + "Valor Propiedad: %.2f\n"
                + "Porcentaje: %.2f\n"
                + "Pago: %.2f\n\n",
                propiedad.obtenerCostoPropiedad(),
                porcentaje,
                pago);

        return mensaje;
    }

}
