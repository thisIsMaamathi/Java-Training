package Ex7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex710DateObjectWrite {

	public static void main(String args[]) throws IOException {

		File file = new File("/Users/maamathikrishnan/Desktop/JavaReference/DateTimeObj.txt");
		file.createNewFile();

		FileReader fir = new FileReader(file);
		FileWriter fw = new FileWriter(file);
		Date d = new Date();
		String s = d.toString();
		fw.write(s);
		fw.close();
		int i = 0;

		while ((i = fir.read()) != -1) {

			System.out.print((char) i);

		}

		fir.close();

	}
}
