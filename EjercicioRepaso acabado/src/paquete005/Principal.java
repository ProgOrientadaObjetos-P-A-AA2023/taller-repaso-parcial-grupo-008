/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete005;

import java.util.ArrayList;
import paquete001.*;
import paquete002.*;
import paquete003.*;
import paquete004.*;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {

        ArrayList<Pago> lista = new ArrayList();

        Pago aguaCasa = new PagoAguaPotable(30, 6, 7, "Casa");
        Pago aguaComercio = new PagoAguaPotable(35, 4, 7, "Comercial");

        Ciudad ciudad1 = new Ciudad("Loja");
        Pago luzCasa = new PagoLuzElectrica(50, 324, 4, ciudad1);

        Ciudad ciudad2 = new Ciudad("Quito");
        Pago luzComercio = new PagoLuzElectrica(50, 324, 4, ciudad2);

        Propiedad propiedad1 = new Propiedad(10000);
        Pago casa1 = new PagoPredial(propiedad1, 10);

        Propiedad propiedad2 = new Propiedad(2000);
        Pago casa2 = new PagoPredial(propiedad2, 15);

        Pago telefonoCasa = new PagoTelefonoConvencional(20, 2000, 0.3);

        Pago telefonoFinca = new PagoTelefonoConvencional(19, 2100, 0.4);

        lista.add(aguaCasa);
        lista.add(aguaComercio);
        lista.add(luzCasa);
        lista.add(luzComercio);
        lista.add(casa1);
        lista.add(casa2);
        lista.add(telefonoCasa);
        lista.add(telefonoFinca);

        for (Pago lista1 : lista) {
            lista1.calcularPago();
        }

        Persona persona1 = new Persona("Juan", "Andrade", 28, "1150631511", ciudad2);

        BilleteraPagos pago = new BilleteraPagos(persona1, "11", lista);

        pago.calcularGastoPagos();

        System.out.println(pago);
    }
}
