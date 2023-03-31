package Ex3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex02FormatMsg {
 public static void main(String[] args) {
	 ExecutorService es=Executors.newFixedThreadPool(5);
	 Display display=new Display();
	 
		es.execute(()->{
			synchronized(display) {
			display.print("[-----");
			}
			
		});
		es.execute(()->{
			synchronized(d) {
			display.print("Mess");
			}
		});
        es.execute(()->{
        	synchronized(display) {
			display.print("age");
        	
        	}
			
		});
		es.execute(()->{
			synchronized(display) {
			display.print("-----]");
		
			}
			
		});
		
		es.close();
 }
}

 class Display{
	
	public void print(String string) {
	 System.out.print(string);
	}
	
}


