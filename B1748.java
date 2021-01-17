package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1748 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		long n =0, num=0, result =0;
		
		n = Long.parseLong(str);
		num = str.length();
		
		if(num ==1) {
			result = n;
			System.out.println(result);
		} else {
			result =9;
			for(long i=1; i<num-1; i++)
				result += Math.pow(10, i)*9*(i+1);

			result += ((n-Math.pow(10, num-1))+1)*num;
			System.out.println(result);
		}
	}
}
