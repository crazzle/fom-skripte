package strings;

import java.util.StringTokenizer;

public class StringSumme {

	public static void main(String[] args) {
		String meinString = "10;15;10;5";

		int count = zaehle(meinString);
		System.out.println(count);
	}

	private static int zaehle(String meinString) {
		StringTokenizer st = new StringTokenizer(meinString, ";");
		int summe = 0;
		while (st.hasMoreTokens()) {
			int x = Integer.parseInt(st.nextToken());
			summe += x;
		}
		return summe;
	}

}
