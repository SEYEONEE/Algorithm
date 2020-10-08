package study;

import java.util.*;

public class B2231 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int size = String.valueOf(N).length();
		
		sum(N, size);
	}
	
	public static void sum(int N, int size) {
		int i=0, number=0, result=0;
		int min = N - size*9;

		for(i= min; i<N; i++) {
			number =i;
			int sum = i;
			while(number >0) {
				sum += number%10;
				number /= 10;
			}
			if(sum == N) {
				result = i;
				break;
			}
		}
		System.out.println(result);	
	}	
}
