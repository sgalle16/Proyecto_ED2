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
public class Proyecto_Automatas implements Auto {

    /**
     * @param args the command line arguments
     */
   // inicializacion de estados Q={q0,q1,q2,q3,q4,q5}   
   private static final int q0=0;
   private static final int q1=1;
   private static final int q2=2;
   private static final int q3=3;
   private static final int q4=4;
   private static final int q5=5;
   private static final int qe=-1;
   
   // estado actual
   private static int actual=q0;
   
   static private int delta(int s, char c)//'s' Estado de la Q
   {
        int r=0;//Resultado
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
                    default: r = qe;//reporta error;
                    
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
                    default: r = qe;//reporta error;
                    
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
                    default: r = qe;//reporta error;
                    
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
                break;
                
            default: r = qe;
                break;
            
         }
        return r;
   }
   
   public void reset() 
   {
       actual = q0;
   }
  
  public void process(String e)
  {
   for(int i =0;i<e.length();i++)
   {
    actual=Proyecto_Automatas.delta(actual,e.charAt(i));
   }
  }
  
  public boolean accepted()
  {
   return actual==q5; 
  }                                                                                                                                                                                                                             
  
}
