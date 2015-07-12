package wiederholung;

public class VergleichBitShift {

	public static void main(String[] args) {

		Stoppuhr.start();
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			int x = i / 2;
		}
		Stoppuhr.stopp();
		System.out.println(Stoppuhr.berechneDifferenz());

		Stoppuhr.start();
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			int x = i >> 1;
		}
		Stoppuhr.stopp();
		System.out.println(Stoppuhr.berechneDifferenz());

	}
}
