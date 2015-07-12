package operatoren_ausdruecke;

import tastatur.Tastatur;

public class Benzinverbrauch {
	public static void main(String[] args) {
		// Verbrauch in Litern
		System.out.println("Geben Sie den Verbrauch ein: ");
		float verbrauch = Tastatur.readFloat();
		System.out.println();

		// Verbrauch in Litern
		System.out.println("Geben Sie die gefahrenen Kilometer ein: ");
		float km = Tastatur.readFloat();
		System.out.println();

		// Ausgabe
		float vkm = (verbrauch * 100) / km;
		System.out.println("Verbrauch auf 100 KM = " + vkm + " Liter");
	}
}
