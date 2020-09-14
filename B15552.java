package study;

import java.util.*;
import java.io.*;

public class B15552 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		String [] arr;
		
		for(int i=0; i<T; i++) {
			arr = (br.readLine()).split(" "); 
			int result = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
			
			bw.write(result+"\n");	
		}
		bw.flush();
		bw.close(); 
	}
}
