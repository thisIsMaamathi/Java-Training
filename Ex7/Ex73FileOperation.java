package Ex7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;

public class Ex73FileOperation {

	public static void main(String[] args) throws IOException {
        //create new file
		File file = new File("/Users/maamathikrishnan/Desktop/JavaReference/newFile.txt");
		boolean fileCreated = file.createNewFile();
		System.out.println(fileCreated);


		//adding content to created file
        FileReader fir=new FileReader(file);
        FileWriter fw=new FileWriter(file);
        String s="Hello Here";
        fw.write(s);
        fw.close();
        //displaying file size
        System.out.println(file.length()+" b");
      
		//renaming file
		File newName = new File("/Users/maamathikrishnan/Desktop/JavaReference/newname.txt");
		file.renameTo(newName);
        //deleting file
		boolean fileDeleted = newName.delete();
		System.out.println(fileDeleted);

	}
}
