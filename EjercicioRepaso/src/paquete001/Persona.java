package paquete001;

import paquete002.Ciudad;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author reroes
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String cedula;
    private Ciudad ciudad;

    public Persona(String n, String a, int e, String c, Ciudad ciu) {
        nombre = n;
        apellido = a;
        edad = e;
        cedula = c;
        ciudad = ciu;

    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerApellido(String apellido) {
        this.apellido = apellido;
    }

    public void establecerEdad(int edad) {
        this.edad = edad;
    }

    public void establecerCedula(String cedula) {
        this.cedula = cedula;
    }

    public void establecerCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public int obtenerEdad() {
        return edad;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

}
