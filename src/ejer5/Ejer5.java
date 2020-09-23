
package ejer5;

import java.util.Random;
import javax.swing.JOptionPane;


public class Ejer5 {

    public static void main(String[] args) {
        
        int matriz[];
        matriz = new int[300];
        Random numero=new Random();
        int suma=0;
        
        
        for(int i=0;i<10;i++){
            matriz[i]=numero.nextInt(100);
            if(matriz[i]<10){
                suma+=matriz[i];
            }
        }
        
        
        JOptionPane.showMessageDialog(null, "La suma de los numeros de 1 digito son: "+suma);
        System.out.println(numero);
    }
    
}
