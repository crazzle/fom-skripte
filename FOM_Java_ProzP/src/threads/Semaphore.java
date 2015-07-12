package threads;

public class Semaphore {
	private int value = 0;

	public Semaphore(int val) {
		if (val > 0) {
			value = val;
		}
	}

	public synchronized void p() {
		while (value == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// left blank
			}
		}
		value--;
	}

	public synchronized void v() {
		value++;
		notify();
	}
}
