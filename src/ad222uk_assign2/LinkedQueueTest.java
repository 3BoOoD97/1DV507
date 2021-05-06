package ad222uk_assign2;

import org.junit.Test;

import org.junit.Before;




public class LinkedQueueTest {
    private static int count;
   
    @Before public void setUp() {
        System.out.println("test Number " + (++count));
    }
   
    public void tearDown() {
        System.out.println("Test( " + count + " )Is Done :)");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*");
    }

    @Test
    public void testEnqueueSize() {
        QueueImplementation queue = new QueueImplementation();
        queue.enqueue(999999999);
        queue.enqueue(-888888888);
        queue.enqueue(0);
        System.out.println("Queue Size: " + queue.size());

        queue = new QueueImplementation();
        for(int i = 0; i < 483647; i++) {    // add 483647 to the linkedqueue
            queue.enqueue(i);
        }
        System.out.println("Queue Size: " + queue.size());   // check if the size is 483647
        tearDown();
    }

    @Test
    public void testFirstLast() {
        QueueImplementation queue = new QueueImplementation();
        queue.enqueue(4);
        queue.enqueue(8);
        queue.enqueue(16);
        queue.enqueue(32);
        System.out.println("first element: " + queue.first());
        System.out.println("Last element: " + queue.last());

        queue = new QueueImplementation();
        for(int i = 0; i < 123456; i++) {
            queue.enqueue(i);
        }
        System.out.println("First: " + queue.first());
        System.out.println("Last: " + queue.last());
    
        tearDown();
    }
}