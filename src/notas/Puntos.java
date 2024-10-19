
package notas;

import java.util.Scanner;

public class Puntos {

    public static void main(String[] args) {
        
     Scanner entrada= new Scanner(System.in);
     
     System.out.println("Favor ingrese cuantos partidos ganaron");
     int ganados=entrada.nextInt();
     
     System.out.println("Favor ingrese los partidos empatados");
     int empatados=entrada.nextInt();
     
     System.out.println("Favor ingrese los partidos perdidos");
     int perdidos=entrada.nextInt();
     
     int gant=ganados*3;
     int emp=empatados*1;
     int pert=perdidos*0;
     
     int total=gant+emp+pert;
     System.out.println("El total de puntos del Equipo fue de: "+total);
     
    }
    
}
