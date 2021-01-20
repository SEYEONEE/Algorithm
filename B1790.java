package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1790 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n=0, k=0;
		long length =0, result=0, num=0;
		
		String[] str = br.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		k = Integer.parseInt(str[1]);
		
		for(int i=1; i<=n; i++) {
			num = i;
			length += (long)(Math.log10(i)+1);
			if(length >= k)
				break;
		}
		
		if(length<k)
			System.out.println(-1);
		else {
			while(length !=k) {
				num /= 10;
				length--;
			}
			result = num%10;
			System.out.println(result);
		}
	}

}


