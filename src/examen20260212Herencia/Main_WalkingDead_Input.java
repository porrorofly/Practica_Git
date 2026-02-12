/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen20260212Herencia;

/**
 *
 * @author Mike
 */
public class Main_WalkingDead_Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear humanos (personajes de la serie)
        Humano rick = new Humano(Especie.Sexo.masculino, 40, "Rick Grimes");
        Humano daryl = new Humano(Especie.Sexo.masculino, 35, "Daryl Dixon");
        Humano carol = new Humano(Especie.Sexo.feminino, 45, "Carol Peletier");
        Humano negan = new Humano(Especie.Sexo.masculino, 42, "Negan");
        Humano maggie = new Humano(Especie.Sexo.feminino, 32, "Maggie Greene");

        // Crear zombis
        Zombie walker1 = new Zombie(Especie.Sexo.masculino, 30);
        Zombie walker2 = new Zombie(Especie.Sexo.feminino, 25, "Rapido");

        //Mostrar situación inicial sobre infección de humanos
        System.out.println("=== Situación inicial ===");
        System.out.println("Rick: " + rick.isInfectado());
        System.out.println("Daryl: " + daryl.isInfectado());
        System.out.println("Carol: " + carol.isInfectado());
        System.out.println("Negan: " + negan.isInfectado());
        System.out.println("Maggie: " + maggie.isInfectado());

        //Mostrar resultado de contacto entre rick  y  el zombie walker1 
        Especie.contacto(rick, walker1);

        // Fuerzo infección para Rick
        System.out.println("Fuerzo infección para Rick (en caso de que no hubiera infectado en el contacto anterior");
        rick.infeccion();
        // Contacto entre Rick y Daryl (Daryl saldrá infectado)
        System.out.println("=== Contacto Rick - Daryl (humano-humano) ===");
        rick.contacto(daryl);
        //Mostrar resultado de contacto entre Carol y Maggie (ambas sanas) 
        System.out.println("=== Contacto Carol - Maggie (ambas sanas) ===");
        carol.contacto(maggie);

        System.out.println("=== Contacto Negan con Daryl(el 2º infectado) ===");
        negan.contacto(daryl);
        //(Probilidad de infeccion del 60%)

        System.out.println("=== Evolución de walker1 ===");
        System.out.println(walker1.getEvolucion());
        walker1.evoluciona();
        System.out.println(walker1.getEvolucion());
        walker1.evoluciona();
        System.out.println(walker1.getEvolucion());
        walker1.evoluciona();
        System.out.println(walker1.getEvolucion());

        // mostrar evoluciones repetidas para ver como va cambiando el tipo de zombie en walker1
        // mostrar una evolución del walker2
        System.out.println("=== Evolución de walker2 ===");
        walker1.evoluciona();
        System.out.println(walker1.getEvolucion());

    }
}
