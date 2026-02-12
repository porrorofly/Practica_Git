/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen20260212Herencia;

/**
 *
 * @author Mike
 */
public class Especie {

    public enum Sexo {
        masculino, feminino, no_defenido
    };
    private Sexo sexo;
    private int edad;
    private boolean infectado;

    //constructor
    public Especie(Sexo sexo, int edad) {
        this.sexo = sexo;
        this.edad = edad;
        this.infectado = false;
    }

    //para ver si esta infectado
    public boolean isInfectado() {
        return infectado;
    }

    //cambia a true si se infecto el personaje.no hace falta introducir nada,
    //ya que después no lo puedes cambiar a false
    public void infeccion() {
        this.infectado = true;
    }

    //probabilidad de que salga infectado
    public static void contacto(Humano humano, Zombie zombie) {
        int propabilidad = (int) (Math.random() * 10 + 1);//para que sea entre 1 y 10 
        if (propabilidad >= 5) {
            System.out.println(humano.nombre + " Ha salido infectado");//infectado
            humano.infeccion();//llamo a la funcion de infeccion ,porque ha salido la probabilidad mas de 50%
        } else {
            System.out.println(humano.nombre + " NO ha salido infectado,felicidades");//no infectado 
        }
    }

    @Override
    public String toString() {
        return "Sexo de la especie: " + sexo + ", edad: " + edad + "está infectado? " + infectado;
    }

}//end class
