package Ex3;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenOddEx01 {
	public static void main(String[] args) {
		OddEven oddNum =new OddEven();
		ExecutorService es=Executors.newFixedThreadPool(2);
		
		es.execute(()->{
			Thread.currentThread().setName("odd");
			oddNum.odd();
			
		});
		es.execute(()->{
			Thread.currentThread().setName("even");
			
			oddNum.even();
			
			
		});
		
		es.close();
	
		
	}

}

class OddEven{
	public void odd() {
		for(int i=1;i<100;i+=2) {
			System.out.println(i);
			
		}
	}
	public void even() {
		for(int i=0;i<=100;i+=2) {
			System.out.println(i);
			
		}
	}
}

