package arrays;

import tastatur.Tastatur;

/**
 * TIC-TAC-TOE
 * 
 * Eine erste Implementierung fuer ein Konsolenbasiertes TIC-TAC-TOE
 * 
 * ACHTUNG: Eingaben werden nicht geprueft. Das Spiel ''stabil'' zu gestalten
 * ist ihre Aufgabe.
 * 
 * @author Mark Keinhoerster
 * 
 */
public class TicTacToe {

	/**
	 * Wichtige Variablen die im Spiel verwendet werden
	 */
	public static final int FELDER_ZAHL = 3;
	public static final int[][] FELD = new int[FELDER_ZAHL][FELDER_ZAHL];
	public static final int S1 = -1;
	public static final int S2 = 1;
	public static final int SIEG_S1 = berechneSiegesSummes(S1);
	public static final int SIEG_S2 = berechneSiegesSummes(S2);
	public static final String[] FIGUR = { "X", "O" };

	/**
	 * Die Main-Methode, hier laeuft das Spiel ab
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Die Auswahl um mehrmals zu spielen
		int auswahl = -1;
		int spieler = S1;

		// Das Spielfeld initialisieren und alles auf 0 setzen
		initialisiereSpielfeld();

		// Das eigentliche Spiel
		System.out.println("Tic-Tac-Toe");

		// Initiales Feld zeichnen
		zeichneSpielfeld();

		// Simples Menue
		while (auswahl != 0) {
			// Spieler ist am Zug
			waehleFeld(spieler);

			// nach dem Zug wird das Feld neu gezeichnet
			zeichneSpielfeld();

			// pruefen ob einer der Spieler gewonnen hat
			boolean sieg = pruefeFeld(spieler);

			// Wenn Sieg, dann muss dies der des aktuellen Spielers sein
			if (sieg) {
				gebeSiegesNachrichtAus(spieler);
				auswahl = frageSpielWiederholenAb();
				initialisiereSpielfeld();
			}

			// Den Spieler wechseln
			spieler = wechselSpieler(spieler);
		}
	}

	/**
	 * Gibt die Siegesnachricht auf der Konsole aus
	 * 
	 * @param spieler
	 */
	public static void gebeSiegesNachrichtAus(int spieler) {
		System.out.println("Spielfigur '" + ermittleSpielfigur(spieler)
				+ "' hat das Spiel gewonnen.");
	}

	/**
	 * Wechselt vom einen zum anderen Spieler
	 * 
	 * @param spieler
	 * @return
	 */
	public static int wechselSpieler(int spieler) {
		spieler *= -1;
		return spieler;
	}

	/**
	 * Zeichnet das Spielfeld
	 */
	public static void zeichneSpielfeld() {
		for (int i = 0; i < FELD.length; i++) {
			System.out.printf("|%s", "");
			for (int j = 0; j < FELD[i].length; j++) {
				if (FELD[i][j] != 0) {
					int spielerAufFeld = FELD[i][j];
					System.out
							.printf("%s|", ermittleSpielfigur(spielerAufFeld));
				} else {
					System.out.printf("%s|", " ");
				}
			}
			System.out.println();
		}
	}

	/**
	 * Soll noch ein Spiel gespielt werden?
	 * 
	 * @return
	 */
	public static int frageSpielWiederholenAb() {
		System.out.print("Noch ein Spiel (1=ja, 0=nein): ");
		int auswahl = Tastatur.readInteger();
		return auswahl;
	}

	/**
	 * Prueft das Spielfeld auf einen Sieg durch einen Spieler
	 * 
	 * @param spieler
	 * @return
	 */
	public static boolean pruefeFeld(final int spieler) {
		// Die Siegessumme, die fuer den Spieler gilt
		int pruefwert = berechneSiegesSummes(spieler);

		// Pruefen von Zeilen, Spalten und Diagonalen
		boolean zeilen = pruefeZeilenAufSieg(pruefwert);
		boolean spalten = pruefeSpaltenAufSieg(pruefwert);
		boolean diagonalen = pruefeDiagonalenAufSieg(pruefwert);

		// Das Ergebnis ist ''wahr'' wenn in Spalte,
		// Diagonale oder Zeile die Summe gleich der Siegessumme ist
		boolean ergebnis = zeilen || spalten || diagonalen;
		return ergebnis;
	}

	/**
	 * Prueft die Diagonalen
	 * 
	 * @param pruefwert
	 * @return
	 */
	public static boolean pruefeDiagonalenAufSieg(int pruefwert) {
		boolean siegD1 = pruefeDiagonaleLinksObenRechtsUnten(pruefwert);
		boolean siegD2 = pruefeDiagonaleLinksUntenRechtsOben(pruefwert);
		return siegD1 || siegD2;
	}

