package Ex7;

import java.io.File;

public class Ex74FileDierectoryLister {
	public static void main(String args[]) {
		String folderpath="/Users/maamathikrishnan/Desktop/JavaReference/";
		
		File folder=new File(folderpath);
		File[] files=folder.listFiles();
		
		for(File file:files) {
			if(file.isFile()) {
				System.out.println("file: "+file.getName());
			}
			else {
				if(file.isDirectory()) {
					System.out.println("folders: "+file.getName());
					
				}
			}
			
		}
		
	}

}
