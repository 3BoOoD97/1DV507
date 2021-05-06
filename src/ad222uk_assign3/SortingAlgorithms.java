package ad222uk_assign3;

import java.util.Arrays;
import java.util.Comparator;

public class SortingAlgorithms  {

	public static void main(String[] args) {
int [] arr = {13,2,55,1,6,99,0};
System.out.println(Arrays.toString(SortingAlgorithms.insertionSort(arr)));
System.out.println(Arrays.toString(SortingAlgorithms.insertionSort(arr)));

	}
	public static int[] insertionSort(int arr[]) 
    { 
		// I got  help from geeksforgeeks.
		
        for (int n = 1; n < arr.length; n++) { 
            int tem = arr[n]; 
            int i = n - 1; 
            while (i >= 0 && arr[i] > tem) { 
                arr[i + 1] = arr[i]; 
                i = i - 1; 
            } 
            arr[i + 1] = tem; 
        }
		return arr; 
    }
	
	  public String[] insertionSort(String[] str, Comparator<String> comp) {
	        String[] arr = Arrays.copyOf(str, str.length);
int i =0;
	        while (i< arr.length) {
	            for (int s = i; s > 0; s--) {
	                if (comp.compare(arr[s], arr[s - 1]) < 0) {
	                    String temp = arr[s];
	                    arr[s] = arr[s - 1];
	                    arr[s - 1] = temp;
	                } else {
	                    break;
	                }
	            }
	            i++;
	        }
	        return arr;
	    }
}

