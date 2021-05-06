package ad222uk_assign2;

import java.util.Iterator;

public class QueueMain {
	public static void main (String[]args) {
		QueueImplementation LQ = new QueueImplementation();
        System.out.println("Is  queue empty: " + LQ.isEmpty());
System.out.println("**-**-**-**-**-**");
		 System.out.println("Adding elmentes 10-9-8-7-6-5-4-3-2-1");

	        Object t1 = 10;
	        Object t2 = 9;
	        Object t3 = 8;
	        Object t4 = 7;
	        Object t5 = 6;
	        Object t6 = 5;
	        Object t7 = 4;
	        Object t8 = 3;
	        Object t9 = 2;
	        Object t10 =1;
	        LQ.enqueue(t1);
	        LQ.enqueue(t2);
	        LQ.enqueue(t3);
	        LQ.enqueue(t4);
	        LQ.enqueue(t5);
	        LQ.enqueue(t6);
	        LQ.enqueue(t7);
	        LQ.enqueue(t8);
	        LQ.enqueue(t9);
	        LQ.enqueue(t10);
			 System.out.println(LQ);
System.out.println("Size "+LQ.size());
			 System.out.println("**-**-**-**-**-**");

	        
	        
	        
	        
	        
	        System.out.println();
	        System.out.println("First element: " + LQ.first());
	        System.out.println("Last element : " + LQ.last());
	        LQ.dequeue();
	        System.out.println("elements left in the queue: " + LQ.toString());
	        LQ.dequeue();
	        System.out.println("return and remove first element: " + LQ.toString());
	        LQ.dequeue();
	        System.out.println("return and remove first element. : " + LQ.toString());
	        LQ.dequeue();
	        System.out.println("return and remove first element. : " + LQ.toString());
	        LQ.dequeue();
	        System.out.println("return and remove first element. : " + LQ.toString());
	        LQ.dequeue();
	        System.out.println("return and remove first element. : " + LQ.toString());
	        LQ.dequeue();
	        System.out.println("return and remove first element. : " + LQ.toString());
	        LQ.dequeue();
	        System.out.println("return and remove first element. : " + LQ.toString());
	        LQ.dequeue();
	        System.out.println("return and remove first element. : " + LQ.toString());
	        LQ.dequeue();
	        System.out.println("return and remove first element. : " + LQ.toString());
	        System.out.println("Is  queue empty: " + LQ.isEmpty());
	        System.out.println("Size "+LQ.size());


	    }
	}