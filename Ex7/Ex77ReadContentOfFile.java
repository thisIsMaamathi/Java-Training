package Ex7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Ex77ReadContentOfFile {

	public static void main(String args[]) {
		try {
			Scanner sc=new Scanner(System.in);
			String filename=sc.nextLine();
			
			BufferedReader br=new BufferedReader(new FileReader(filename));
		    String s;
			
			while((s=br.readLine())!=null) {
				System.out.println(s);
				
			}
			br.close();
			sc.close();
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
