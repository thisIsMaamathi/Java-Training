package Ex3;


import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors; 

public class Ex06CharacterThread {
	public static void main(String args[]) {
		GetCharacter getCharacter=new GetCharacter();
		Scanner sc=new Scanner(System.in);
		ExecutorService es=Executors.newFixedThreadPool(1);
	    es.execute(()->{
		while(true) {
		char character=sc.next().charAt(0);
		 getCharacter.charPass(character);
		}
	    });
	    es.close();
	    
	}

}

class GetCharacter{
	
	public void charPass(char character) {
		try {
		if (Character.isAlphabetic(character)) 
			System.out.println(character);
		else throw new IllegalArgumentException();
		
	
		}
		catch(Exception e)
		{
			System.out.println("invalid character");
		}
		
	}
	
}

