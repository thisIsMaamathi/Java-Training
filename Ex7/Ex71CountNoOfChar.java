package Ex7;

import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Ex71CountNoOfChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] arr = new char[100];
		System.out.printf("Enter input: ");
		System.out.println(readIntoArray(sc, arr));
		
	}

	public static int readIntoArray(Scanner sc, char[] num) {
		int count = 0; 
		while (true) {
			num[count] = sc.next().charAt(0);
			if(num[count]=='z') return count;
			count++;
			
		}
		
		
	}

}
