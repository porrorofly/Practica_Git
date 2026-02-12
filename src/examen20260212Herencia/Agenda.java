/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen20260212Herencia;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

/**
 *
 * @author Mike
 */
public class Agenda {

    int[] arrayFechas;
    Contacto[] arrayContactos;

    //constructor sin elementos
    public Agenda() {
        arrayFechas = new int[0];
        arrayContactos = new Contacto[0];
    }

    //constructor sobrecargado
    public Agenda(Contacto[] arrayContactos) {
        this.arrayContactos = arrayContactos;
        arrayFechas=new int[arrayContactos.length];
        for (int i = 0; i < arrayFechas.length; i++) {
            arrayFechas[i] = obtenerFecha();
        }
    }

    public Contacto[] getArrayContactos() {
        return arrayContactos;
    }

    //obtener fecha
    public int obtenerFecha() {
        LocalDate ahora = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyyMMdd");
        int formatoInt = Integer.parseInt(ahora.format(formato));
        return formatoInt;
    }

    //añadir con fecha y contacto
    public void append(int fecha, Contacto nuevoContacto) {
        arrayContactos = Arrays.copyOf(arrayContactos, arrayContactos.length + 1);
        arrayFechas = Arrays.copyOf(arrayFechas, arrayFechas.length + 1);

        arrayFechas[arrayFechas.length - 1] = fecha;
        arrayContactos[arrayContactos.length - 1] = nuevoContacto;
    }
    //apend sobrecargado

    public void append(Contacto nuevoContacto) {
        append(obtenerFecha(), nuevoContacto);
    }
    //eliminar contacto

    public boolean eliminarContacto(Contacto contactoParaEliminar) {
        boolean respuesta = false;
        Contacto[] aux = new Contacto[arrayContactos.length-1];
        for (int i = 0; i < arrayContactos.length; i++) {
            if(!arrayContactos[i].equals(contactoParaEliminar)){
                aux[i] = arrayContactos[i];
            }
            
            if (arrayContactos[i].equals(contactoParaEliminar)) {
              
                aux[i] = arrayContactos[i + 1];
                System.out.println("Está eliminado correctamente");
            }
        }
        return respuesta;
    }

//    @Override//no me sale con 
//    public String toString() {
//        return String.format("%-20s Fecha: %-20 Contactos: ",
//                arrayFechas, arrayContactos);
//    }

}//end class
