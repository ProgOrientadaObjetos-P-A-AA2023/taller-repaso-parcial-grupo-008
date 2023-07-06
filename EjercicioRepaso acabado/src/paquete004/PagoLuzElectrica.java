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
    
    public PagoLuzElectrica(double tB, double kC, double cK, Ciudad c){
    
        tarifaBase = tB;
        kilovatiosConsumidos = kC;
        costoKilovatio = cK;
        ciud = c;
    
    
    }

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

        if (ciud.obtenerNombreCiudad().equals("Loja")) {
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

        String mensaje = String.format("Pago luz electrica:\n"
                + "Tarifa base: %.2f\n"
                + "Consumo kilovatios: %.2f\n"
                + "Costo kilovatios: %.2f\n"
                + "Ciudad: %s\n\n"
                + "Pago: %.2f\n\n",
                tarifaBase, 
                kilovatiosConsumidos, 
                costoKilovatio, 
                ciud.obtenerNombreCiudad(),
                pago);

        return mensaje;
    }
    
    
}
