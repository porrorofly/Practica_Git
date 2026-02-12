/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen20260212Herencia;

/**
 *
 * @author Mike
 */
public class Humano extends Especie {

    String nombre;

    //constructor junto con la de clase especie
    public Humano(Sexo sexo, int edad, String nombre) {
        super(sexo, edad);
        this.nombre = nombre;
    }

    //consultar nombre del humano
    public String getNombre() {
        return nombre;
    }

    public void contacto(Humano pers2) {
        if (this.isInfectado() == true && pers2.isInfectado() != true) {
            System.out.println(this.nombre + " infecto a " + pers2.nombre);
            pers2.infeccion();
        }
        if (this.isInfectado() != true && pers2.isInfectado() == true) {
            int prob = (int) (Math.random() * 10 + 1);
            if (prob <= 6) {//infectado
                System.out.println(pers2.nombre + " infecto a " + this.nombre);
                this.infeccion();
            } else {
                System.out.println("Se salvo!!!Felicidades");
            }

        }
        if (this.isInfectado() != true && pers2.isInfectado() != true) {
            System.out.println("Ambos no están infectados,estan bebiendo la cerveza juntos felices");
        }
    }

    @Override
    public String toString() {
        return "Se llama" + nombre + super.toString();
    }

}//end class
