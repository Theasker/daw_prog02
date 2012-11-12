/*
 * Diseña un programa Java que realice las siguientes operaciones, 
 * en el orden que se muestran. 
 * Se indica la variable y el tipo de dato que recibe el valor 
 * o resultado de la operación indicada:
 * 
 *  El resultado del programa debe ser el siguiente:

------- Conversiones entre enteros y coma flotante -------
Producto de int por float: j= i*x = 9
Producto de float por double: dz=dx * y = 6.0

------- Operaciones con byte -------
byte: 5 - 2 = 3
byte -128 - 1 = 127
(int)(-128 - 1) = -129

------- Operaciones con short -------
short: 10 - 1 = 3
short 32767 + 1 = -32768

------- Operaciones con char -------
char: - = 14
char(0x000F) - 1 = 14
(int)= 65535
(short)= -1
-32768 short-char-int = 32768
-1 short-char-int = 65535
 */
public class PROG02_Ejer10 {
  public static void main (String[] args) {
    System.out.println("------- Conversiones entre enteros y coma flotante -------");
    float x = 4.5f;
    float y = 3.0f;
    int i = 2;
    int j;
    j = (int) (i * x); // conversion explícita a int de un int * float
    System.out.print("Producto de int por float: j = i * x = "+j);
    double dx = 2.0d;
    double dz;
    dz = dx * y; // double * float = double
    System.out.print("\nProducto de float por double: dz=dx * y = "+dz);
    System.out.print("\n\n------- Operaciones con byte -------");
    byte bx = 5;
    byte by = 2;
    byte bz;
    bz = (byte) (bx - by); // las operaciones entre tipos byte dan como ersultado int
    System.out.print("\nbyte: "+bx+" - "+by+" = "+bz);
    bx = -128; // rango -128 a 127
    by = 1;
    bz = (byte) (bx - by); // conversión explícita a byte
    System.out.print("\nbyte: "+bx+" - "+by+" = "+bz);  
    int entero = (bx - by); // usamos una variable intermedia de tipo entero para la conversión de tipos
    System.out.print("\n(int)("+bx+" - "+by+") = "+entero);  
    System.out.print("\n\n------- Operaciones con short -------");
    short sx = 5;
    short sy = 2;
    short sz = (short) (sx - sy); // conversión explícita a short
    System.out.print("\nshort: "+sx+" - "+sy+" = "+sz);
    sx = 32767; // rango de short -32,768 a 32,767
    sy = 1;
    sz = (short) (sx + sy);
    System.out.print("\nshort: "+sx+" + "+sy+" = "+sz);
    System.out.print("\n\n------- Operaciones con char -------");
    char cx = '\u000F';
    char cy = '\u0001';
    int z = (char) (cx - cy);
    System.out.print("\nchar: "+cx+" - "+cy+" = "+z);
    z = ((int) cx) - 1;
    System.out.printf("\nchar(%X) - 1 = %d ",(int) cx,z);
    cx = '\uFFFF';
    z = cx;
    System.out.print("\n(int)= "+z);
    sx = (short) cx; // conversión explicita requerida
    System.out.print("\n(short)= "+sx);
    sx = -32768;
    cx = (char) sx;
    z = (int) sx;
    sx = (short) cx; // conversión explicita requerida
    System.out.print("\n"+z+" short-char-int = "+z);
    sx = -1;
    cx = (char) sx; // conversion explicita
    z = (int) cx; // conversion explicita
    System.out.print("\n"+sx+" short-char-int = "+z);
  }
}