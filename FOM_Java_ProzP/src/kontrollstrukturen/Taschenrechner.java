package kontrollstrukturen;

import tastatur.Tastatur;

/**
 * Aufgaben zu den Kontrollstrukturen
 * 
 * @author Mark Keinhoerster
 * 
 */
public class Taschenrechner {

	public static void main(String args[]) {

		// Zur Auswahl unserer Operation
		int choice = -1;

		// Unsere beiden Werte
		float a = 0;
		float b = 0;

		// Schleife für unser Menü
		do {

			/*
			 * Eingabeblock
			 */
			// wir lesen die gewünschte operation ein
			System.out
					.println("1 = add, 2 = sub, 3 = mul, 4 = div, 5 = fak, 0 = exit");
			System.out.print("Geben Sie die gewünschte Operation ein: ");
			choice = Tastatur.readInteger();

			// Bei der Auswahl von 0 soll das Programm beendet werden
			if (choice != 0) {

				// wir lesen die erste Zahl ein
				System.out.print("Geben Sie die erste Zahl ein: ");
				a = Tastatur.readFloat();

				if (choice != 5) { // Fakultaet
					// wir lesen die zweite Zahl ein
					System.out.print("Geben Sie die zweite Zahl ein: ");
					b = Tastatur.readFloat();
				}
			}

			/*
			 * Verarbeitungsblock
			 */
			// berechnen
			float ergebnis = 0.0f;
			switch (choice) {
			case 1: // addieren
				ergebnis = a + b;
				break;
			case 2: // subtrahieren
				ergebnis = a - b;
				break;
			case 3: // multiplizieren
				ergebnis = a * b;
				break;
			case 4: // dividieren
				ergebnis = a / b;
				break;
			case 5: // fakultaet
				// Benoetigte Variablen
				int zahl = 1;
				int naechsteZahl = 1;
				// Verarbeitung
				while (naechsteZahl <= a) {
					// Zahl mit ihrer vorherigen multiplizieren
					zahl = zahl * naechsteZahl++;
				}
				ergebnis = zahl;
			}

			/*
			 * Ausgabeblock
			 */
			System.out.println("Das Ergebnis ist: " + ergebnis);
			System.out.println();

		} while (choice != 0); // Beenden wenn im Menü 0 gewählt wurde
		System.out.println("Programm beendet.");
	}
}
