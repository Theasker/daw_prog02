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
public class PROG02_Ejer02 { // nombre de la clase que coincide
																	// con el nombre del fichero
	// El día de la semana es un tipo de dato "enumerado",
	// ya que los valores que va a tomar van a ser siempre
	// dentro de un rango "enum".
	// al ser con una clase no puede ir declarado dentro de la clase principal.
	enum diasem {Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo};
	// variable de tipo "enumerado" con 2 posibles valores
	enum sexo {V,M}
	public static void main(String[] args) { // clase principal main
		// Sólo puede tener 2 valores true o false.
		boolean casado = true;
		// con final declaramos la variable como constante
		// el tipo de variable "int" tiene un rango de valores de:
		// 2,147,483,648 a 2,147,483,647
		final int MAXIMO = 999999;
		// los días del año como max será de 366 
		// por lo que no puede ser "byte" ya que si rango es de -128 a 127
		// por lo que ha de ser el siguiente tipo "short" que su rango es
		// -32,768 a 32,767
		short diasAnio = 205;
		// Los milisegundos transcurridos desde el 01/01/1970 son unos 43 años
		// que son 43 años x 365 dias x 24 horas x 60 min. x 60 seg. x 1000 milisegundos
		// = 1,356048e+12 lo que entra en el rango del tipo de variable long
		// 9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
		long milisegundos = 1298332800000L;
		// suficiente con los decimales que nos da el rango float
		// para representar un valor monetario con 2 decimales.
		float totalFra = (float) 10350.678;
		// la población mundial está cerca de los 7.000.000.000
		// por lo que no es suficiente con el rango de int que no llega ni a 
		// 3.000.000.000 pero si con el de "long" cuyo rango es:
		// 9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
		long poblacionMundial = 6973738433L;
	 } // cierre de la clase main
} // cierre de la clase ejerciciovariables
