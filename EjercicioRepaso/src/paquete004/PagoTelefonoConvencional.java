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
        tarifa = 6.20;
        minutosConsumidos = 100;
        costoMinuto = 0.2;
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
        String mensaje = "Pago de telefono convenciuonal : \n";

        mensaje = String.format("%s\nPago total: %.2f\n",
                mensaje,
                pago);
        return mensaje;
    }

}
