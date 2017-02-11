/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.set;

import java.util.Comparator;
import model.Persona;

/**
 *
 * @author educacionit
 */
public class OrdenApellido implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
           return o1.getApellido().compareTo(o2.getApellido());
    }
    
    
}
