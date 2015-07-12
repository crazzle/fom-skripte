package arrays;

import tastatur.Tastatur;

public class Schulnoten {
	public static void main(String[] args) {
		int[] noten = new int[5];
		for (int i = 0; i < noten.length; i++) {
			noten[i] = Tastatur.readInteger();
		}
		double ergebnis = 0;
		for (int i = 0; i < noten.length; i++) {
			ergebnis += noten[i];
			ergebnis = ergebnis + noten[i];
		}
		ergebnis /= noten.length;
		System.out.println(ergebnis);
	}
}
