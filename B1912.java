package study;

import java.util.*;

public class B1912 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++)
			arr[i] = scan.nextInt();
		
		System.out.println(sum(arr));
	
	}
	
	public static int sum(int arr[]) {
		int max;
		int dp[] = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			if(i==0 || dp[i-1] + arr[i] <= arr[i])
				dp[i] = arr[i];
			else if(dp[i-1] + arr[i] > arr[i])
				dp[i] = dp[i-1] + arr[i];
		}
		Arrays.sort(dp);
		max = dp[dp.length-1];
		
		return max;
	}
}
