/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_automatas;

/**
 *
 * @author ACER
 */
public interface Auto {
    
     /**
     * Restablece el estado inicial del autómata.
     */
    public abstract void reset();

    /**
     * Realiza una transición en cada carácter en la cadena
     * dada.
     * @param in una cadena de entrada con los datos.
     */

    /**
     * Examina si el DFA aceptó la cadena.
     * @return true si el estado final fue de aceptación
     */
    public abstract boolean accepted();
    
    /**
     * Realiza una transición en cada carácter en la cadena
     * dada.
     * @param e una cadena de entrada con los datos.
     */
    public abstract process (String e);
}
