package study;

import java.util.*;
import java.io.*;

public class B7568 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int [] height = new int[N];
		int [] weight = new int[N];
		int [] rank = new int[N];
		
		for(int i=0; i<N; i++) {
			height[i] = scan.nextInt();
			weight[i] = scan.nextInt();
			rank[i] = 1;
		}
		
		for(int i =0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(height[i] < height[j] && weight[i] < weight[j]) 
					rank[i]++;
			}	
		}
		for(int i=0; i<N; i++) 
			System.out.print(rank[i]+ " ");
	}
}