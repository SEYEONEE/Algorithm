package study;

import java.util.Scanner;

public class B16162 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num=0, memory=0;
		int N = scan.nextInt();
		int A = scan.nextInt();
		int D = scan.nextInt();
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++) 
			arr[i]= scan.nextInt();
		
		for(int i=0; i<N; i++) {
			if(arr[i]==A && num ==0) { 
				num =1;
				memory = arr[i];
			}
			else if(num>=1 && arr[i] == memory+D) {
				num++;
				memory = arr[i];
			}
		}
		
		System.out.println(num);
	}
}
