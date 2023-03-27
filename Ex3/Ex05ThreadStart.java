package Ex3;

public class Ex05ThreadStart extends Thread{
	
	 public void run(){  
	   System.out.println("running...");  
	 }  
	 public static void main(String args[]){  
	  Ex05ThreadStart t=new Ex05ThreadStart();
	  t.start();  
	  t.start();  
	 }  
	}  
