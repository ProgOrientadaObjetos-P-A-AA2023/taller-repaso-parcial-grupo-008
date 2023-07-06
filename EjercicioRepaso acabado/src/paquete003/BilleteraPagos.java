/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete003;

import java.util.ArrayList;
import paquete001.Persona;
import paquete004.*;
import paquete003.*;
import paquete002.*;

/**
 *
 * @author reroes
 */
public class BilleteraPagos {

    public Persona persona;
    private double gastoPagos;
    private  String mes;
    public ArrayList<Pago> listaPagos;

    public BilleteraPagos(Persona p,String m, ArrayList<Pago> lP) {
        persona = p;
        mes = m;
        listaPagos = lP;
    }
    
     public Persona getPersona() {
        return persona;
    }
     public void setPersona(Persona n) {
        persona = n;
    }

    public double getGastoPagos() {
        return gastoPagos;
    }

    public void calcularGastoPagos() {
        gastoPagos = 0;
        for (Pago pago : listaPagos) {
            gastoPagos += pago.obtenerPago();
        }
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String n) {
        mes = n;
    }

    public ArrayList<Pago> getPagos() {
        return listaPagos;
    }

    public void setPagos(ArrayList<Pago> n) {
        listaPagos = n;
    }

      @Override
    public String toString(){
        /*
            Se debe presentar el reporte que incluya
            información correspondiente oportuna
        */
        String mensaje = String.format("""
                                =========REPORTE DE PAGOS======
                                 -Nombre: %s %s
                                 -Edad: %d
                                 -Cedula: %s
                                 -Ciudad: %s
                                 -Mes: %s
                                 
                                 """, 
                persona.obtenerNombre(),
                persona.obtenerApellido(),
                persona.obtenerEdad(),
                persona.obtenerCedula(),
                persona.obtenerCiudad(),
                mes);
        
        for (Pago p : listaPagos) {
            mensaje = String.format("%s%s", mensaje, p);
        }
        
        mensaje = String.format("""
                          
                          %s-Gasto de pagos: $%.2f
                          """, mensaje, gastoPagos);
        
        return mensaje;
    }

}
