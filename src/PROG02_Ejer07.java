import java.util.Scanner;
/* Diseña un programa Java para resolver 
 * una ecuación de primer grado con una incógnita (x), 
 * suponiendo que los coeficientes de la ecuación (C1 y C2) 
 * se introducen desde teclado. C1x + C2 = 0
 * @author Mauricio Segura Ariño
 */
public class PROG02_Ejer07 {
  public static void main (String[] args) {
    Scanner teclado = new Scanner( System.in );
    float C1,C2;
    System.out.print( "Introduzca un número: " );
    C1 = teclado.nextInt();
    System.out.print( "Introduzca otro número: " );
    C2 = teclado.nextInt();
    System.out.println("el resultado de la dividion es: "+(C2/C1));
    System.out.printf("La ecuación %.1fx + %.1f = 0 es: %f",C1,C2,(-(C2/C1)));
  }
}
