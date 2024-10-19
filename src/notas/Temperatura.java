
package notas;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
           
        Scanner sc = new Scanner(System.in);
       double Fahrenheit;
       double Celsius;
       
        System.out.println("Favor ingrese su temperatura en Fahrenheit");
        Fahrenheit=(sc.nextDouble());
        
        Celsius=(Fahrenheit-32)*5/9;
        
        System.out.println("Su temparatura en Celsius sera:" +Celsius);
        
        
           
         
    }
  
    
}
