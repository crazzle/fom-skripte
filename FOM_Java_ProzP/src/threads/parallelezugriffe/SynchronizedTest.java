package threads.parallelezugriffe;

public class SynchronizedTest {
	static Integer zahl = 0;

	static synchronized void inc() {
		System.out.println("Aktuell: " + zahl);
		int neueZahl = zahl + 1;
		zahl = neueZahl;
		System.out.println("Neue Zahl: " + neueZahl);
	}

	static synchronized int get() {
		return zahl;
	}

	public static void main(String[] args) throws InterruptedException {
		// Threads
		Thread t1 = new Thread(new Incrementer());
		Thread t2 = new Thread(new Incrementer());
		Thread t3 = new Thread(new Incrementer());
		Thread t4 = new Thread(new Incrementer());

		// Threads starten
		t1.start();
		t2.start();
		t3.start();
		t4.start();

		// Zahl ausgeben
		while (true) {
			System.out.println(get());
		}
	}
}
