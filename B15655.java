package study;

import java.util.Arrays;
import java.util.Scanner;

public class B15655 {
	static int n,m;
	static int [] input;
	static int [] output;
	static boolean [] visit;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		m = scan.nextInt();
		
		input= new int[n];
		output= new int[m];
		visit = new boolean[n];
		
		for(int i=0; i<n; i++)
			input[i] = scan.nextInt();
		
		Arrays.sort(input);
		make(0);
		
	}
	
	static void make(int length) {
		if(length == m) {
			for(int i =0; i<m; i++) 
				System.out.print(output[i] + " ");
		
			System.out.println();
			return ;
		}
		
		for(int i=0; i<n; i++) {
			if(!visit[i]) {
				if(length==0 || output[length-1]<input[i]) {
					visit[i] = true;
					output[length] = input[i];
					make(length+1);
					visit[i] = false;
				}
			}
		}
	}
}

