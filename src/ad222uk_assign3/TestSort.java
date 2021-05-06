package ad222uk_assign3;
import java.util.Random;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

public class TestSort {



	 private static int count=0;
	   
	    @Before public void Number() {
	        System.out.println("test Number " + (++count));
	    }
	   
	    public void NumberAfter() {
	        System.out.println("Test( " + count + " )Is Done :)");
	        System.out.println("*-*-*-*-*-*-*-*-*-*-*");
	    }
  

    @Test
    public void testInsertionSortInt(){
    	
        int[] arr = new int[10];
        Random rand = new Random();
        for (int j =0 ;j<arr.length ;j++) {
     // Obtain a number between [0 - 49].
        int n = rand.nextInt(50);
        n += 1;
       arr[j]=n;
        }
     
        int[] sort = SortingAlgorithms.insertionSort(arr);
        assertEquals(arr.length, sort.length);     
        for(int i = 0; i < sort.length -1; i++){
            assertTrue(sort[i] <= sort[i + 1]);   
        }
     
        Number();
        NumberAfter();
    }

    @Test
    public void testInsertionSortString(){
        SortingAlgorithms sort = new SortingAlgorithms();
        Comparator<String> sort1 = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        String[] str = {"cool", "nice", "cute", "wow", "zoo","enough","-_-"};
        String[] strSorted = sort.insertionSort(str, sort1);

        assertEquals(str.length, strSorted.length); 

        for(int i = 0; i < strSorted.length - 1; i++){
            assertTrue(sort1.compare(strSorted[i], strSorted[i + 1]) <= 0); 

        }
        Number();
        NumberAfter();
    }
}