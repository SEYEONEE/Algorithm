package study;

import java.io.*;
import java.util.*;

public class B15651 {

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
			arr[length] = i+1;
			make(length+1);
		}
	}
}
