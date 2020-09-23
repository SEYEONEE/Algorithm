package study;

import java.util.Scanner;
import java.util.Arrays;

public class B16678 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int arr[] = new int[N+1];
		int sequence =1;
		long count =0;
		
		for(int i=1; i<=N; i++)
			arr[i] = scan.nextInt();
		
		Arrays.sort(arr);
		
		for(int i=1; i<=N; i++) {
			if(arr[i] >= sequence) {
				count += arr[i]-sequence;
				sequence++;
			}
		}		
		System.out.println(count);
	}
}