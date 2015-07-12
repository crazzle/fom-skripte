package rekursion;

/**
 * Seite 64 Aufgabe 2
 * 
 * @author Mark Keinhoerster
 * 
 */
public class Ggt {

	public static void main(String[] args) {
		System.out.println(ggt(100, 50));
	}

	static int ggt(int a, int b) {
		if (a == b)
			return a;
		else if (a < b)
			return ggt(a, b - a);
		else
			return ggt(a - b, b);
	}
}
