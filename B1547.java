package study;

import java.util.*;

public class B1547 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int M = scan.nextInt();
		int location[][] = new int[M][2];
		int cup = 1;
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<2; j++) 
			location[i][j] = scan.nextInt();
		}
		
		for(int i=0; i<M; i++) {
			if(location[i][0] == cup)
				cup = location[i][1];
			else if(location[i][1] == cup)
				cup = location[i][0];
		}
		
		if(cup <0)
			System.out.println("-1");
		else 
			System.out.println(cup);
	}
}
	
	
