/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen20260212Herencia;

/**
 *
 * @author Mike
 */
public class Contacto {

    String nombre;
    String apellido;
    int telefono;

    //constructor
    public Contacto(String nombre, String apellido, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    //metodo equals que verifica si TODOS los atributos son iguales
    public boolean equals(Contacto contacto) {
        boolean igual = false;
        if (nombre.equals(contacto.nombre) && apellido.equals(contacto.apellido) && telefono == contacto.telefono) {
            igual = true;
        }
        return igual;
    }

    @Override
    public String toString() {
        return String.format("%-20s Nombre: %-20s Apellido: %-12d Tfno:",
                nombre, apellido, telefono);
    }

}//end class
