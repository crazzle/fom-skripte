package arrays;

/**
 * Lösung: Prüfen Sie eine n x n Matrix ob es sich um ein magisches Quadrat
 * handelt
 * 
 * @author Mark Keinhoerster
 * 
 */
public class MagischesQuadrat {

	public static void main(String[] args) {
		// Initiliasiere die Matrix mit Werten
		int[][] matrix = { { 6, 7, 2 }, { 1, 5, 9 }, { 8, 3, 4 } };

		// Hilfsvariable zum Start
		boolean ersterLauf = true;

		// Hilfsvariable mit der zu prüfenden Summe
		int summe = -1;

		// Ergebnis
		boolean maqa = true;

		// Schleife die durch alle Zeilen geht, sobald wir wissen das es sich
		// nicht um ein magisches Quadrat handelt, wird die Schleife abgebrochen
		for (int zeile = 0; zeile < matrix.length && maqa; zeile++) {
			int summeZeile = 0;

			// Schleife die durch die Spalten der aktuellen Zeile geht
			for (int spalte = 0; spalte < matrix[zeile].length; spalte++) {
				summeZeile += matrix[zeile][spalte];
			}

			// Beim ersten mal muss die Summe gesetzt
			// Da alle Summen gleich sind, reicht es die erste Summe
			// zu speichern und alle anderen damit zu vergleichen
			if (ersterLauf) {
				summe = summeZeile;
				ersterLauf = false;
			}

			// Prüfung auf magisches Quadrat
			if (summe != summeZeile) {
				maqa = false;
			}
		}

		// Schleife die durch alle Spalten geht, sobald wir wissen das es sich
		// nicht um ein magisches Quadrat handelt, wird die Schleife abgebrochen
		for (int spalte = 0; spalte < matrix.length && maqa; spalte++) {
			int summeSpalte = 0;

			// Schleife die durch die Zeilen der aktuellen Spalte geht
			for (int zeile = 0; zeile < matrix.length; zeile++) {
				summeSpalte += matrix[zeile][spalte];
			}

			// Prüfung auf magisches Quadrat
			if (summe != summeSpalte) {
				maqa = false;
			}
		}

		// Pruefen der Diagonalen
		int summeDiagonaleObenLinksUntenRechts = 0;
		int summeDiagonaleUntenLinksObenRechts = 0;
		// Sobald wir wissen das es sich
		// nicht um ein magisches Quadrat handelt,
		// wird die Schleife abgebrochen
		for (int position = 0; position < matrix.length && maqa; position++) {
			summeDiagonaleObenLinksUntenRechts += matrix[position][position];
			summeDiagonaleUntenLinksObenRechts += matrix[matrix.length - 1
					- position][position];
		}
		// Prüfung auf magisches Quadrat
		if ((summe != summeDiagonaleObenLinksUntenRechts)
				|| (summe != summeDiagonaleUntenLinksObenRechts)) {
			maqa = false;
		}

		// Ausgabe
		if (maqa) {
			System.out.println("Die matrix ist ein magisches Quadrat.");
		} else {
			System.out.println("Die matrix ist kein magisches Quadrat.");
		}
	}
}
