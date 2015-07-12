package arrays;

import tastatur.Tastatur;

public class MinMaxArray {

	public static void main(String[] args) {
		System.out.println("Geben Sie die Anzahl an: ");
		int anzahl = Tastatur.readInteger();
		int[] zahlen = new int[anzahl];

		System.out.println("Geben Sie die " + anzahl + " Zahlen ein: ");
		for (int i = 0; i < zahlen.length; i++) {
			zahlen[i] = Tastatur.readInteger();
		}
		System.out.println();

		System.out.println("Folgende Zahlen eingegeben: ");
		for (int i = 0; i < zahlen.length; i++) {
			System.out.print(zahlen[i] + "; ");
		}
		System.out.println();

		System.out.println("Minimum: ");
		int mini = zahlen[0];
		for (int i = 1; i < zahlen.length; i++) {
			if (zahlen[i] < mini) {
				mini = zahlen[i];
			}
		}
		System.out.println(mini);
		System.out.println();

		System.out.println("Maximum: ");
		int max = zahlen[0];
		for (int i = 1; i < zahlen.length; i++) {
			if (zahlen[i] > max) {
				max = zahlen[i];
			}
		}
		System.out.println(max);
		System.out.println();

	}
}
