/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.set;

import model.Persona;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author educacionit
 */
public class UniqueElements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona("111", "Juan", "Peréz");
        Persona p2 = new Persona("112", "Jorge", "López");
        Persona p3 = new Persona("111", "Juan", "Peréz");
        
        Set<Persona> personas = new HashSet();
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        
        for (Persona nombre: personas) {
            System.out.println(nombre);
        }            

    }
    
}
