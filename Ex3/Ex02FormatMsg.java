package Ex3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex02FormatMsg {
 public static void main(String[] args) {
	 ExecutorService es=Executors.newFixedThreadPool(5);
	 Display d=new Display();
	 
		es.execute(()->{
			synchronized(d) {
			Thread.currentThread().setName("a");
			System.out.println(Thread.currentThread().getName());
			d.print("Message1");
		    
			}
			
			
			
			
			
		});
		es.execute(()->{
			synchronized(d) {
			Thread.currentThread().setName("b");
			System.out.println(Thread.currentThread().getName());
			d.print("Message2");
			

			}
			
			
		});
        es.execute(()->{
        	synchronized(d) {
        	Thread.currentThread().setName("c");
        	System.out.println(Thread.currentThread().getName());
			d.print("Message3");
        	
        	}
			
		});
		es.execute(()->{
			synchronized(d) {
			Thread.currentThread().setName("d");
			System.out.println(Thread.currentThread().getName());
			d.print("Message4");
		
			}
			
			
			
		});
		
		es.close();
 }
}

 class Display{
	
	public void print(String s) {
	System.out.println("[------"+ s +"------]");
	}
	
}


