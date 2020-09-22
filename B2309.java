package study;

import java.util.Scanner;
import java.util.Arrays;

public class B2309 {
	final static int number =9;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[number];
		int sum =0, i =0, j =0;
		
		for(i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
			sum += arr[i];
		}
		
		for(i=0; i<arr.length; i++) {
			for(j=i+1; j<arr.length; j++) {
				if(sum-arr[i]-arr[j] == 100) {
					arr[i] = -1;
					arr[j] = -1;
					break;
				}
			}
			if(arr[i] == -1 && arr[j] == -1)
				break;
		}
		Arrays.sort(arr);
		
		for(i =2; i<arr.length; i++) 
			System.out.println(arr[i]);
	}
}