package junit;

import methoden.MathematischeMethoden;

import org.junit.Assert;
import org.junit.Test;

public class MatheTest {

	@Test
	public void testUmfang() {
		double radius = 10;
		double umfangKorrekt = Math.PI * 2 * radius;
		double umfangBerechnet = MathematischeMethoden.berechneUmfang(radius);
		Assert.assertTrue(umfangKorrekt == umfangBerechnet);
	}

	@Test
	public void testFlaeche() {
		double radius = 10;
		double flaecheKorrekt = Math.PI * radius * radius;
		double flaecheBerechnet = MathematischeMethoden.berechneFlaeche(radius);
		Assert.assertTrue(flaecheKorrekt == flaecheBerechnet);
	}

}
