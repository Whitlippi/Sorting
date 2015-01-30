package files;

import java.io.FileNotFoundException;
import java.io.IOException;


public class test {
	public static void main(String[] args) throws FileNotFoundException {
		FileWriter e = new FileWriter();
		try {
			e.randomFileGen(10, 1000, "nums");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Selection f1 = new Selection();
		System.out.println(Selection.doSelectionSort (f1.fileRead("nums.txt")));
		
		
       
		
	}	

}
