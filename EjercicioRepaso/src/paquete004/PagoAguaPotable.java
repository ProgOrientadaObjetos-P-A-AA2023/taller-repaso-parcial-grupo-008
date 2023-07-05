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
public class PagoAguaPotable extends Pago {

    //private double pago;
    private double costoConsumoCubicos;
    private double tarifaFija;
    private double metrosCubicosConsumo;
    private String tipo;

    public void establecerPago(double pago) {
        this.pago = pago;
    }

    public void establecerCostoConsumoCubicos(double costoConsumoCubicos) {
        this.costoConsumoCubicos = costoConsumoCubicos;
    }

    public void establecerTarifaFija(double tarifaFija) {
        this.tarifaFija = tarifaFija;
    }

    public void establecerMetrosCubicosConsumo(double metrosCubicosConsumo) {
        this.metrosCubicosConsumo = metrosCubicosConsumo;
    }

    public void establecerTipo(String tipo) {
        this.tipo = tipo;
    }

    public double obtenerCostoConsumoCubicos() {
        return costoConsumoCubicos;
    }

    public double obtenerTarifaFija() {
        return tarifaFija;
    }

    public double obtenerMetrosCubicosConsumo() {
        return metrosCubicosConsumo;
    }

    public String obtenerTipo() {
        return tipo;
    }

    @Override
    public void calcularPago() {
        pago = 0;
        if (tipo.equals("comercial")) {
            tarifaFija = 2.20;
            metrosCubicosConsumo = 100.2;
            costoConsumoCubicos = 0.2;
            pago = tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos) + 15;
        } else {
            tarifaFija = 2.20;
            metrosCubicosConsumo = 100.2;
            costoConsumoCubicos = 0.2;
            pago = tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos);
        }

    }

    @Override
    public double obtenerPago() {
        return pago;
    }

    @Override
    public String toString() {
        String mensaje = "Pago de agua potable : \n";

        mensaje = String.format("%s\nPago de agua: %.2f\n",
                mensaje,
                pago);
        return mensaje;
    }

}
