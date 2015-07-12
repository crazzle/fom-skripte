package rekursion;

/**
 * Seite 64 Aufgabe 1
 * 
 * @author Mark Keinhoerster
 * 
 */
public class Fibunacci {

	public static void main(String[] args) {
		int i = 50;

		long now1 = System.currentTimeMillis();
		System.out.println(fibunacci(i));
		long delta1 = System.currentTimeMillis() - now1;
		System.out.println("Zeit rekursiv: " + delta1 + "s");

		long now2 = System.nanoTime();
		System.out.println(fibunacciEndrekursiv(i));
		long delta2 = System.nanoTime() - now2;
		System.out.println("Zeit endrekursiv: " + delta2 + "s");
	}

	public static int fibunacci(int i) {
		if (i > 1) {
			return fibunacci(i - 1) + fibunacci(i - 2);
		} else if (i == 1) {
			return 1;
		} else {
			return 0;
		}
	}

	// Jede rekursive Funktion kann sich mithilfe von CPS
	// (https://en.wikipedia.org/wiki/Continuation-passing_style)
	// in eine endrekursive Funktion umwandeln lassen
	public static int fibunacciEndrekursiv(int z) {
		return fibunacciEndrekursiv(1, 1, 2, z - 1);
	}

	public static int fibunacciEndrekursiv(int x, int y, int i, int n) {
		if (i > n)
			return y;
		else
			return fibunacciEndrekursiv(y, x + y, i + 1, n);
	}

	public static void fibunacciAusgabe(int i) {
		int anzahl = 0;
		while (anzahl <= i) {
			System.out.print(" " + fibunacci(anzahl));
			anzahl++;
		}
	}
}