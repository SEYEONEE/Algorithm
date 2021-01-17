package study;

import java.util.Scanner;

public class B9095 {
	static int dp[];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n=0;
		int arr[];
		
		n = scan.nextInt();
		dp = new int[11];
		arr = new int[n];
		
		for(int i=0; i<n; i++) 
			arr[i] = scan.nextInt();
		
		for(int i=0; i<n; i++) 
			count(arr[i]);
	}

	static void count(int num) {
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		if(num <4)
			System.out.println(dp[num]);
		
		else {
			for(int i=4; i<=num; i++) 
				dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
			
			System.out.println(dp[num]);
		}	
	}
}
