/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import model.Persona;

/**
 *
 * @author educacionit
 */
public class ElementsWithOrder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<String> nombresDesordenados = new HashSet();
        nombresDesordenados.add("Juan");
        nombresDesordenados.add("Pedro");
        nombresDesordenados.add("Algo");
        nombresDesordenados.add("Xavier");
        
        System.out.println("Nombres Desordenadods:");
        for (String nombre: nombresDesordenados) {
            System.out.println(nombre);
        }
        
        Set<String> nombresOrdenados = new TreeSet();
        nombresOrdenados.add("Juan");
        nombresOrdenados.add("Pedro");
        nombresOrdenados.add("Algo");
        nombresOrdenados.add("Xavier");
        
        System.out.println("Nombres Ordenadods:");
        for (String nombre: nombresOrdenados) {
            System.out.println(nombre);
        }
        
        Set<Persona> personasOrdenadas = new TreeSet();
        personasOrdenadas.add(new Persona("115", "Juan", "Peréz"));
        personasOrdenadas.add(new Persona("110", "Jorge", "López"));
        personasOrdenadas.add(new Persona("100", "Jorge", "Gómez"));
        personasOrdenadas.add(new Persona("113", "Hector", "Peréz"));

        System.out.println("Nombres Ordenadods:");
        for (Persona persona: personasOrdenadas) {
            System.out.println(persona);
        }
        
        
        
        
        
        
    }
    
}
