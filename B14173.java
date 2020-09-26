package study;


import java.util.Scanner;
import java.util.Arrays;

public class B14173 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x1, y1, x2, y2;
		int x3, y3, x4, y4;
		int length =0;
				
		x1 = scan.nextInt();
		y1 = scan.nextInt();
		x2 = scan.nextInt();
		y2 = scan.nextInt();
		x3 = scan.nextInt();
		y3 = scan.nextInt();
		x4 = scan.nextInt();
		y4 = scan.nextInt();
	
		int []x = {x1, x2,x3,x4};
		int []y = {y1, y2,y3,y4};
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		if(x[3] - x[0] > y[3]-y[0])
			length = x[3] - x[0];
		else 
			length = y[3] - y[0];
		
		System.out.println(length*length);
	}
}