package zusatz_variablen_operatoren;

/**
 * Extra-Aufgaben zu Variablen, Operatoren und Datentypen
 * 
 * @author Mark Keinhoerster
 * 
 */
public class aufgabe6 {

	// Konstanten
	final static int CENT_50 = 50;
	final static int CENT_20 = 20;
	final static int CENT_10 = 10;
	final static int CENT_05 = 5;
	final static int CENT_02 = 2;
	final static int CENT_01 = 1;

	// Die Main-Methode
	public static void main(String[] args) {
		// Eingaben
		int eingabe = 100;
		int artikelPreis = 55;

		// Gesamtbetrag der zurückgegeben wird
		int rueckgabe = eingabe - artikelPreis;

		// 50 Cent-Stuecke berechnen
		int fuenfziger = rueckgabe / CENT_50;
		rueckgabe %= CENT_50;

		// 20 Cent-Stuecke berechnen
		int zwanziger = rueckgabe / CENT_20;
		rueckgabe %= CENT_20;

		// 10 Cent-Stuecke berechnen
		int zehner = rueckgabe / CENT_10;
		rueckgabe %= CENT_10;

		// 5 Cent-Stuecke berechnen
		int fuenfer = rueckgabe / CENT_05;
		rueckgabe %= CENT_05;

		// 2 Cent-Stuecke berechnen
		int zweier = rueckgabe / CENT_02;
		rueckgabe %= CENT_02;

		// 1 Cent-Stuecke berechnen
		int einer = rueckgabe / CENT_01;
		rueckgabe %= CENT_01;

		// Ausgabe
		System.out.println("50 Cent Stuecke: " + fuenfziger);
		System.out.println("20 Cent Stuecke: " + zwanziger);
		System.out.println("10 Cent Stuecke: " + zehner);
		System.out.println("05 Cent Stuecke: " + fuenfer);
		System.out.println("02 Cent Stuecke: " + zweier);
		System.out.println("01 Cent Stuecke: " + einer);
	}
}
