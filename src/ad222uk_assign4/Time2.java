package ad222uk_assign4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Time2{
	
	static long aSecond = 1000000000;
	static int sumA=0;
	public static void main(String[] args) {
		
		int[] arr = new  int[10];
		String[] stringArr = new String[10];
		
		
		for(int i=0; i<10;++i)
			System.out.println(intTimeTest(arr));
		
		System.out.println("Average int : " + (sumA /5));
		sumA =0;
		
		for(int i=0; i<10;++i)
			System.out.println(stringTimeTest(stringArr));
		System.out.println("Average  String: " + (sumA /5));
	}
	
	public static String stringTimeTest(String[] test) {
		Comparator<String> StringLetter = (s1,s2) -> s2.compareTo(s1); 
		long estimatedTime =0;
		long before = System.nanoTime();
		long after;
		int n = 0;
		
		
		
		for(int i=0; i<test.length; i++ ) {
			test[i] = random();
		}
		while(estimatedTime< aSecond) {
			insertionSort(test,StringLetter);
			n++;
			after =System.nanoTime();
			estimatedTime = after-before;
			for(int i=0; i<test.length; i++ ) {
				test[i] = random();
			}
		}
		sumA += n;
		return "Amount of sorts done : " + n;
	}
	
	public static String intTimeTest(int[] test) {
		long before = System.nanoTime();
		long after;
		long estimatedTime =0;
		int counter = 0;
		Random rand = new Random();
		
		for(int i=0; i<test.length; i++ ) {
			test[i] = rand.nextInt(100);
		}
		
		while(estimatedTime< aSecond) {
			insertionSort(test);
			counter++;
			after =System.nanoTime();
			estimatedTime = after-before;
			for(int y=0; y<test.length; y++ ) {
				test[y] = rand.nextInt(100);
			}
		}
		sumA += counter;
		return "Amount done : " + counter;
		
	}
	
	public static int[] insertionSort(int[] arr1) {
		  int[]arr = arr1;
		  
		  for(int i=0; i<arr.length-1; i++){
			  int j = i;
			  int temp = arr[i+1];
			  int n = arr[i];
			  
			  while(j>=0 && arr[j]>temp){
				  arr[j+1] = arr[j]; 
				  j--;
			  }
			  arr[j+1] = temp;
		  }
		 
		 return arr;
	 }
	
	public static String[] insertionSort(String[] arr1, Comparator<String> com) {
		   String arr[] = arr1;
		   for (int j = 1; j < arr.length; j++) {
			    String temp = arr[j];
			    int i = j - 1;
			    	while (i >= 0) {
			    		if (com.compare(temp,arr[i]) >0 ) {
			    			break;
			      }
			      arr[i + 1] = arr[i];
			      i--;
			    }
			    arr[i + 1] = temp;
		   }
		   return arr;
		   
	   }


	public static String random() {
		char[] alpha = { 'a','b','c','d','e','f',
				'g','h','i','j','k','l','m','n','o',
				'p','q','r','s','t','u','v','w','x','y','z'
		};
		StringBuilder s = new StringBuilder();
		Random rand = new Random();
		for(int i=0; i<10; i++) {
			s.append(alpha[rand.nextInt(24)]);
		}
		return s.toString();
				
		}
	}