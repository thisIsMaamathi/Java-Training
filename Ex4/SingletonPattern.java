package Ex4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonPattern {
	public static void main(String args[]) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(() -> {
			Locker t = Locker.accessLocker();
		});
		es.execute(() -> {
			Locker s1 = Locker.accessLocker();
		});

	}
}

class Locker {

	private static Locker locker;
	private Locker() {
		System.out.println("Locker is access granted....");
	}

	synchronized public static Locker accessLocker() {
		if (locker == null) {     
			locker = new Locker();
		}
		System.out.println("Locker being accessed");
		return locker;
	}

}
