
package boletin5_2;

import javax.swing.JOptionPane;


public class Boletin5_2 {

    
    public static void main(String[] args) {
        Suma resultado=new Suma();
        short n1=Short.parseShort(JOptionPane.showInputDialog("Introduzca un número"));
        short n2=Short.parseShort(JOptionPane.showInputDialog("Introduzca un número"));
       
        resultado.resultados(n1, n2);
       
       
        
        
        
        
    }
    
}
