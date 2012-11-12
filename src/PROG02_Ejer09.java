import java.util.Scanner;
/* Diseña un programa Java que solicite un número de 5 dígitos del teclado, 
 separe el número en sus dígitos individuales y los muestre por pantalla. 
 Por ejemplo, si el número es 53123 que muestre:
 5 3 1 2 3
 */
public class PROG02_Ejer09 {
  public static void main (String[] args) {
    Scanner teclado = new Scanner( System.in );
    int i,x=0;
    String NumTexto;
    // pedimos por teclado un número de 5 dígitos positivo
    while (x<10000 || x>99999){
      System.out.print( "Introduzca un número: " );
      x = teclado.nextInt();
    }
    NumTexto = String.valueOf(x);
    // hacemos un bucle tantas veces como carácteres tenga el string
    for (i=0;i<NumTexto.length();i++){
      // accedemos al caracter i hasta (i+1)
      System.out.print(NumTexto.substring(i,(i+1)));
      System.out.print(" ");
    }   
  }
}
