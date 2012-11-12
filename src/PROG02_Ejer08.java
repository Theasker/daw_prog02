import java.util.Scanner;
import java.lang.Math;
/* Diseña un programa Java que calcule la suma, resta, multiplicación 
 y división de dos números introducidos por teclado. 
 Incorpora también las funciones que permitan realizar 
 la potencia de un número y la raíz cuadrada del otro. 
 Salida del programa para x=9, y=3: 
 Introducir primer numero: 9
 Introducir segundo numero: 3
 x = 9.0 y = 3.0
 x + y = 12.0
 x - y = 6.0
 x * y = 27.0
 x / y = 3.0
 x ^ 2 = 81.0
 √ x = 3.0
 */
public class PROG02_Ejer08 {
  public static void main (String[] args) {
    Scanner teclado = new Scanner( System.in );
    float x,y;
    System.out.print( "Introduzca un número: " );
    x = teclado.nextInt();
    System.out.print( "Introduzca otro número: " );
    y = teclado.nextInt();
    System.out.printf("\nx + y = %.1f",(x+y));
    System.out.printf("\nx - y = %.1f",(x-y));
    System.out.printf("\nx * y = %.1f",(x*y));
    System.out.printf("\nx / y = %.1f",(x/y));
    System.out.printf("\nx ^ 2 = %.1f",Math.pow(x, 2));
    System.out.printf("\n√x = %.1f",Math.pow(x,0.5));
  }
}
