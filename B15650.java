package study;

import java.util.*;

public class B15650 {
	static int n,m;
	static int [] arr;
	static boolean [] visit;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		m = scan.nextInt();
		
		arr= new int[m];
		visit = new boolean[n];
		
		make(0);
		
	}
	
	static void make(int length) {
		if(length == m) {
			for(int i =0; i<m; i++) 
				System.out.print(arr[i] + " ");
		
			System.out.println();
			return ;
		}
		
		for(int i=0; i<n; i++) {
			if(!visit[i]) {
				if(length==0 || arr[length-1]<i+1) {
					visit[i] = true;
					arr[length] = i+1;
					make(length+1);
					visit[i] = false;
				}
			}
		}
	}
}
