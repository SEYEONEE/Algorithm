package study;

import java.util.Scanner;
import java.util.Arrays;

public class quickSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N, sum = 0;
		N = scan.nextInt();
		int data[] = new int[N];
		for(int i = 0; i<data.length; i++) {
			data[i] = scan.nextInt();
		}
		Arrays.sort(data);
		for(int i=0; i<data.length; i++) {
			for(int j=i; j>=0; j--) {
				sum += data[j];
			}
		}
		System.out.println(sum);
	}
}
