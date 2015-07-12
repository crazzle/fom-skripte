package io;

import java.io.FileInputStream;
import java.io.IOException;

public class InputTestKlasse {

	public static void main(String[] args) throws IOException {
		String pfad = "resource/TestDatei.txt";
		FileInputStream is = null;
		is = new FileInputStream(pfad);
		int inhalt = -1;
		while ((inhalt = is.read()) != -1) {
			System.out.print((char) inhalt);
		}
		is.close();

		is = new FileInputStream(pfad);
		byte[] inhaltBytes = new byte[5];
		while (is.read(inhaltBytes) != -1) {
			System.out.print((char) inhaltBytes[0]);
			System.out.print((char) inhaltBytes[1]);
			System.out.print((char) inhaltBytes[2]);
			System.out.print((char) inhaltBytes[3]);
			System.out.print((char) inhaltBytes[4]);
		}
		is.close();
	}
}
