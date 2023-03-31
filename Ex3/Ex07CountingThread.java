package Ex3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex07CountingThread {
	public static void main(String args[]) {
		ExecutorService es=Executors.newFixedThreadPool(1);
	    es.execute(()->{
	    	for(int i=1;i<=100;i++) {
	    		
	    		System.out.println(i);
	    		if(i%10==0) System.out.println("string");
	    		try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
	    	}
	    });
	    es.close();
	}

}


