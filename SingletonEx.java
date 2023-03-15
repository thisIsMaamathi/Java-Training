package Ex1R;
 class Singleton {
	private static Singleton s =new Singleton();
	
	private Singleton() {
		
		System.out.println("Singleton private class called");
	}
	
	public static Singleton getInstance() {
		return s;
		
	}

}
 
 public class SingletonEx{
	 public static void main(String args[]) {
//		Singleton t=new Singleton();
		 Singleton t= Singleton.getInstance();
		 
	 }
 }



	
