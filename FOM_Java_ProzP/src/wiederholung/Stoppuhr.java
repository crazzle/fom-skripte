package wiederholung;

/**
 * Beispiellösung der Stoppuhr-Aufgabe
 * 
 * @author keinmark
 * 
 */
public class Stoppuhr {
	static long start;
	static long stopp;

	/**
	 * Start-Methode
	 * 
	 * @return
	 */
	public static long start() {
		start = System.currentTimeMillis();
		return start;
	}

	/**
	 * Stopp-Methode
	 * 
	 * @return
	 */
	public static long stopp() {
		stopp = System.currentTimeMillis();
		return stopp;
	}

	/**
	 * Diese Methode entspricht einem Reset
	 */
	public static void init() {
		start = 0;
		stopp = 0;
	}

	/**
	 * Berechnet die Differenz
	 * 
	 * @param einheit
	 * @return
	 */
	public static long berechneDifferenz() {
		return stopp - start;
	}
}
