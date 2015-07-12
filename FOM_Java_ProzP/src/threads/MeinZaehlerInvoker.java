package threads;

public class MeinZaehlerInvoker {
	public static void main(String[] args) throws InterruptedException {

		// Management der Threads
		int anzahl = 512;
		Thread[] threads = new Thread[anzahl];
		MeinZaehlerRunner[] zaehler = new MeinZaehlerRunner[anzahl];

		// Management der Liste
		int eintraege = 1024;
		int range = eintraege / anzahl;
		boolean[] liste = new boolean[eintraege];

		// Liste intitialisieren
		for (int i = 0; i < liste.length; i++) {
			if (Math.random() > 0.5) {
				liste[i] = true;
			}
		}

		// Zeit messen
		long startZeit = System.currentTimeMillis();

		// Arbeiter anfeuern
		for (int i = 0; i < anzahl; i++) {

			// Range des einzelnen Threads
			int start = i * range;
			int ende = start + range;

			// Runnable
			MeinZaehlerRunner r = new MeinZaehlerRunner(liste, start, ende);
			Thread t = new Thread(r);
			t.start(); // Runnable arbeiten lassen

			// Infos sichern
			threads[i] = t;
			zaehler[i] = r;
		}

		// Ergebnis verarbeiten
		int anzahlTrues = 0;
		for (int i = 0; i < anzahl; i++) {
			threads[i].join();
			anzahlTrues += zaehler[i].count();
		}

		// Zeit stoppen
		long stoppZeit = System.currentTimeMillis();

		// Ausgabe
		System.out.println("Anzahl Threads: " + anzahl + " \nZeit: "
				+ (stoppZeit - startZeit));
		System.out.println("Ergebnis: " + anzahlTrues);
	}
}
