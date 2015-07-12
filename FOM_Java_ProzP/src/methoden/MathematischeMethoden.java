package methoden;

public class MathematischeMethoden {
	static final double PI = Math.PI;
	static final double KONSTANTE = 2.0;

	public static void main(String[] args) {

		double umfang = berechneUmfang(15.0);
		System.out.println(umfang);

		double flaeche = berechneFlaeche(15.0);
		System.out.println(flaeche);
	}

	public static double berechneUmfang(double radius) {
		double umfang = KONSTANTE * PI * radius;
		return umfang;
	}

	public static double berechneFlaeche(double radius) {
		double flaeche = PI * Math.pow(radius, KONSTANTE);
		return flaeche;
	}
}
