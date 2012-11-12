/* Tarea 02 - ejercicio sobre variables
 * Dado el siguiente programa, 
 * modifícalo para utilizar las variables que se indican. 
 * El tipo de dato elegido debe ser el de menos bits posibles 
 * que puedan representar el valor. Justifica tu elección.
 *  - Si un empleado está casado o no.
 *  - Valor máximo no modificable: 999999.
 *  - Día de la semana
 *  - Día del año.
 *  - Sexo: con dos valores posibles 'V' o 'M'
 *  - Milisegundos transcurridos desde el 01/01/1970 hasta nuestros días.
 *  - Almacenar el total de una factura
 *  - Población mundial del planeta tierra.
 */
public class u01_ejerciciovariables { // nombre de la clase que coincide
	// variable de tipo "enumerado" con 2 posibles valores
	public enum sexo {V,M}
	public static void main(String[] args) { // clase principal main
		// Sólo puede tener 2 valores true o false.
		boolean casado = true;
		// con final declaramos la variable como constante
		// el tipo de variable "int" tiene un rango de valores de:
		// -2,147,483,648 a 2,147,483,647
		final int MAXIMO = 999999;
            // dias de la semana del 1 al 7 con un tipo byte es suficiente
            byte diasem[] = {1,2,3,4,5,6,7};
		// los días del año como max será de 366 
		// por lo que no puede ser "byte" ya que si rango es de -128 a 127
		// por lo que ha de ser el siguiente tipo "short" que su rango es
		// -32,768 a 32,767
		short diaanual = 300;
		// Los milisegundos transcurridos desde el 01/01/1970 son unos 43 años
		// que son 43 años x 365 dias x 24 horas x 60 min. x 60 seg. x 1000 milisegundos
		// = 1,356048e+12 lo que entra en el rango del tipo de variable long
		// -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
		long miliseg = 1298332800000L;
		// suficiente con los decimales que nos da el rango float
		// para representar un valor monetario con 2 decimales.
		float totalfactura = (float) 10350.678;
		// la población mundial está cerca de los 7.000.000.000
		// por lo que no es suficiente con el rango de int que no llega ni a 
		// 3.000.000.000 pero si con el de "long" cuyo rango es:
		// -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
		long poblacion = 6775235741L;
    sexo genero = sexo.M;
      // visualización de las variables con println
      System.out.println("----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----");
      System.out.println("\tEl valor de la variable casado es "+ casado);
      System.out.println("\tEl valor de la variable MAXIMO es "+ MAXIMO);
      System.out.println("\tEl valor de la variable diasem es "+ diasem[0]);
      System.out.println("\tEl valor de la variable diaanual es "+ diaanual);
      System.out.println("\tEl valor de la variable miliseg es "+ miliseg);
      System.out.println("\tEl valor de la variable totalfactura es "+ totalfactura);
      System.out.println("\tEl valor de la variable poblacion es "+ poblacion);
      System.out.println("\tEl valor de la variable sexo es "+ genero);

      // visualización de las variables con print
      System.out.print("\n----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----");
      System.out.print("\n\tEl valor de la variable casado es "+ casado);
      System.out.print("\n\tEl valor de la variable MAXIMO es "+ MAXIMO);
      System.out.print("\n\tEl valor de la variable diasem es "+ diasem[0]);
      System.out.print("\n\tEl valor de la variable diaanual es "+ diaanual);
      System.out.print("\n\tEl valor de la variable miliseg es "+ miliseg);
      System.out.print("\n\tEl valor de la variable totalfactura es "+ totalfactura);
      System.out.print("\n\tEl valor de la variable poblacion es "+ poblacion);
      System.out.print("\n\tEl valor de la variable sexo es "+ genero);
      
      // visualización de las variables con printf
      System.out.printf("\n----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----");
      System.out.printf("\n\tEl valor de la variable casado es "+ casado);
      System.out.printf("\n\tEl valor de la variable MAXIMO es "+ MAXIMO);
      System.out.printf("\n\tEl valor de la variable diasem es "+ diasem[0]);
      System.out.printf("\n\tEl valor de la variable diaanual es "+ diaanual);
      System.out.printf("\n\tEl valor de la variable miliseg es "+ miliseg);
      System.out.printf("\n\tEl valor de la variable totalfactura es "+ totalfactura);
      System.out.printf("\n\tEl valor de la variable poblacion es "+ poblacion);
      System.out.printf("\n\tEl valor de la variable sexo es "+ genero);
	 } // cierre de la clase main
} // cierre de la clase ejerciciovariables