package Ex7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;

public class Ex73FileOperation {

	public static void main(String[] args) throws IOException {
        
		File file = new File("/Users/maamathikrishnan/Desktop/JavaReference/newFile.txt");
		boolean fileCreated = file.createNewFile();
		System.out.println(fileCreated);


		
        FileReader fir=new FileReader(file);
        FileWriter fw=new FileWriter(file);
        String s="Hello Here";
        fw.write(s);
        fw.close();
        
        System.out.println(file.length()+"b");
      
		
		File newName = new File("/Users/maamathikrishnan/Desktop/JavaReference/newname.txt");
		
		file.renameTo(newName);

//		boolean fileDeleted = file.delete();
//		System.out.println(fileDeleted);

	}
}
