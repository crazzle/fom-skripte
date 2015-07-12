package kontrollstrukturen;

/**
 * Aufgaben zu den Kontrollstrukturen
 * 
 * @author Mark Keinhoerster
 * 
 */
public class Kleines1x1 {
	public static void main(String[] args) {

		// Jeweils 10 Zeilen und 10 Spalten
		int anzahl = 10;

		// Schleife fuer die Zeilen
		for (int i = 1; i < anzahl; i++) {

			// Schleife fuer die Spalten
			for (int j = 1; j < anzahl; j++) {

				// Ergebnis berechnen
				int ergebnis = i * j;

				// Ergebnis formatiert ausgeben
				System.out.format("%02d ", ergebnis);
			}

			// Zeilenumbruch fuer die naechste Zeile
			System.out.println();
		}
	}
}
