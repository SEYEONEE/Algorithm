package study;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class B15656 {
	static int n,m;
	static int [] input;
	static int [] output;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		m = scan.nextInt();
		
		input= new int[n];
		output= new int[m];
		
		for(int i=0; i<n; i++)
			input[i] = scan.nextInt();
		
		Arrays.sort(input);
		make(0);
		
		bw.flush();
		bw.close();
	}
	
	static void make(int length) throws IOException {
		if(length == m) {
			for(int i =0; i<m; i++) 
				bw.write(output[i] + " ");
		
			bw.newLine();
			return ;
		}
		
		for(int i=0; i<n; i++) {
			output[length] = input[i];
			make(length+1);
		}
			
	}
}

