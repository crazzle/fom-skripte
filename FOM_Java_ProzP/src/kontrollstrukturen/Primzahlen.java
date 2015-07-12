package kontrollstrukturen;

/**
 * Aufgaben zu den Kontrollstrukturen
 * 
 * @author Mark Keinhoerster
 * 
 */
public class Primzahlen {

	public static void main(String[] args) {

		// Unsere Range in der wir Primzahlen suchen
		int range = 100;

		// Flag als Indikator
		boolean isPrim = true;

		// Verarbeitung
		for (int n = 1; n < range; n++) {

			// Teile n durch alle Zahlen < n
			// Wenn n durch eine der Zahlen teilbar
			// dann ist n keine Primzahl
			for (int d = 2; d < n; d++) {
				int e = n / d;
				int result = e * d;
				if (result == n) {
					isPrim = false;
				}
			}

			// wenn es keine Primzahl ist,
			// soll die Zahl ausgegeben werden
			if (isPrim) {
				System.out.println(n + " ist eine Primzahl.");
			}

			// Indikator zuruecksetzen
			isPrim = true;
		}
	}
}
