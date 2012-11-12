import java.util.Scanner;
/* Diseña un programa Java que solicite un número de 5 dígitos del teclado, 
 separe el número en sus dígitos individuales y los muestre por pantalla. 
 Por ejemplo, si el número es 53123 que muestre:
 5 3 1 2 3
 */
public class u01_numeroAstring {
  public static void main (String[] args) {
    Scanner teclado = new Scanner( System.in );
    int i,x=0;
    String NumTexto;
    /*while (x<10000 || x>99999){
      System.out.print( "Introduzca un número: " );
      x = teclado.nextInt();
    }*/
    x = 12345;
    NumTexto = String.valueOf(x);
    System.out.print(NumTexto.length());
    for (i=0;i<NumTexto.length)
    System.out.print("el numero es: "+ NumTexto);
    
  }
}