public class Test {
 public static void main(String[] args) {
	 int [] arr = {1,2,3,4,5};
	 System.out.println(Test.bin(arr, 55, 0, arr.length-1));
}

 static int divRec(int x, int y)
 {
     if( y == 0 )
     {
         return 0;
     }
     else if(x-y == 0)
     {
        return 1;
     }
     else if( x < y)
     {
        return 0; 
     }
     else
     {
         return ( 1 + divRec(x-y, y) );
     }}
     public static boolean bin(int[] arr, int n,int min,int max) {
    	 if (max<min) 
    		 return false;
    		 int mid  = (min+max)/2;
    		 if (arr[mid]==n) 
return true;    		 
    		 else if (arr[mid]<n) 
    			 return bin(arr, n, mid+1, max);
    		 
    		 else if (arr[mid]>n) 
    			 return bin(arr, n, min, mid-1);
    		 else
			return false;
    	 
    	 }
    	
    	 }
 



 
