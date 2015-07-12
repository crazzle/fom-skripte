package rekursion;

/**
 * Fakultät
 * 
 * @author Mark Keinhoerster
 * 
 */
public class Fakultaet {

	public static void main(String[] args) {
		int i = 5;
		System.out.println(fakultaet(i));
	}

	public static int fakultaet(int i) {
		if (i > 0)
			return fakultaet(i - 1) * i;
		else
			return 1;
	}

}
