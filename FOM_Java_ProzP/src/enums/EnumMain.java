package enums;

public class EnumMain {

	public static void main(String[] args) {
		Wochentag[] values = Wochentag.values();

		for (int i = 0; i < values.length; i++) {

			System.out.println(values[i]);
			if (values[i] == Wochentag.Montag) {
				System.out.println("Arbeitsbeginn...");

			}

		}

	}

}
