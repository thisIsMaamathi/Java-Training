package Ex2R;

import java.util.Scanner;
import java.io.*;

public class Ex8MarksAverage {

	public static void main(String args[])  {
		StudentMarks s = new StudentMarks();
		s.calcAvg();
	}

}

class StudentMarks {

	public void calcAvg() {
		float avg = 0f, m = 0, sum = 0;
		int count=0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; count < 10; i++) {
			String mark = sc.next();

			try {

				m = Float.parseFloat(mark);
			
				sum += m;
				count++;
//				System.out.println("the sum" + sum);

			} catch (NumberFormatException e) {
				System.out.println("Enter a valid integer");
			}
			

		}
		//System.out.println(sum);
		//System.out.println(sum / 10);

		avg = sum / 10;
		System.out.println("The avg is " + avg);

	}
}


	
	
	
	
