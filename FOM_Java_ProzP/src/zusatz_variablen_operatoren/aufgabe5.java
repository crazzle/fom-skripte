package zusatz_variablen_operatoren;

/**
 * Extra-Aufgaben zu Variablen, Operatoren und Datentypen
 * 
 * @author Mark Keinhoerster
 * 
 */
public class aufgabe5 {

	public static void main(String[] args) {

		int gesamtSekunden = 2549;
		int gesamtMinuten = gesamtSekunden / 60;

		// Die Sekunden, die nicht mehr zu einer vollen Minute reichen
		int sekunden = gesamtSekunden % 60;

		// Die Minuten die nicht mehr zu einer vollen Stunde reichen
		int minuten = gesamtMinuten % 60;

		// Die Stunden
		int stunden = minuten / 60;

		System.out.println(stunden + "h " + minuten + "m " + sekunden + "s");
	}

}
