package study;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class B15654 {
	static int [] input;
	static int [] output;
	static boolean [] visit;
	static int n,m;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
	
		n = scan.nextInt();
		m = scan.nextInt();
		
		input = new int[n];
		output = new int[m];
		visit = new boolean[n];
		
		for(int i=0; i<n; i++)
			input[i] = scan.nextInt();
		
		Arrays.sort(input);
		
		make(0);

		bw.flush();
		bw.close();
	}
	
	static void make(int length) throws IOException {
		
		if(length == m) {
			for(int i=0; i<m; i++) 
				bw.write(output[i]+ " ");
		
			bw.newLine();
			return;
		}
		
		for(int i=0; i<n; i++) {
			if(!visit[i]) {
				visit[i] = true;
				output[length] = input[i];
				make(length+1);
				visit[i] = false;
			}
		
		}
	}
}
