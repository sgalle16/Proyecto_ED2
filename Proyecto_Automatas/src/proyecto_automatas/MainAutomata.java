/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_automatas;

/**
 *
 * @author Shaan
 */
/**
 * MainAuotNumPunFlo
 *
 * Punto de entrada para el autómata AutoNumPunFloj.
 *
 * Creación: 25/08/2011.
 * Autor:    fcardona
 * email:    fcardona@eafit.edu.co
 *
 * Registro de modificación:
 *
 * 01/03/2012 - Arreglando la identación y algunos cambios menores.
 *
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Una aplicación Java para demostrar el comportamiento de la clase AutoNumPunFlo
 * siendo utilizado como filtro que procesa la entrada estándar y muestra aquellas
 * lineas que aceptadas por AutoNumPunFlo en la salida estándar.
 */

public class MainAutomata {

    public static void main(String [] args)
            throws IOException {

        Auto automata = new Proyecto_Automatas(); // El DFA
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        // Lea y haga echo de las líneas hasta EOF
        System.out.println("Ingrese un caracter valido de las vocales");
        System.out.println(" A E I O U ");
        String x = in.readLine();
        while(x!=null)
        {
            automata.reset();//Resetea El Automata al estado inicial
            automata.process(x);
            
            if(automata.accepted())
            
                System.out.println("El caracter ingresado es valido!!!");
            else
                System.err.printl("El caracter ingresado es invalido!!!");
        }        
                
        
    }
}
