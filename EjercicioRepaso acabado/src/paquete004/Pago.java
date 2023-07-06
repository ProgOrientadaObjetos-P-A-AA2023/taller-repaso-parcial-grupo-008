/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

/**
 *
 * @author SALA H
 */
public abstract class Pago {

    protected double pago;

    public abstract void calcularPago();

    public double obtenerPago() {
        return pago;
    }

    @Override
    public String toString() {
        String mensaje = String.format("Pago: $%.2f\n",
                pago);

        return mensaje;
    }

}
