package rekursion;

/**
 * Rekursive Lösung des Springer-Problems mit dem Backtracking-Algorithmus
 * 
 * @author Mark Keinhoerster
 * 
 */
public class Springer {

	public static final int SIZE = 8;
	public static int[][] brett = new int[SIZE][SIZE];
	public static int zug = 0;

	/**
	 * Die Main-Methode
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		initBrett();
		springe(0, 0);
		gebeBrettAus();
	}

	/**
	 * Initialisiert das Spielfeld indem es alle Felder mit -1 belegt.
	 */
	private static void initBrett() {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				brett[i][j] = -1;
			}
		}
	}

	/**
	 * Die Rekursive Methode zur Lösung des Springer-Problems. Sie prueft
	 * zunaechst ob der Springer auf den uebergebenen Koordinaten gesetzt werden
	 * kann. Anschliessend werden, falls nicht bereits alle Felder belegt, von
	 * dieser Position aus alle weiteren moeglichen Zielfelder versucht rekursiv
	 * zu setzen. Ist einer der Versuche geglueckt wird ''true'' zurueckgegeben.
	 * Fuehrte keiner der Versuche zum Erfolg wird der Springer von der
	 * aktuellen Zielposition wieder entfernt und es wird ''false''
	 * zurueckgegeben.
	 * 
	 * @param zielX
	 * @param zielY
	 * @return
	 */
	public static boolean springe(int zielX, int zielY) {
		// Pruefen ob die Position besetzt werden kann
		boolean zielPositionValide = kannSpringen(zielX, zielY);
		if (zielPositionValide) { // Position kann besetzt werden
			setzeSpringer(zielX, zielY);
			if (zug < (SIZE * SIZE)) { // Es ist noch nicht alles besetzt
				zielPositionValide = versucheVonPositionAus(zielX, zielY);
				if (!zielPositionValide) { // Springer entfernen
					entferneSpringer(zielX, zielY);
				}
			}
		}
		return zielPositionValide;
	}

	/**
	 * Hilfsmethode, die alle Versuche von der aktuellen Position aus
	 * durchfuehrt, die Methode ruft wieder die Methode
	 * {@link #springe(int, int) springe} auf
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	private static boolean versucheVonPositionAus(int x, int y) {
		/*
		 * Ausprobieren aller moeglichen Ziele
		 */
		boolean b1 = springe(x + 1, y + 2);
		boolean b3 = springe(x + 2, y + 1);
		boolean b2 = springe(x + 1, y - 2);
		boolean b4 = springe(x + 2, y - 1);
		boolean b5 = springe(x - 1, y - 2);
		boolean b6 = springe(x - 2, y + 1);
		boolean b7 = springe(x - 1, y + 2);
		boolean b8 = springe(x - 2, y - 1);
		/*
		 * Indikator ob eines der Ziele geglueckt ist
		 */
		boolean versuchValide = (b1 || b2 || b3 || b4 || b5 || b6 || b7 || b8);

		return versuchValide;
	}

	/**
	 * Prüft ob der Springer auf einem Feld gesetzt werden kann
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	private static boolean kannSpringen(int x, int y) {
		// Befinden wir uns innerhalb der Grenzen
		boolean xOk = (x < SIZE && x >= 0);
		boolean yOk = (y < SIZE && y >= 0);

		// Ist das Feld frei
		boolean frei = false;
		if (yOk && xOk) {
			frei = (brett[x][y] == -1);
		}
		return frei;
	}

	/**
	 * Setzt den Springer (in Form des aktuellen Zugs) auf einem Feld
	 * 
	 * @param x
	 * @param y
	 */
	private static void setzeSpringer(int x, int y) {
		brett[x][y] = ++zug;
	}

	/**
	 * Entfernt den Springer wieder von einem Feld
	 * 
	 * @param x
	 * @param y
	 */
	private static void entferneSpringer(int x, int y) {
		if ((x < SIZE && x >= 0) && (y < SIZE && y >= 0)) {
			--zug;
			brett[x][y] = -1;
		}
	}

	/**
	 * Gibt das Spielfeld aus
	 */
	private static void gebeBrettAus() {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				System.out.format("%02d ", brett[i][j]);
			}
			System.out.println();
		}
	}
}
