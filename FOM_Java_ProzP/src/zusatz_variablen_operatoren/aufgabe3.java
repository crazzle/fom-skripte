package zusatz_variablen_operatoren;

/**
 * Extra-Aufgaben zu Variablen, Operatoren und Datentypen
 * 
 * @author Mark Keinhoerster
 * 
 */
public class aufgabe3 {

	public static void main(String[] args) {
		float eStS = 20;
		float gehaltBrutto = 4000;
		float abzuege = gehaltBrutto * (eStS / 100);
		float gehaltNetto = gehaltBrutto - abzuege;

		System.out.println("Bruttogehalt: " + gehaltBrutto);
		System.out.println("Steuersatz: " + eStS);
		System.out.println("Abzuege: " + abzuege);
		System.out.println("Nettogehalt: " + gehaltNetto);
	}

}
