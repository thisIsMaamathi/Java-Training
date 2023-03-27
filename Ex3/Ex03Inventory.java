package Ex3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex03Inventory {
	public static void main(String[] args) {

		ExecutorService es = Executors.newFixedThreadPool(10);
		Inventory i = new Inventory();

		es.execute(() -> {
			int a = 0;

			while (a < 5) {
				//System.out.println(a);
				i.addProduct();
				a++;
			}

		});

		es.execute(() -> {
			int a = 0;
			while (a < 5) {

			 // System.out.println(a);
				i.consumeProduct();
				a++;
			}

		});

		es.shutdown();

	}
}

class Inventory {

	int count = 0;

	public void checkNumber() {

		System.out.println("Number of goods in Inventory" + count);
	}

	synchronized void consumeProduct() {

 	   notify();
       if(count==1) {
		System.out.println("product Consumed..." + count);
		count--;

		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
       }
       
      
    	  
	}

	synchronized void addProduct() {
		notify();
		if(count==0) {
			System.out.println("product Added..." + count);
			count++;

			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
			
	}

}
