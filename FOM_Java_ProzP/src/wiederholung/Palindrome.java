package wiederholung;

public class Palindrome {
	public static boolean istPalindrom(String wort) {
		boolean toReturn = true;
		int begin = 0;
		int end = wort.length() - 1;

		while (begin < end) {
			if (wort.charAt(begin) != wort.charAt(end)) {
				toReturn = false;
				begin = end;
			}
			begin++;
			end--;
		}
		return toReturn;
	}

	public static void main(String args[]) {
		System.out.println(istPalindrom("rentner"));
		System.out.println(istPalindrom("rentnea"));
		System.out.println(istPalindrom("anna"));
		System.out.println(istPalindrom("anxa"));
		System.out.println(istPalindrom("anxxdxxna"));
	}
}