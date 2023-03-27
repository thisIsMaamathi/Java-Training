package Ex3;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex04DigitalClock {
	public static void main(String args[]) {
		Clock c=new Clock();
		
	    ExecutorService es=Executors.newFixedThreadPool(4);
	    es.execute(()->{
	    	
	    	 try {
	    		 while(true) {
	    			 
	    		    	Thread.currentThread();
	    		    	if(c.sec==59) {c.sec=0;c.min++;}
	    		    	if(c.min==59) {c.min=0;c.hr++;}
	    		    	c.display();
	    		    	
				       Thread.sleep(1000);
 
	    		 }
	    	 }
			 catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    	
	    });
	    
		
	

}
}

class Clock{
	

	LocalTime time = LocalTime.now();
    int hr=time.getHour();
	int min=time.getMinute();
	int sec=time.getSecond();
	
	
    public void display() {
          sec++;

          if(sec<10) System.out.println(hr+":"+min+":0"+sec);
          
          
          else
          System.out.println(hr+":"+min+":"+sec);
         
     
         

}
	
}
