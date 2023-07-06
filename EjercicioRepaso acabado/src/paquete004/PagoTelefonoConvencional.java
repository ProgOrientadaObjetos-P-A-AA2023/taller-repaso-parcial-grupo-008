/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

import paquete001.Persona;

/**
 *
 * @author reroes
 */
public class PagoTelefonoConvencional extends Pago {

    private double tarifa;
    private double minutosConsumidos;
    private double costoMinuto;
    
    public PagoTelefonoConvencional(double t, double m, double c) {
        tarifa = t;
        minutosConsumidos = m;
        costoMinuto = c;
    }

    public void establecerTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public void establecerMinutosConsumidos(double minutosConsumidos) {
        this.minutosConsumidos = minutosConsumidos;
    }

    public void establecerCostoMinuto(double costoMinuto) {
        this.costoMinuto = costoMinuto;
    }

    @Override
   public void calcularPago() {

        pago = tarifa + (minutosConsumidos * costoMinuto);
    }


    public double obtenerTarifa() {
        return tarifa;
    }

    public double obtenerMinutosConsumidos() {
        return minutosConsumidos;
    }

    public double obtenerCostoMinuto() {
        return costoMinuto;
    }
    
     @Override
    public String toString() {

        String mensaje = String.format("Pago telefono convencional:\n"
                + "Tarifa: %.2f\n"
                + "Minutos consumidos: %.2f\n"
                + "Costo minutos: %.2f\n"
                + "Pago: %.2f\n\n",
                tarifa,
                minutosConsumidos,
                costoMinuto,
                pago);

        return mensaje;
    }

}
