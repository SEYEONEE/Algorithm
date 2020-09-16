package study;

import java.util.*;

public class B18228 {
	  public static void main(String[] args) {
	     Scanner scan = new Scanner(System.in);
	     
	     int result =0, check =0, l=0, r=0;
	     int N = scan.nextInt();
	     int arr[] = new int[200001];
	     int arr1[] = new int[200001];
	     int arr2[] = new int[200001];
	     
	     for(int i=0; i<N; i++) 
	    	arr[i] = scan.nextInt(); 
	
	     for(int i=0; i<N; i++) {
	    	 if(arr[i] == -1) {
	    		 i++;
	    		 check++;
	    	 } 
	    	 if(check ==0) {
	    		 arr1[l] = arr[i];
		    	 l++;	 
	    	 }
	    	 else {
	    		 arr2[r] = arr[i];
	    		 r++;
	    	 }
	     }

	     Arrays.sort(arr1, 0, l);
	     Arrays.sort(arr2, 0, r);
	     result = arr1[0] + arr2[0];
	      
	     System.out.println(result);
	  }
}


