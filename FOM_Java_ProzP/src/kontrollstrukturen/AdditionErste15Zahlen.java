package kontrollstrukturen;

/**
 * Aufgaben zu den Kontrollstrukturen
 * 
 * @author Mark Keinhoerster
 * 
 */
public class AdditionErste15Zahlen {

	public static void main(String[] args) {
		// Eingabe
		int anzahl = 5;

		// Verarbeitung
		int zahl = 1; // Die Zahl die ausgegeben wird
		int naechsteZahl = 2; // Zahl die hinzuaddiert wird

		// Schleife die bis Anzahl geht
		while (naechsteZahl <= anzahl) {
			if (naechsteZahl % 2 != 0) {
				zahl += naechsteZahl;
			}
			naechsteZahl++;
		}

		// Ausgabe
		System.out.println("Ergebnis: " + zahl);
	}
}
