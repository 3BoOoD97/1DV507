package ad222uk_assign2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class QueueImplementation implements Queue {


	 
	private int size = 0;
	private Node head;
	private Node tail;
	
	 
	public QueueImplementation()
	{
		size = 0; 
		head = null;
		tail = null; 
	}

	
	@Override
	public int size() 
	{
		return size;
	}
	
	
	@Override
	public boolean isEmpty() 
	{
		if (head == null)
		{
			return true;
		}
		else
			
		return false;
	}


	@Override
	public void enqueue(Object element) 
	{
		
		if (head == null)
		{
			head = new Node();
			
			head.value = element;
			
			tail = head;
		}
		else 
		{
				tail.next = new Node();
				tail.next.value = element;
				tail = tail.next;
		}
		size++;
		
	}

	  
	@Override
	public Object dequeue()
	{
		  if (isEmpty()) 
		  { 
			  throw new NoSuchElementException(); 
		  }
		  
		  Node output = head;
		  
		  head = head.next;
		  size--;
		  return output.value;
	}

	
	@Override
	public Object first() 
	{
		return head.value;
	}

	

	@Override
	public Object last() 
	{
		return tail.value;
	}
	
	
	@Override
	public Iterator<Object> iterator()
	{
		return new ObjectIterator();
	}
	
	@Override
	public String toString()
	{
		 if (head == null)
	            return null;

	        if (head == tail)
	            return head.value.toString();

	        StringBuffer sb = new StringBuffer();
	        Node cur = head;
	        while(cur != tail){
	            sb.append(cur.value.toString()+" ");
	            cur = cur.next;
	        }
	        sb.append(tail.value.toString());
	        return sb.toString();
	    }

	private class ObjectIterator implements Iterator<Object> 
	{
		private Node n = head; 
		
		@Override
		public boolean hasNext() 
		{  			
			if (n == null)
			{
				return false;
			}
			else
				return true;
		}
			
	
		@Override
		 public Object next() 
		{
            if (!hasNext()) 
            { 
            	throw new NoSuchElementException();
            }
        
            Object element = n.value;
            n = n.next;
            
            return element;
        }
	}
	

    class Node
    {
    
        Object value;
        Node next; 
    }
}