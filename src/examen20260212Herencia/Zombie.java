/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen20260212Herencia;

/**
 *
 * @author Mike
 */
public class Zombie extends Especie {

    String evolucion;
    final String[] arrayTipos = {"Lento", "Rapido", "Inteligente", "Alfa"};

    //constructor donde le dijo que al principio el zombie empiezará por Lento
    public Zombie(Sexo sexo, int edad) {
        super(sexo, edad);
        evolucion = arrayTipos[0];
    }

    //constructor sobrecargado que ponga automáticamente el tipo que zombie que es y que está infectado por defecto
    public Zombie(Sexo sexo, int edad, String evolucion) {
        super(sexo, edad);
        this.evolucion = evolucion;
        this.infeccion();
    }

    public void evoluciona() {
        //hago una búsqueda
        for (int i = 0; i < arrayTipos.length; i++) {
            if (arrayTipos[i].equals(this.evolucion)) {
                if (arrayTipos.length - 1 != i) {
                    evolucion = arrayTipos[i + 1];
                    break;
                } else {
                    System.out.println("Vuestro zombie ya ha llegado al máximo nivel");
                    break;
                }
            }

        }
        if (!this.evolucion.equals(arrayTipos[arrayTipos.length - 1])) {
            System.out.println("El zombie ha evolucionado a " + evolucion + " !Felicidades(o no)");
        }

    }

    public String getEvolucion() {
        return evolucion;
    }

    @Override
    public String toString() {
        return super.toString() + "Tipo de zombie: " + evolucion + '}';
    }

}//end class
