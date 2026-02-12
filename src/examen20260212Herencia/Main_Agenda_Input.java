/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen20260212Herencia;

import java.util.Arrays;

/**
 *
 * @author Mike
 */
public class Main_Agenda_Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contacto[] contactos = new Contacto[8];
        contactos[0] = new Contacto("Homer", "Simpson", 5550001);
        contactos[1] = new Contacto("Marge", "Simpson", 5550002);
        contactos[2] = new Contacto("Bart", "Simpson", 5550003);
        contactos[3] = new Contacto("Lisa", "Simpson", 5550004);
        contactos[4] = new Contacto("Maggie", "Simpson", 5550005);
        contactos[5] = new Contacto("Ned", "Flanders", 5550006);
        contactos[6] = new Contacto("Montgomery", "Burns", 5550007);
        contactos[7] = new Contacto("Waylon", "Smithers", 5550008);
        
        // Crea un objeto agenda a partir del array de Contactos
       
        Agenda agenda=new Agenda(contactos); 
        
        // Muestra contenido de la agenda
      // agenda.toString(); no me funciono
        
        Contacto milhouse =   new Contacto("Milhouse", "VanHouten", 5550010);
        
        Contacto krusty = new Contacto("Krusty", "ElPayaso", 5550009);
        
        
        System.out.println("=== Intento de eliminar a Milhouse ===");
        agenda.eliminarContacto(milhouse);
        // mostrar que ocurre
        System.out.println(agenda.getArrayContactos());
        
        System.out.println("\n=== Se añade a Milhouse a la agenda ===");
        agenda.append(milhouse);
        System.out.println("=== Contenido de la Agenda depués de añadir a Milhouse ===");
         
        
        // eliminar a Milhouse
        
         System.out.println("=== Contenido de la Agenda después de eliminar a Milhouse ===");
        agenda.eliminarContacto(milhouse);
        
        System.out.println("\n=== Se añade a Krusty con fecha manual a la agenda ===");
         agenda.append(2025,krusty);
        
        
    }
    
}
