package rekursion;

/**
 * Zusatzaufgabe 5
 * 
 * @author Mark Keinhoerster
 * 
 */
public class BinaerDarstellung {

	public static void main(String[] args) {
		binaer(2);
	}

	public static void binaer(int zahl) {
		if (zahl > 0) {
			binaer(zahl / 2);
			System.out.print(zahl % 2);
		}
	}
}
