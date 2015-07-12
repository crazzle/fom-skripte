package threads;

public class WichtigerThread extends Thread {
	// Semaphore die anderweitig bereits initialisiert wurde
	Semaphore s;

	public WichtigerThread(Semaphore s) {
		this.s = s;
	}

	// Unsere run-Methode
	public void run() {
		while (true) {
			// Wir betreten einen kritischen Bereich
			s.p();

			this.doCriticalStuff();

			// Wir verlassen den kritischen Bereich
			s.v();
		}
	}

	private void doCriticalStuff() {

	}

}
