package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import tastatur.Tastatur;

public class WriterTestKlasse {

	public static void main(String[] args) throws IOException {
		String pfad = "resource/TestDateiOutput.txt";
		FileOutputStream fos = new FileOutputStream(pfad);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		PrintWriter pw = new PrintWriter(osw);

		pw.println(Tastatur.readLine());
		pw.print("mein String");
		pw.close();
	}

}
