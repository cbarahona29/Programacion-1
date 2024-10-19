
package notas;

import java.util.Scanner;
public class Notas {
    public static void main(String[] args) {
        
        try ( Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese la calificación del primer parcial: ");
            double parcial1 = scanner.nextDouble();
            
            System.out.print("Ingrese la calificaci8ón del segundo parcial: ");
            double parcial2 = scanner.nextDouble();
            
            System.out.print("Ingrese la calificación del tercer parcial: ");
            double parcial3 = scanner.nextDouble();
            
            double promedioParciales = (parcial1 + parcial2 + parcial3) / 3;
            System.out.print("Ingrese la calificación del examen final: ");
            double examenFinal = scanner.nextDouble();
            
            
            System.out.print("Ingrese la calificación del trabajo final: ");
            double trabajoFinal = scanner.nextDouble();
            
            double calificacionFinal = (promedioParciales * 0.55) + (examenFinal * 0.30) + (trabajoFinal * 0.15);
            System.out.println("La calificación final es: " + calificacionFinal);
            
        }
    }
}