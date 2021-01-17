package study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B15652 {

	static int [] arr;
	static int n,m;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new int[m];
		make(0);
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	static void make(int length) throws IOException {
		
		if(length == m) {
			for(int i=0; i<m; i++) 
				bw.write(arr[i]+ " ");
		
		bw.newLine();
		return;
		}
		
		for(int i=0; i<n; i++) {
			if(length ==0 || arr[length-1] <= i+1) {
				arr[length] = i+1;
				make(length+1);
			}
		}
	}
}

