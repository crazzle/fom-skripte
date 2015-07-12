package operatoren_ausdruecke;

import tastatur.Tastatur;

public class MultiplikationMitConsole {

	public static void main(String[] args) {
		System.out.print("Bitte lesen Sie die erste Zahl ein: ");
		int a = Tastatur.readInteger();
		System.out.println();

		System.out.print("Bitte lesen Sie die zweite Zahl ein: ");
		int b = Tastatur.readInteger();
		System.out.println();

		System.out.println("Ergebnis: " + a * b);
	}

}
