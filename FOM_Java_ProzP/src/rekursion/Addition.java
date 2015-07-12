package rekursion;

/**
 * Zusatzaufgabe 3
 * 
 * @author Mark Keinhoerster
 * 
 */
public class Addition {
	public static void main(String[] args) {
		System.out.println(addiere(10, 30));
	}

	static int addiere(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return addiere(++a, --b);
		}
	}
}
