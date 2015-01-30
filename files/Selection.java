package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class Selection {
	
	public ArrayList<Integer> fileRead (String file) throws FileNotFoundException
    {

        Scanner readFile = new Scanner(new File("C:/Users/Whit/JavaFiles/Sorting/files/directory/"+file));

        ArrayList<Integer> numFile = new ArrayList<Integer>();

        while(readFile.hasNextInt())
        {
            numFile.add(readFile.nextInt());
        }
       readFile.close();
       
        
		return numFile;

    }
	
	public static ArrayList<Integer> doSelectionSort(ArrayList<Integer> arr){
        
        for (int i = 0; i < arr.size() - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(j) < arr.get(index))
                    index = j;
      
            int smallerNumber = arr.get(index); 
            arr.set (index, arr.get(i));
            arr.set (i, smallerNumber);
        }
        return arr;
    }
}

