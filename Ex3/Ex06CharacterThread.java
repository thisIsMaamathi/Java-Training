package Ex3;


import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors; 

public class Ex06CharacterThread {
	public static void main(String args[]) {
		GetCharacter g=new GetCharacter();
		Scanner sc=new Scanner(System.in);
		ExecutorService es=Executors.newFixedThreadPool(1);
	    es.execute(()->{
		while(true) {
		char c=sc.next().charAt(0);
		 g.charPass(c);
		}
	    });
	    es.close();
	    
	}

}

class GetCharacter{
	
	public void charPass(char c) {
		try {
		if (Character.isAlphabetic(c)) 
			System.out.println(c);
		else throw new IllegalArgumentException();
		
	
		}
		catch(Exception e)
		{
			System.out.println("invalid character");
		}
		
	}
	
}

