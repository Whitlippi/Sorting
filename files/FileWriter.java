package files;

import java.io.*;

public class FileWriter {
	
	public void randomFileGen (int length, int range, String name) throws IOException{
    	String fileName = name +".txt";
    	File file = new File("C:/Users/Whit/JavaFiles/Sorting/files/directory/"+fileName);
    	file.getParentFile().mkdirs();

		PrintWriter fileout = new PrintWriter (file);
		
    	for (int j=0; j < length; j++){
    		int rNum = (int)(Math.random() * range+1);
    		fileout.println (rNum);
    	}
    	fileout.close();
    }
	
}
	
