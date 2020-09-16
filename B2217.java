package study;

import java.util.*;

public class B2217 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		Integer arr[] = new Integer[N];
		int weight =0;
		
		for(int i=0; i<arr.length; i++) 
			arr[i] = scan.nextInt();
		Arrays.sort(arr, Collections.reverseOrder());
		
		for(int i=1; i<=N; i++) 
			weight = Math.max(weight, arr[i-1]*i);
		
		
		System.out.println(weight);
	}
}

