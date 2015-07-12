package rekursion;

import java.io.FileNotFoundException;

/**
 * Zusatzaufgabe 1
 * 
 * @author Mark Keinhoerster
 * 
 */
public class AusgabeZahlen {

	public static void main(String[] args) throws FileNotFoundException {
		ausgabe(10);
	}

	public static void ausgabe(int z) {
		if (z >= 0) {
			ausgabe(z - 1);
			System.out.print(z + " ");
		}
	}

}
