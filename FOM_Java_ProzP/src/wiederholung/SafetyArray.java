package wiederholung;

/**
 * SafetyArray
 * 
 * @author keinmark
 * 
 */
public class SafetyArray {
	static String[] elements = new String[5];
	static int sizingFactor = 5;

	/**
	 * Gibt das Element an der Stelle "index" zurück
	 * 
	 * @param index
	 * @return
	 */
	public static String getElement(int index) {
		if (index < 0 || elements.length <= index || elements[index] == null) {
			return null;
		}
		return elements[index];
	}

	/**
	 * Fügt Element an einem bestimmten Index ein und überschreibt das Element
	 * was bereits im Feld vorhanden
	 * 
	 * @param index
	 * @param element
	 */
	public static void insertElement(int index, String element) {
		int len = elements.length;
		if (index > (len - 1)) {
			len = resize(index);
		}
		elements[index] = element;
	}

	/**
	 * Vergrößert das Array anhand der Länge die benötigt wird; Vergrößerung =
	 * benötigte Länge + 5
	 * 
	 * @param neededLength
	 * @return
	 */
	static int resize(int neededLength) {
		int newLen = neededLength + sizingFactor;
		String[] temp = new String[newLen];
		for (int i = 0; i < elements.length; i++) {
			temp[i] = elements[i];
		}
		elements = temp;
		return elements.length;
	}

	/**
	 * Entfernt Element aus dem Array
	 * 
	 * @param element
	 * @throws ThisObjectDoesNotExistHereException
	 */
	public static void removeElement(Object element) {
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] != null && elements[i].equals(element)) {
				elements[i] = null;
			}
		}
	}

	/**
	 * Gibt die Länge von Elements zurück
	 * 
	 * @return
	 */
	public static int getSize() {
		int len = 0;
		if (elements != null) {
			len = elements.length;
		}
		return len;
	}

}
