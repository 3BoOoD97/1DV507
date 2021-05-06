package ad222uk_assign4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class BinaryHeapTest {

	private static final int TEST_INTEGERS[][] = {
			new int[]{5,6,7,8,9,10,11,12,13,14,15},
			new int[]{16,17,18,19,20,21,22,23,24,25,26},
			new int[]{100,101,102,103,105,106,107,108,109,110,111,112,113,114,115}};

	@Test
	public void testBinaryHeap() {
		
		for (int i = 0; i < TEST_INTEGERS.length; i++)
		{
			int[] num = TEST_INTEGERS[i];
			System.out.printf(" The Array \n:", i + 1, Arrays.toString(num));
			BinaryIntHeap hp = new BinaryIntHeap();
			
			for (int integer : num)
				hp.add(integer);
			
			int expectedSize = num.length;
			int realSize = hp.size();
			
			System.out.printf("Size of sample array and heap: %d and %d\n", expectedSize, realSize);
			

			while (!hp.isEmpty())
				System.out.print(hp.pullHighest() + " ");
			System.out.println();
		}	
	}

}