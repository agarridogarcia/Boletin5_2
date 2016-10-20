
package boletin5_2;


public class Suma {
    
    //atributos
    private short num1, num2;
    //constructores
    public Suma(){
        short n1=0;
        short n2=0;
    }
    public Suma(short n1, short n2){
        num1=n1;
        num2=n2;
    }
    //métodos
    public void resultados (short n1, short n2){
        if (n1>=n2){
            System.out.println("O resultado da resta é " + (n1-n2));
        }
        else {
            System.out.println("O resultado da suma é " + (n1+n2));
        }
        
    } 
   
    }
    
    
    
       

    
        
    

