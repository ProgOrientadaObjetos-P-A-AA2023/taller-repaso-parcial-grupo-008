/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

import paquete001.Persona;
import paquete002.*;

/**
 *
 * @author reroes
 */
public class PagoLuzElectrica extends Pago {

   // private double pago;
    private double tarifaBase;
    private double kilovatiosConsumidos;
    private double costoKilovatio;
    private Ciudad ciud;

    public void setPago(double pago) {
        this.pago = pago;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public void setKilovatiosConsumidos(double kilovatiosConsumidos) {
        this.kilovatiosConsumidos = kilovatiosConsumidos;
    }

    public void setCostoKilovatio(double costoKilovatio) {
        this.costoKilovatio = costoKilovatio;
    }

    public void setCiud(Ciudad ciud) {
        this.ciud = ciud;
    }

    @Override
    public void calcularPago() {
        pago = 0;
        tarifaBase = 10.20;
        kilovatiosConsumidos = 80;
        costoKilovatio = 0.5;
        String ciudad = "Loja";
        if (ciudad.equals("Loja")) {
            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio / 2);
        } else {
            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio);
        }
    }

    @Override
    public double obtenerPago() {
        return pago;
    }

    public double obtenerTarifaBase() {
        return tarifaBase;
    }

    public double obtenerKilovatiosConsumidos() {
        return kilovatiosConsumidos;
    }

    public double obtenerCostoKilovatio() {
        return costoKilovatio;
    }

    public Ciudad obtenerCiud() {
        return ciud;
    }

    
     @Override
    public String toString() {
        String mensaje = "Pago de Luz : \n";

        mensaje = String.format("%s\nPago total de luz: %.2f\n",
                mensaje,
                pago);
        return mensaje;
    }
    
    
}
