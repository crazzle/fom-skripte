package wiederholung;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SafetyArrayTest {

	@Before
	public void init() {
		SafetyArray.elements = new String[5];
	}

	/**
	 * Wächst das Array richtig?
	 */
	@Test
	public void testInsertElement() {
		SafetyArray.insertElement(0, "a");
		SafetyArray.insertElement(1, "a");
		Assert.assertTrue(SafetyArray.getSize() == 5);

		SafetyArray.insertElement(14, "");
		Assert.assertEquals(19, SafetyArray.getSize());

		SafetyArray.insertElement(15, "");
		Assert.assertEquals(19, SafetyArray.getSize());

		SafetyArray.insertElement(20, "");
		Assert.assertEquals(25, SafetyArray.getSize());
	}

	/**
	 * Wird ordentlich gelöscht?
	 */
	@Test
	public void testRemoveElement() {
		String a = "a";
		String b = "b";

		SafetyArray.insertElement(0, a);
		SafetyArray.removeElement(a);

		SafetyArray.removeElement(a);

		SafetyArray.insertElement(0, a);
		SafetyArray.insertElement(20, a);

		SafetyArray.removeElement(a);

		Assert.assertNull(SafetyArray.getElement(20));

		SafetyArray.removeElement(a);

		SafetyArray.removeElement(b);
	}

	/**
	 * Wird ordentlich zurückgegeben?
	 */
	@Test
	public void testGetElement() {
		String a = "a";
		String b = "b";

		SafetyArray.insertElement(0, a);
		SafetyArray.insertElement(25, b);

		Assert.assertEquals(SafetyArray.getElement(0), a);

		Assert.assertEquals(SafetyArray.getElement(25), b);

		Assert.assertEquals(SafetyArray.getElement(5), null);

		Assert.assertEquals(SafetyArray.getElement(44), null);
	}
}
