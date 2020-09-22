package study;

import java.util.Scanner;

public class B4796 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int L=0, P=0, V=0;
			int result =0, count =0;
			
			while(true) {
				L = scan.nextInt();
				P = scan.nextInt();
				V = scan.nextInt();
				count++;
				
				if(L == 0 && P == 0 && V == 0)
					break;
	
				if(V%P >= L) 
					result = (V/P)*L +L;
				else
					result = (V/P)*L + V%P;
				
				System.out.println("Case " + count + ": " + result);
			}
		}
	}