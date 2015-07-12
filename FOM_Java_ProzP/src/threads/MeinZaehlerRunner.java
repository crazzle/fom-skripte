package threads;

public class MeinZaehlerRunner implements Runnable {

	boolean[] liste;
	int start;
	int ende;
	int counter = 0;

	public MeinZaehlerRunner(boolean[] liste, int start, int ende) {
		this.liste = liste;
		this.start = start;
		this.ende = ende;
	}

	public void run() {
		for (int i = start; i < ende; i++) {
			if (liste[i]) {
				++counter;
				try {
					Thread.sleep(30); // Wir simulieren eine komplexe Berechnung
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public int count() {
		return counter;
	}
}
