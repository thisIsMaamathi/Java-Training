package Ex3;

public class Ex08StringBufferThread {
	public static void main(String args[]) {
		StringBuffer a = new StringBuffer("A");
		ThreadClass t1 = new ThreadClass(a);
		ThreadClass t2 = new ThreadClass(a);
		ThreadClass t3 = new ThreadClass(a);
		t1.start();
		t2.start();
		t3.start();


	}

}

class ThreadClass extends Thread {
	StringBuffer str;

	public ThreadClass(StringBuffer s) {
		this.str = s;
	}

	@Override
	public void run() {

		
		synchronized (str) {
			int n=0;
			while(n<=100) {
			System.out.println(str);
			n++;
			}
			
			str.setCharAt(0,(char)(str.charAt(0)+1));

		}

	}

}
