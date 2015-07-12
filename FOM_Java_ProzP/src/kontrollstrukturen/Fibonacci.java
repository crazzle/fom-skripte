package kontrollstrukturen;

/**
 * Aufgaben zu den Kontrollstrukturen
 * 
 * @author Mark Keinhoerster
 * 
 */
public class Fibonacci {

	public static void main(String[] args) {
		// Die Eingabe
		long n = 5;

		// Benoetigte Variablen
		int g = 1;
		int gVor = 1;
		int gVorVor = 1;

		// Verarbeitung
		if (n == 0) {
			System.out.println("0");
		} else if (n == 1 || n == 2) {
			System.out.println("1");
		} else {
			System.out.print("0 1 ");
			for (int i = 3; i <= n; i++) {
				System.out.print(g + " ");
				g = gVor + gVorVor;
				gVorVor = gVor;
				gVor = g;
			}
		}
	}
}
