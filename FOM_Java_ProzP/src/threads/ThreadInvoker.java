package threads;

public class ThreadInvoker {
	public static void main(String[] args) {
		MeinThreadRunner t1Runner = new MeinThreadRunner("T1");
		Thread t1 = new Thread(t1Runner);

		MeinThreadRunner t2Runner = new MeinThreadRunner("T2");
		Thread t2 = new Thread(t2Runner);

		MeinThreadRunner t3Runner = new MeinThreadRunner("T3");
		Thread t3 = new Thread(t3Runner);

		t1.start();
		t2.start();
		t3.start();
	}
}