	/**
	 * Prueft die Diagonale von Links-Unten nach Rechts-Oben
	 * 
	 * @param pruefwert
	 * @return
	 */
	public static boolean pruefeDiagonaleLinksUntenRechtsOben(int pruefwert) {
		 boolean siegD2 = false;
		
		int summeD2 = 0;
		for (int i = 0, j = (FELD[i].length - 1); i < FELD.length && j > -1; i++, j--) {
			summeD2 += FELD[i][j];
			if (summeD2 == pruefwert) {
				i = FELD.length;
				 siegD2 = true;
			}
		}
		
		 return siegD2;
	}

	/**
	 * Prueft die Diagonale von Links-Oben nach Rechts-Unten
	 * 
	 * @param pruefwert
	 * @return
	 */
	public static boolean pruefeDiagonaleLinksObenRechtsUnten(int pruefwert) {
		boolean siegD1 = false;
		int summeD1 = 0;
		for (int i = 0; i < FELD.length; i++) {
			summeD1 += FELD[i][i];
			if (summeD1 == pruefwert) {
				i = FELD.length;
				siegD1 = true;
			}
		}
		return siegD1;
	}

	/**
	 * Prueft die Zeilen
	 * 
	 * @param pruefwert
	 * @return
	 */
	private static boolean pruefeZeilenAufSieg(final int pruefwert) {
		boolean sieg = false;
		for (int i = 0; i < FELD.length; i++) {
			int summe = 0;
			for (int j = 0; j < FELD[i].length; j++) {
				summe += FELD[i][j];
			}
			if (summe == pruefwert) {
				i = FELD.length;
				sieg = true;
			}
		}
		return sieg;
	}

	/**
	 * Prueft die Spalten
	 * 
	 * @param pruefwert
	 * @return
	 */
	public static boolean pruefeSpaltenAufSieg(final int pruefwert) {
		boolean sieg = false;
		for (int i = 0; i < FELD.length; i++) {
			int summe = 0;
			for (int j = 0; j < FELD[i].length; j++) {
				summe += FELD[j][i];
			}
			if (summe == pruefwert) {
				i = FELD.length;
				sieg = true;
			}
		}
		return sieg;
	}

	/**
	 * Initialisiert das Feld
	 */
	public static void initialisiereSpielfeld() {
		for (int i = 0; i < FELD.length; i++) {
			for (int j = 0; j < FELD[i].length; j++) {
				FELD[i][j] = 0;
			}
		}
	}

	/**
	 * Setzen der Spielfigur, der Spieler gibt die Koordinaten durch Komma
	 * getrennt ein
	 * 
	 * @param spieler
	 */
	public static void waehleFeld(int spieler) {
		System.out
				.println("Spielfigur '"
						+ ermittleSpielfigur(spieler)
						+ "', welches Feld wollen Sie setzen? (Koordinaten durch ',' getrennt eingeben: )");

		// Position des Kommas wird gelesen
		String koordinaten = Tastatur.readLine();
		int mitte = koordinaten.indexOf(",");

		// Die Zeile, Zahl vor dem Komma wird gelesen
		String xString = koordinaten.substring(0, mitte);
		int x = Integer.parseInt(xString);

		// Die Spalte, Zahl nach dem Komma wird gelesen
		String yString = koordinaten.substring(mitte + 1, koordinaten.length());
		int y = Integer.parseInt(yString);

		FELD[x][y] = spieler;
	}

	/**
	 * Berechnet die Summe, die für den Sieg nötig ist
	 * 
	 * @param s
	 * @return
	 */
	public static int berechneSiegesSummes(int s) {
		int summe = 0;
		for (int i = 0; i < FELDER_ZAHL; i++) {
			summe += s;
		}
		return summe;
	}

	/**
	 * Wählt die Spielfigur des Spielers anhand seiner Zahl; (spieler >>> 1)
	 * ergibt bei NEGATIVEM Vorzeichen 1; (spieler >>> 1) ergibt bei POSITIVEM
	 * Vorzeichen 0; Durch die & Verknüpfung
	 */
	public static String ermittleSpielfigur(int spieler) {
		// Binaer:
		// -1 = 11111111111111111111111111111111
		// -1 >>> 1 = 01111111111111111111111111111111
		// +1 = 00000000000000000000000000000001
		// +1 >>> 1 = 00000000000000000000000000000000
		// Durch die &-Verknüpfung auf das erste Bit von rechts ergibt sich
		// jeweils die Zahl 0 oder 1, die als Indices fuer das Array genutzt
		// werden kann
		return FIGUR[((spieler >>> 1) & 1)];
	}
}