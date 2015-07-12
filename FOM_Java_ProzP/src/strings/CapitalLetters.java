package strings;

public class CapitalLetters {

	public static void main(String[] args) {
		String meinString = "Dies #zahl# ist ein Test  #zahl#     ";
		String neu = replace("#zahl#", "1234", meinString);
		System.out.println(neu);
	}

	private static String replace(String toReplace, String replacement,
			String meinString) {
		String replaced = meinString.replace(toReplace, replacement);
		return replaced;
	}

}
