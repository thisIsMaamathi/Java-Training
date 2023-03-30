package Ex7;
import java.io.ByteArrayOutputStream;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.imageio.ImageIO;


public class Ex75ImageToByteArray {
	   public static void main(String args[]) throws Exception{
		   
		   FileInputStream fis=new FileInputStream(new File("/Users/maamathikrishnan/Desktop/JavaReference/goldfish.png"));
		   FileOutputStream fos=new FileOutputStream(new File("/Users/maamathikrishnan/Desktop/JavaReference/goldfishCopy12.png"));
		  
		   
		   int c;
		   while((c=fis.read())!=-1)
		   {
			   fos.write(c);
			   System.out.println("one byte copied");
		   }
	     
	    	System.out.println("File copied");  
	      }
	      
	      
	      
	      
	   }
	