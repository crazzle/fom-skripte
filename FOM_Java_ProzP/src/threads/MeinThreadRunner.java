package threads;

public class MeinThreadRunner implements Runnable {

	String name;

	public MeinThreadRunner(String name) {
		this.name = name;
	}

	public void run() {
		while (true) {
			System.out.println("Hello this is " + name);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
