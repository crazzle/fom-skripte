package wiederholung;

public class Berechne {

	public static int berechne(int n) {
		if (n == 0) {
			return 0;
		}
		return n * n + berechne(n - 1);
	}

	public static void main(String[] args) {
		System.out.println(berechne(5));

	}

}
