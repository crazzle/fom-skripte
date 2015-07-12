package kontrollstrukturen;

/**
 * Aufgaben zu den Kontrollstrukturen
 * 
 * @author Mark Keinhoerster
 * 
 */
public class Rechteck {

	public static void main(String[] args) {
		// Anzahl der Sterne pro Zeile und Spalte
		int anzahl = 10;

		// Schleife für die Zeilen
		for (int i = 0; i < anzahl; i++) {

			// Schleife für die Spalten
			for (int j = 0; j < anzahl; j++) {
				System.out.print("*");
			}

			// Zeilenumbruch für die naechste Zeile
			System.out.print("\n");
		}
	}
}
