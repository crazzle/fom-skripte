package rekursion;

/**
 * Zusatzaufgabe 2
 * 
 * @author Mark Keinhoerster
 * 
 */
public class Summe {
	public static void main(String[] args) {
		System.out.println(summeEndrekursiv(10000));
	}

	public static long summe(long n) {
		if (n > 0) {
			return n + summe(n - 1);
		} else {
			return n;
		}
	}

	public static long summeEndrekursiv(long z) {
		return summeEndrekursiv(0, z);
	}

	public static long summeEndrekursiv(long m, long n) {
		if (n == 0)
			return m;
		else
			return summeEndrekursiv(m + n, n - 1);
	}
}
