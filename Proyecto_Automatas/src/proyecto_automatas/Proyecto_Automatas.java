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
public class Proyecto_Automatas {

    /**
     * @param args the command line arguments
     */
   // inicializacion de estados Q={q0,q1,q2,q3,q4,q5}   
   public int q0=0;
   public int q1=1;
   public int q2=2;
   public int q3=3;
   public int q4=4;
   public int q5=5;
   public int qe="Error!!!";
   
   // estado actual
   public int actual;
   
   public int delta(int s, char c)
   {
    switch(s)
    {
        case 0:
            switch(c)
            {
                case 'A':q2;
                    break;
                case 'E':q5;
                    break;
                case 'I':qe;
                    break;
                case 'O':qe;
                    break;
                case 'U':q5;
                    break;
                default: //reporta error;
                    break;
            }
    }
   }
}
