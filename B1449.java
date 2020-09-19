package study;

import java.util.Scanner;
import java.util.Arrays;

public class B1449 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count=0;
		double tape =0;
		int N = scan.nextInt();
		int L = scan.nextInt();
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++)
			arr[i] = scan.nextInt();
		
		Arrays.sort(arr);
		
		tape = arr[0] - 0.5 +L;
		count++;
		
		for(int i=1; i<N; i++) {
			if(tape < arr[i]+0.5) {
				tape = arr[i] -0.5+L;
				count++;
			}
		}
		
		System.out.println(count); 
	}	
}
