package Ex7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex79CharByCharCopy {
	public static void main(String args[]) throws IOException {
		File root = new File("/Users/maamathikrishnan/Desktop/JavaReference/CheckPallindromePerfectArmstrong.java");
		File dest = new File("/Users/maamathikrishnan/Desktop/JavaReference/CheckPallindromePerfectArmstrong.txt");
		dest.createNewFile();
		BufferedReader ir = new BufferedReader(new FileReader(root));
		PrintWriter pw = new PrintWriter(new FileWriter(dest));
		String l;
		try {
			while ((l = ir.readLine()) != null) {
				pw.println(l);
			}
			System.out.println("FileCopied");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			ir.close();
			pw.close();

		}

	}

}
