package Ex7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex77ReadContentOfFile {

	public static void main(String args[]) throws IOException {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter FIle name");
			String filename = sc.nextLine();
			BufferedReader br = new BufferedReader(new FileReader(filename));
			String s;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
			br.close();
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
