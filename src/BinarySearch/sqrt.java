package BinarySearch;

public class sqrt {
	public int sqrt(int A) {
	    
	    int low, high, root;
	    int mid;
	    int num;
	    
	    low = 1;
	    high = A;
	    root = 0;
	    
	    while (low <= high) {
	        
	        mid = (low + high) / 2;
	        
	        if (mid == A / mid && (A % mid == 0))
	            return mid;
	            
	        if (mid <= A / mid) {
	            root = mid;
	            low = mid + 1;
	        } else {
	            high = mid - 1;
	        }
	        
	    }
	    
	    return root;
	    
	}
}
