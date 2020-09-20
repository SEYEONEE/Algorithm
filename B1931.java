package study;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class B1931 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int arr[][] = new int[N][2];
		int count=0;
		
		for(int i = 0; i<N; i++) {
			for(int j=0; j<2; j++) 
				arr[i][j] = scan.nextInt();
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
		      public int compare(int[] a1, int[] a2) {
	                if(a1[1]==a2[1])
	                    return Integer.compare(a1[0], a2[0]);
	                
	                return Integer.compare(a1[1], a2[1]);
	          }
		});
		    
		int room =-1;
		for(int i=0; i<N; i++) {
			if(arr[i][0] >= room) {
				room = arr[i][1];
				count ++;
			}
		}
		System.out.println(count);
	}
}

 