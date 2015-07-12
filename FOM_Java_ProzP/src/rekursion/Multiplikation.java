package rekursion;

/**
 * Zusatzaufgabe 4
 * 
 * @author Mark Keinhoerster
 * 
 */
public class Multiplikation {

	public static void main(String[] args) {
		System.out.println(multipliziere(9, 5));
	}

	public static int multipliziere(int a, int b) {
		if (a > 1) {
			return b + multipliziere(a - 1, b);
		} else {
			return b;
		}
	}
}
