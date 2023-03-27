package Ex4;

public class SingletonPattern {
	public static void main(String args[]) {

			 Locker t= Locker.accessLocker();
			 Locker s1=Locker.accessLocker();
		 }
}
	


class Locker {
	
		private static Locker s =new Locker();
		
		private Locker() {
			
			System.out.println("Locker is access granted....");
			
		}
		
		public static Locker accessLocker() {
		  System.out.println("Locker being accessed");
			return s;
			
		}
		
		

	}
	 
	

