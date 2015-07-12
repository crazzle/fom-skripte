package rekursion;

/**
 * Seite 65 Aufgabe
 * 
 * @author Mark Keinhoerster
 * 
 */
public class Hanoi {

	public static void main(String args[]) {
		bewegeTurm(40, 1, 2, 3);
	}

	/**
	 * 
	 * @param n
	 *            ist die Anzahl der Scheiben
	 * @param s
	 *            ist der Platz an dem gestartet wird
	 * @param z
	 *            ist das Ziel der Scheiben
	 * @param h
	 *            der Hilfsplatz
	 */
	public static void bewegeTurm(int n, int s, int z, int h) {
		if (n == 1) {
			System.out.println("Bewege Scheibe von Platz " + s + " nach " + z);
		} else {
			bewegeTurm(n - 1, s, h, z);
			System.out.println("Bewege Scheibe von Platz " + s + " nach " + z);
			bewegeTurm(n - 1, h, z, s);
		}
	}
}
