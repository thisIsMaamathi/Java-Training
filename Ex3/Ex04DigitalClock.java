package Ex3;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex04DigitalClock {
	public static void main(String args[]) {
		Clock clock=new Clock();
		
	    ExecutorService es=Executors.newFixedThreadPool(4);
	    es.execute(()->{
	    	
	    	 try {
	    		 while(true) {
	    			 
	    		        if(clock.sec==59) {clock.sec=0;clock.min++;}
	    		    	if(clock.min==59) {clock.min=0;clock.hr++;}
	    		    	clock.display();
	    		    	
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
          
          String hour=String.format("%02d",hr);
          String minute=String.format("%02d",min);
          String seconds=String.format("%02d",sec);

          System.out.println(hour+":"+minute+":"+seconds);
          
          
     
         
     
         

}
	
}
