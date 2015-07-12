package io;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputTestKlasse {

	public static void main(String[] args) throws IOException {
		String pfad = "resource/TestDateiOutput.txt";
		FileOutputStream fos = new FileOutputStream(pfad);
		fos.write((int) 'a');
		String meinString = "Dies ist ein Test\neueZeile";
		byte[] bytes = meinString.getBytes();
		fos.write(bytes);
		fos.close();

	}

}
