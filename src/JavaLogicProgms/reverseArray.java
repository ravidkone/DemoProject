package JavaLogicProgms;

public class reverseArray {
	
			  
	    /*function swaps the array's first element with last element,  
	      second element with last second element and so on*/
	    static void reverse(int a[], int n) 
	    { 
	        int i, k, t; 
	        for (i = 0; i < n / 2; i++) { 
	            t = a[i]; 
	            a[i] = a[n - i - 1]; 
	            a[n - i - 1] = t; 
	        } 
	  
	        /*printing the reversed array*/
	        System.out.println("Reversed array is: \n"); 
	        for (k = 0; k < n; k++) { 
	            System.out.println(a[k]); 
	        } 
	    } 
	    
	    static void reverse1(int a[], int count) 
	    { 
		System.out.println("******reverse array****");
        for (int k=count-1;k>0;k--) {
			
          System.out.print(a[k]+",");			
		}
		System.out.print(a[0]);
	    
	    }
	  
	    public static void main(String[] args) 
	    { 
	        int [] arr = {10, 20, 30, 40, 50}; 
	        reverse1(arr, arr.length); 
	    } 
	} 
