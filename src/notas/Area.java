
package notas;

import java.util.Scanner;
        
public class Area {

       public static void main(String[] args) {
      
           Scanner entrada= new Scanner(System.in);
           double base;
           
           System.out.println("Favor ingrese la base del rectangulo");
           base=entrada.nextDouble();
           
           double altura;
           System.out.println("Favor ingrese la altura del rectangulo");
           altura=entrada.nextDouble();
           
          double area=(base*altura);
          System.out.println("El area del rectangulo sera de: "+area);
                  
    }
    
}
