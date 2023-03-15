package Ex1R;


public class PrimenumberList {
	 public static void main (String[] args)
	   {		
	       int i =0;
	       int num =0;
	       
	   

	       for (i = 1; i <= 100; i++)         
	       { 		  	  
	          int c=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0) c++;
		    
		  }
		  if (c==2)
		 
	
	       System.out.println(i);

}
}
}

