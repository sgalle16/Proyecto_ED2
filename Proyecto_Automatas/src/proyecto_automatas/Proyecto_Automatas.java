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
   public int qe=-1;
   
   // estado actual
   public int actual=q0;
   
   public int delta(int s, char c)//'s' Estado de la Q
   {
        int r;//Resultado
        switch(s)
        {
            case q0:
                switch(c)
                {
                    case 'A': r = q2;
                        break;
                    case 'E': r = q5;
                        break;
                    case 'I': r = qe;
                        break;
                    case 'O': r = qe;
                        break;
                    case 'U': r = q5;
                        break;
                    default: //reporta error;
                    
                        break;
                }
            break; // end q0
        
            case q1:
                switch(c)
                {
                    case 'A': r = q1;
                        break;
                    case 'E': r = q0;
                        break;
                    case 'I': r =qe;
                        break;
                    case 'O': r =qe;
                        break;
                    case 'U': r =qe;
                        break;
                    default: //reporta error;
                    
                        break;
                }
                break; // end q1  
        
            case q2:
                switch(c)
                {
                    case 'A': r = qe;
                        break;
                    case 'E': r = q0;
                        break;
                    case 'I': r =q0;
                        break;
                    case 'O': r =qe;
                        break;
                    case 'U': r =qe;
                        break;
                    default: r = qe//reporta error;
                    
                        break;    
                
                }
                break; // Termina estado 
            case q3:
                switch(c)
                {
                    case 'A': r = q1;
                        break;
                    case 'E': r = qe;
                        break;
                    case 'I': r =qe;
                        break;
                    case 'O': r =q1;
                        break;
                    case 'U': r =qe;
                        break;
                    default: r = qe//reporta error;
                    
                        break;    // Termina estado q3
                }
        
            case q4:
                switch(c)
                {
                    case 'A': r = qe;
                        break;
                    case 'E': r = qe;
                        break;
                    case 'I': r =qe;
                        break;
                    case 'O': r =qe;
                        break;
                    case 'U': r =q3;
                        break;
                    default: r = qe//reporta error;
                    
                        break;    // Termina estado q4
                }
            
            case  q5:
                switch(c)
                {
                    case 'A': r = q4;
                        break;
                    case 'E': r = qe;
                        break;
                    case 'I': r = q4;
                        break;
                    case 'O': r = qe;
                        break;
                    case 'U': r = qe;
                        break;
                    default: r = qe; //reporta error;
                    
                        break;    // Termina estado q5
                }
                default: r = qe;
        }
        return r;
  }
  
  
  
  
  
  
}
