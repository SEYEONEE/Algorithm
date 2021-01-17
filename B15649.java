package study;

import java.util.*;

public class B15649 {
	static boolean [] visit;
	static int [] arr;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		visit = new boolean[n];
		arr = new int[m];
		make(n,m,0);
	}
	
	public static void make(int n, int m, int length) {
		if(length == m) {
			for(int i=0; i<m; i++) 
				System.out.print(arr[i] + " ");
		
		System.out.println();
		return;
		}
		
		for(int i=0; i<n; i++) {
			if(!visit[i]) {
				visit[i] = true;
				arr[length] = i+1;
				make(n,m,length+1);
				visit[i] = false;
			}
		}
	}
}