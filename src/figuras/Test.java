package figuras;

/**
 * Clase Test que contiene el método main para probar la clase Circunferencia.
 * 
 * @author Javier Castro Lobato
 * @version 19/04/2024
 */
public class Test {
	/**
	 * Método principal que se ejecuta al iniciar el programa.
	 * 
	 * @param args Argumentos de la línea de comandos.
	 */
	public static void main(String[] args) {
		// Creación de una circunferencia con radio 5.5
		Circunferencia c1 = new Circunferencia(5.5);
		// Creación de una circunferencia con radio 10.1
		Circunferencia c2 = new Circunferencia(10.1);
		// Creación de una circunferencia con radio 10.9
		Circunferencia c3 = new Circunferencia(10.9);

		// Compara c2 y c3 sin considerar los decimales
		if (c2.esIgual(false, c3))
			System.out.println("c2 y c3: iguales sin considerar decimales");

		// Compara c2 y c3 considerando los decimales
		if (c2.esIgual(true, c3))
			System.out.println("c2 y c3: iguales considerando decimales");
	}
}
