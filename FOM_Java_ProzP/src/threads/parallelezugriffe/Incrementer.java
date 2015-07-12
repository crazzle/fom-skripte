package threads.parallelezugriffe;

public class Incrementer implements Runnable {
	@Override
	public void run() {
		while (true) {
			SynchronizedTest.inc();
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
