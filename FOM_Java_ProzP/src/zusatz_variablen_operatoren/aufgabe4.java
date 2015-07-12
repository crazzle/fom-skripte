package zusatz_variablen_operatoren;

/**
 * Extra-Aufgaben zu Variablen, Operatoren und Datentypen
 * 
 * @author Mark Keinhoerster
 * 
 */
public class aufgabe4 {

	public static void main(String[] args) {
		float fahrenheit = 80;
		float celsius = ((fahrenheit - 32.0f) * 5.0f / 9.0f);

		System.out.println("Temparatur in Fahrenheit: " + fahrenheit);
		System.out.println("Temparatur in Celsius: " + celsius);
	}
}
