


public class Selection {

		 
	    public static int[] doSelectionSort(int[] arr){
	         
	        for (int i = 0; i < arr.length - 1; i++)
	        {
	            int index = i;
	            for (int j = i + 1; j < arr.length; j++)
	                if (arr[j] < arr[index])
	                    index = j;
	      
	            int smallerNumber = arr[index]; 
	            arr[index] = arr[i];
	            arr[i] = smallerNumber;
	        }
	        return arr;
	    }
	    
	    public static int[] randomArrayGen (int length){
	    	int arr[] = new int[length];
	    	//ArrayList<Integer> val = new ArrayList<Integer>();
	    	for (int j=0; j < length; j++){
	    		int m = (int)(Math.random() * 100000);
	    		arr[j] = m;
	    		
	    	}
	    	//int[] stockArr = new int[val.size()];
	    	//stockArr = val.toArray(stockArr);
	    	return arr;
	    }
	     
	    public static void main(String a[]){
	    	
	    	
	         
	        int[] arr1 = randomArrayGen(200000);
	        int[] arr2 = doSelectionSort(arr1);
	        for(int i:arr2){
	            System.out.print(i);
	            System.out.print(", ");
	        }
	    
	}
}
