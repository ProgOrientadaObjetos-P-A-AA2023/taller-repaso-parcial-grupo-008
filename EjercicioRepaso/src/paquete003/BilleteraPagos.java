/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete003;

import paquete001.Persona;
import paquete004.*;
import paquete003.*;

/**
 *
 * @author reroes
 */
public class BilleteraPagos {

    public Persona persona;
    public Ciudad ciudad;
    public ArrayList<Pago> listaPagos;

    public BilleteraPagos(Persona p, Ciudad c, ArrayList<Pago> lP) {
        persona = p;
        ciudad = c;
        listaPagos = lP;
    }

    @Override
    public String toString() {
        /*
            Se debe presentar el reporte que incluya
            información correspondiente oportuna
         */

        String cadena = String.format("\tBilletera de Pagos\n"
                + "Usuario: %s\n"
                + "Ciudad: %s\n"
                + "Lista de pagos: \n",
                persona,
                ciudad);

        for (int i = 0; i < listaPagos.size(); i++) {

            cadena = String.format("%s\n", listaPagos.get(i));

        }

        return cadena;
    }

}
