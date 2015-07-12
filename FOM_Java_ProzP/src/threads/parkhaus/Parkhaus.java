package threads.parkhaus;

public class Parkhaus {
	private int freiePlaetze = 0;
	private static Parkhaus p = null;

	public synchronized static Parkhaus getInstance() {
		if (p == null) {
			p = new Parkhaus(3);
		}
		return p;
	}

	private Parkhaus(int anzahl) {
		if (anzahl > 0) {
			freiePlaetze = anzahl;
		}
	}

	public synchronized void passieren() {
		while (freiePlaetze == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// left blank
			}
		}
		freiePlaetze--;
	}

	public synchronized void verlassen() {
		freiePlaetze++;
		notify();
	}

	public static void main(String args[]) {
		for (int i = 0; i < 501; i++) {
			Thread t = new Thread(new Auto("" + i));
			t.start();
		}
	}
}
