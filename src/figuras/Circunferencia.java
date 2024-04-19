package figuras;

/**
 * Clase que representa una circunferencia con propiedades y métodos
 * relacionados.
 * 
 * @author Javier Castro Lobato
 * @version 19/04/2024
 */
public class Circunferencia {
	/**
	 * Radio de la circunferencia.
	 */
	private double radio;

	/**
	 * Color de la circunferencia.
	 */
	private String color;

	/**
	 * Constructor que inicializa una instancia de la circunferencia con un radio
	 * dado.
	 * 
	 * @param radio El radio de la circunferencia.
	 */
	public Circunferencia(double radio) {
		this.radio = radio;
	}

	/**
	 * Imprime información sobre la circunferencia, incluyendo diámetro, color y
	 * área.
	 */
	public void imprimir() {
		// Asigna el color rojo a la circunferencia
		color = "rojo";
		// Imprime el diámetro de la circunferencia
		System.out.println("Diámetro: " + (2 * radio));
		// Imprime el color de la circunferencia
		System.out.println("Color: " + color);
		// Calcula y muestra el área de la circunferencia
		double area = 2 * 3.1416 * radio * radio;
		System.out.println("Área: " + area);
	}

	/**
	 * Compara si esta circunferencia es igual a otra, considerando o no los
	 * decimales.
	 * 
	 * @param considerarDecimales Si se deben considerar los decimales en la
	 *                            comparación.
	 * @param otro                Otra circunferencia con la que se compara.
	 * @return Verdadero si las circunferencias son iguales, falso en caso
	 *         contrario.
	 * @throws IllegalArgumentException Si el objeto 'otro' es nulo.
	 */
	public boolean esIgual(boolean considerarDecimales, Circunferencia otro) {
		if (otro == null) {
			throw new IllegalArgumentException("El objeto 'otro' no puede ser nulo.");
		}
		double radio1 = this.radio;
		double radio2 = otro.getRad();
		if (considerarDecimales) {
			return radio1 == radio2;
		} else {
			return Math.abs(radio1 - radio2) < 1;
		}
	}

	/**
	 * Obtiene el radio de la circunferencia.
	 * 
	 * @return El radio de la circunferencia.
	 */
	public double getRad() {
		return radio;
	}

	/**
	 * Establece un nuevo valor para el radio de la circunferencia.
	 * 
	 * @param rad El nuevo valor del radio.
	 */
	public void setRad(double rad) {
		this.radio = rad;
	}
}
