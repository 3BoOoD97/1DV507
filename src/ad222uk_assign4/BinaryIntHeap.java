package ad222uk_assign4;

import java.util.Arrays;

public class BinaryIntHeap {
	private int sz = 0;
	private int arr[] = new int[8];
	public BinaryIntHeap() {
		
	}
	
    public void add( int n ) {
    int l = arr.length;
        if( sz == l - 1 )
          resize();
       
  	  int temp = sz++;
  	  while(temp>1 && n<( arr[temp/2] )){ 
  		arr [temp] = arr[ temp / 2 ];
  		temp = temp/2;
  	  }
		arr[temp] = n; 
    }
	


  private void Down() { 
	  int i = 0;
      int leaf;
      int temp = arr[ 0 ];
      while (2 * i + 1 < sz)
      {
          leaf = children(i);
          if (arr[leaf] < temp)
        	  arr[i] = arr[leaf];
          else
              break;
          i = leaf;
      }
      arr[i] = temp;
	   }
  
 
  public int pullHighest(){ 
      if (isEmpty() == true) {
          System.out.println("Oh,It is empty");}
      
      int output = arr[0];
      arr[0] = arr[sz - 1];
      sz--;
      Down();      
      return output;
      }
  
  private int children(int num) { 
      int i = 2;
      int position = 2 * num + i;
      int child = 2 * num +1 ;

      while ((i <= 2) && (position < sz)) 
      {
          if (arr[position] < arr[child]) 
        	  child = position;
          position = 2 * num + (i+=1); 
      }    
      return child;
  }
  
  
	public int size() {
		
		return this.sz;
	}
	
	public boolean isEmpty() {
		
		return sz == 0;
	}
	
	private void resize() { 
		int growSize = sz*2;
		arr = Arrays.copyOf(arr, growSize);
	}

}