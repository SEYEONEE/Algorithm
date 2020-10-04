package study;

import java.io.*;
import java.util.*;

public class B11944 {	
	static int N,M;
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		M = scan.nextInt();
		String n = String.valueOf(N);
		String number = makeString(N, n);
		
		System.out.println(print(number));
	}
	
	public static String makeString(int N, String n) {
		String result = "";
		for(int i=0; i<N; i++)
			result +=n;
		
		return result;
	}
	
	public static String print(String number) {
		if(N < M) 
			return number;
		else 
			return number.substring(0,M);
	}
}

