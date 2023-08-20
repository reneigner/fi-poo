import java.lang.*;
import java.util.*;

public class Ejemplo0 {
	public static void main(String ar[])
	{
		System.out.println("TIPOS DE DATO PRIMITIVO\n");
		int x = 10;
		int y = x;
		System.out.print("Inicialmente: ");
		System.out.println("x = " + x + ", y = " + y);

		// Se hara un cambio en variable y que no afecta a x
		y = 30;

		System.out.print("Despues de cambiar a 30: ");
		System.out.println("x = " + x + ", y = " + y);
		System.out.println(
			"**Solo se afecta el valor de y aqui "
			+ "porque es un Tipo de Dato Primitivo\n");

		System.out.println("TIPOS DE DATO DE REFERENCIA\n");
		int[] c = { 10, 20, 30, 40 };

		/*  Aqui la referencia completa de c se copia a d
            ambos apuntan a al mismo montículo (heap) de 
            memoria.
        */
		int[] d = c;

		System.out.println("Inicialmente");
		System.out.println("Arreglo c: "
						+ Arrays.toString(c));
		System.out.println("Arreglo d: "
						+ Arrays.toString(d));

        /*
            Se modifica el valor del índice 1
            a 50 en el arreglo d
        */

		System.out.println("\nModificado el valor en "
						+ "indice 1 a 50 en el arreglo d\n");
		d[1] = 50;

		System.out.println("Despues de la modificacion");
		System.out.println("Arreglo c: "
						+ Arrays.toString(c));
		System.out.println("Arreglo d: "
						+ Arrays.toString(d));
		System.out.println(
			"**Aqui el valor de c[1] tambien se modifica "
			+ "porque es un Tipo de Valor por Referencia\n");
	}
}